package pageObject;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import utilities.Excelutils;

public class Bikepage extends Basepage {

	public Bikepage(WebDriver driver) {
		super(driver);
	}
	  @FindBy(xpath="//a[text()='New Bikes']")
	  WebElement newbike;
	  @FindBy(xpath="//span[text()='Upcoming Bikes']")
	  WebElement upcomingbikes;
	  @FindBy(xpath="//*[@id=\"makeId\"]")
	  WebElement Manufacturers;
	  @FindBy(xpath="//option[text()=\"Honda\"]")
	  WebElement Honda;
	  @FindBy(xpath="//a[text()='Upcoming Bikes Under 1 Lakh']")
	  WebElement scrollToMore;
	  @FindBy (xpath="//*[text()='View More Bikes ']")
	  WebElement viewmore;
	  @FindBy(xpath="//*[text()=\"Honda Bikes\"]")
	  WebElement scrollUp;
	  @FindBy(xpath="//*[@ data-track-label='model-name']")
	  List<WebElement> bikenames;
	  @FindBy(xpath="//*[@class='b fnt-15']")
	  List<WebElement> prices;
	  @FindBy(xpath="//*[@class='clr-try fnt-14']")
	  List<WebElement> launchdates;
	  
	      public void page(){
		     action=new Actions(driver);
			 action.moveToElement(newbike).perform();
			 upcomingbikes.click();
		  }
		  public void filter() {
			  Manufacturers.click();
			  Honda.click();
		  }
		  public void scroll() throws InterruptedException {
			  js=(JavascriptExecutor)driver;
			  Thread.sleep(2000);
			  js.executeScript("arguments[0].scrollIntoView();",scrollToMore);
			  Thread.sleep(2000);
			 js.executeScript("arguments[0].click();", viewmore);
			 Thread.sleep(2000);
			 js.executeScript("arguments[0].scrollIntoView();",scrollUp);
		  }
		  public  void verify() throws IOException {
			  
			  for(int i=0,r=0; i<prices.size(); i++) {
				  String[] s = prices.get(i).getText().split(" ");
				  if(Double.parseDouble(s[1].replace(",","."))<=4.0) {
					  //String y = bikenames.get(i).getText();
					  System.out.println(bikenames.get(i).getText());
					  System.out.println(prices.get(i).getText());
					  System.out.println(launchdates.get(i).getText()+"\n");
					  
					  Excelutils.write("Sheet1", r, 0, bikenames.get(i).getText());
					  Excelutils.write("Sheet1", r, 1, prices.get(i).getText());
					  Excelutils.write("Sheet1", r, 2, launchdates.get(i).getText());
					  r++;
					  
				  }
				  if(s[1].contains(",")) {
					  if(Integer.parseInt( s[1].replace(",", ""))<400000){
						  System.out.println(bikenames.get(i).getText());
						  System.out.println(prices.get(i).getText());
						  System.out.println(launchdates.get(i).getText()+"\n");
					
						  
						  Excelutils.write("Sheet1", r, 0, bikenames.get(i).getText());
						  Excelutils.write("Sheet1", r, 1, prices.get(i).getText());
						  Excelutils.write("Sheet1", r, 2, launchdates.get(i).getText());
						  r++;
					  }
						 // Excelutils.write("Sheet1", 0, 0, bikenames.get(i).getText());
					  
				  }
				  
			  //Excelutils.write("Sheet1", 0, 0, bikenames.get(i).getText());
			  }
		  }
		  
		 
//		  public void bikeandcar() throws InterruptedException {
//			  Bikepage run = new Bikepage(driver);
//			  run.page();
//			  run.filter();
//			  run.scroll();
//			  run.verify();
//}
}
