package com.avitas.qa.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.avitas.qa.automationcore.Page;
import com.avitas.qa.pages.locators.HeaderPageLocators;


/**
 * @author Venkat
 * Page to maintain Header navigation
 */
public class HeaderPage extends Page {
	
	
	public HeaderPageLocators headerPageLocators;
	

	public HeaderPage(){
		
		this.headerPageLocators = new HeaderPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,5);
		PageFactory.initElements(factory, this.headerPageLocators);
		
	}
	
	public String getCartSize() {
		return getValue(headerPageLocators.BAG_ICON_COUNTER);
	}
	
	public void goToCart() {
		click(headerPageLocators.cartIcon);
	}

}
