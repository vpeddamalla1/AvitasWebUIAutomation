package com.avitas.qa.automationcore;

import java.io.File;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.avitas.qa.pages.actions.SignInPage;
import com.avitas.qa.utilities.ExtentManager;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

/**
 * @author Venkat
 */

//Base class where we define driver initialization.
public class Page {
	
	public static WebDriver driver;
	public static Logger log = Logger.getLogger(Page.class);
	public static WebDriverWait wait;
	public ExtentReports rep = ExtentManager.getInstance();
	public static ExtentTest test;
	public static String browser;
	public static SignInPage signInPage;
	
	
	public static void initConfiguration(){
		
		String browser = System.getProperty("browser") != null ? System.getProperty("browser") : Constants.browser; 
		if(browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + 
						File.separator +"src"  + File.separator + "main"+  
						File.separator + "resources" +  
						File.separator + "plugins" +
						File.separator + "chromedriver");
			driver = new ChromeDriver();
			log.debug("Launching Chrome");
		} else {
			log.error("No other browsers supported other than Chrome");
		}
		
		driver.get(Constants.siteurl);
		signInPage = new SignInPage();
	}
	
	/**
	 * Utility method to click on web element
	 */
	public static void click(WebElement element) {
		element.click();
		log.debug("Clicking on an Element : "+element);
		test.log(LogStatus.INFO, "Clicking on : " + element);
	}
	
	/**
	 * Utility method to type text in WebElement fields.
	 */
	public static void enterText(WebElement element, String value) {
		element.sendKeys(value);
		log.debug("Typing in an Element : "+element+" entered value as : "+value);
		test.log(LogStatus.INFO, "Typing in : " + element + " entered value as " + value);
	}
	
	/**
	 * Method to read value from given WebElement
	 */
	public String getValue(WebElement element) {
		return element.getText();
	}
	
	public static void quitBrowser(){
		driver.quit();
	}
	

}
