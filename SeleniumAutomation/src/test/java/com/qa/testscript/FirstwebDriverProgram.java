package com.qa.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstwebDriverProgram {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		//Invoke Chrome Browser
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.rediff.com/");
	driver.navigate().to("https://www.google.com/");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	driver.switchTo().alert();//switch to pop-up window
	driver.switchTo().frame(0);//switch from a browser to a frame
	//driver.switchTo().window(wind id);//switch to other window/tab based on the window id
	
	//get the title of the page
	String title=driver.getTitle();
	System.out.println(title);
	
	String currentUrl=driver.getPageSource();
	System.out.println(currentUrl);
	
	String winId=driver.getWindowHandle();
	System.out.println(winId);
	
	//set<String> windowHandles=driver.getWindowHandles();
	
	driver.close();//current browser instance will be closed
	

		
	}
	
}
