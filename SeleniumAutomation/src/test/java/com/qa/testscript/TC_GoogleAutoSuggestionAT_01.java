package com.qa.testscript;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_GoogleAutoSuggestionAT_01 {
	static{
		System.setProperty("Webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("(//button)[2]")).click();
		driver.findElement(By.className("q")).sendKeys("Automation Testing");
		Thread.sleep(1000);
		List<WebElement> AllAutoSugg=driver.findElements(By.xpath("//span[contains(text(),'Automation'/.."));
		int count=AllAutoSugg.size();
		for(int i=0;i<count;i++){
			String text=AllAutoSugg.get(i).getText();
			System.out.println(text);
		}
		driver.close();
	}

}
