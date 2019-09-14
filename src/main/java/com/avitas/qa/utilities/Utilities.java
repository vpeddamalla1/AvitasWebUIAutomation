package com.avitas.qa.utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.avitas.qa.automationcore.Page;

/**
 * @author Venkat
 * Small utility method to take screen shots in required scenarios.
 */

public class Utilities extends Page {

	public static String screenshotName;

	public static void captureScreenshot() throws IOException {

		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		Date d = new Date();
		screenshotName = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";

		FileUtils.copyFile(srcFile,
				new File(System.getProperty("user.dir") + File.separator +"target"+
									File.separator+ "surefire-reports" +
									File.separator + "html" + 
									File.separator + screenshotName));

	}
}
