package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps 
{
	@Given("I open a chrome browser and navigate to website")
	public void i_open_a_chrome_browser_and_navigate_to_website() 
	{

		System.out.println("In Given");
	}

	@When("I login without entering username and password")
	public void i_login_without_entering_username_and_password() 
	{
		System.out.println("In When");
	}

	@Then("Username Error and Password Error should appear")
	public void username_error_and_password_error_should_appear() 
	{
		System.out.println("In Then");
	}
}
