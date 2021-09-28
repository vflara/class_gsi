package selenium_cucumber.selenium_cucumber.google;

import io.cucumber.java.en.*;

public class GoogleStepDefinitions {

	private GoogleStep googleStep;

	public GoogleStepDefinitions() {
		googleStep=new GoogleStep();
		
	}

	@Given("User is on google page")
	public void user_is_on_google_page() {
		googleStep.checkIsGooglePage();
	}

	@When("User types for {word}")
	public void user_types_for(String word) {
		googleStep.typeInSearchfield(word);

	}
	@When("User clicks on {string} button")
	public void user_clicks_on_button(String string) {
	   googleStep.clicksOnbutton(string);
	}

	@Then("The system browses for the animal")
	public void the_system_browses_for_the_animal() {
		googleStep.checkSearching();
		
	}

}
