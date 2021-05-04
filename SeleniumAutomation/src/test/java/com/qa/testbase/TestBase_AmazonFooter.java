package com.qa.testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.qa.pages.AmazonFooterPages;

public class TestBase_AmazonFooter {
	WebDriver driver;
	public AmazonFooterPages AmazonFooterOR;
	public AmazonFooterPages getCountryNames;
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
		AmazonFooterOR= new AmazonFooterPages(driver);
		driver.get(Url);
	getCountryNames=new AmazonFooterPages(driver);
		
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	

}


}
