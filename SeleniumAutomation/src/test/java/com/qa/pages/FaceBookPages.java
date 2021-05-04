package com.qa.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBookPages {
	WebDriver driver;
	public FaceBookPages(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	@FindBy(xpath="//input[@class='inputtext _55r1 _6luy']")
	WebElement EmailField;
	@FindBy(xpath="//input[@class='inputtext _55r1 _6luy _9npi']")
	WebElement PasswordField;

	@FindBy(xpath="//button[@name='login']")
	WebElement LogIn;
	
	@FindBy(xpath="(//*[@class='a8c37x1j ms05siws hwsy1cff b7h9ocf4 em6zcovv'])[1]")
	WebElement Friends;
	@FindBy(xpath="/html/body/div[1]/div/div[1]/div/div[2]/div[4]/div[1]/span/div/div[1]/i")
	WebElement LogOutDropDown;
	//@FindBy(xpath="(//span[@class='d2edcug0 hpfvmrgz qv66sw1b c1et5uql lr9zc1uh a8c37x1j keod5gw0 nxhoafnm aigsh9s9 d3f4x2em fe6kdd0r mau55g9w c8b282yb iv3no6db jq4qci2q a3bd9o3v ekzkrbhg oo9gr5id hzawbc8m'])[5]")
	//WebElement LogOut;
	public WebElement getEmailField()
	{
		return EmailField;
	}
	public WebElement getPasswordField()
	{
		return PasswordField;
	}
	public WebElement getLogInButton()
	{
		return LogIn;
	}
	public WebElement getFriends()
	{
		return Friends;
	}
	public WebElement getLogOutDropDown() {
		return LogOutDropDown;
	}
	//public WebElement getlogOut() {
	//	return LogOut;
	//}



}
