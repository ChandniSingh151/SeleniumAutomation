package com.qa.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.qa.pages.GooglePages;

public class TC_GoogleSearch_03 {
	@Test
	public  void main() {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		GooglePages googlePages=new GooglePages(driver);
		
		driver.get("https://www.google.com/");
		
		googlePages.getSearchTextField().sendKeys("Automation Testing");
		googlePages.getSubmitButton().submit();
		String title = driver.getTitle();
		if(title.contains("Automation Testing")){
			System.out.println("Search successfully completed");
		}
		else
			System.out.println("Search is not successfully completed");
	
	}
}
