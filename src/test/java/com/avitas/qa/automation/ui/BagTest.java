package com.avitas.qa.automation.ui;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.avitas.qa.automationcore.Constants;
import com.avitas.qa.pages.actions.BagPage;
import com.avitas.qa.pages.actions.HeaderPage;
import com.avitas.qa.pages.actions.InventoryListPage;
import com.avitas.qa.utilities.TestBase;

/**
 * @author Venkat
 * Test case to validate Cart contents after adding required products to cart
 */

public class BagTest extends TestBase {
	
	public static Logger log = Logger.getLogger(BagTest.class);
	
	@Test(description = "Test to add product to Bag")
	public void addProductToBagTest() {
		InventoryListPage anInventoryListPage = new InventoryListPage();
		anInventoryListPage.addProductToBag(anInventoryListPage.inventoryPageLocators.ADD_PRODUCT_SAUCE_LABS_ONESIE);
		anInventoryListPage.addProductToBag(anInventoryListPage.inventoryPageLocators.ADD_PRODUCT_SAUCE_LABS_BIKE_LIGHT);
		log.info("PRODUCT_SAUCE_LABS_ONESIE & PRODUCT_SAUCE_LABS_BIKE_LIGHT are added Successfully");
		
		HeaderPage aHeaderPage = new HeaderPage();
		Assert.assertTrue(aHeaderPage.getCartSize().equals("2"), "Cart size should be 2");
	}
	
	@Test(description = "Test to validate Cart")
	public void validateCartTest() {
		BagPage aBagPage = new BagPage();
		new HeaderPage().goToCart();
		Assert.assertTrue(aBagPage.isProductAddedToBag(Constants.PRODUCT_SAUCE_LABS_ONESIE), "PRODUCT_SAUCE_LABS_ONESIE is missing in Cart");
		Assert.assertTrue(aBagPage.isProductAddedToBag(Constants.PRODUCT_SAUCE_LABS_BIKE_LIGHT), "PRODUCT_SAUCE_LABS_BIKE_LIGHT is missing in Cart");
	}
	
	
}

