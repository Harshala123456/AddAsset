package Corejava.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import parent.Abstractcomponent.Abstractcomponent;

public class Landingpage extends Abstractcomponent{

	 WebDriver driver;
	 
	public Landingpage (WebDriver driver)
	{
		//initialization
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
   }
	
    //WebElement userEmails = driver.findElement(By.id("userEmail"));
 	//pageFactory
	
	@FindBy(xpath = "/html/body/div/div/div[1]/div/div/div/div[2]/form/div[1]/input")
	WebElement Email;
	
	@FindBy(xpath= "/html/body/div/div/div[1]/div/div/div/div[2]/form/div[2]/input")
	WebElement PasswordEle;
	
	@FindBy(css= "div.alert")
	WebElement errorMessage;
	
	
	@FindBy(css ="button[type='submit']")
	WebElement submit;
	
	public void loginApplication (String email, String password)
	{
		Email.sendKeys(email);
		PasswordEle.sendKeys(password);
		submit.click();
	}

	public String getErrorMessage ()
		{
		return errorMessage.getText();
		
	}

	
	public void goTo()
	{
		driver.get("https://dev-webs.patoliyainfotech.com/auth");
}
		
}
	
	
	
	
	



	
	

