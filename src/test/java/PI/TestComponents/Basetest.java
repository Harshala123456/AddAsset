package PI.TestComponents;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import Corejava.pageobject.Landingpage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Basetest {

	public WebDriver driver;
	public Landingpage landingPage;

	public WebDriver initializeDriver() throws IOException {
		// properties class

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\Pi\\Resources\\GlobalData.properties");
		prop.load(fis);
		
		//java ternary operator code run multiple broswer chrome to firefox 
		String browserName= System.getProperty("browser")!=null?System.getProperty("browser"): prop.getProperty("browser");
		//prop.getProperty("browser")
		
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup(); 
			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("firefox")) {
			// firefox
		}

		else if (browserName.equalsIgnoreCase("edge")) {
			// edge
			System.setProperty("webDriver.edge.driver", "edge.exe");
			driver = new EdgeDriver();
		}

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}

	public List<HashMap<String, String>> getJsonDataToMap(String string) throws IOException {
	// read json to string
	String jsonContent = FileUtils.readFileToString(
			new File("C:\\Harshala P\\eclipse-workspace\\SeleniumFramworkDesign\\src\\test\\java\\PI\\Data\\Assets.json"),
			StandardCharsets.UTF_8);

	// string to HashMap Jackson databind
	ObjectMapper mapper = new ObjectMapper();
	List<HashMap<String, String>> data = mapper.readValue(jsonContent,
			new TypeReference<List<HashMap<String, String>>>() {
			});
	return data;

}
	

	/*public List<HashMap<String, String>> getJsonDataToMap1(String string) throws IOException {
	
		//read json to string 
		 String jsonContent=FileUtils.readFileToString(new File("C:\\Harshala P\\eclipse-workspace\\SeleniumFramworkDesign\\src\\test\\java\\PI\\Data\\Assets.json"),StandardCharsets.UTF_8);
	
		//string to HashMap Jackson databind
		   ObjectMapper mapper = new ObjectMapper();	
		
		List<HashMap<String,String>>data = mapper.readValue(jsonContent,new TypeReference<List<HashMap<String,String>>>(){
			});
		return data;
	
	}*/
	
	
	
	
	@BeforeMethod(alwaysRun = true)
	public Landingpage launchingApplication() throws IOException {

		driver = initializeDriver();
		landingPage = new Landingpage(driver);
		landingPage.goTo();
		return landingPage;

	}


	
 //@AfterMethod(alwaysRun = true)
//public void terDwann() {
	//driver.close();
	//}

}
