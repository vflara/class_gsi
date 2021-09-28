package selenium_cucumber.selenium_cucumber.general;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.util.HashMap;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public final class Setup {
	private static WebDriver driver;
	private static HashMap<String, Object> store = new HashMap();
	private static JavascriptExecutor jsExecutor;
	private static Actions actions;

	@Before
	private void InitSetup() {
		String browser = System.getProperty("browser");
		System.setProperty("webdriver.chrome.driver", "D://Documents//QA-Automation//Google//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		driver = new ChromeDriver(options);
	}

	private static void initObject() {
		actions = new Actions(driver);
	}

}
