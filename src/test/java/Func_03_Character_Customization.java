package test.java;




import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import main.java.SetUp;


public class Func_03_Character_Customization extends SetUp{
	
	
		@Test
		public void Character_001_MyMenu_Character() throws InterruptedException {
			
			//Common.facebookLogin(); //페이스북 로그인
			
//			Common.clickByXpath("/html/body/div[1]/main/div/div[1]/div/div/div[1]/span[3]"); //빅배너에서 소개 블록 선택
//			Common.clickByXpath("/html/body/div[1]/main/div/div[1]/div/div/div[2]/div[4]/div/div/div[4]/span");//자세히 보기
//			Common.clickByXpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div/img"); //마이메뉴
			
			Common.clickByXpath("/html/body/div[1]/header/div/div[2]/div[2]/div"); //마이메뉴
			Common.clickByText("캐릭터 꾸미기"); //"캐릭터 꾸미기" 클릭
			
	  }

		@Test
		public void Character_002_Skin() throws InterruptedException {
			Common.Assert_ExistByText("피부"); //캐릭터꾸미기 모달 진입 시 피부 디폴트 노출 확인
			Thread.sleep(2000);
			Common.clickByXpath("/html/body/div[3]/div/div/div[2]/div[2]/div[2]/ul/li[3]"); //스킨 선택
		}
		@Test
		public void Character_003_Hair() throws InterruptedException {
			
			Common.clickByText("헤어");
			Thread.sleep(2000);
			Common.clickByXpath("/html/body/div[3]/div/div/div[2]/div[2]/div[2]/ul/li[12]"); //헤어 선택
			Common.clickByXpath("/html/body/div[3]/div/div/div[2]/div[2]/div[3]/ul/li[4]/div"); //헤어 색상 선택
	  }
		
		@Test
		public void Character_004_Top() throws InterruptedException {
			
			Thread.sleep(2000);
			Common.clickByXpath("/html/body/div[3]/div/div/div[2]/div[2]/div[1]/ul/li[3]"); //상의 탭 선택
			Thread.sleep(2000);
			Common.clickByXpath("/html/body/div[3]/div/div/div[2]/div[2]/div[2]/ul/li[6]"); //상의 선택
			Common.clickByXpath("/html/body/div[3]/div/div/div[2]/div[2]/div[3]/ul/li[3]/div"); //상의 색상 선택
	  }
		
		@Test
		public void Character_005_Bottom() throws InterruptedException {
			Common.clickByXpath_Hidden("/html/body/div[3]/div/div/div[2]/div[2]/div[1]/div[2]/button");
			Common.clickByText("하의");
			Thread.sleep(2000);
			Common.clickByXpath("/html/body/div[3]/div/div/div[2]/div[2]/div[2]/ul/li[9]"); //하의 선택
			Common.clickByXpath("/html/body/div[3]/div/div/div[2]/div[2]/div[3]/ul/li[3]/div"); //하의 색상 선택
	  }
		
		@Test
		public void Character_006_Bag() throws InterruptedException {
			
			Common.clickByXpath_Hidden("/html/body/div[3]/div/div/div[2]/div[2]/div[1]/div[4]/button");
			Common.clickByXpath_Hidden("/html/body/div[3]/div/div/div[2]/div[2]/div[1]/div[4]/button");

			Thread.sleep(2000);
			Common.clickByText("가방");
			Thread.sleep(2000);
			Common.clickByXpath("/html/body/div[3]/div/div/div[2]/div[2]/div[2]/ul/li[6]"); //가방 선택
	  }
		
		@Test
		public void Character_007_Cap() throws InterruptedException {
			
			Common.clickByText("모자");
			Thread.sleep(2000);
			Common.clickByXpath("/html/body/div[3]/div/div/div[2]/div[2]/div[2]/ul/li[2]"); //모자 선택
	  }
		
		@Test
		public void Character_008_Shose() throws InterruptedException {
			Common.clickByXpath_Hidden("/html/body/div[3]/div/div/div[2]/div[2]/div[1]/div[4]/button");
			Common.clickByXpath_Hidden("/html/body/div[3]/div/div/div[2]/div[2]/div[1]/div[4]/button");
			Common.clickByXpath_Hidden("/html/body/div[3]/div/div/div[2]/div[2]/div[1]/div[4]/button");
			
			Common.clickByText("신발");
			Thread.sleep(2000);
			Common.clickByXpath("/html/body/div[3]/div/div/div[2]/div[2]/div[2]/ul/li[6]"); //신발 선택
	  }
		
		@Test
		public void Character_009_Socks() throws InterruptedException {
			
			Common.clickByText("양말");
			Thread.sleep(2000);
			Common.clickByXpath("/html/body/div[3]/div/div/div[2]/div[2]/div[2]/ul/li[7]"); //양말 선택
	  }
		
		@Test
		public void Character_010_Accessories() throws InterruptedException {
			
			Common.clickByText("악세사리");
			Thread.sleep(2000);
			Common.clickByXpath("/html/body/div[3]/div/div/div[2]/div[2]/div[2]/ul/li[1]"); //악세사리 1 선택
			Thread.sleep(2000);
			Common.clickByXpath("/html/body/div[3]/div/div/div[2]/div[2]/div[2]/ul/li[7]"); //악세사리 7 선택
			Thread.sleep(2000);
			Common.clickByXpath("/html/body/div[3]/div/div/div[2]/div[2]/div[2]/ul/li[8]"); //악세사리 8 선택
			Thread.sleep(2000);
	  }
		
		@Test
		public void Character_011_Save() throws InterruptedException {
			
			Common.clickByText("저장");
			Thread.sleep(2000);
			Common.clickByText("확인");
			Thread.sleep(2000);
	  }
		
}