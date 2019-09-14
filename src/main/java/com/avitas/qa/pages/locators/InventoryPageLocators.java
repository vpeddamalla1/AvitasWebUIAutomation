package com.avitas.qa.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


/**
 * @author Venkat
 * Defining locators of Product list page
 */
public class InventoryPageLocators {

	@FindBy(xpath = "//div[contains(.,'Sauce Labs Onesie')]/parent::div/div/button")
	public WebElement ADD_PRODUCT_SAUCE_LABS_ONESIE;
	
	@FindBy(xpath = "//div[contains(.,'Sauce Labs Bike Light')]/parent::div/div/button")
	public WebElement ADD_PRODUCT_SAUCE_LABS_BIKE_LIGHT;
	
	@FindBy(xpath = "//div[@id='shopping_cart_container']/a/span")
	public WebElement BAG_ICON_COUNTER;


}
