package Corejava.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectCandidatename {

	
	
	WebDriver driver;

	public SelectCandidatename (WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/form/div[2]/div[1]/div[1]")
	WebElement openCandidateDropdwon;

	@FindBy(xpath = "//span[text()='AI/ML'][1]")
	WebElement SelectCandName;

	public void areaOfinterest()
	{
		
		openCandidateDropdwon.click();
		SelectCandName.click();

	}

}

