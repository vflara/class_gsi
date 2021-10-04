package selenium_cucumber.selenium_cucumber.goheavy.login.page;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import selenium_cucumber.selenium_cucumber.general.PageObject;

public class LoginPage extends PageObject {

	public LoginPage() {
		super();
		this.urlpath = "/login";

	}

	public HashMap<String, WebElement> fillCredentials(String email, String password) {

		WebElement email_element = getWebElement(By.id("email"));
		email_element.sendKeys(email);
		WebElement pass_element = getWebElement(By.id("password"));
		pass_element.sendKeys(password);

		HashMap<String, WebElement> eles = new HashMap<String, WebElement>();
		eles.put("email", email_element);
		eles.put("password", pass_element);
		return eles;
	}

	public void clickOnButtons() {
		getWebElement(By.xpath("//*[@id=\"admin-form-session\"]/button")).click();

	}

}
