package test.java;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
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
	public void scenario_0001_facebookLogin() throws InterruptedException {

		Common.clickByClassName("home-start-button"); //시작하기
		Common.clickByText("페이스북 계정으로 로그인");
		Common.WinHandle(); //브라우저 탭 핸들링
		
		
//		//Before & After Class 로 돌리지 않으면 세션이 유지되어 페이스북 로그인 버튼을 클릭하면 이메일, 패스워드 입력할 필요없이 바로 로그인되므로 일단 막고 진행		
//		Thread.sleep(3000);
//		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.name("email")));
//		driver.findElement(By.name("email")).sendKeys("juikjuil@nate.com");
//		Thread.sleep(2000);
//    
//		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.name("pass")));
//		driver.findElement(By.name("pass")).sendKeys("ju09260927@");
//		Thread.sleep(2000);
//    
//		driver.findElement(By.name("login")).click();
//		Thread.sleep(2000);
//    
//		for(String winHandle : driver.getWindowHandles()){
//			driver.switchTo().window(winHandle);
//       }

	}
	
	@Test
	  public void scenario_0002_joinAccount() throws InterruptedException {

	    Common.clickByXpath("/html/body/div[1]/div/main/form/div[1]/div/label"); //세컨블록 서비스 이용약관 동의 체크
	    Common.clickByXpath("/html/body/div[1]/div/main/form/div[3]/div/label"); //개인정보 수집 및 이용에 대한 동의 체크
	    Common.clickByXpath("/html/body/div[1]/div/main/form/div[5]/div[1]/div[2]/div[1]/img"); //만 14세 - 예
	    Common.clickByXpath("/html/body/div[1]/div/main/form/div[5]/div[2]/div[2]/div[2]/img"); //메일 수신 - 동의 안 함
	    Common.clickByClassName("terms-and-conditions-submit"); //다음
	    
	    Common.waitForElementByName("nickname");
	    driver.findElement(By.name("nickname")).sendKeys("페이스북(라일리)"); //닉네임 입력
	    Thread.sleep(2000);
	    
	    Common.clickByXpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div"); //닉네임 중복 확인
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.switchTo().alert().accept(); //중복완료 얼럿 확인
	    Thread.sleep(2000); 
	    
	    Common.clickByXpath("/html/body/div[1]/div/div/div[2]/div[3]/div[2]/div/div[1]/div"); //캐릭터 선택
	    Common.clickByXpath("/html/body/div[1]/div/div/div[2]/div[5]"); //회원가입 완료 버튼 선택

	  }
	
}