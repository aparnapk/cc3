package pages;

import org.openqa.selenium.WebDriver;

public class BasePage {
	private String url = "http://newtours.demoaut.com/mercurywelcome.php";
	public static WebDriver driver;
public BasePage(WebDriver driver) {
	this.driver = driver;
}
}
