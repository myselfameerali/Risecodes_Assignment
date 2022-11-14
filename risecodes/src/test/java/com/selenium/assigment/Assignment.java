package com.selenium.assigment;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.selenium.Utils.WebDriverConfiguration;
import com.selenium.pages.HomePage;
import com.selenium.pages.LoginPage;

/**
 * @author AMEER ALI
 *
 */


public class Assignment extends WebDriverConfiguration {	
	
	
	@Parameters({"Username", "Password"})
	@Test
	public void loginFunction(String Username, String Password) throws InterruptedException {

		//WebDriverConfiguration.launchbrowser("EdGe");
		WebDriverConfiguration.launchbrowser("chrome");
		// WebDriverConfiguration.launchbrowser("Firefox");

		LoginPage.login(Username, Password);
		String[] itemIds = { "add-to-cart-sauce-labs-backpack", "add-to-cart-sauce-labs-bolt-t-shirt",
				"add-to-cart-sauce-labs-onesie" };

		HomePage.addToCartAndValidate(itemIds);
		HomePage.logout();

	}
}
