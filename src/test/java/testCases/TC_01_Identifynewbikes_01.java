package testCases;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObject.Bikepage;
import testbase.Baseclass;


public class TC_01_Identifynewbikes_01 extends Baseclass{

	@Test(priority=1,groups= {"sanity"})
	@Parameters({"browser"})
	public void bikeVerification(String br) throws InterruptedException, IOException {
		Bikepage bp = new Bikepage(driver);
		logger.info("-----Finding Upcoming Bikes-----");
			bp.page();
		logger.info("-----Choosing Specifically Honda Bikes-----");	
			bp.filter();
	}
	@Test(priority=2,groups= {"sanity","regression"})
	@Parameters({"browser"})
			public void bikeVerification1(String br) throws InterruptedException, IOException {
		    Bikepage bp = new Bikepage(driver);
		    logger.info("-----Capturing all the Honda Bikes-----");
			bp.scroll();
			logger.info("-----Printing all Honda Bikes with Prices-----");
			bp.verify();
}	
	

}
