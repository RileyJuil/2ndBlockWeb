package test.java;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import main.java.SetUp;


public class Func_04_InGame extends SetUp{
	
	
		@Test
		public void Home_001_InGame_HomeBtn() throws InterruptedException {
			
			Common.facebookLogin(); //페이스북 로그인
	
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
		
		@Test
		public void Home_005_InGame_BlockFollow() throws InterruptedException {

			Common.clickByText("블록 팔로우"); //블록 팔로우 버튼 클릭
			Common.Assert_ExistByText(" 팔로우 중"); //팔로우 중 상태 확인
	  }
		
		@Test
		public void Home_006_InGame_BlockUnfollow() throws InterruptedException {

			Thread.sleep(1000);
			Common.clickByText(" 팔로우 중"); //블록 팔로우 버튼 클릭
			Thread.sleep(1000);
			Common.Assert_ExistByText("블록 팔로우"); //팔로우 중 상태 확인
	  }
		
		@Test
		public void Home_007_InGame_ZoomOut() throws InterruptedException {

			Common.clickByXpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[3]/img"); //축소 돋보기 버튼 클릭
			Assert.assertEquals(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]")).getText(), "50%");
	  }
		
		@Test
		public void Home_008_InGame_ZoomIn() throws InterruptedException {

			Common.clickByXpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/img"); //확대 돋보기 버튼 클릭
			Assert.assertEquals(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]")).getText(), "100%");
	  }
		
		@Test
		public void Home_009_InGame_User() throws InterruptedException {

			System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]")).getText()); //현재 인원수 프린트
	  }
		
		@Test
		public void Home_010_InGame_MenuBtn() throws InterruptedException {

			Common.clickByXpath("//html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[3]/img"); //햄버거 메뉴 버튼 클릭
			Common.Assert_ExistByXpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div/div[4]/div/div/div/div/div/div[2]/div"); //참가 중인 인원 확인
	  }
		
//		@Test
//		public void Home_011_InGame_1Chat1() throws InterruptedException {
//			// 1명 이상은 항상 블록에 있어야 하므로 고민 필요
//			Actions actions = new Actions(driver);
//			WebElement elementLocator = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div/div[4]/div/div/div/div/div/div[2]/div"));
//			actions.doubleClick(elementLocator).perform();
//
//			Common.clickByXpath("//html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[3]/img"); //햄버거 메뉴 버튼 클릭
//			Common.Assert_ExistByXpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div/div[4]/div/div/div/div/div/div[2]/div"); //참가 중인 인원 확인
//	  }
		@Test
		public void Home_011_InGame_SearchNickname() throws InterruptedException {

			Common.waitForElementByXpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div/div[2]/input");
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div/div[2]/input")).sendKeys("라일리"); //닉네임 검색
			Thread.sleep(1000);
			Common.Assert_ExistByXpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div/div[4]/div/div/div/div/div/div[2]/div"); //검색된 유저 확인
	  }
		
		@Test
		public void Home_012_InGame_CloseMenu() throws InterruptedException {

			Common.clickByXpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[3]/img"); //햄버거 메뉴 닫기
	  }
		
		@Test
		public void Home_013_InGame_Open_Minimap() throws InterruptedException {

			Common.clickByXpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[3]/div[1]/img"); //미니맵 열기
			Common.Assert_ExistByXpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[3]/div[2]/img[1]"); // 미니맵 오픈 확인
	  }
		
		@Test
		public void Home_014_InGame_Close_Minimap() throws InterruptedException {

			Common.clickByXpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[3]/div[1]/img"); //미니맵 닫기
			Common.Assert_NotExistByXpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[3]/div[2]/img[2]"); // 미니맵 닫힘 확인
	  }
		
		@Test
		public void Home_015_InGame_Open_Notice() throws InterruptedException {

			Common.clickByXpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div/img"); //공지사항 열기
			Common.Assert_ExistByXpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div"); // 공지사항 열림 확인
	  }
		
		@Test
		public void Home_016_InGame_Close_Notice() throws InterruptedException {

			Common.clickByXpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div/img"); //공지사항 닫기
			Common.Assert_NoSuch_ByXpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div"); // 공지사항 닫힘 확인
	  }
		
		
		
		
		
		
		
}