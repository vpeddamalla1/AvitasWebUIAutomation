package com.avitas.qa.pages.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Venkat
 * Defining Locators of BagPage
 */
public class BagPageLocators {
	
	
	@FindBy(xpath = "//div/a/div[@class='inventory_item_name']")
	public List<WebElement> productList;

}
