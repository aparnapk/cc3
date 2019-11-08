//-----------------------------------------------------------------------------
// <copyright file="Element.java" company="Planit Testing">
//      Copyright � 2019 Planit Testing.
//      All rights reserved.
// </copyright>
// <created>08/04/2019</created>
// <author>Sam Chen</author>
//-----------------------------------------------------------------------------
package elements;

import java.sql.Driver;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//Parent class for all element objects
public class Element {
	
	 protected int TIMEOUT = 30;

     public WebDriver driver;
     public By identifier;
     
     public Element(By identifier, WebDriver driver) {
    	 this.driver = driver;
    	 this.identifier = identifier;
     }
     
     // Help method to wait for element present on the page
     public void waitForElementPresent() {
    	 WebDriverWait wait = new WebDriverWait(driver, TIMEOUT);
    	 wait.until(ExpectedConditions.presenceOfElementLocated(identifier));
     }
     
     // Help method to wait for attribute value of element on the page
     public void waitForElementAttributeValue(String attribute, String value) {
    	 WebDriverWait myWait = new WebDriverWait(driver, TIMEOUT);
         myWait.until(ExpectedConditions.attributeToBe(identifier, attribute, value));
     }
     
     // Help method to get text of element on the page
     public String getText() {
         return driver.findElement(identifier).getText();
     }
     public void enterText(String username) {
       	 driver.findElement(identifier).sendKeys(username);
        }
}
