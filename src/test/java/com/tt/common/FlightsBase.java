package com.tt.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlightsBase {

	public static WebDriver driver;
	public static String baseURL = "http://www.facebook.com";
	
	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","/home/mahbub/WebDrivers/chromedriver_linux64.chromedriver");
		driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10,Timeunit.SECOND);
		driver.get(baseURL);
	}
		
	public void tearDown() {	
		
	}
	
	
	
	

}
