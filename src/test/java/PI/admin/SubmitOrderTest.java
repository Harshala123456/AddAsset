package PI.admin;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Corejava.pageobject.AssetsFields;
import Corejava.pageobject.Candidatecreate;
import Corejava.pageobject.Candidateredirection;
import Corejava.pageobject.CreateInterview;
import Corejava.pageobject.Landingpage;
import Corejava.pageobject.SelectAreaofinterest;
import Corejava.pageobject.Selectjobtype2;
import Corejava.pageobject.Selectotheroption;
import PI.TestComponents.Basetest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SubmitOrderTest extends Basetest {

	
		@Test (dataProvider ="getData",groups= {"Purchase"})
		public void SubmitOrder(HashMap<String,String>input ) throws IOException, InterruptedException
		{

		landingPage.loginApplication(input.get("email"),input.get("password")); 
    
			
		//Click on sider bar dropdawn

		 Candidateredirection Candidateredirection = new  Candidateredirection (driver);
		 Candidateredirection.SiderbarClick();
		
		
		/*driver.findElement(By.xpath("//a[@href='/dashboard']//i[contains(@class,'ki-duotone ki-down')]")).click();
		driver.get("https://dev-webs.patoliyainfotech.com/recruit/candidates/all");
		driver.findElement(By.cssSelector(".ki-duotone.ki-plus.fs-2")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Quick Add Candidate']")).click();*/
		
		Candidatecreate Candidatecreate = new Candidatecreate(driver);
		
		String jobName = "Human Resource"; //select job type
		Selectjobtype2 Selectjobtype2 = new Selectjobtype2(driver);
		Selectjobtype2.jobselection();
		
		SelectAreaofinterest SelectAreaofinterest = new SelectAreaofinterest(driver); //select area of interest
		SelectAreaofinterest.areaOfinterest();
		
		String first = "ridimak"; // candidate details
		String last = "patel";
		String email1 ="ridimae13@gmail.com";
		String phone = "8955856962";
		Selectotheroption Selectotheroption = new Selectotheroption  (driver);
		Selectotheroption.addfewdetails(first, last, email1, phone);
		
		}
	
	//@DataProvider
	//	public Object[][]  getData() throws IOException
		{
		//	
			//HashMap <String,String> map = new HashMap<String,String> ();
			//map.put("email", "qat5643@gmail.com");
			//map.put("password", "Qatest@1234");
		    //map.put("jobselectionl","Laravel Developer");
			
			
	//	    List<HashMap<String,String>>data = getJsonDataToMap ("webdriver.chrome.driver\",\"C:\\\\Harshala P\\\\chromedriver-win64\\\\chromedriver.exe");
	//	   return new Object [] [] {{data.get(0)}};
		
}
			
}


		//Add candidate in interview module
		/*driver.findElement(By.cssSelector("a[href='/interviews']")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div[1]/div[1]/div[2]/div/button[2]")).click();
	
	    CreateInterview CreateInterview= new CreateInterview (driver);
		CreateInterview.showCadidates();
		
		CreateInterview CreateInterview1 = new CreateInterview(driver);
		CreateInterview.interviewType();

		driver.findElement(By.cssSelector("input[placeholder='Interview Date']")).click();
		CreateInterview CreateInterview2 = new CreateInterview(driver);
		CreateInterview.interviewDate();*/
	
		
