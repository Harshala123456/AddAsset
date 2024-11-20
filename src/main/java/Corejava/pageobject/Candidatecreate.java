package Corejava.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import parent.Abstractcomponent.Abstractcomponent;

public class Candidatecreate extends  Abstractcomponent {
	
	
	
	 WebDriver driver;
	 
		public  Candidatecreate (WebDriver driver)
		{
			
			super(driver);
			//initializatio
			this.driver=driver;
			PageFactory.initElements(driver,this);
	   }

		@FindBy(css=".modal-content")
		WebElement Createbutton;
		
		@FindBy(css="#kt_interview")
		WebElement CreateinterviewBy;

		By CreatebuttonBy = By.cssSelector(".modal-content");
		By Createinterview = By.cssSelector("#kt_interview");
		
		public WebElement getCandidate() {
			
			waitForElementToAppear(CreatebuttonBy);
			return Createbutton;
		}
	
        public WebElement getInterview () {
			
			waitForElementToAppear(Createinterview);
			return CreateinterviewBy;
		}
		
}	
	


