package com.qa.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import com.qa.pages.AmazonAutomationPages;

public class AmazonautomationTestBase {
	WebDriver driver;
	AmazonAutomationPages AmazonOR;
	SoftAssert SAssert;

	@Parameters({"Browser","Url"})
	@BeforeClass
	public void setUp(String Browser, String Url) {

		if(Browser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			driver = new ChromeDriver();
          }
		AmazonOR = new AmazonAutomationPages(driver);
		driver.manage().window().maximize();
		driver.get(Url);
		SAssert=new SoftAssert();
	}

	@AfterClass
	public void tearDown() {
		driver.close();
	}

}


