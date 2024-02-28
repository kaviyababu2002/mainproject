package testCases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObject.Googlepage;
import testbase.Baseclass;

public class TC_01_Identifynewbikes_03 extends Baseclass {
	//public Googlepage gp;
	@Test(priority=1,groups= {"sanity"})
	@Parameters({"browser"})
	public void googleVerification(String br) throws InterruptedException {
		 Googlepage gp = new Googlepage(driver);
		 try {
		logger.info("-----Clicking the Login Page-----");
		logger.info("-----Moving to Google page-----");
		logger.info("-----Capturing all error messages-----");
		logger.info("-----Capturing the Final message-----");
		 gp.login();
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
			
}		
}
