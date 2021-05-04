package com.qa.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_CheckingAmazonAppTitle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.amazon.in/");
		
		String homePageTitle = driver.getTitle();
		
		System.out.println("The title of the homepage is :- \n"+homePageTitle);
		
		System.out.println("---------------------------------------------------------------------------------------------------------");
		
		System.out.println("The number of Uppercase characters are :- "+countUpperCase(homePageTitle));
		System.out.println("The number of Lowercase characters are :- "+countLowerCase(homePageTitle));
		System.out.println("The number of Spaces are :- "+countSpaces(homePageTitle));
		System.out.println("The number of Digits are :- "+countDigits(homePageTitle));
		System.out.println("The number of Special characters are :- "+countSpecialCharacters(homePageTitle));

	}
	
	private static int countUpperCase(String title) {
		
		int upperCase = 0;
		
		for(int i=0; i<title.length(); i++) 
			if(title.charAt(i)>=65 && title.charAt(i)<=90)
				upperCase++;
		
		return upperCase;

	}
	
	private static int countLowerCase(String title) {
		
		int lowerCase = 0;
		
		for(int i=0; i<title.length(); i++) 
			if(title.charAt(i)>=97 && title.charAt(i)<=122)
				lowerCase++;
		
		return lowerCase;

	}
	
	private static int countSpaces(String title) {
		
		int spaces = 0;
		
		for(int i=0; i<title.length(); i++) 
			if(title.charAt(i) == 32)
				spaces++;
		
		return spaces;

	}
	
	private static int countDigits(String title) {
		
		int digits = 0;
		
		for(int i=0; i<title.length(); i++) 
			if(title.charAt(i)>=48 && title.charAt(i)<=57)
				digits++;
		
		return digits;

	}
	
	private static int countSpecialCharacters(String title) {
		
		int specialChars = 0;
		
		for(int i=0; i<title.length(); i++)
			if(!(title.charAt(i)>=48 && title.charAt(i)<=57) && (title.charAt(i)>=65 && title.charAt(i)<=90) &&
					(title.charAt(i)>=97 && title.charAt(i)<=122) && title.charAt(i) == 32)
				specialChars++;
		
		return specialChars;

	}

}
