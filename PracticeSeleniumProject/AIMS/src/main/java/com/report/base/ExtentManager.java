package com.report.base;

import java.io.File;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {
	 static ExtentReports extent;
	    final static String filePath = "/RM_report.html";
	    
	    public synchronized static ExtentReports getReporter() {
	        if (extent == null) {
	            extent = new ExtentReports(System.getProperty("user.dir") +filePath, true);
	            extent.loadConfig(new File(System.getProperty("user.dir") + "/extent-config.xml"));
	        }
	        
	        return extent;
	    }
}
