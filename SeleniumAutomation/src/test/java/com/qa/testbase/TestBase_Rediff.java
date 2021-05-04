


	package com.qa.testbase;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Parameters;

	import com.qa.pages.RediffPages;


	public class TestBase_Rediff  {

		WebDriver driver;
		public RediffPages gAP1;

		@Parameters({"browser","url"})
		@BeforeClass
		public void setUp(String browser, String url) {

			if(browser.equalsIgnoreCase("chrome")) {

				System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
				driver = new ChromeDriver();

			}

			gAP1 = new RediffPages(driver);
			driver.get(url);
		}

		@AfterClass
		public void tearDown() {
			driver.close();
		}

	}



