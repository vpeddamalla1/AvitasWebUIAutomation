package com.avitas.qa.pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.avitas.qa.automationcore.Page;
import com.avitas.qa.pages.locators.InventoryPageLocators;

/**
 * @author Venkat
 * POM for Product list page
 */
public class InventoryListPage extends Page {
	
	
	public InventoryPageLocators inventoryPageLocators;
	

	public InventoryListPage(){
		
		this.inventoryPageLocators = new InventoryPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,5);
		PageFactory.initElements(factory, this.inventoryPageLocators);
		
	}
	
	public void addProductToBag(WebElement webElement){
		click(webElement);
	}
	
}
