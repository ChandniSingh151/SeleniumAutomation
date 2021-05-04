package com.qa.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_RediffCreateAccount_01 {
	
	/*1. Open the browser
	2. Launch the rediff URL
	3. Click on the Create Account link
	4. Check if the user is landed on the registration page
	5. Enter Kim Smith as full name
	6. Enter Smith@test.com as Email-ID
	7. Click the check availability button*/

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		//Invoke Chrome Browser
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.rediff.com/");
	WebElement CreateAccountLink=driver.findElement(By.linkText("Create Account"));
	CreateAccountLink.click();
	String CurrentUrl = driver.getCurrentUrl();
	if(CurrentUrl.contains("register")){
		System.out.println("The User is landed on the registration page");
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")).sendKeys("Kim Smith");
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]")).sendKeys("Smith@test.com");
		driver.findElement(By.xpath("//input[@value='Check availability']")).click();
	}
	else{
		System.out.println("The User is not landed on the registration page");
	}
	driver.close();
	}

}
