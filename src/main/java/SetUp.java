package main.java;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


public class SetUp {

	public static WebDriver driver;
	public static Common Common = null;
	
	@BeforeClass
	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Phillip\\Downloads\\chromedriver.exe");
		
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), chromeOptions);
		driver.manage().window().maximize();
		driver.get("https://2ndblock.com/");
		
			
		
//		ChromeOptions chromeOptions = new ChromeOptions();
//		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), chromeOptions);
//		
//		WebDriver driver = new ChromeDriver(); driver.manage().window().maximize();
//		driver.get("https://www.secondblock-front.dunamu-2ndblock-dev.com/");
//		driver.get("https://2ndblock.com/"); // PROD 서버

		Common = new Common(driver);
	}

	@AfterClass
	public void quit() {

		driver.quit();
	}
}