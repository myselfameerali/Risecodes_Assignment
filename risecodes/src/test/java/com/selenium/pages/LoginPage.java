package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.selenium.Utils.BasicActions;
import com.selenium.Utils.WebDriverConfiguration;

/**
 * @author AMEER ALI
 *
 */
public class LoginPage {
	
	/**
	 *Page Login
	 * 
	 * @param Username : Username Input
	 * @param Password : Password Input
	 * @return
	 */
	
	
	static WebDriver driver = WebDriverConfiguration.driver;
	public static void login(String Username, String Password) {

		BasicActions ba = new BasicActions();
		
		ba.launchURL("https://www.saucedemo.com/");

		try {
			ba.sendKeys(driver.findElement(By.id("user-name")), "Username", Username);
			ba.sendKeys(driver.findElement(By.xpath("//input[@placeholder='Password']")), "Password", Password);
			ba.clickEvent(driver.findElement(By.xpath("//input[@id='login-button']")), "loginbutton");
		} catch (Exception e) {
			System.err.println("Login is not sucessful");
			System.err.println("Exception : " + e.getMessage());
		}
	}

}
