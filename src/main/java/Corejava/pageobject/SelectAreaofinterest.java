package Corejava.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import parent.Abstractcomponent.Abstractcomponent;

public class SelectAreaofinterest extends Abstractcomponent {

	WebDriver driver;

	public SelectAreaofinterest(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/form/div[2]/div[1]/div[1]")
	WebElement openDropdwon1;

	@FindBy(xpath = "//span[text()='AI/ML'][1]")
	WebElement selectAreaoptions;

	public void areaOfinterest()
	{
		
		openDropdwon1.click();
		selectAreaoptions.click();

	}

}
