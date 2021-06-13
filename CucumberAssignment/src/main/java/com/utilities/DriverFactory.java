package com.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	public WebDriver driver ;
	
	public static ThreadLocal<WebDriver> drivers = new ThreadLocal<>();
	
	public WebDriver createDriverInstance(String browserType) {
		System.out.println("Browser type" +browserType);
		
		if(browserType.equals("chrome")) {
			 WebDriverManager.chromedriver().setup();
			 drivers.set(new ChromeDriver());
		}
		else {
			System.out.println("Please check the browser type");
		}
		
		return getDriver();
	}
	
	public static WebDriver getDriver() {
		return drivers.get();
	}
}
