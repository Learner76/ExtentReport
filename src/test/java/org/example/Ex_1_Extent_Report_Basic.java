//Using Extent Report Version 5 with JDK 11.
//

package org.example;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.Assert;

public class Ex_1_Extent_Report_Basic {


    public static void main(String[] args) {

        ExtentReports myreport = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter("./test-output/myreport.html");

        myreport.attachReporter(spark);

        ExtentTest mytest1= myreport.createTest("Test1");

        mytest1.log(Status.INFO,"I am basic extent logger class");
        mytest1.log(Status.INFO,"I am basic extent logger class");
        mytest1.log(Status.INFO,"I am basic extent logger class");
        mytest1.log(Status.INFO,"I am basic extent logger class");
        mytest1.log(Status.INFO,"I am basic extent logger class");
        mytest1.log(Status.INFO,"I am basic extent logger class");
        mytest1.log(Status.INFO,"I am basic extent logger class");

        ExtentTest mytest2 = myreport.createTest("Test2");
        mytest2.log(Status.INFO,"I am basic extent logger class");
        mytest2.log(Status.INFO,"I am basic extent logger class");
        mytest2.log(Status.INFO,"I am basic extent logger class");
        mytest2.log(Status.INFO,"I am basic extent logger class");
        mytest2.log(Status.INFO,"I am basic extent logger class");
        mytest2.log(Status.INFO,"I am basic extent logger class");
        mytest2.log(Status.INFO,"I am basic extent logger class");

        ExtentTest mytest3 = myreport.createTest("Test3");
        mytest3.log(Status.INFO,"I am basic extent logger class");
        mytest3.log(Status.INFO,"I am basic extent logger class");
        mytest3.log(Status.INFO,"I am basic extent logger class");
        mytest3.log(Status.INFO,"I am basic extent logger class");
        mytest3.log(Status.INFO,"I am basic extent logger class");
        mytest3.log(Status.INFO,"I am basic extent logger class");
        mytest3.log(Status.INFO,"I am basic extent logger class");

        ExtentTest mytest4 = myreport.createTest("Test4");
        mytest4.log(Status.INFO,"I am basic extent logger class");
        mytest4.log(Status.INFO,"I am basic extent logger class");
        mytest4.log(Status.INFO,"I am basic extent logger class");
        mytest4.log(Status.INFO,"I am basic extent logger class");
        mytest4.log(Status.INFO,"I am basic extent logger class");
        mytest4.log(Status.INFO,"I am basic extent logger class");
        mytest4.log(Status.INFO,"I am basic extent logger class");

        ExtentTest mytest5 = myreport.createTest("Test5");
        mytest5.log(Status.INFO,"I am basic extent logger class");
        mytest5.log(Status.INFO,"I am basic extent logger class");
        mytest5.log(Status.INFO,"I am basic extent logger class");
        mytest5.log(Status.INFO,"I am basic extent logger class");
        mytest5.log(Status.INFO,"I am basic extent logger class");
        mytest5.log(Status.INFO,"I am basic extent logger class");
        mytest5.log(Status.INFO,"I am basic extent logger class");

        ExtentTest mytest6 = myreport.createTest("Test6");
        mytest6.log(Status.INFO,"I am basic extent logger class");
        mytest6.log(Status.INFO,"I am basic extent logger class");
        mytest6.log(Status.INFO,"I am basic extent logger class");
        mytest6.log(Status.INFO,"I am basic extent logger class");
        mytest6.log(Status.INFO,"I am basic extent logger class");
        mytest6.log(Status.INFO,"I am basic extent logger class");
        mytest6.log(Status.INFO,"I am basic extent logger class");

        ExtentTest mytest7 = myreport.createTest("Test7");
        mytest7.log(Status.INFO,"I am basic extent logger class");
        mytest7.log(Status.INFO,"I am basic extent logger class");
        mytest7.log(Status.INFO,"I am basic extent logger class");
        mytest7.log(Status.INFO,"I am basic extent logger class");
        mytest7.log(Status.INFO,"I am basic extent logger class");
        mytest7.log(Status.INFO,"I am basic extent logger class");
        mytest7.log(Status.INFO,"I am basic extent logger class");


       mytest7.log(Status.FAIL,"This Test is failed.");

        myreport.flush();
    }


}
