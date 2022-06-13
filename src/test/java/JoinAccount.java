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
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class JoinAccount extends SetUp{
		
	@Test
	public void scenario_0001_facebookLogin() throws InterruptedException {

		Common.clickByText("시작하기"); //시작하기
		Common.clickByText("페이스북 계정으로 로그인");
		Common.WinHandle(); //브라우저 탭 핸들링
		
		
//		//Before & After Class 로 돌리지 않으면 세션이 유지되어 페이스북 로그인 버튼을 클릭하면 이메일, 패스워드 입력할 필요없이 바로 로그인되므로 일단 막고 진행		
//		Common.waitForElementByName("email");
//		driver.findElement(By.name("email")).sendKeys("juikjuil@nate.com");
//		Thread.sleep(2000);
//
//		Common.waitForElementByName("pass");
//		driver.findElement(By.name("pass")).sendKeys("ju09260927@");
//		Thread.sleep(2000);
//
//    	Common.clickByName("login"); //id, pw 입력 후 login 버튼 선택
//    	Common.WinHandle(); //브라우저 탭 핸들링
//       }

	}
	
	@Test
	  public void scenario_0002_joinAccount() throws InterruptedException {

	    Common.waitForElementByXpath("/html/body/div[1]/main/div/div[1]/section[1]/form/div[2]/div[2]/div/div/input"); //닉네임 입력란 찾을 때까지 대기
	    driver.findElement(By.xpath("/html/body/div[1]/main/div/div[1]/section[1]/form/div[2]/div[2]/div/div/input")).sendKeys("페이스북(라일리)"); //닉네임 입력
	    Thread.sleep(2000);
	    Common.Assert_ExistByText("닉네임을 사용할 수 있습니다."); //닉네임 중복 확인
		
	    Common.clickByXpath("/html/body/div[1]/main/div/div[1]/section[2]/div[1]/label/img"); //전체 동의
	    Common.clickByText("회원 가입하기");
	    
	    Common.Assert_CheckCurrentUrl("https://2ndblock.com/"); //회원 가입되며 메인으로 이동 확인
	    Thread.sleep(2000);
	  }
	
}