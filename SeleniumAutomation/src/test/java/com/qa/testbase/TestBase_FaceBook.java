package com.qa.testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.qa.pages.FaceBookPages;

public class TestBase_FaceBook {
	WebDriver driver;
	public ChromeOptions options;
	 public FaceBookPages FaceBookOR;
	@Parameters({"Browser","Url"})
	@BeforeClass
	public void setUp(String Browser,String Url)
	{
		if(Browser.equalsIgnoreCase("chrome"))
		{ options = new ChromeOptions();
		  options.addArguments("--disable-notifications");
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			driver =new ChromeDriver(options);
		}
		else if(Browser.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
			driver= new EdgeDriver();
		}
	FaceBookOR= new FaceBookPages(driver);
		driver.get(Url);
		
	}
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}

}