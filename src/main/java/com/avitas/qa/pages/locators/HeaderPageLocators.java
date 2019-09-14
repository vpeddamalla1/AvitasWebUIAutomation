package com.avitas.qa.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Venkat
 * Defining locators of Header navigation
 */

public class HeaderPageLocators {
	
	
	@FindBy(xpath = "//div[@id='shopping_cart_container']/a/span")
	public WebElement BAG_ICON_COUNTER;
	
	@FindBy(xpath = "//div[@class='shopping_cart_container']/a")
	public WebElement cartIcon;

}
