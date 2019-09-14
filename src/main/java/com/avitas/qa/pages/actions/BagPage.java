package com.avitas.qa.pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.avitas.qa.automationcore.Page;
import com.avitas.qa.pages.locators.BagPageLocators;

/**
 * @author Venkat
 * Page object model - BagPage/CartPage
 */

public class BagPage extends Page {
	
	public BagPageLocators bagPageLocators;

	public BagPage(){
		this.bagPageLocators = new BagPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,5);
		PageFactory.initElements(factory, this.bagPageLocators);
	}
	
	public boolean isProductAddedToBag(String elementName) {
		for(WebElement aWebElement : bagPageLocators.productList) {
			if(aWebElement.getText().equalsIgnoreCase(elementName)) {
				return true;
			}
		}
		return false;
	}

}
