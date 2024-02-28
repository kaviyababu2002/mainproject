package pageObject;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import utilities.Excelutils;

public class Carpage extends Basepage {
	
	public Carpage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//*[text()=\"Used Cars\"]")
	  WebElement usedcars;
	  
	  @FindBy(xpath="(//span[text()='Chennai'])[1]")
	  WebElement chennai;
	  
	  @FindBy(xpath="//label[normalize-space()='Maruti 800']")
	  WebElement Maruti800;
	  
	  @FindBy(xpath="//a[@data-track-component='used-car-listing' and @data-track-label='Car-name']")
	  List<WebElement> carsName;

	  @FindBy(xpath="//span[starts-with(@class,'zw-cmn-price')]")
	  List<WebElement> carsPrice;
	  
	  @FindBy(xpath="//label[normalize-space()='Maruti Swift Dzire']")
	  WebElement marutidzire;
	  
	  @FindBy(xpath="//label[normalize-space()='Maruti Swift']")
	  WebElement marutiSwift;

	  @FindBy(xpath="//label[normalize-space()='Hyundai I10']")
	  WebElement hyundai;
	  
	  @FindBy(xpath="//label[normalize-space()='Hyundai Santro Xing']")
	  WebElement hyundaiSantro;
	  
	  @FindBy(xpath="//label[normalize-space()='Honda City']")
	  WebElement honda;

	  @FindBy(xpath="//label[normalize-space()='Toyota Innova']")
	  WebElement toyotaInnova;
	  
	  @FindBy(xpath="//label[normalize-space()='Toyota Fortuner']")
	  WebElement toyotaFortuner;
	  
	  @FindBy(xpath="//label[normalize-space()='Mahindra XUV500']")
	  WebElement mahindra;
	  
	  @FindBy(xpath="//*[@id='mmvLi_21_314']/label")
	  WebElement scroll;
	  
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  
	  public void cars() {
	  		action=new Actions(driver);
	  		action.moveToElement(usedcars).perform();
	  		chennai.click();
	  	}
	 
	  	public void clic() {
	  		 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	  		
	  		 js.executeScript("arguments[0].click();", Maruti800);
//	  		 Maruti800.click();
	  		
	  	}
	  	public void click() throws IOException {
	  		for(int i=0,t=0; i<carsName.size(); i++,t++) {
	  			String carname=carsName.get(i).getText();
	  			System.out.println(carname);
	  			String carprice=carsPrice.get(i).getText();
	  			System.out.println(carprice+"\n");
	  			Excelutils.write("Sheet1", t, 3, carname);
	  			Excelutils.write("Sheet1", t, 4, carprice);
	  		}	
	  	}
	  	
	  	public void move() throws InterruptedException, IOException {
	  		js.executeScript("arguments[0].click();", Maruti800);
	  		try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	  		
	  		js.executeScript("arguments[0].click();", marutidzire);
	  		Thread.sleep(2000);
	  		
	  		for(int i=0,t=7; i<10; i++,t++) {
	  			String carname=carsName.get(i).getText();
	  			System.out.println(carname);
	  			String carprice=carsPrice.get(i).getText();
	  			System.out.println(carprice+"\n");
	  			Excelutils.write("Sheet1", t, 3, carname);
	  			Excelutils.write("Sheet1", t, 4, carprice);
	  		}	
	  	
	  	}
	  	
	  	public void car3() throws InterruptedException, IOException {
	  		js.executeScript("arguments[0].click();", marutidzire);
	  		Thread.sleep(2000);
	  		
	  		js.executeScript("arguments[0].click();", marutiSwift);
	  		Thread.sleep(2000);
	  		
	  		for(int i=0,t=17; i<10; i++,t++) {
	  			String carname=carsName.get(i).getText();
	  			System.out.println(carname);
	  			String carprice=carsPrice.get(i).getText();
	  			System.out.println(carprice+"\n");
	  			Excelutils.write("Sheet1", t, 3, carname);
	  			Excelutils.write("Sheet1", t, 4, carprice);
	  		}	
	  	}
	  	
	  	public void car4() throws InterruptedException, IOException {
	  		
	  		js.executeScript("arguments[0].click();", marutiSwift);
	  		Thread.sleep(2000);
	  		
	  		js.executeScript("arguments[0].click();", hyundai);
	  		Thread.sleep(2000);
	  		
	  		for(int i=0,t=27; i<10; i++,t++) {
	  			String carname=carsName.get(i).getText();
	  			System.out.println(carname);
	  			String carprice=carsPrice.get(i).getText();
	  			System.out.println(carprice+"\n");
	  			Excelutils.write("Sheet1", t, 3, carname);
	  			Excelutils.write("Sheet1", t, 4, carprice);
	  		}	
	  	}
	  	
		public void car5() throws InterruptedException, IOException {
		  		
		  		js.executeScript("arguments[0].click();", hyundai);
		  		Thread.sleep(2000);
		  		
		  		js.executeScript("arguments[0].click();", hyundaiSantro);
		  		Thread.sleep(2000);
		  		
		  		for(int i=0,t=37; i<10; i++,t++) {
		  			String carname=carsName.get(i).getText();
		  			System.out.println(carname);
		  			String carprice=carsPrice.get(i).getText();
		  			System.out.println(carprice+"\n");
		  			Excelutils.write("Sheet1", t, 3, carname);
		  			Excelutils.write("Sheet1", t, 4, carprice);
		  		}	
		  	}
		 
		public void car6() throws InterruptedException, IOException {
	  		
	  		js.executeScript("arguments[0].click();", hyundaiSantro);
	  		Thread.sleep(2000);
	  		
	  		js.executeScript("arguments[0].scrollIntoView();", mahindra);
	  		 Thread.sleep(2000);
	  		
	  		js.executeScript("arguments[0].click();", honda);
	  		Thread.sleep(2000);
	  		
	  		for(int i=0,t=47; i<10; i++,t++) {
	  			String carname=carsName.get(i).getText();
	  			System.out.println(carname);
	  			String carprice=carsPrice.get(i).getText();
	  			System.out.println(carprice+"\n");
	  			Excelutils.write("Sheet1", t, 3, carname);
	  			Excelutils.write("Sheet1", t, 4, carprice);
	  		}	
	  	}
	 
		public void car7() throws InterruptedException, IOException {
		  		
		  		js.executeScript("arguments[0].click();", honda);
		  		Thread.sleep(2000);
		  		
		  		js.executeScript("arguments[0].click();", toyotaInnova);
		  		Thread.sleep(2000);
		  		
		  		for(int i=0,t=57; i<10; i++,t++) {
		  			String carname=carsName.get(i).getText();
		  			System.out.println(carname);
		  			String carprice=carsPrice.get(i).getText();
		  			System.out.println(carprice+"\n");
		  			Excelutils.write("Sheet1", t, 3, carname);
		  			Excelutils.write("Sheet1", t, 4, carprice);
		  		}	
		  		
		  		
		  	}
		public void car8 () throws InterruptedException {
	  		
	  		js.executeScript("arguments[0].click();", toyotaInnova);
	  		Thread.sleep(2000);
	  		
		}
		public void car9() throws InterruptedException, IOException{
	  		
	  		js.executeScript("arguments[0].click();", toyotaFortuner);
	 		Thread.sleep(2000);
	 		for(int i=0,t=65; i<8; i++,t++) {
	 			String carname=carsName.get(i).getText();
	  			System.out.println(carname);
	  			String carprice=carsPrice.get(i).getText();
	  			System.out.println(carprice+"\n");
	  			Excelutils.write("Sheet1", t, 3, carname);
	  			Excelutils.write("Sheet1", t, 4, carprice);
	  		}	
	  	}
		public void car10() throws InterruptedException, IOException {
	  		
	  		js.executeScript("arguments[0].click();", toyotaFortuner);
	  		Thread.sleep(2000);
	  		
	  		js.executeScript("arguments[0].click();", mahindra);
	  		Thread.sleep(2000);
	  		
	  		for(int i=0,t=75; i<10; i++,t++) {
	  			String carname=carsName.get(i).getText();
	  			System.out.println(carname);
	  			String carprice=carsPrice.get(i).getText();
	  			System.out.println(carprice+"\n");
	  			Excelutils.write("Sheet1", t, 3, carname);
	  			Excelutils.write("Sheet1", t, 4, carprice);
	  		}	
	  	}
	  
//	  public void bikeandcar() throws InterruptedException {
//	  Carpage run = new Carpage(driver);
//	  run.cars();
//	  Thread.sleep(3000);
//	  run.clic();
//	  Thread.sleep(3000);
//	  run.click();
//	  run.move();
//	  run.clickCars();
//	  run.car3();
//	  run.clickCars();
//	  run.car4();
//	  run.clickCars();
//	  run.car5();
//	  run.clickCars();
//	  run.car6();
//	  run.clickCars();
//	  run.car7();
//	  run.clickCars();
//	  run.car8();
//	  run.car9();
//	  run.car10();
//	  run.clickCars();
//	  
//}
}
