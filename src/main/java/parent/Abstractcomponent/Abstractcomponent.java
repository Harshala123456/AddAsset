package parent.Abstractcomponent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Abstractcomponent {

	WebDriver driver;
	
	public Abstractcomponent(WebDriver driver) {
	
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}	

   
   @FindBy(xpath = "/html/body/div[1]/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div[2]/div/div[2]/form/div[1]/div[2]/div[2]/div/div[3]/div/span")
	WebElement candidateSelect;
	
	public void  waitForElementToAppear(By findBy) 
	{
		
	 WebDriverWait wait = new WebDriverWait(driver, 10);
	 wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
	}

	
	public void Siderbar(WebElement Ele)
	{
	
		Actions a= new Actions(driver);
	    a.moveToElement(Ele).build().perform();
	
	
	
	
	
}
	
}