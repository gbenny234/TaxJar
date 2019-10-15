package com.validateToken;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.Properties;

public class LoginDataMethods {


	static Properties prop = new Properties();
	public static final String Path_Properties = "OnboardingData.properties";


	// load data from properties file
	public static void dataLoad() throws FileNotFoundException, IOException {
		prop.load(new FileInputStream(Path_Properties));
	}

	// get url from properties file
	public static String getUrL() {
		String baseUrl = prop.getProperty("taxJarUrl");
		return baseUrl;

	}

	// gets username from properties file.
	public static String getUsername() {
		String username = prop.getProperty("username");
		return username;

	}

	// get password from properties file.
	public static String getPassword() {
		String password = prop.getProperty("password");
		return password;
	}
	
	// get token from properties file.
	public static String getTokenToVerify() {
		String token = prop.getProperty("token");
		return token;
	}

	
	

}
