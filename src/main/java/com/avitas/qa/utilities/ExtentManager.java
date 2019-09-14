package com.avitas.qa.utilities;

import java.io.File;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

/**
 * @author Venkat
 * Location where Report generated will be present
 */
public class ExtentManager {
	
	private static ExtentReports extent;
	
	
	public static ExtentReports getInstance(){
		
		if(extent==null){
			extent = new ExtentReports(System.getProperty("user.dir")+ File.separator + "target"
						+ File.separator +"surefire-reports"
						+ File.separator +"html"
						+ File.separator + "SwagLabs_Report.html",true,DisplayOrder.OLDEST_FIRST);
			extent.loadConfig(new File(System.getProperty("user.dir")
						+ File.separator + "src"
						+ File.separator + "main" + File.separator +"resources" + File.separator +
						"extentconfig"+ File.separator +"ReportsConfig.xml"));
		}
		
		return extent;
		
	}

}
