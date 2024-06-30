package com.televate.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.televate.qa.base.TestBase;

public class LoginPage extends TestBase {

	// Page Factory: Object Repository

	@FindBy(xpath = "//img[contains(@class,'mx-auto d-block mb-5')]")
	WebElement Televatelogo;

	@FindBy(name = "username")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "/html/body/div/div/div/div[1]/form/div[5]/button")
	WebElement loginbutton;

	@FindBy(xpath = "/html/body/div/div/div/div[1]/form/a")
	WebElement Forgotpassword;

	@FindBy(xpath = "/html/body/div/div/div/div[1]/form/div[6]/p/span")
	WebElement ortext;

	@FindBy(xpath = "/html/body/div/div/div/div[1]/form/div[7]/button")
	WebElement SSOLogin;

	// Initializing the Page Objects:
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	// Actions:
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}

	public boolean validateTelevatelogo() {
		return Televatelogo.isDisplayed();
	}

	public DashboardPage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbutton.click();
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].click();", loginbutton);

		return new DashboardPage();
	}

	public boolean validateForgotPassword() {
		return Forgotpassword.isDisplayed();
	}

	public boolean validatedORText() {
		return ortext.isDisplayed();
	}

	public boolean validateSSOLogin() {
		return SSOLogin.isDisplayed();
	}
}
