package TestNGTest;

import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import junit.framework.Assert;
import pages.HomePage;
import pages.LoginPage;

public class LoginPageTest extends BaseTest {
	// static ExtentReports report;
	// static ExtentTest test;
	private static Logger log = Logger.getLogger(LoginPageTest.class);

	@Test
	public void verifyloginPage() throws Exception {
		log.info("-----------starting test------------");
		LoginPage login = new LoginPage(driver);
		login.enterCredentials();
		log.info("Signed in successfully");
		// login.verifyCredentials();
		login.clickOnsignIn();
		HomePage home = new HomePage(driver);
		home.clickOnFlights();
		// home.verifyFlightPageIsDisplayed();
		Assert.assertEquals("Find a Flight: Mercury Tours:", home.titleOfFlightPage());
		log.info("Verified flights page");

	}

}
