package Corejava.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateInterview {

	
	WebDriver driver;

	public CreateInterview (WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div[2]/div/div[2]/form/div[1]/div[2]/div[1]/div[1]/div[2]/input")
	WebElement openCandDropdwon;

	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div[2]/div/div[2]/form/div[1]/div[2]/div[2]/div/div[3]/div/span")
	WebElement selectCandName;

	public void showCadidates ()
	{
		openCandDropdwon.click();
		selectCandName.click();

	}

	
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div[2]/div/div[2]/form/div[2]/div[2]/div/div[1]/div[2]")
	WebElement intervieTypeDropdwon;

	@FindBy(xpath = "//span[normalize-space()='On site interview']")
	WebElement selectType;

	public void interviewType ()
	{
		intervieTypeDropdwon.click();
		selectType.click();

	}
	
	
	@FindBy(css= "[aria-label='September 25, 2024']")
	WebElement Selectdate;
	
    @FindBy(css =".indicator-label")
	WebElement submit;
	
	public void interviewDate ()
	{
		Selectdate.click();
		submit.click();
	}

	

	

}
	
	
	

