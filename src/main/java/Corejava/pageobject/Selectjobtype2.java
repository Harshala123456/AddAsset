package Corejava.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selectjobtype2 {

	WebDriver driver;

	public Selectjobtype2(WebDriver driver) {
		
		//initialization
		
				this.driver=driver;
				PageFactory.initElements(driver,this);
	}

	// sing @FindBy to locate the elements
	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/form/div[1]/div[1]/div/div[1]/div[2]")
	 WebElement openDropdwon;

	@FindBy(xpath = "//div[@id='react-select-12-option-1']")
	 WebElement selectjob;
	
	public void jobselection() 
	{	
		
		openDropdwon.click();
		selectjob.click();
		
	}
	
}

//iver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/form/div[1]/div[1]/div[1]")).click();//opren
//List<WebElement> joboptions = driver.findElements(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/form/div[1]/div[1]/div[2]/div/div[2]/div/span"));select
//Optional<WebElement> optionToSelect = joboptions.stream().filter(option -> "JavaScript".equalsIgnoreCase(option.getText())).findFirst();
//optionToSelect.ifPresent(WebElement::click);