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
		googleSearchPage.getWebElement(By.xpath("//input[@title='Search' and @role='combobox']"))
				.sendKeys(searchcriteria);
		Setup.setKeyValueStore("searchcriteria", searchcriteria);

	}

	public void clicksOnbutton(String string) {
		googleSearchPage.cliksOnButton(By.xpath(
				"//div[contains(@class,'FPdoLc')]/descendant::input[@value='Google Search' and @type='submit']"));

	}

	public void checkSearching() {
		String criteria = Setup.getValueStore("searchcriteria").toString();
		List<WebElement> list = googleSearchPage
				.getWebElements(By.xpath("//h3[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', '" + criteria
						+ "'),'cut" + criteria + "')]"));
		assertTrue("There is not matches for this criteria: " + criteria, list.size() > 0);

	}

}
