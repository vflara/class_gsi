package selenium_cucumber.selenium_cucumber.google;

import static org.junit.Assert.*;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.hamcrest.CoreMatchers.*;

import selenium_cucumber.selenium_cucumber.general.Setup;

public class GoogleStep {

	private GoogleSearchPage googleSearchPage;

	public GoogleStep() {
		googleSearchPage = new GoogleSearchPage();
	}

	public void checkIsGooglePage() {
		googleSearchPage.openURL();
		assertThat(Setup.getDriver().getCurrentUrl(), containsString("google.com"));

	}

	public void typeInSearchfield(String searchcriteria) {
		googleSearchPage.fillInputSerachField(searchcriteria);
		Setup.setKeyValueStore("searchcriteria", searchcriteria);

	}

	public void clicksOnbutton(String string) {
		googleSearchPage.clicksOnButtonSerach();

	}

	public void checkSearching() {
		String criteria = Setup.getValueStore("searchcriteria").toString();
		List<WebElement> list = googleSearchPage.getAllH3Tag(criteria);
		assertTrue("There is not matches for this criteria: " + criteria, list.size() > 0);

	}

}
