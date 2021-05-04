package com.qa.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.pages.RediffPages;

public class TC_RediffNavigateExample_02 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		//Invoke Chrome Browser
	WebDriver driver=new ChromeDriver();
	RediffPages RediffOR=new RediffPages(driver);
	driver.get("https://www.rediff.com/");
	RediffOR.getCreateAccountLink().click();
	RediffOR.getFullNameTextField().sendKeys("KimSmith");
	RediffOR.getEmailIDTextField().sendKeys("smith@test.com");
	RediffOR.getCheckAvailabilityBtn().click();
	
	driver.close();
	

	}

}
