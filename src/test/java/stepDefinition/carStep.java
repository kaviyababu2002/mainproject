package stepDefinition;

import java.io.IOException;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Carpage;

public class carStep {
	Carpage cp;
	@Given("User navigates to the main homepage")
	public void user_navigates_to_the_main_homepage() {
	   cp=new Carpage(BaseClass.getDriver());
	}
	@When("User clicks the used cars and selects Chennai")
	public void user_clicks_the_used_cars_and_selects_chennai() {
		BaseClass.getLogger().info("Clicking the used cars and chennai");
	    cp.cars();
	}

	@When("User navigates to the popular brand and selects maruthi {int}")
	public void user_navigates_to_the_popular_brand_and_selects_maruthi(Integer int1) {
		BaseClass.getLogger().info("Clicking maruti 800 in popular brand");
	    cp.clic();
	}

	@When("User displays the car name and car prices")
	public void user_displays_the_car_name_and_car_prices() {
		BaseClass.getLogger().info("Capturing car names and prices");
	    try {
			cp.click();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("User unselects maruti {int} and clicks maruthi dzire and displays the car name and car prices")
	public void user_unselects_maruti_and_clicks_maruthi_dzire_and_displays_the_car_name_and_car_prices(Integer int1) {
	   try {
		   BaseClass.getLogger().info("Capturing all car names and prices");
		cp.move();
	}  catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	@Then("User Displays the car names and price for all popular brands")
	public void user_displays_the_car_names_and_price_for_all_popular_brands() {
	   try {
		cp.car3();
	   cp.car4();
	   cp.car5();
	   cp.car6();
	   cp.car7();
	   cp.car8();
	   cp.car9();
	   cp.car10();
	   }catch(Exception e) {
		   e.printStackTrace();
	   }
	}
}
