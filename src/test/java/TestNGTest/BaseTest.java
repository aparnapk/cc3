package TestNGTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.BasePage;

public class BaseTest {
	protected WebDriver driver;
	protected BasePage page;

	@BeforeMethod
	public void setUp() {

		// Use Chrome as testing browser
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\main\\java\\resources\\chromedriver.exe");
		driver = new ChromeDriver();

		// Maximize browser after launching it
		driver.manage().window().fullscreen();
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		// Create the page object
		page = new BasePage(driver);
	}

	// Release selenium web driver instance and kill the process
	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
