package com.masteringselenium;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverFactory {
	private RemoteWebDriver webDriver;
	
	private final String operatingSystem = System.getProperty("os.name").toUpperCase();
	private final String systemArchitecture = System.getProperty("os.arch");
	
	RemoteWebDriver getDriver() {
		if (null == webDriver) {
			System.out.println(" ");
			System.out.println("Current OS: " + operatingSystem);			
			System.out.println("Current Arch: " + systemArchitecture);
			System.out.println("Current Browser: Firefox");
			System.out.println(" ");
			webDriver = new FirefoxDriver();			
		}
		return webDriver;
	}
	
	void quitDriver() {
		if (null != webDriver) {
			webDriver.quit();
			webDriver = null;
		}
	}
	
}