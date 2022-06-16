package test.java;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import main.java.SetUp;


public class Func_04_InGame extends SetUp{
	
	
		@Test
		public void Home_001_InGame_HomeBtn() throws InterruptedException {
			
			//Common.facebookLogin(); //페이스북 로그인
	
			Common.clickByXpath("/html/body/div[1]/main/div/div[1]/div/div/div[1]/span[3]"); //빅배너에서 소개 블록 선택
			Common.clickByXpath("/html/body/div[1]/main/div/div[1]/div/div/div[2]/div[4]/div/div/div[4]/span");//자세히 보기
			Common.clickByXpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/img"); //홈버튼 클릭
			Common.Assert_ExistByXpath("/html/body/div[1]/header/div/div[1]/a/img"); //메인으로 이동하여 메인 로고 있는지 확인
			Common.Back();
	  }
	
		@Test
		public void Home_002_InGame_MyMenu_Character() throws InterruptedException {
			
			Common.clickByXpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div/img"); //마이메뉴
			Common.clickByText("캐릭터 꾸미기"); //"캐릭터 꾸미기" 클릭
			Common.Assert_ExistByText("피부"); //캐릭터꾸미기 모달 확인
			Common.clickByXpath("/html/body/div[3]/div/div/div[1]/div[2]/img"); //닫기 버튼으로 메인 페이지 이동
	  }

		@Test
		public void Home_003_InGame_MyMenu_Setting() throws InterruptedException {
			
			Common.clickByXpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div/img"); //마이메뉴
			Common.clickByText("설정"); //설정 클릭
		    Common.Assert_ExistByText("미디어 설정"); //미디어 설정 탭 유무로 확인
			Common.clickByXpath("/html/body/div[6]/div/div/div[1]/img"); //닫기 버튼으로 메인 페이지 이동
	  }
		
		@Test
		public void Home_004_InGame_BlockTitle() throws InterruptedException {

			Common.Assert_ExistByXpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/span/span"); //인게임 블록 제목 Xpath 확인
	  }
		
		
		
}