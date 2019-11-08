//-----------------------------------------------------------------------------
// <copyright file="Button.java" company="Planit Testing">
//      Copyright � 2019 Planit Testing.
//      All rights reserved.
// </copyright>
// <created>26/03/2019</created>
// <author>Sam Chen</author>
//-----------------------------------------------------------------------------
package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Button extends Element {

	public Button(By identifier, WebDriver driver) {
		super(identifier, driver);
	}

	// Click the button
    public void click() {
        driver.findElement(identifier).click();
    }
}
