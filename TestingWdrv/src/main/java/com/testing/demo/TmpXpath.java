package com.testing.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

public class TmpXpath {
	
	static WebDriver driver = null;
	
	@BeforeClass
	public static void beforeclass() {
		
		System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");
		driver = new FirefoxDriver();
	    try {
	    	driver.get("https://www.alibaba.com/");
		} catch (Exception e) {
			e.fillInStackTrace();
		} finally {
			System.out.println("check coding!");
		}	
	} 
	
	public static void main(String[] args) {
		
		beforeclass();
	}
			

}
