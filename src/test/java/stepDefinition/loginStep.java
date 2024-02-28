package stepDefinition;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObject.Googlepage;

public class loginStep {
	Googlepage gp;
	@Given("User navigate to the homepage again")
	public void user_navigate_to_the_homepage_again() {
	    gp=new Googlepage(BaseClass.getDriver());
	}

	@Then("User clicks the login and clicks the google and enters the mail id and capture error message")
	public void user_clicks_the_login_and_clicks_the_google_and_enters_the_mail_id_and_capture_error_message() {
	   try {
		   BaseClass.getLogger().info("Capturing an error message");
		gp.login();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
