package Corejava.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import parent.Abstractcomponent.Abstractcomponent;

public class Candidateredirection extends  Abstractcomponent {

	WebDriver driver;
	 
	public Candidateredirection (WebDriver driver)
	{
		//initialization
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
   }
	
	
	@FindBy(xpath = "//a[@href='/dashboard']//i[contains(@class,'ki-duotone ki-down')]")
	WebElement Dashboard;
	
	@FindBy(css=".btn-label")
	WebElement Switch;
	
	@FindBy(xpath = "//span[normalize-space()='Recruit']")
	WebElement Recruiter;
	
	@FindBy(css ="//body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]")
	WebElement Candidate;
	
	@FindBy(css ="a[href='/recruit/candidates/all\']")
	WebElement Viewallclick;
	
	
	@FindBy(xpath = "//span[normalize-space()='Candidate']")
	WebElement ClickCandidate;
	
	@FindBy(xpath = "//span[normalize-space()='All Candidates']")
	WebElement Allcandidate;

	@FindBy(css=".ki-duotone.ki-plus.fs-2")
	WebElement Clickcreatebutton;
	
	@FindBy(xpath = "//span[normalize-space()='Quick Add Candidate']")
	WebElement ClickQc;
	
	

	public void  SiderbarClick() throws InterruptedException
	{
		Thread.sleep(3000);
		Switch.click();
		Recruiter.click();
		Thread.sleep(2000);
		Candidate.click();
		Viewallclick.click();
	    Allcandidate.click();
		Clickcreatebutton.click();
		ClickQc.click();
     
	}

}