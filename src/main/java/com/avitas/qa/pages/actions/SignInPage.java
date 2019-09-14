package com.avitas.qa.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.avitas.qa.automationcore.Page;
import com.avitas.qa.pages.locators.SignInPageLocators;

/**
 * @author Venkat
 * POM for login page
 */
public class SignInPage extends Page {
	
	
	public SignInPageLocators signInPageLocators;
	

	public SignInPage(){
		
		this.signInPageLocators = new SignInPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,5);
		PageFactory.initElements(factory, this.signInPageLocators);
		
	}
	
	public void doLogin(String username,String password){
		
		enterText(signInPageLocators.userName,username);
		enterText(signInPageLocators.passWord,password);
		click(signInPageLocators.login);
		
	}

}
