package com.televate.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.televate.qa.base.TestBase;
import com.televate.qa.pages.DashboardPage;
import com.televate.qa.pages.LoginPage;

public class DashboardPageTest extends TestBase {
	LoginPage loginpage;
	DashboardPage dashboard;

	public DashboardPageTest() {
		super();
	}

	@BeforeClass
	public void setUp() {
		initializaiton();
		loginpage = new LoginPage();
		dashboard = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	@Test(priority = 1)
	public void DashboardPageTitleTest() {
		String title = dashboard.validateDashboardPageTitle();
		Assert.assertEquals(title, "AMN Teletherapy");
	}

	@Test(priority = 2)
	public void DashboardUpcomingTileTest() {
		boolean flag = dashboard.ValidateUpcomingEvent();
		Assert.assertTrue(flag);
	}

	@Test(priority = 3)
	public void DashboardDocumentedTileTest() {
		boolean flag = dashboard.ValidateDocumentedEvent();
		Assert.assertTrue(flag);
	}

	@Test(priority = 4)
	public void DashboardMissedTileTest() {
		boolean flag = dashboard.ValidateMissedEvent();
		Assert.assertTrue(flag);
	}

	@Test(priority = 5)
	public void DashboardUndocumentedTileTest() {
		boolean flag = dashboard.ValidatedUndocumentedEvent();
		Assert.assertTrue(flag);
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
