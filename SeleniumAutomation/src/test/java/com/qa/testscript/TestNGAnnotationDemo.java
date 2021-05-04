package com.qa.testscript;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotationDemo {
	//Login-->Fund Transfer-->Logout
	//Login-->Utility bill Payment-->Logout
	//Login-->Credit Card Payment-->Logout
	@Test(priority=1,groups="Payment")
	public void FundTransfer(){
		//System.out.println("I am Fund Transfer method");
		Reporter.log("I am Fund Transfer method",true);
	}
	@Test(priority=2,groups="Payment",enabled=false)
	public void UtilityBillPayment(){
		//System.out.println("I am Utility Bill Payment method");
		Reporter.log("I am Utility Bill Payment method");
	}
	@Test(priority=3,groups="Payment",invocationCount=3)
	public void CreditCardBillPayment(){
		System.out.println("I am Credit Card bill payment method");
		Reporter.log("I am Credit Card bill payment method");
	}
	@BeforeMethod
	public void Login(){
		System.out.println("I am Login method");
	}
	@AfterMethod
	public void Logout(){
		System.out.println("I am Logout method");
	}
	@BeforeClass
	public void InvokeBrowser(){
		System.out.println("Launch the browser");
	}
	@AfterClass
    public void CloseBrowser(){
    	System.out.println("Close the Browser");
    	
    }
	@BeforeTest
	public void setUp(){
		System.out.println("I am SetUp method");
	}
	@AfterTest
	public void tearDown(){
		System.out.println("I am tear down method");
	}
}
