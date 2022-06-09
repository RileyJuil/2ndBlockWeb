package main.java;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.junit.*;
import io.appium.java_client.remote.*;

import main.java.Common;


public class SetUp {

	public static WebDriver driver;
	public static Common Common = null;
	
	@BeforeTest
	public static void createAndStartService() throws IOException {

		//File file = new File("lib" + File.separator + "chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		//System.setProperty("binary_location", "C:\\Program Files\\Google\\Chrome Beta\\Application\\chrome.exe");
		
//		ChromeOptions chromeOptions = new ChromeOptions();
//		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://172.17.160.181:4444/wd/hub"), chromeOptions);
//		driver.manage().window().maximize();
//		driver.get("https://2ndblock.com/");
//		Thread.sleep(5000);
			
//		DesiredCapabilities capabilities = new DesiredCapabilities();
//		driver = new RemoteWebDriver(new URL("http://172.17.160.181:4444/wd/hub"), capabilities);
//		driver.manage().window().maximize();
//		driver.get("https://2ndblock.com/");

		ChromeOptions chromeOptions = new ChromeOptions();
		//chromeOptions.setBinary("C:\\Program Files\\Google\\Chrome Beta\\Application\\chrome.exe");
		driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.get("https://2ndblock.com/");

		Common = new Common(driver);
	}

	@AfterTest
	public void quit() {

		driver.quit();
	}
}