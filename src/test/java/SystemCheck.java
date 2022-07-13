package test.java;


import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import main.java.SetUp;

public class SystemCheck extends SetUp{
	
	@Test
	public void Join_001_Login_Facebook() throws InterruptedException {

		if (!driver.findElements(By.xpath("/html/body/div[1]/div/div")).isEmpty()) {
			Thread.sleep(1000);
			Common.InputTextXpath("/html/body/div[1]/header/div/div[2]/a", "s");
			Thread.sleep(1000);
			Common.InputTextXpath("/html/body/div[1]/header/div/div[2]/a", "e");
			Thread.sleep(1000);
			Common.InputTextXpath("/html/body/div[1]/header/div/div[2]/a", "c");
			Thread.sleep(1000);
			Common.InputTextXpath("/html/body/div[1]/header/div/div[2]/a", "o");
			Thread.sleep(1000);
			Common.InputTextXpath("/html/body/div[1]/header/div/div[2]/a", "n");
			Thread.sleep(1000);
			Common.InputTextXpath("/html/body/div[1]/header/div/div[2]/a", "d");
			Thread.sleep(3000);
			
			Common.clickByText("시작하기"); //시작하기
			Common.clickByText("페이스북 계정으로 로그인");
			Common.WinHandle(); //브라우저 탭 핸들링
		} 
		else {
			Common.clickByText("시작하기"); //시작하기
			Common.clickByText("페이스북 계정으로 로그인");
			Common.WinHandle(); //브라우저 탭 핸들링
		}
	}
//		@Test
//		public void Home_000_Login() throws InterruptedException {
//		
//			Common.facebookLogin(); //페이스북 로그인
//			}
//		
//		@Test
//		public void OBSetting_001_Enter() throws InterruptedException {
//			
//			Common.clickByText("#라일리첫블록"); //마이블록 옆에 내가 만든 블록 첫번째 클릭
//			Thread.sleep(6000);
//			Common.clickByXpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div/img"); //마이메뉴
//			Common.clickByText("설정"); //설정 클릭
//			Common.clickByText("블록 설정"); //블록 설정 클릭
//
//		}
//		
//		
//		@Test
//		public void OBSetting_008_Close() throws InterruptedException {
//	
//			Common.clickByXpath("/html/body/div[7]/div/div/div[3]/div/div[1]/div[2]/div[4]/div[2]/div[2]"); //블록 폐쇄 클릭
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//*[contains(text(), '블록폐쇄')]")).click(); //블록 폐쇄 클릭
//			//driver.findElement(By.xpath("//span[.='블록폐쇄']")).click(); //블록 폐쇄 클릭
//			Thread.sleep(1000);
//			
//			if (!driver.findElements(By.xpath("//*[contains(text(), '확인')]")).isEmpty()) {
//			Common.clickByText("확인");
//			Thread.sleep(1000);
//			} else
//			{Thread.sleep(3000);}
//			
//			
//		}
		

	
}