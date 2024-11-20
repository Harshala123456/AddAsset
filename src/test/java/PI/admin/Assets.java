package PI.admin;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assets {

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
		
		Thread.sleep(3000);
		/*Actions a= new Actions(driver);
	    WebElement move=driver.findElement(By.xpath("(//span[normalize-space()='Assets'])[1]"));
	    a.moveToElement(move).build().perform();
		driver.findElement(By.cssSelector("a[class='menu-link without-sub active'] span[class='menu-title']")).click();*/
		
		//driver.get("https://dev-webs.patoliyainfotech.com/hrm/assets-data");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[1]/div[2]/div/div[1]/div[6]/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[1]/div[2]/div/div[1]/div[6]/div/div[3]/a")).click();
		
		
		
		
		
		driver.findElement(By.cssSelector(".ki-duotone.ki-plus.fs-2.false")).click();
		driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("HP");
	    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div/div/form/div[2]/div[1]/div[1]/div[1]/div[2]/input")).click();
	    List<WebElement> Category= driver.findElements(By.xpath("//span[text()='Notes']"));
        java.util.Optional<WebElement>selectCategory = Category.stream().filter(option -> "Notes".equalsIgnoreCase(option.getText())).findFirst();
	    selectCategory.ifPresent(WebElement::click);
		

	    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div/div/form/div[3]/div[1]/div[1]/div[1]/div[2]/input")).click();
	    List<WebElement> Vendor= driver.findElements(By.xpath("//span[text()='Amazon']"));
        java.util.Optional<WebElement>selectVendor = Vendor.stream().filter(option -> "Amazon".equalsIgnoreCase(option.getText())).findFirst();
        selectVendor.ifPresent(WebElement::click);
	    
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div/div/form/div[6]/div[1]/div/div[1]/div[2]/input")).click();
	    List<WebElement> Condition = driver.findElements(By.xpath("//span[text()='Good']"));
        java.util.Optional<WebElement>selectCondition = Condition.stream().filter(option -> "Good".equalsIgnoreCase(option.getText())).findFirst();
        selectCondition.ifPresent(WebElement::click);
	    
	   driver.findElement(By.cssSelector("input[placeholder='Purchased On']")).click();
	   driver.findElement(By.xpath("//span[@aria-label='November 12, 2024']")).click();
	    
	   driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div/div/form/div[8]/div[1]/div/div[1]/div[2]/input")).click();
	   List<WebElement> Location = driver.findElements(By.xpath("//span[text()='Ahmedabad']"));
       java.util.Optional<WebElement>selectLocation= Location.stream().filter(option -> "Ahmedabad".equalsIgnoreCase(option.getText())).findFirst();
       selectLocation.ifPresent(WebElement::click);
	    
       driver.findElement(By.cssSelector("input[placeholder='Price']")).sendKeys("550");
    
       Thread.sleep(2000);
       WebElement fileInput = driver.findElement(By.cssSelector("input[type='file'][id='fileInput']"));
	   fileInput.sendKeys("C:\\Users\\PI-27\\Downloads\\Capture 1.png");
	   Thread.sleep(2000);
       driver.findElement(By.xpath("//span[text()='Submit']")).click();
	    
	}	
}
