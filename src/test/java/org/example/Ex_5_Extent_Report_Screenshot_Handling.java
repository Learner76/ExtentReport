// This report will add png file to Extent report but report is not emailable, as images needed along with.
// Another example , we will use Base64 emailable report.

package org.example;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Ex_5_Extent_Report_Screenshot_Handling {

    public static void main(String[] args) {

        ExtentReports myreport = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter("./test-output/myreportwithsnippet.html");
        myreport.attachReporter(spark);

        ExtentTest mytest = myreport.createTest("mytest");
        mytest.log(Status.INFO,"This is info");
        mytest.log(Status.WARNING,"This is pass");
        mytest.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath("./test-output/img.png").build());

        myreport.flush();
    }

}
