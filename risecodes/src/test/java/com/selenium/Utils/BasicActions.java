package com.selenium.Utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author AMEER ALI
 *
 */
public class BasicActions {

	static WebDriver driver = WebDriverConfiguration.driver;

	public void clickEvent(WebElement element, String elementName) {

		try {
			element.click();
			System.out.println("User is able to click on " + elementName);
		} catch (Exception e) {
			System.err.println("User is unable to click on " + elementName);
			System.err.println("Exception : " + e.getMessage());
		}

	}

	public void sendKeys(WebElement element, String elementName, String elementValue) {
		try {
			element.sendKeys(elementValue);
			System.out.println("User is able to type the data in " + elementName + " field");
		} catch (Exception e) {
			System.err.println("User is not able to type the data in " + elementName + " field");
			System.err.println("Exception : " + e.getMessage());
		}

	}

	public String getText(WebElement element, String elementName) {
		String text = null;
		try {
			text = element.getText();
			System.out.println(
					"User is able to get the text from the element " + elementName + " and the value is " + text);

		} catch (Exception e) {
			System.err.println("User is not able to get the text from the element " + elementName);
			System.err.println("Exception : " + e.getMessage());
		}
		return text;

	}

	public void waituntill(By byElement) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(byElement));
	}

	public String getURL() {
		String url = null;
		try {
			url = driver.getCurrentUrl();
			System.out.println("The current URL is " + url);

		} catch (Exception e) {
			System.err.println("Getting exception while reading the current URL");
			System.err.println("Exception : " + e.getMessage());
		}
		return url;

	}

	public void launchURL(String url) {

		try {
			driver.get(url);
			System.out.println("User is able to launch the URL sucessfully");
		} catch (Exception e) {
			System.err.println("User is unable to launch the URL");
			System.err.println("Exception : " + e.getMessage());
		}

	}

	public static void closebrowser() {

		try {
			driver.quit();
			System.out.println("Browser is Closed Sucessfully");
		} catch (Exception e) {
			System.err.println("Exception while closing Browser");
			System.err.println("Exception : " + e.getMessage());
		}
	}
}
