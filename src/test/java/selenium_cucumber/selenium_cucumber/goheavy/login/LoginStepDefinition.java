package selenium_cucumber.selenium_cucumber.goheavy.login;

import java.io.InputStream;
import java.util.Properties;

import io.cucumber.java.en.*;
import selenium_cucumber.selenium_cucumber.general.Setup;
import selenium_cucumber.selenium_cucumber.general.Steps;
import selenium_cucumber.selenium_cucumber.goheavy.dashboard.DashboardStep;
import selenium_cucumber.selenium_cucumber.goheavy.driver.DriverStep;
import selenium_cucumber.selenium_cucumber.goheavy.fleetowners.FleetStep;

public class LoginStepDefinition {
	private LoginStep loginStep;

	public LoginStepDefinition() {
		loginStep = new LoginStep();

	}

	@Given("The unauthenticated GoHeavy User is in the Login view")
	public void the_unauthenticated_go_heavy_user_is_in_the_view() {
		loginStep.the_unauthenticated_go_heavy_user_is_in_the_view();
	}

	@When("User insert email {string} and password {string}")
	public void user_insert_email_and_password(String string, String string2) {
		loginStep.user_insert_email_and_password(string, string2);
	}

	@When("User clicks on the \"Sign in\" button")
	public void user_clicks_on_the_button() {
		loginStep.user_clicks_on_the_button();
	}

	@Then("The system allows the user access to the system")
	public void the_system_allows_the_user_access_to_the_system() {
		loginStep.the_system_allows_the_user_access_to_the_system();

	}

	@Then("System redirects to {string} view")
	public void sytem_redirects_to_dashboard_view(String string) {
		Steps view = new DashboardStep();
		if ("Drivers List".equalsIgnoreCase(string))
			view = new DriverStep();
		else if ("Fleet Owners List".equalsIgnoreCase(string))
			view = new FleetStep();
		view.checkPage();

	}


}
