package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import elements.Button;
import elements.Label;

public class LoginPage<SoftAssert> extends BasePage {
	private Button login;
	private Label userid;
	private Label password;

	public LoginPage(WebDriver driver) {
		super(driver);
		login = new Button(By.xpath("//input[@value='Login']"), driver);
		userid = new Label(By.name("userName"), driver);
		password = new Label(By.xpath("//input[@name='password']"), driver);
	}

	public void enterCredentials() {
		userid.waitForElementPresent();
		userid.enterText("mercury");
		password.waitForElementPresent();
		password.enterText("mercury");
	}

	public void verifyCredentials() {
		String name = userid.getText();
		System.out.println("user id " + userid.getText());
		// Assert.assertEquals("Entered and expected are not same", "mercury", name);
		// String pwd = password.getText();
		// Assert.assertEquals("Entered and expected are not same", "mercury", pwd);
	}

	public void clickOnsignIn() {
		login.waitForElementPresent();
		login.click();
	}
}
