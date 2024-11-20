package PI.admin;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Newcandidate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
	    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		// pen URL using get method
		driver.get("https://dev-webs.patoliyainfotech.com/auth");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/div[2]/form/div[1]/input")).sendKeys("patoliya.dm1@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/div[2]/form/div[2]/input")).sendKeys("Password@1");
		driver.findElement(By.className("btn-primary")).click();
		
		//Click on sider bar dropdawn 
		Thread.sleep(3000);
		Actions a= new Actions(driver);
		WebElement move=driver.findElement(By.cssSelector("div[id='#kt_app_sidebar_menu']"));
		a.moveToElement(move).build().perform();
		driver.findElement(By.xpath("//a[@href='/dashboard']//i[contains(@class,'ki-duotone ki-down')]")).click();
		driver.get("https://dev-webs.patoliyainfotech.com/recruit/candidates/all");

		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".ki-duotone.ki-plus.fs-2")).click();
		
	   
	   // select job type dropdawn box by using java stream
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/form/div[1]/div[1]/div/div[2]/div")).click();
	   
	   List<WebElement> jobOptions = driver.findElements(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/form/div[1]/div[1]/div[2]/div/div[3]"));
	   Optional<WebElement> optionToSelect = jobOptions.stream().filter(option ->"JavaScript".equalsIgnoreCase(option.getText())).findFirst();
	   optionToSelect.ifPresent(WebElement::click);
		
	   //Select area of intreset dropdawn box
		  driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/form/div[2]/div[1]/div[1]")).click();
		  List<WebElement> Areaoptions= driver.findElements(By.xpath("//span[text()='AI/ML'][1]"));	
		  Optional<WebElement> AreaoptionToSelect = Areaoptions.stream().filter(option ->"AI/ML".equalsIgnoreCase(option.getText())).findFirst();
		  AreaoptionToSelect.ifPresent(WebElement::click);
		      
		  //Add candidate details
		  driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Amt");
		  driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("patel");
		  driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("amit124@gmail.com");
		  driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("9586266623");
		  driver.findElement(By.xpath("//span[normalize-space()='Submit']")).click();
		
	
		  
		  //Add candidate for interview 
		  
		/*  driver.findElement(By.cssSelector("a[href='/interviews']")).click();
		  //wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("#kt_interview")));
		  driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div[1]/div[1]/div[2]/div/button[2]")).click();
		   
		 driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div[2]/div/div[2]/form/div[1]/div[2]/div[1]/div[1]/div[2]/input")).click();
		 List<WebElement> candidateSelect = driver.findElements(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div[2]/div/div[2]/form/div[1]/div[2]/div[2]/div/div[3]/div/span"));
		 Optional<WebElement> optionToSelect = candidateSelect.stream().filter(option->"Richa patel".equalsIgnoreCase(option.getText())).findFirst();
		 optionToSelect.ifPresent(WebElement::click);
		 
		 driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div[2]/div/div[2]/form/div[2]/div[2]/div/div[1]/div[2]")).click();
		 List<WebElement> InteviewType = driver.findElements(By.xpath("//span[normalize-space()='On site interview']"));
		 Optional<WebElement> optionToSelect2 = InteviewType.stream().filter(option->"On site interview".equalsIgnoreCase(option.getText())).findFirst();
		 optionToSelect2.ifPresent(WebElement::click);
		 
		 //select date
		 driver.findElement(By.cssSelector("input[placeholder='Interview Date']")).click();
		 driver.findElement(By.cssSelector("[aria-label='September 25, 2024']")).click();
		 driver.findElement(By.cssSelector(".indicator-label")).click();*/

		 
		 
		 
	}

}
