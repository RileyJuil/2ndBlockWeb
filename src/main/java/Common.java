package main.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Common {

	public static WebDriver driver;
	public String text;

	public Common(WebDriver driver) {
		this.driver = driver;

	}

	public static void clickByText(String text) {

		driver.findElement(By.xpath("//div[text()='" + text + "']/..")).click();

	}

}