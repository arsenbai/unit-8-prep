package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BaseTest {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BEFORE SUITE is used");
        System.out.println("set up sys property for browser");
        System.out.println("--------");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("BEFORE TEST is used");
        System.out.println("open chrome");
        System.out.println("--------");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("BEFORE CLASS is used");
        System.out.println("open test application");
        System.out.println("--------");
    }

    @BeforeMethod
    public void setUp(){
        System.out.println("BeforeMethod: Setup before each test");
        System.out.println("login");
        System.out.println("--------");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("AfterMethod: Cleanup after each test");
        System.out.println("logout");
        System.out.println("--------");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("AFTER CLASS is used");
        System.out.println("close test application");
        System.out.println("--------");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("AFTER TEST is used");
        System.out.println("close chrome");
        System.out.println("--------");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("AFTER SUITE is used");
        System.out.println("--------");
    }
}
