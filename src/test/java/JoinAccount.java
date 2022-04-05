package test.java;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import main.java.Common;
import main.java.SetUp;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class JoinAccount extends SetUp{
		
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
    
		Thread.sleep(3000);
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.name("email")));
		driver.findElement(By.name("email")).sendKeys("juikjuil@nate.com");
		Thread.sleep(2000);
    
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.name("pass")));
		driver.findElement(By.name("pass")).sendKeys("ju09260927@");
		Thread.sleep(2000);
    
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
    
		for(String winHandle : driver.getWindowHandles()){
			driver.switchTo().window(winHandle);
       }
    
		Thread.sleep(2000);
	}
	
	@Test
	  public void scenario_02_joinAccount() throws InterruptedException {

	    new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/main/form/div[1]/div/label")));
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/form/div[1]/div/label")).click(); //세컨블록 서비스 이용약관 동의 체크
	    Thread.sleep(2000); 
	    
	    new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/main/form/div[3]/div/label")));
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/form/div[3]/div/label")).click(); //개인정보 수집 및 이용에 대한 동의 체크
	    Thread.sleep(2000);
	    
	    new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/main/form/div[5]/div[1]/div[2]/div[1]/img")));
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/form/div[5]/div[1]/div[2]/div[1]/img")).click(); //만 14세 - 예
	    Thread.sleep(2000);
	    
	    new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/main/form/div[5]/div[2]/div[2]/div[2]/img")));
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/form/div[5]/div[2]/div[2]/div[2]/img")).click(); //메일 수신 - 동의 안 함
	    Thread.sleep(2000);
	    
	    new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.className("terms-and-conditions-submit")));
	    driver.findElement(By.className("terms-and-conditions-submit")).click(); //다음
	    Thread.sleep(3000);
	    
	    new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.name("nickname")));
	    driver.findElement(By.name("nickname")).sendKeys("페이스북(라일리)"); //닉네임 입력
	    Thread.sleep(2000);
	    
	    new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div[2]/div")));
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div[2]/div")).click(); //닉네임 중복 확인
	    Thread.sleep(2000);
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.switchTo().alert().accept(); //중복완료 얼럿 확인
	    Thread.sleep(2000); 
	    
	    new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[3]/div[2]/div/div[1]/div")));
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[3]/div[2]/div/div[1]/div")).click(); //캐릭터 선택
	    Thread.sleep(2000);
	    
	    new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[5]")));
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[5]")).click(); //회원가입 완료 버튼 선택
	    Thread.sleep(3000);
	  }
	
}