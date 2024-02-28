package stepDefinition;

import java.io.IOException;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Bikepage;

public class bikeStep {
	Bikepage bp;
	@Given("User navigates to the homepage")
	public void user_navigates_to_the_homepage() {
	   bp=new Bikepage(BaseClass.getDriver());
	}

	@When("User clicks on to the upcoming bikes")
	public void user_clicks_on_to_the_upcoming_bikes() {
	    bp.page();
	    BaseClass.getLogger().info("Clicking the Upcoming Bikes");
	}

	@When("User clicks on to the Honda in manufacturers")
	public void user_clicks_on_to_the_honda_in_manufacturers() {
	   bp.filter();
	   BaseClass.getLogger().info("Clicking the Honda Bikes in manufacturers");
	}

	@When("User scroll to bottom and clicks on to the view more bikes and scroll back up")
	public void user_scroll_to_bottom_and_clicks_on_to_the_view_more_bikes_and_scroll_back_up() {
	   try {
		bp.scroll();
		BaseClass.getLogger().info("Scrolling to the bottom to view more bikes");
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	@Then("User displays the bikes name and price with in {int} lakhs")
	public void user_displays_the_bikes_name_and_price_with_in_lakhs(Integer int1) {
	   try {
		bp.verify();
		BaseClass.getLogger().info("Capturing the bike names and prices");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	
}
