package main.java;

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
import org.testng.annotations.BeforeClass;
import org.junit.*;
import io.appium.java_client.remote.*;

import main.java.Common;


public class SetUp {

	public static WebDriver driver;
	public static Common Common = null;
	

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Phillip\\Downloads\\chromedriver.exe");
		
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriver driver = new RemoteWebDriver(new URL("http://172.17.160.181:4444/wd/hub"), chromeOptions);
		
		//driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://2ndblock.com/"); // PROD 서버

//		ChromeOptions chromeOptions = new ChromeOptions();
//		WebDriver driver = new RemoteWebDriver(new URL("http://172.17.160.181:4444/wd/hub"), chromeOptions);
//		driver.manage().window().maximize();
//		driver.get("https://2ndblock.com/");

		Common = new Common(driver);
	}

	@AfterClass
	public void quit() {

		driver.quit();
	}
}