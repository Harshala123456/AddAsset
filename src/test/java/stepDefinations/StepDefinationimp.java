package stepDefinations;

import java.io.IOException;

import Corejava.pageobject.Landingpage;
import Corejava.pageobject.Selectjobtype2;
import PI.TestComponents.Basetest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepDefinationimp extends  Basetest {

	public Landingpage landingPage;
	
	@Given ("I landed on admin page")
	public void  I_landed_on_admin_page() throws IOException 
	{
		
		landingPage=launchingApplication() ;
	}
	
	@Given ("^Logged in with email (.+) and password(.+)$") 
	public void logged_in_with_email_and_password(String email, String password)
	{
		landingPage.loginApplication(email,password); 
		
	
	}

	@Then("^I select job name$")
	public void I_select_job_name()
	{
		String jobName = "Human Resource"; //select job type
		Selectjobtype2 Selectjobtype2 = new Selectjobtype2(driver);
		Selectjobtype2.jobselection();
	
	}
	
	//@Then("")
	
	
	
	
	
}