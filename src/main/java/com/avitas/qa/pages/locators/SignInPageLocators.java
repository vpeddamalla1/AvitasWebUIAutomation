package com.avitas.qa.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Venkat
 * Defining locators of Login page
 */

public class SignInPageLocators {
	
	
	@FindBy(id="user-name")
	public WebElement userName;
	
	@FindBy(id="password")
	public WebElement passWord;
	
	@FindBy(xpath="//input[@value = 'LOGIN']")
	public WebElement login;

}
