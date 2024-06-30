package com.televate.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.televate.qa.base.TestBase;

public class DashboardPage extends TestBase {

	// Page Factory: Object Repository

	@FindBy(xpath = "//p[contains(text(),'Upcoming')]")
	WebElement Upcoming;

	@FindBy(xpath = "//p[contains(text(),'Documented')]")
	WebElement Documented;

	@FindBy(xpath = "//p[contains(text(),'Missed')]")
	WebElement Missed;

	@FindBy(xpath = "//p[contains(text(),'Undocumented')]")
	WebElement Undocumented;

	// Initializing the Page Objects:
	public DashboardPage() {
		PageFactory.initElements(driver, this);
	}

	// Actions:
	
	public String validateDashboardPageTitle() {
		return driver.getTitle();
	}

	public boolean ValidateUpcomingEvent() {
		return Upcoming.isDisplayed();
	}

	public boolean ValidateDocumentedEvent() {
		return Documented.isDisplayed();
	}

	public boolean ValidateMissedEvent() {
		return Missed.isDisplayed();
	}

	public boolean ValidatedUndocumentedEvent() {
		return Undocumented.isDisplayed();
	}
}
