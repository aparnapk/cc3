package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

public class Popup {
	public static WebDriver driver;
	public Popup( WebDriver driver) {
		//super();
		this.driver = driver;
		
	}
	public static boolean isAlertPresent()
	{
		try {
			driver.switchTo().alert();
			return true;
		} 
		catch (NoAlertPresentException Ex) {
			return false;
		} 
	} 

}
