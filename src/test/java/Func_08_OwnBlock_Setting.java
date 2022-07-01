package test.java;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import main.java.SetUp;


public class Func_08_OwnBlock_Setting extends SetUp{
	
	
		@Test
		public void Home_000_Login() throws InterruptedException {
	
		Common.facebookLogin(); //페이스북 로그인
		}
	
		@Test
		public void OBSetting_001_Enter() throws InterruptedException {
			
			Common.clickByText("#라일리첫블록"); //마이블록 옆에 내가 만든 블록 첫번째 클릭
			Thread.sleep(2000);
			Common.clickByXpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div/img"); //마이메뉴
			Common.clickByText("설정"); //설정 클릭
			Common.clickByText("블록 설정"); //블록 설정 클릭

		}
		
		@Test
		public void OBSetting_002_Change_BlockName() throws InterruptedException {
			
			Common.InputTextXpath("/html/body/div[7]/div/div/div[3]/div/div[1]/div[1]/div[1]/div[2]/div/input", "테스트"); //블록 제목 라일리 입력
			Common.Enter("/html/body/div[7]/div/div/div[3]/div/div[1]/div[1]/div[1]/div[2]/div/input"); //엔터
			
		}
		
		@Test
		public void OBSetting_003_Change_Notice() throws InterruptedException {
			
			Common.InputTextClass("notice-input", "공지사항을 등록합니다.");
			Thread.sleep(1000);
			
		}
		
		@Test
		public void OBSetting_004_Change_Thumbnail() throws InterruptedException {
			
			Common.Assert_ExistByXpath("/html/body/div[7]/div/div/div[3]/div/div[1]/div[1]/div[3]/div[2]/div/label/div[1]/img");
			Thread.sleep(1000);

			driver.findElement(By.id("thumbnail-upload")).sendKeys("C:\\Users\\riley\\Downloads\\SaveMe.jpg");
			Thread.sleep(1000);
		}
		
		@Test
		public void OBSetting_005_PW_OnOff() throws InterruptedException {
			
			Common.clickById("password-set-toggle"); //마이블록 옆에 내가 만든 블록 첫번째 클릭
			Thread.sleep(2000);
			Common.clickByXpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div/img"); //마이메뉴
			Common.clickByText("설정"); //설정 클릭
			Common.clickByText("블록 설정"); //블록 설정 클릭

		}
		
		
}