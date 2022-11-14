package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.selenium.Utils.BasicActions;
import com.selenium.Utils.WebDriverConfiguration;



/**
 * @author AMEER ALI
 *
 */
public class HomePage {

	
	static WebDriver driver = WebDriverConfiguration.driver;

	/**
	 * @param itemIds : To add items to cart
	 */
	public static void addToCartAndValidate(String[] itemIds) {

		BasicActions ba = new BasicActions();

		for (int i = 0; i < itemIds.length; i++) {
			ba.clickEvent(driver.findElement(By.id(itemIds[i])), "AddtoCart");
		}
		
		Assert.assertEquals(ba.getText(driver.findElement(By.id("shopping_cart_container")), "cartValue"),itemIds.length + "");

	}

	
	public static void logout() throws InterruptedException {

		BasicActions ba = new BasicActions();

		ba.clickEvent(driver.findElement(By.id("react-burger-menu-btn")), "menuButton");
		Thread.sleep(1000);
		ba.clickEvent(driver.findElement(By.id("logout_sidebar_link")), "Logout");

		if (ba.getURL().equalsIgnoreCase("https://www.saucedemo.com/")) {

			System.out.println("Application Logout Successfully");
		} else {
			System.err.println("Exception while Logout");
		}

	}
	
}
