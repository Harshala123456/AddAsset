package PI.admin;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Corejava.pageobject.AssetsFields;
import Corejava.pageobject.Landingpage;
import PI.TestComponents.Basetest;

public class AddAssets extends Basetest {

	@Test(dataProvider="getData", groups= {"Newasset"})
		public void asset (HashMap<String,String>input) throws IOException
		{
		Landingpage landingPage = launchingApplication();
		landingPage.loginApplication(input.get("email"),input.get("password"));	
        AssetsFields AssetsFields = new AssetsFields(driver);
		AssetsFields.AddAsset(input.get("assetname"));
		
		}
		
	    @DataProvider
	    public Object[][] getData() throws IOException
	    {
	   
	    	//HashMap<String,String> map = new  HashMap<String,String>();
	    	//map.put("email","patoliya.dm1@gmail.com");
	    	//map.put("password","Password@1");
	    	//map.put("assetname", "HP");
	    	
	    	 List<HashMap<String,String>> data = getJsonDataToMap("C:\\Harshala P\\eclipse-workspace\\SeleniumFramworkDesign\\src\\test\\java\\PI\\Data\\Assets.json");
			return new  Object[][] {{data.get(0)}};
	    
			
	}

}
