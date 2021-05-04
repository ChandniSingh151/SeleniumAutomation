package com.qa.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_ScrollByPositionsAmazon {
	WebDriver driver;
	Actions act;
	JavascriptExecutor js;
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver=new ChromeDriver();
		act=new Actions(driver);
		js=(JavascriptExecutor)driver;
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
	}
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
	@Test
	public void scrollBy() throws InterruptedException
	{
		for(int i=0;i<=5;i++)
		{
			
	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[1]/div/div[1]/ul/li[2]/a")).click();
		System.out.println("Successfully Landed on the Career ");
		
//		for(int i=0;i<=5;i++)
//		{
//			
//	js.executeScript("window.scrollBy(0,-500)");
//	}
//		}
	
	

}
}
