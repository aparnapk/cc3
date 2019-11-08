package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import elements.Link;
import junit.framework.Assert;

public class HomePage extends BasePage {
	private Link flight;

	public HomePage(WebDriver driver) {
		super(driver);
		flight = new Link(By.xpath("//a[contains(text(),'Flights')]"), driver);
	}

	public void clickOnFlights() {
		flight.waitForElementPresent();
		flight.click();
	}

	public void verifyFlightPageIsDisplayed() {
		String title = driver.getTitle();
		String actualTitle = "Find a Flight: Mercury Tours:";
		System.out.println("Title is --" + title);
		Assert.assertEquals(actualTitle, title);
	}

	public String titleOfFlightPage() {
		String title = driver.getTitle();
		return title;
	}
}
