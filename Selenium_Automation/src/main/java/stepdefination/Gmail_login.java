package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Gmail_login {
	@Given("User should be registered")

	void precondition(){
		
		System.out.print("user is registered :");
		
	}
	@When("open gmail login page, enter valid credentials")
	void teststep() {
		
		System.out.println("Email : markjones123@gmail.com & password : mark@619");
		
	}
	@Then("Gmail should be successfull")
	void expected() {
		
		System.out.println("Login Sucessfull");
		
	}

}
