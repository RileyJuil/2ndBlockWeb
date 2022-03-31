package main.java;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class SetUp {

	public static WebDriver driver;
	public static Common Common = null;

	@BeforeClass
	public static void createAndStartService() throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Phillip\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.get("https://www.secondblock-front.dunamu-2ndblock-dev.com/"); //DEV
		// 서버
		driver.get("https://2ndblock.com/"); // PROD 서버

		Common = new Common(driver);
	}

	@AfterClass
	public void quit() {

		driver.quit();
	}
}