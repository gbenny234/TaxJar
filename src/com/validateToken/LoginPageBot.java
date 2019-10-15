package com.validateToken;

import org.openqa.selenium.By;

public abstract class LoginPageBot {

	/*
	 * This function returns locator for the username address field
	 */
	public static By usernameField() {
		String emailAddy = "//input[@id='session_email']";

		return By.xpath(emailAddy);

	}

	/*
	 * This function returns locator for the password field
	 */
	public static By passwordField() {
		String password = "//input[@id='session_password']";

		return By.xpath(password);

	}
	
	/*
	 * This function returns locator for login filed
	 */
	public static By loginField() {
		String password = "//input[@id='login']";

		return By.xpath(password);

	}
	
	/*
	 * This function returns locator for token
	 */
	public static By tokenField() {
		String token = "//span[contains(@id, 'token')]";

		return By.xpath(token);

	}
	
	/*
	 * This function returns locator for dashboard link
	 */
	public static By dashBoardLink() {
		String dashboard = "//a[text()='Dashboard']";

		return By.xpath(dashboard);

	}
	/*
	 * This function returns locator for Active token link
	 */
	public static By activeTokenLink() {
		String activeToken = "//a[text()='token is active.']";

		return By.xpath(activeToken);

	}
	
	
	/*
	 * This function returns locator for API token button
	 */
	public static By apiTokenButton() {
		String apiToken = "//a[text()='API Token']";

		return By.xpath(apiToken);

	}	
	
}
