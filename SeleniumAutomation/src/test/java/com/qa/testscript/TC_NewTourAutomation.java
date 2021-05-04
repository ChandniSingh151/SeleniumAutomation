package com.qa.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.qa.pages.NewTourPages;

public class TC_NewTourAutomation {

	static Select select;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		NewTourPages newTP = new NewTourPages(driver);
    	driver.get("http://demo.guru99.com/test/newtours/");

		// Giving username as mercury
		// newTP.getUserNameTextField().sendKeys("mercury");
		newTP.enterUserName();

		// Giving password as mercury
		//		nTP.getPasswordTextField().sendKeys("mercury");
		newTP.enterPassword();

		newTP.getSubmitButton().click();

		String loginPageURL = driver.getCurrentUrl();

		//System.out.println(loginPageURL);

		if(loginPageURL.contains("login")) System.out.println("Logged in successfull");
		else System.out.println("Login failed");

		// Choosing flights
		newTP.getSearchFlights().click();

		//Choosing one way
		newTP.getChooseOneWay().click();

		// Choosing number of passengers as 4
		// using select by index
		//		select = new Select(newTP.getPassengerSelection());
		//		select.selectByIndex(3);
		newTP.choosePassengerSeat();

		System.out.println("\nPassenger properly selected");

		/* Choosing Departure location as San Francisco
		 * Departure month as May
		 * Departure date as 30
		 * */
		// using select by value

		//		select = new Select(newTP.getDeparturePlaceSelection());
		//		select.selectByValue("San Francisco");
		newTP.chooseDepartureLocation();


		//		select = new Select(newTP.getDepartureMonthSelection());
		//		select.selectByValue("5");
		newTP.chooseDepartureMonth();

		//		select = new Select(newTP.getDepartureDaySelection());
		//		select.selectByValue("30");
		newTP.chooseDepartureDate();

		System.out.println("\nDeparture location, month and date selected");

		/* Choosing Arrival location as New York
		 * Arrival month as June
		 * Arrival date as 18
		 *  */
		// using select by Visible text

		//		select = new Select(newTP.getArrivalPlaceSelection());
		//		select.selectByVisibleText("New York");

		newTP.chooseArrivalLocation();

		//		select = new Select(newTP.getArrivalMonthSelection());
		//		select.selectByVisibleText("June");
		newTP.chooseArrivalMonth();

		//		select = new Select(newTP.getArrivalDaySelection());
		//		select.selectByVisibleText("18");
		newTP.chooseArrivalDate();

		System.out.println("\nArrival location, month and date selected");

		// Choosing Business class
		newTP.getChoosingClass().click();

		System.out.println("\nService class chosen");

		// Choosing Airline Preference as Indigo Airlines
		//		select = new Select(newTP.getChooseAirlinePreference());
		//		select.selectByVisibleText("Unified Airlines");
		newTP.chooseAirlinePreference();

		System.out.println("\nChosen preferred Airline");

		newTP.getContinueButton().click();

		System.out.println("\nCompleted");

		driver.close();
	}

}
