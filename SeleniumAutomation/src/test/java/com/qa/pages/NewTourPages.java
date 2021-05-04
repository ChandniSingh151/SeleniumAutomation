package com.qa.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewTourPages {

	WebDriver driver;

	public NewTourPages(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "userName")
	WebElement userNameTextField;

	@FindBy(name = "password")
	WebElement passwordTextField;

	@FindBy(name = "submit")
	WebElement submitButton;

	@FindBy(linkText = "Flights")
	WebElement searchFlights;

	@FindBy(xpath = "//input[@value = 'oneway']")
	WebElement chooseOneWay;

	@FindBy(name = "passCount")
	WebElement passengerSelection;

	//Select passengerSelection = new Select(driver.findElement(By.name("passCount"))); 

	@FindBy(name = "fromPort")
	WebElement departurePlaceSelection;

	@FindBy(name = "fromMonth")
	WebElement departureMonthSelection;

	@FindBy(name = "fromDay")
	WebElement departureDaySelection;

	@FindBy(name = "toPort")
	WebElement arrivalPlaceSelection;

	@FindBy(name ="toMonth")
	WebElement arrivalMonthSelection;

	@FindBy(name = "toDay")
	WebElement arrivalDaySelection;

	@FindBy(xpath = "//input[@value = 'Business']")
	WebElement choosingClass;

	@FindBy(name = "airline")
	WebElement chooseAirlinePreference;

	@FindBy(name = "findFlights")
	WebElement continueButton;

	public WebElement getUserNameTextField() {
		return userNameTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

	public WebElement getSearchFlights() {
		return searchFlights;
	}

	public WebElement getChooseOneWay() {
		return chooseOneWay;
	}

	public WebElement getPassengerSelection() {
		return passengerSelection;
	}

	public WebElement getDeparturePlaceSelection() {
		return departurePlaceSelection;
	}

	public WebElement getDepartureMonthSelection() {
		return departureMonthSelection;
	}

	public WebElement getDepartureDaySelection() {
		return departureDaySelection;
	}

	public WebElement getArrivalPlaceSelection() {
		return arrivalPlaceSelection;
	}

	public WebElement getArrivalMonthSelection() {
		return arrivalMonthSelection;
	}

	public WebElement getArrivalDaySelection() {
		return arrivalDaySelection;
	}

	public WebElement getChoosingClass() {
		return choosingClass;
	}

	public WebElement getChooseAirlinePreference() {
		return chooseAirlinePreference;
	}

	public WebElement getContinueButton() {
		return continueButton;
	}

	// Method which gives username as mercury
	public void enterUserName() {
		getUserNameTextField().sendKeys("mercury");
	}

	// Method which gives password as mercury
	public void enterPassword() {
		getPasswordTextField().sendKeys("mercury");
	}

	// Method which chooses Passenger seat as 4
	public void choosePassengerSeat() {
		new Select(getPassengerSelection()).selectByIndex(3);
	}

	// Method which chooses Departure location as San Francisco
	// using selectByValue()
	public void chooseDepartureLocation() {
		new Select(getDeparturePlaceSelection()).selectByValue("San Francisco");
	}

	// Method which chooses Departure month as May
	// using selectByValue()
	public void chooseDepartureMonth() {
		new Select(getDepartureMonthSelection()).selectByValue("5");
	}

	// Method which chooses Departure date as 30
	// using selectByValue()
	public void chooseDepartureDate() {
		new Select(getDepartureDaySelection()).selectByValue("30");
	}

	// Method which chooses Arrival location as New York
	// using selectByVisibleText()
	public void chooseArrivalLocation() {
		new Select(getArrivalPlaceSelection()).selectByVisibleText("New York");
	}

	// Method which chooses Arrival month as June
	// using selectByVisibleText()
	public void chooseArrivalMonth() {
		new Select(getArrivalMonthSelection()).selectByVisibleText("June");
	}

	// Method which chooses Arrival date as 18
	// using selectByVisibleText()
	public void chooseArrivalDate() {
		new Select(getArrivalDaySelection()).selectByVisibleText("18");
	}
	
	// Method which chooses Airline as Unified Airlines
	public void chooseAirlinePreference() {
		new Select(getChooseAirlinePreference()).selectByVisibleText("Unified Airlines");
	}
}
