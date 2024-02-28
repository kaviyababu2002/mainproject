package pageObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

	public class Googlepage extends Basepage {
		
		public Googlepage(WebDriver driver) {
			super(driver);
		}
		 
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		  
		 @FindBy(xpath="//span[text()=\"Home\"]")
		  WebElement home;

		  @FindBy(xpath="//*[@id=\"des_lIcon\"]")
		  WebElement login;
		  
		  @FindBy(xpath="//*[@data-track-label=\"Popup_Login/Register_with_Google\"]")
		  WebElement google;
		  
		  @FindBy(xpath="//*[@id='identifierId']")
		  WebElement maillogin; 

		 
		  @FindBy(xpath="//*[text()=\"Next\"]")
		  WebElement next;
		  
		  @FindBy(xpath="//*[text()=\"Enter an email or phone number\"]")
		  WebElement Emptymail; 
		  
		  @FindBy(xpath="//*[text()=\"Couldn’t find your Google Account\"]")
		  WebElement mailerror;
		  
		  @FindBy(xpath="//div[starts-with(text(),'Try using a different browser')]")
		  WebElement Finalmessage;
		  
		  public void login() throws InterruptedException {
		  		
		  		
		  		js.executeScript("arguments[0].click();", home);
		  		login.click();
		  		Thread.sleep(3000);
		  		js.executeScript("arguments[0].click();", google);
		  		
		  		Set<String> windows = driver.getWindowHandles();
		  		List<String> windowids=new ArrayList<String>(windows);
		  		String carwindow = windowids.get(0);
		  		String googlewindow = windowids.get(1);
		  		driver.switchTo().window(googlewindow);
		  		driver.manage().window().maximize();
		  		
		  		
		  		maillogin.sendKeys("  ");
		  		next.click();
		  		Thread.sleep(3000);
		  		System.out.println("The Empty mail message is:  " + Emptymail.getText()+"\n");
		  		maillogin.sendKeys("hoi");
		  		next.click();
		  		Thread.sleep(3000);
		  		System.out.println("The incorrect mail error message is:  " + mailerror.getText()+"\n");
		  		maillogin.clear();
		  		maillogin.sendKeys("kaviyaglory");
		  		Thread.sleep(2000);
		  		next.click();
		  		Thread.sleep(3000);
		  		String msg = Finalmessage.getText();
		  		System.out.println("The Final message is: "+ msg);
		  		
		  	}

	}
	

