package com.report.seq.base;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {
public static ExtentReports extent;
    
    public synchronized static ExtentReports getReporter(String filePath) {
        if (extent == null) {
            extent = new ExtentReports(filePath, true);
            
            extent
                .addSystemInfo("Host Name", "Anshoo")
                .addSystemInfo("Environment", "QA");
        }
        
        return extent;
    }
}
