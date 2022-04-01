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
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.appium.java_client.remote.MobileCapabilityType;


public class SetUp {

	public static WebDriver driver;
	public static Common Common = null;
	
	@BeforeClass
	public void createAndStartService() throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Phillip\\Downloads\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://2ndblock.com/"); // PROD 서버

//		ChromeOptions chromeOptions = new ChromeOptions();
//		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), chromeOptions);
//		driver.manage().window().maximize();
//		driver.get("https://2ndblock.com/");

		Common = new Common(driver);
	}

	@AfterClass
	public void quit() {

		driver.quit();
	}
}