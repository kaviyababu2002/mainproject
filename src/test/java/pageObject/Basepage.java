package pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class Basepage {
		WebDriver driver;
		public Actions action;
		public JavascriptExecutor js;
		public Basepage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
}
		
	
