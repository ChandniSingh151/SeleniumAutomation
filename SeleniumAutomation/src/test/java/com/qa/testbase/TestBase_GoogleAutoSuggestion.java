package com.qa.testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.qa.pages.GoogleAutoSuggATPages;


public class TestBase_GoogleAutoSuggestion {

	WebDriver driver;
	public GoogleAutoSuggATPages gAP1;

	@Parameters({"browser","url"})
	@BeforeClass
	public void setUp(String browser, String url) {

		if(browser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			driver = new ChromeDriver();

		}

		gAP1 = new GoogleAutoSuggATPages(driver);
		driver.get(url);
	}

	@AfterClass
	public void tearDown() {
		driver.close();
	}

}
