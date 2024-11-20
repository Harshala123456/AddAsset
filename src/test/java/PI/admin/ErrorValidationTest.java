package PI.admin;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Corejava.pageobject.Candidatecreate;
import Corejava.pageobject.SelectAreaofinterest;
import Corejava.pageobject.Selectjobtype2;
import Corejava.pageobject.Selectotheroption;
import PI.TestComponents.Basetest;

public class ErrorValidationTest extends Basetest {

	@Test (groups= {"ErrorHandling"})
	public void SubmitOrder() throws IOException
	{

		 landingPage.loginApplication("patoliya.dm1@gmail.com", "Password@12");
			Assert.assertEquals("Incorrect credentials or wrong pass1@word", landingPage.getErrorMessage());
			
	}
			@Test
			public void candidateErrorValidation () throws IOException
			{

			landingPage.loginApplication("hr@patoliyainfotech.com","Hr@patoliya12345");
			
			// Click on sider bar dropdawn
			driver.findElement(By.xpath("//a[@href='/dashboard']//i[contains(@class,'ki-duotone ki-down')]")).click();
			driver.get("https://dev-webs.patoliyainfotech.com/recruit/candidates/all");
			driver.findElement(By.cssSelector(".ki-duotone.ki-plus.fs-2")).click();
			Candidatecreate Candidatecreate = new Candidatecreate(driver);
			
			String jobName = "Human Resource"; //select job type
			Selectjobtype2 Selectjobtype2 = new Selectjobtype2(driver);
			Selectjobtype2.jobselection();
			
			SelectAreaofinterest SelectAreaofinterest = new SelectAreaofinterest(driver); //select area of interest
			SelectAreaofinterest.areaOfinterest();
			
			String first = "diskha"; // candidate details
			String last = "patel";
			String email ="diksha@gmail.com";
			String phone = "8955856922";
			Selectotheroption Selectotheroption = new Selectotheroption  (driver);
			Selectotheroption.addfewdetails(first, last, email, phone);
			
			
			//Add candidate in interview module
			
		//	driver.findElement(By.cssSelector("a[href='/interviews']")).click();
	
}
}