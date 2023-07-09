//Setting up Extent Report with Testng.
// We achieved with help of static variables.
package org.example;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.TestListenerAdapter;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class Ex_2_Extent_Report_Testng {
        public static ExtentReports myreport = new ExtentReports();
        public static ExtentSparkReporter spark = new ExtentSparkReporter("./test-ouput/myreport.html");

        public ExtentTest mytest;

        static {
            myreport.attachReporter(spark);
        }

        @BeforeMethod
        public void setup(Method method){
            String Testname = method.getName();
            mytest = myreport.createTest(Testname);
        }

        @AfterSuite
        public void tearout(){
            myreport.flush();
        }

        @Test
        public void test1(){
            mytest.log(Status.INFO,"Test is working.");
            mytest.log(Status.PASS,"Test is passed");
        }

    @Test
    public void test2(){
        mytest.log(Status.INFO,"Test is working.");
        mytest.log(Status.PASS,"Test is passed");
    }

    @Test
    public void test3(){
        mytest.log(Status.INFO,"Test is working.");
        mytest.log(Status.PASS,"Test is passed");
    }

    @Test
    public void test4(){
        mytest.log(Status.INFO,"Test is working.");
        mytest.log(Status.PASS,"Test is passed");
    }

    @Test
    public void test5(){
        mytest.log(Status.INFO,"Test is working.");
        mytest.log(Status.PASS,"Test is passed");
    }

    @Test
    public void test6(){
        mytest.log(Status.INFO,"Test is working.");
        mytest.log(Status.PASS,"Test is passed");
    }

    @Test
    public void test7(){
        mytest.log(Status.INFO,"Test is working.");
        mytest.log(Status.PASS,"Test is passed");
    }

    @Test
    public void test8(){
        mytest.log(Status.INFO,"Test is working.");
        mytest.log(Status.PASS,"Test is passed");
    }

    @Test
    public void test9(){
        mytest.log(Status.INFO,"Test is working.");
        mytest.log(Status.PASS,"Test is passed");
    }

    @Test
    public void test10(){
        mytest.log(Status.INFO,"Test is working.");
        mytest.log(Status.PASS,"Test is passed");
    }
}
