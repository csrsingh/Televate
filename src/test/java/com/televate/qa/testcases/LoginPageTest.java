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

public class LoginPageTest extends TestBase {
	LoginPage loginpage;
	DashboardPage dashboard;

	public LoginPageTest() {
		super();
	}

	@BeforeClass
	public void setUp() {
		initializaiton();
		loginpage = new LoginPage();
	}

	@Test(priority = 1)
	public void loginPageTitleTest() {
		String title = loginpage.validateLoginPageTitle();
		Assert.assertEquals(title, "AMN Teletherapy");
	}

	@Test(priority = 2)
	public void TelvatelogoTest() {
		boolean flag = loginpage.validateTelevatelogo();
		Assert.assertTrue(flag);
	}

	@Test(priority = 3)
	public void ForgotPasswordTest() {
		boolean flag = loginpage.validateForgotPassword();
		Assert.assertTrue(flag);
	}

	@Test(priority = 4)
	public void ORTextTest() {
		boolean flag = loginpage.validatedORText();
		Assert.assertTrue(flag);
	}

	@Test(priority = 5)
	public void SSOLoginTest() {
		boolean flag = loginpage.validateSSOLogin();
		Assert.assertTrue(flag);
	}

	@Test(priority = 6)
	public void loginTest() {
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
