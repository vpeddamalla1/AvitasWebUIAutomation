package com.avitas.qa.automation.ui;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.avitas.qa.automationcore.Constants;
import com.avitas.qa.pages.actions.SignInPage;
import com.avitas.qa.utilities.TestBase;

/**
 * @author Venkat
 * Test case to Login with required credentials
 */

public class SignInTest extends TestBase{
	
	public static Logger log = Logger.getLogger(BagTest.class);
	
	@Test(description = "Test to Login into SWAGLABS Website")
	public void loginTest() {
		SignInPage aSignInPage = new SignInPage();
		aSignInPage.doLogin(Constants.userName, Constants.passWord);
		log.info("Signed In Successfully");
	}
	
}

