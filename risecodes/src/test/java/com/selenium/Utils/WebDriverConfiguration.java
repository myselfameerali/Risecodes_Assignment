package com.selenium.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;

/**
 * @author AMEER ALI
 *
 */
public class WebDriverConfiguration {
	public static WebDriver driver;

	/**
	 * Launching the required browser for testing based on the feasibility of the
	 * application.
	 * 
	 * @param browsername : Name of the browser which we would like to test
	 * @return
	 */
	public static WebDriver launchbrowser(String browsername) {
		if (browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver_win32//chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			System.out.println("User is able to launch Chrome browser");
		} else if (browsername.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C://Drivers//geckodriver-v0.32.0-win-aarch64//geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			System.out.println("User is able to launch Firefox browser");
		} else if (browsername.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", "C://Drivers//edgedriver_win64//msedgedriver.exe");
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			System.out.println("User is able to launch Edge browser");
		} else {
			System.out.println("The Browser Type is Undefined");
		}
		return driver;
	}

	@AfterSuite
	public static void quitBrowser() {

		BasicActions.closebrowser();
	}

}
