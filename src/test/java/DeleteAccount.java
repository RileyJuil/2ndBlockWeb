package test.java;



import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



import main.java.Common;
import main.java.SetUp;

public class DeleteAccount extends SetUp{
	
		@Test
		public void scenario_01_facebookLogin() throws InterruptedException {

			new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.className("home-start-button")));
			driver.findElement(By.className("home-start-button")).click(); //시작하기
			Thread.sleep(2000); 
    
			main.java.Common.clickByText("페이스북 계정으로 로그인");
			Thread.sleep(2000);
    
			for(String winHandle : driver.getWindowHandles()){
				driver.switchTo().window(winHandle);
			}
    
			new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.name("email")));
			driver.findElement(By.name("email")).sendKeys("juikjuil@nate.com");
			Thread.sleep(2000);
    
			new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.name("pass")));
			driver.findElement(By.name("pass")).sendKeys("ju09260927@");
			Thread.sleep(2000);
    
			new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.name("login")));
	    	driver.findElement(By.name("login")).click();
	    	Thread.sleep(3000);
    
	    	for(String winHandle : driver.getWindowHandles()){
	    		driver.switchTo().window(winHandle);
	    	}	
	    	
	    	Thread.sleep(2000);
  }
	
	@Test
	  public void scenario_02_deleteAccount() throws InterruptedException {

		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div[3]/div[2]/div/div[2]")));
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div[3]/div[2]/div/div[2]")).click(); //마이메뉴
	    Thread.sleep(2000); 
	    
	    new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div[3]/div[2]/ul/li[5]")));
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div[3]/div[2]/ul/li[5]")).click(); //설정
	    Thread.sleep(2000);
	    
	    new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[12]/div/div/div[2]/div/div[2]/div/div[6]/div[4]/div[2]")));
	    driver.findElement(By.xpath("/html/body/div[12]/div/div/div[2]/div/div[2]/div/div[6]/div[4]/div[2]")).click(); //정말 탈퇴하시겠습니까?
	    Thread.sleep(2000);
	    
	    new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[14]/div/div/div/div[2]/div[1]")));
	    driver.findElement(By.xpath("/html/body/div[14]/div/div/div/div[2]/div[1]")).click(); //확인
	    Thread.sleep(2000);
	    
	    new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[15]/div/div/div/div[2]")));
	    driver.findElement(By.xpath("/html/body/div[15]/div/div/div/div[2]")).click(); //완료되었습니다. - 확인
	    Thread.sleep(3000);
	    
	  }
	
}