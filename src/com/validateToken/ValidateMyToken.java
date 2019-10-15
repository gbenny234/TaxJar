package com.validateToken;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ValidateMyToken extends LoginPageBot {
	


	WebDriver driver;
	

	@BeforeClass
	public void setUp() throws FileNotFoundException, IOException {
		LoginDataMethods.dataLoad();
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		// DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		// capabilities.setCapability("marionette", true);

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.get(LoginDataMethods.getUrL());
		driver.manage().window().maximize();
		
	}

	@AfterClass
	public void tearDown() {
		driver.close();
	}

	// Test to validate token
	@Test
	public void createProfileWithValidData() throws InterruptedException {
		
		driver.findElement(usernameField()).sendKeys(LoginDataMethods.getUsername());
		driver.findElement(passwordField()).sendKeys(LoginDataMethods.getPassword());
		driver.findElement(loginField()).click();
		driver.findElement(dashBoardLink()).click();
		driver.findElement(activeTokenLink()).click();
		driver.findElement(apiTokenButton()).click();
		Assert.assertTrue(driver.findElement(tokenField()).getText().equals(LoginDataMethods.getTokenToVerify()));
		
		
	}


}
