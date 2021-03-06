package test.java;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import main.java.SetUp;


public class Func_07_MakeBlock extends SetUp{
	
		//하나만 돌릴 때만 열기
//		@Test
//		public void Home_000_Login() throws InterruptedException {
//	
//		Common.facebookLogin(); //페이스북 로그인
//		}
	
		@Test
		public void MakeBlock_001_Enter() throws InterruptedException {
			
			//Common.clickByXpath("/html/body/div[1]/main/div/div[2]/section/div[1]/div[2]/a[3]"); //블록 만들기 클릭, 뒤에 숫자가 블록 늘어날수록 늘어남
			Common.clickByLinktext("블록 만들기");
		    Common.Assert_ExistByText("#대규모컨퍼런스홀"); //블록 프리셋 이름 확인
		}
		
		@Test
		public void MakeBlock_002_Preset() throws InterruptedException {
			
			Common.clickByText("#대규모컨퍼런스홀"); //화이트컨퍼런스홀 클릭
		    Common.Assert_ExistByText("블록 설정하기"); //블록 설정하기 모달 확인
		}
		
		@Test
		public void MakeBlock_003_Preset_Check() throws InterruptedException {
			
		    Common.Assert_ExistByText("#대규모컨퍼런스홀"); //템플릿 제목
		    Thread.sleep(1000);
		    Common.Assert_ExistByXpath("/html/body/div[9]/div/div/div[2]/div[1]/div[1]/img"); //썸네일

		    Thread.sleep(1000);
		    Assert.assertEquals(driver.findElement(By.xpath("/html/body/div[9]/div/div/div[2]/div[1]/p[2]")).getText(), "깔끔한 화이트톤의 약 300인 좌석 컨퍼런스 홀입니다."); //설명
		    Thread.sleep(1000);
		    Common.Assert_ExistByXpath("/html/body/div[9]/div/div/div[2]/div[2]/div[2]/div/input"); //블록 이름 입력란
		}
		
		@Test
		public void MakeBlock_004_Preset_CheckBtn() throws InterruptedException {
			
		    Assert.assertFalse(driver.findElement(By.xpath("/html/body/div[9]/div/div/div[2]/div[2]/button")).isEnabled()); //버튼 비활성화 체크
		}
		
		@Test
		public void MakeBlock_005_Preset_InputName() throws InterruptedException {
			
//			Date date = new Date();
//			System.out.println(date.toString());
//			SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy hhmmss");
//			String formattedDate = sdf.format(date);
//			driver.findElement(By.xpath("/html/body/div[7]/div/div/div[3]/div/div[1]/div[1]/div[2]/div[2]/input")).sendKeys("라일리"+ formattedDate); //닉네임 입력
//			
			Common.InputTextXpath("/html/body/div[9]/div/div/div[2]/div[2]/div[2]/div/input", "라일리첫블록"); //블록 제목 라일리 입력
			Common.Enter("/html/body/div[9]/div/div/div[2]/div[2]/div[2]/div/input"); //엔터
			
		}
		
		@Test
		public void MakeBlock_006_Preset_Make() throws InterruptedException {
			
			Common.clickByXpath("/html/body/div[9]/div/div/div[2]/div[2]/button"); //블록 만들기 버튼 클릭
			Thread.sleep(5000);
			Common.Assert_ExistByXpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/span/span"); //인게임 블록 제목 Xpath 확인
			Thread.sleep(1000);
			Common.clickByXpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/img"); //홈버튼 클릭
		}
		
		
		
		
		
		
}