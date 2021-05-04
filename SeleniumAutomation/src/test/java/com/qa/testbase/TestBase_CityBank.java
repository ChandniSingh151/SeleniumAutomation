package com.qa.testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.qa.pages.CitiBankPages;

public class TestBase_CityBank {
	WebDriver driver;
	 public CitiBankPages CitiBankOR;
	@Parameters({"Browser","Url"})
	@BeforeClass
	public void setUp(String Browser,String Url)
	{
		if(Browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			driver =new ChromeDriver();
		}
		else if(Browser.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver", "./driver/edgedriver.exe");
			driver= new EdgeDriver();
		}
		CitiBankOR= new CitiBankPages(driver);
		driver.get(Url);
		
	}
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	

}
}

