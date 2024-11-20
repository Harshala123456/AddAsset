package stepDefinations;

import java.io.IOException;

import Corejava.pageobject.AssetsFields;
import Corejava.pageobject.Landingpage;
import PI.TestComponents.Basetest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDefinationasset extends Basetest {

	 public Landingpage landingPage;
	 
	 
	@Given ("I landed on Admin site")
	
	public void  i_landed_on_admin_site()  throws IOException
	{
		//code
		landingPage= launchingApplication();
	}
	
	@Given ("^Logged in with (.+) and (.+)$")
	
	public void logged_in_with_email_and_password(String email,String password)
	{
	
		landingPage.loginApplication(email,password);	
	}
	
	@When("^I add asset (.+)$")
	public void i_add_asset(String assetname)
	{
		 AssetsFields AssetsFields = new AssetsFields(driver);
			AssetsFields.AddAsset(assetname);
	}
}
	
	

