// Parallel Execution and Report creation.
// 2 Mechanism used here to make static varibale thead safe.
// 1.) ThreadLocal for variable which are not needed to be synchronized. can die at the end fo thread.
// 2.) Synchronized block for for static varibale , which are shared among threads.


package org.example;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class Ex_3_Extent_Report_Parallel_Execution_Pass {

    public static ExtentReports report = new ExtentReports();
    public static Object lock = new Object();
    ThreadLocal<ExtentTest> extentTest = new ThreadLocal<>();


    @BeforeMethod
    public void setup(Method method){
        String Testname = method.getName();
     //   report = new ExtentReports();
        ExtentSparkReporter sprk = new ExtentSparkReporter("./test-output/coolreport.html");
        report.attachReporter(sprk);
        extentTest.set(report.createTest(Testname));
    }

    @Test
    public void Test1() throws Exception{
      ExtentTest  test =extentTest.get();
        for (int i=0;i<10;i++){
            Thread.sleep(2000);
            test.log(Status.INFO,"Test 1 is running");
            System.out.println("Test 1 is running");
        }
    }


    @Test
    public void Test2() throws Exception{
        ExtentTest  test =extentTest.get();
        for (int i=0;i<10;i++){
            Thread.sleep(2000);
            test.log(Status.INFO,"Test 2 is running");
            System.out.println("Test 2 is running");
        }
    }


    @Test
    public void Test3() throws Exception{
        ExtentTest  test =extentTest.get();
        for (int i=0;i<10;i++){
            Thread.sleep(2000);
            test.log(Status.INFO,"Test 3 is running");
            System.out.println("Test 3 is running");
        }
    }


    @Test
    public void Test4() throws Exception{
        ExtentTest  test =extentTest.get();
        for (int i=0;i<10;i++){
            Thread.sleep(2000);
            test.log(Status.INFO,"Test 4 is running");
            System.out.println("Test 4 is running");
        }
    }


    @Test
    public void Test5() throws Exception{
        ExtentTest  test =extentTest.get();
        for (int i=0;i<10;i++){
            Thread.sleep(2000);
            test.log(Status.INFO,"Test 5 is running");
            System.out.println("Test 5 is running");
        }
    }


    @Test
    public void Test6() throws Exception{
        ExtentTest  test =extentTest.get();
        for (int i=0;i<10;i++){
            Thread.sleep(2000);
            test.log(Status.INFO,"Test 6 is running");
            System.out.println("Test 6 is running");
        }
    }


    @Test
    public void Test7() throws Exception{
        ExtentTest  test =extentTest.get();
        for (int i=0;i<10;i++){
            Thread.sleep(2000);
            test.log(Status.INFO,"Test 7 is running");
            System.out.println("Test 7 is running");
        }
    }

    @Test
    public void Test8() throws Exception{
        ExtentTest  test =extentTest.get();
        for (int i=0;i<10;i++){
            Thread.sleep(2000);
            test.log(Status.INFO,"Test 8 is running");
            System.out.println("Test 8 is running");
        }
    }

    @Test
    public void Test9() throws Exception {
        ExtentTest  test =extentTest.get();
        for (int i=0;i<10;i++){
            Thread.sleep(2000);
            test.log(Status.INFO,"Test 9 is running");
            System.out.println("Test 9 is running");
        }
    }


    @Test
    public void Test10() throws Exception {
        ExtentTest  test =extentTest.get();
        for (int i=0;i<10;i++){
            Thread.sleep(2000);
            test.log(Status.INFO,"Test 10 is running");
            System.out.println("Test 10 is running");
        }
    }

    @AfterSuite
    public void teardown(){
    synchronized (lock) {
        report.flush();
   }
    }
}
