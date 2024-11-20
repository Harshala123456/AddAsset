package Corejava.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import parent.Abstractcomponent.Abstractcomponent;

public class Selectotheroption extends Abstractcomponent{

	WebDriver driver;

	 
		public Selectotheroption (WebDriver driver)
		{
			super(driver);
			this.driver=driver;
			PageFactory.initElements(driver,this);
	   }
		
	    //WebElement userEmails = driver.findElement(By.id("userEmail"));
	 	//pageFactory
		
		@FindBy(xpath = "/html/body/div[1]/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/form/div[3]/input")
		WebElement Firstname;
		
		@FindBy(xpath= "/html/body/div[1]/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/form/div[4]/input")
		WebElement Lastname;
		
		@FindBy(xpath = "/html/body/div[1]/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/form/div[5]/input")
		WebElement Email;
		
		@FindBy(xpath= "/html/body/div[1]/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/form/div[6]/div[1]/div/input")
		WebElement PhoneField;
		
		@FindBy(xpath ="/html/body/div[1]/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/form/div[9]/button[1]/span")
		WebElement submit;
		
		
		
		
		public void addfewdetails (String first, String last ,String email, String phone)
		{
			
			
			
			Firstname.sendKeys(first);
			Lastname.sendKeys(last); // corrected literal
			Email.sendKeys(email);
			PhoneField.sendKeys(phone); // phone should be string
			submit.click();
		}
		
}