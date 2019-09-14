package com.avitas.qa.utilities;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;

import com.avitas.qa.automationcore.Page;

/**
 * @author Venkat
 * Base class to initialize / destroy web driver 
 */

public class TestBase extends Page {


	@BeforeTest(alwaysRun = true)
	public void initialize() throws IOException {
		Page.initConfiguration();
	}
	
	@AfterSuite
	public void tearDown() {
		Page.quitBrowser();
	}
}
