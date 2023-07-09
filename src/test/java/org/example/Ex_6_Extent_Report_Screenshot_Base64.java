package org.example;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

public class Ex_6_Extent_Report_Screenshot_Base64 {

    public static void main(String[] args) throws IOException {
        ExtentReports base64Report = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter("./test-output/Base64Report.html");
        base64Report.attachReporter(spark);
        ExtentTest mytest = base64Report.createTest("mytest");

        //---Base64 code-----------
       // File f = new File("./test-output/img.png");
        String imgAsBase64 = Base64.getEncoder().encodeToString(Files.readAllBytes(Paths.get("./test-output/img.png")));
        //System.out.println(imgAsBase64);
        mytest.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromBase64String(imgAsBase64,"The birds").build());
        base64Report.flush();
    }
}
