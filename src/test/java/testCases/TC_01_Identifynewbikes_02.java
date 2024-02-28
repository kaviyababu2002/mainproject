package testCases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObject.Carpage;
import testbase.Baseclass;

public class TC_01_Identifynewbikes_02 extends Baseclass{
	@Test(priority=1,groups= {"sanity"})
	@Parameters({"browser"})
	public void carVerification(String br)  {
		Carpage cp = new Carpage(driver);
		logger.info("-----Choosing Used Cars-----");
		logger.info("-----Clicking place Chennai-----");
		logger.info("-----Capturing Maruti 800-----");
		logger.info("-----Capturing Maruti Swift Dzire-----");
		logger.info("-----Capturing Maruti Swift-----");
		  try {
		  cp.cars();
		  Thread.sleep(3000);
		  cp.clic();
		  Thread.sleep(3000);
		  cp.click();
		  cp.move();
		  cp.car3();
		  }
		  catch(Exception e) {
			  e.printStackTrace();
		  }
	}
	@Test(priority=2,groups= {"sanity","regression"})
	@Parameters({"browser"})
	public void carVerification2(String br)  {
		Carpage cp = new Carpage(driver);
		logger.info("-----Capturing hyundai-----");
		logger.info("-----Capturing hyundaiSantro-----");
		  try {
		  cp.car4();
		  cp.car5();
		  cp.car6();
		
		  }
		  catch(Exception e) {
			  e.printStackTrace();
		  }
	}
	@Test(priority=3,groups= {"sanity","regression"})
	@Parameters({"browser"})
	public void carVerification3(String br) {
		Carpage cp = new Carpage(driver);
		logger.info("-----Capturing Honda-----");
		logger.info("-----Capturing Toyota Innova-----");
		  try {
		  cp.car7();
		  cp.car8();
		  }
		  catch(Exception e) {
			  e.printStackTrace();
		  }
	}
	@Test(priority=4,groups= {"sanity","regression"})
	@Parameters({"browser"})
	public void carVerification4(String br) {
		Carpage cp = new Carpage(driver);
		logger.info("-----Capturing Toyota Fortuner-----");
		 logger.info("-----Capturing Mahindra-----");
		  try {
		  cp.car9();
		  cp.car10();
		  
		  }
		  catch(Exception e) {
			  e.printStackTrace();
		  }
	}
}
