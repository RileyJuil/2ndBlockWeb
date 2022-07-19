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
	
	
//		@Test
//		public void Home_000_Login() throws InterruptedException {
//	
//		Common.facebookLogin(); //페이스북 로그인
//		}
	
		@Test
		public void OBSetting_001_Enter() throws InterruptedException {
			
			Common.clickByText("#라일리첫블록"); //마이블록 옆에 내가 만든 블록 첫번째 클릭
			Thread.sleep(5000);
			Thread.sleep(5000);
			Thread.sleep(5000);
			Thread.sleep(5000);
			Common.clickByXpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div/img"); //마이메뉴
			Common.clickByText("설정"); //설정 클릭
			Common.clickByText("블록 설정"); //블록 설정 클릭

		}
		
		@Test
		public void OBSetting_002_Change_BlockName() throws InterruptedException {
			
			Common.InputTextXpath("/html/body/div[6]/div/div/div[3]/div/div[1]/div[1]/div[1]/div[2]/div/input", "테스트"); //블록 제목 라일리 입력
			Common.Enter("/html/body/div[6]/div/div/div[3]/div/div[1]/div[1]/div[1]/div[2]/div/input"); //엔터
			
		}
		
		@Test
		public void OBSetting_003_Change_Notice() throws InterruptedException {
			
			Common.InputTextClass("notice-input", "공지사항을 등록합니다.");
			Thread.sleep(1000);
			
		}
		
		@Test
		public void OBSetting_004_Change_Thumbnail() throws InterruptedException {
			
			Common.Assert_ExistByXpath("/html/body/div[6]/div/div/div[3]/div/div[1]/div[1]/div[4]/div[2]/div/label/div[1]/img");
			Thread.sleep(1000); 

			driver.findElement(By.id("thumbnail-upload")).sendKeys("C:\\Users\\riley\\Downloads\\SaveMe.jpg");
			Thread.sleep(1000);
		}
		
		@Test
		public void OBSetting_005_Public_On() throws InterruptedException {
			
			Common.clickByXpath("/html/body/div[6]/div/div/div[3]/div/div[1]/div[2]/div[1]/div[2]/label"); //홈에서 공개 off
			Thread.sleep(2000);
		}
					
		@Test
		public void OBSetting_006_PW_OnOff() throws InterruptedException {
			
			Common.clickByXpath("/html/body/div[6]/div/div/div[3]/div/div[1]/div[2]/div[3]/div[1]/label"); //비밀번호 사용 클릭
			Thread.sleep(2000);
			Common.InputTextClass("password-input", "1234");
			Thread.sleep(2000);
		}
		
		@Test
		public void OBSetting_007_Hide_OnOff() throws InterruptedException {
			
			Common.clickByXpath("/html/body/div[6]/div/div/div[3]/div/div[1]/div[2]/div[4]/div[2]/label"); //블록 숨기기 on
			Thread.sleep(2000);

		}
		
		@Test
		public void OBSetting_008_Save() throws InterruptedException {
			
			Common.clickByText("변경사항 저장");
			Thread.sleep(2000);
			Common.clickByText("확인");
			Thread.sleep(1000);
		}
		
		@Test
		public void OBSetting_009_Close() throws InterruptedException {
			
			Common.clickByXpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div/img"); //마이메뉴
			Common.clickByText("설정"); //설정 클릭
			Common.clickByText("블록 설정"); //블록 설정 클릭
			//Common.Assert_ExistByText("비밀번호 변경"); //비밀번호 변경으로 노출되는지 확인
			
			Common.clickByXpath("/html/body/div[6]/div/div/div[3]/div/div[1]/div[2]/div[6]/div[2]/div[2]"); //블록 폐쇄 클릭
			Thread.sleep(1000);
			Common.clickByText("블록폐쇄"); //블록 폐쇄 클릭
			Thread.sleep(1000);
			
			if (!driver.findElements(By.xpath("//*[contains(text(), '확인')]")).isEmpty()) {
			Common.clickByText("확인");
			Thread.sleep(1000);
			}
		}
		
		
}