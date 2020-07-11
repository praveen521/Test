package stepDefinition;

import cucumber.api.java.en.Given;

public class LoginStep {
	
	@Given("^user is already on login page$")
	public void user_is_already_on_login_page() {
		System.out.println("Loggedin success");
	}

}
