package Corejava.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AssetsFields {
	
		WebDriver driver;

		public  AssetsFields (WebDriver driver) {
			
			//initialization
			
					this.driver = driver ;
					PageFactory.initElements(driver,this);
		}
	
		
		@FindBy(xpath = "/html/body/div[1]/div[1]/div/div[2]/div[1]/div[2]/div/div[1]/div[7]/a")
		WebElement ClickAssetmodule;
		
		@FindBy(xpath = "/html/body/div[1]/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div/div[1]/div[1]/a")
		WebElement AssetData;
		
		@FindBy(css = ".ki-duotone.ki-plus.fs-2.false")
		WebElement Create;
		
		@FindBy(css= "input[placeholder='Name']")
		WebElement AssetName;
		
		@FindBy(xpath= "/html/body/div[1]/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div/div/form/div[2]/div[1]/div[1]/div[1]/div[2]/input")
		WebElement Category;
		
		@FindBy(xpath= "//span[text()='Notes']")
		WebElement SelectCategory;
		
		@FindBy(xpath= "/html/body/div[1]/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div/div/form/div[3]/div[1]/div[1]/div[1]/div[2]/input")
		WebElement Vendor;
		
		@FindBy(xpath= "//span[text()='Amazon']")
		WebElement SelectVendor;
		
		@FindBy(xpath= "/html/body/div[1]/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div/div/form/div[6]/div[1]/div/div[1]/div[2]/input")
		WebElement Condition;
		
		@FindBy(xpath= "//span[text()='Good']")
		WebElement SelectCondition;
		
		@FindBy(css= "input[placeholder='Purchased On']")
		WebElement PurchaseDate;
		
		@FindBy(xpath= "//span[@aria-label='November 12, 2024']")
		WebElement SelectDate;
		
		@FindBy(xpath= "/html/body/div[1]/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div/div/form/div[8]/div[1]/div/div[1]/div[2]/input")
		WebElement Location;
		
		@FindBy(xpath= "//span[text()='Ahmedabad']")
		WebElement SelectLocation;
		
		@FindBy(css= "input[placeholder='Price']")
		WebElement Price;
		@FindBy(css= "input[type='file'][id='fileInput']")
		WebElement Billpdf;
		
		
		@FindBy(xpath= "//span[text()='Submit']")
		WebElement Submit;
		
		
		public void AddAsset(String assetname)
		{
		
		ClickAssetmodule.click();	
		AssetData.click();
		Create.click();
		AssetName.sendKeys(assetname);
		Category.click();
		SelectCategory.click();
		Vendor.click();
		SelectVendor.click();
		Condition.click();
		SelectCondition.click();
		PurchaseDate.click();
		SelectDate.click();
		Location.click();
        SelectLocation.click(); 
        Price.sendKeys("550");
        Billpdf.sendKeys("C:\\Users\\PI-27\\Downloads\\Capture 1.png");
        Submit.click();
        
		}

		      	
}
	
	


