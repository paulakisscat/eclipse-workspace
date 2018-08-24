package com.paulakisscat.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Test
public class TmpXpath {
	
	static WebDriver driver = null;
		
		@BeforeClass
		public static void befor() {
			
			System.setProperty("webdriver.firefox.driver", "/usr/local/bin/geckodriver");
			driver = new FirefoxDriver();
		    try {
		    	driver.get("https://www.alipay.com/");
			} catch (Exception e) {
				e.fillInStackTrace();
			} finally {
				System.out.println("check coding!heck coding!"
						+ "heck coding!heck coding!heck coding!heck coding!heck coding!heck coding!heck coding!heck coding!heck coding!"
						+ "heck coding!heck coding!heck coding!heck coding!heck coding!heck coding!heck coding!heck coding!");
			}	
		    
		} 
		
//		@AfterClass
//		public static void after() {
//			driver.quit();
//		}
		
		public static void main(String[] args) {
			
			befor();
//			after();
		}
		

}
