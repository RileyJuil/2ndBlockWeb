package test.java;


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
			
			Common.clickByXpath("/html/body/div[1]/main/div/div[2]/section/div[1]/div[2]/a[2]/div[1]/div"); //마이블록 옆에 내가 만든 블록 첫번째 클릭
			Thread.sleep(2000);
			Common.clickByXpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div/img"); //마이메뉴
			Common.clickByText("설정"); //설정 클릭
			Common.clickByText("블록 설정"); //블록 설정 클릭

		}
		
		@Test
		public void OBSetting_002_Change_BlockName() throws InterruptedException {
			
			Common.InputText("/html/body/div[6]/div/div/div[3]/div/div[1]/div[1]/div[1]/div[2]", "테스트"); //블록 제목 라일리 입력
			Common.Enter("/html/body/div[6]/div/div/div[3]/div/div[1]/div[1]/div[1]/div[2]"); //엔터
			
		}
		
		
		
		
		
		
}