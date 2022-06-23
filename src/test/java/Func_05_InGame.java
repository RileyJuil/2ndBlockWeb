package test.java;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import main.java.SetUp;


public class Func_05_InGame extends SetUp{
	
	
		@Test
		public void InGame_001_HomeBtn() throws InterruptedException {
			
			//Common.facebookLogin(); //페이스북 로그인
	
			Common.clickByXpath("/html/body/div[1]/main/div/div[1]/div/div/div[1]/span[3]"); //빅배너에서 소개 블록 선택
			Common.clickByXpath("/html/body/div[1]/main/div/div[1]/div/div/div[2]/div[4]/div/div/div[1]");//자세히 보기
			Common.clickByText("블록 입장하기"); //최상단 배너에서 블록 입장하기 생김
			Common.clickByXpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/img"); //홈버튼 클릭
			Common.Assert_ExistByXpath("/html/body/div[1]/header/div/div[1]/a/img"); //메인으로 이동하여 메인 로고 있는지 확인
			Common.Back();
	  }
	
		@Test
		public void InGame_002_MyMenu_Character() throws InterruptedException {
			
			Common.clickByXpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div/img"); //마이메뉴
			Common.clickByText("캐릭터 꾸미기"); //"캐릭터 꾸미기" 클릭
			Common.Assert_ExistByText("피부"); //캐릭터꾸미기 모달 확인
			Common.clickByXpath("/html/body/div[3]/div/div/div[1]/div[2]/img"); //닫기 버튼으로 메인 페이지 이동
	  }

		@Test
		public void InGame_003_MyMenu_Setting() throws InterruptedException {
			
			Common.clickByXpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div/img"); //마이메뉴
			Common.clickByText("설정"); //설정 클릭
		    Common.Assert_ExistByText("미디어 설정"); //미디어 설정 탭 유무로 확인
			Common.clickByXpath("/html/body/div[6]/div/div/div[1]/img"); //닫기 버튼으로 메인 페이지 이동
	  }
		
		@Test
		public void InGame_004_BlockTitle() throws InterruptedException {

			Common.Assert_ExistByXpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/span/span"); //인게임 블록 제목 Xpath 확인
	  }
		
		@Test
		public void InGame_005_BlockFollow() throws InterruptedException {

			Common.clickByText("블록 팔로우"); //블록 팔로우 버튼 클릭
			Common.Assert_ExistByText(" 팔로우 중"); //팔로우 중 상태 확인
	  }
		
		@Test
		public void InGame_006_BlockUnfollow() throws InterruptedException {

			Thread.sleep(2000);
			Common.clickByText(" 팔로우 중"); //블록 팔로우 버튼 클릭
			Thread.sleep(2000);
			Common.Assert_ExistByText("블록 팔로우"); //팔로우 중 상태 확인
	  }
		
		@Test
		public void InGame_007_ZoomOut() throws InterruptedException {

			Common.clickByXpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[3]/img"); //축소 돋보기 버튼 클릭
			Assert.assertEquals(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]")).getText(), "50%");
	  }
		
		@Test
		public void InGame_008_ZoomIn() throws InterruptedException {

			Common.clickByXpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/img"); //확대 돋보기 버튼 클릭
			Assert.assertEquals(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]")).getText(), "100%");
	  }
		
		@Test
		public void InGame_009_User() throws InterruptedException {

			System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]")).getText()); //현재 인원수 프린트
	  }
		
		@Test
		public void InGame_010_MenuBtn() throws InterruptedException {

			Common.clickByXpath("//html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[3]/img"); //햄버거 메뉴 버튼 클릭
			Common.Assert_ExistByXpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div/div[4]/div/div/div/div/div/div[2]/div"); //참가 중인 인원 확인
	  }
		
//		@Test
//		public void InGame_011_1Chat1() throws InterruptedException {
//			// 1명 이상은 항상 블록에 있어야 하므로 고민 필요
//			Actions actions = new Actions(driver);
//			WebElement elementLocator = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div/div[4]/div/div/div/div/div/div[2]/div"));
//			actions.doubleClick(elementLocator).perform();
//
//			Common.clickByXpath("//html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[3]/img"); //햄버거 메뉴 버튼 클릭
//			Common.Assert_ExistByXpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div/div[4]/div/div/div/div/div/div[2]/div"); //참가 중인 인원 확인
//	  }
		@Test
		public void InGame_011_SearchNickname() throws InterruptedException {

			Common.waitForElementByXpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div/div[2]/input");
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div/div[2]/input")).sendKeys("라일리"); //닉네임 검색
			Thread.sleep(1000);
			Common.Assert_ExistByXpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div/div[4]/div/div/div/div/div/div[2]/div"); //검색된 유저 확인
	  }
		
		@Test
		public void InGame_012_CloseMenu() throws InterruptedException {

			Common.clickByXpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[3]/img"); //햄버거 메뉴 닫기
	  }
		
		@Test
		public void InGame_013_Open_Minimap() throws InterruptedException {

			Common.clickByXpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[3]/div[1]/img"); //미니맵 열기
			Common.Assert_ExistByXpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[3]/div[2]/img[1]"); // 미니맵 오픈 확인
	  }
		
		@Test
		public void InGame_014_Close_Minimap() throws InterruptedException {

			Common.clickByXpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[3]/div[1]/img"); //미니맵 닫기
			Common.Assert_NotExistByXpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[3]/div[2]/img[2]"); // 미니맵 닫힘 확인
	  }
		
		@Test
		public void InGame_015_Open_Notice() throws InterruptedException {

			Common.clickByXpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div/img"); //공지사항 열기
			Common.Assert_ExistByXpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div"); // 공지사항 열림 확인
	  }
		
		@Test
		public void InGame_016_Close_Notice() throws InterruptedException {

			Common.clickByXpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div/img"); //공지사항 닫기
			Common.Assert_NoSuch_ByXpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div"); // 공지사항 닫힘 확인
	  }
		
		@Test
		public void InGame_017_AllChatting() throws InterruptedException {

			Common.waitForElementByClassName("chatting-input");
			driver.findElement(By.className("chatting-input")).sendKeys("It's UI Test Automation Chatting with Quality Assurance."); //전체 채팅 입력
			driver.findElement(By.className("chatting-input")).sendKeys(Keys.ENTER); //전체 채팅 입력 후 엔터
			Thread.sleep(1000);
			Assert.assertEquals(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[3]/div/div[2]/div[2]")).getText(), "It's UI Test Automation Chatting with Quality Assurance."); //채팅 내용 전송 확인
	  }
		
		@Test
		public void InGame_018_OnOff_Chatting() throws InterruptedException {

			Thread.sleep(1000);
			Common.clickByXpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[3]/img"); //채팅 창 닫기
			Common.Assert_ExistByXpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/img"); // 채팅 창 닫힘 확인
			
			Common.clickByXpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/img"); //채팅 창 열기
			Common.Assert_ExistByXpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[3]/img"); // 채팅 창 열림 확인
	  }
		
		@Test
		public void InGame_019_FilterEffect() throws InterruptedException {

			Common.clickByXpath("/html/body/div[1]/div[1]/div[2]/div[2]/div[1]"); //필터 효과 모달 열기
			Common.Assert_ExistByText("미디어 설정"); // 미디어 설정 모달 열림 확인		
			Common.clickByXpath("/html/body/div[6]/div/div/div[1]/img"); // 설정 모달 닫기
	  }
		
		@Test
		public void InGame_020_Emoji() throws InterruptedException {

			Common.clickByXpath("/html/body/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]"); // 1번 이모티콘
			Thread.sleep(1000);
			Common.clickByXpath("/html/body/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]"); // 2번 이모티콘
			Thread.sleep(1000);
			Common.clickByXpath("/html/body/div[1]/div[1]/div[2]/div[2]/div[2]/div[3]"); // 3번 이모티콘
			Thread.sleep(1000);
			Common.clickByXpath("/html/body/div[1]/div[1]/div[2]/div[2]/div[2]/div[4]"); // 4번 이모티콘
			Thread.sleep(1000);
	  }
		
		@Test
		public void InGame_021_ShareScreen() throws InterruptedException {

			Common.clickByXpath("/html/body/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div/img"); // 화면 공유 클릭
			Thread.sleep(1000);
	  }
		
		@Test
		public void InGame_022_OnOff_Mike() throws InterruptedException {

			Common.clickByXpath("/html/body/div[1]/div[1]/div[2]/div[3]/div[4]/div[2]/div/div"); //마이크 on
			Thread.sleep(2000);
			
			Common.clickByXpath("/html/body/div[1]/div[1]/div[2]/div[3]/div[4]/div[2]/div/div"); //마이크 off
			Thread.sleep(2000);
	  }
		
		@Test
		public void InGame_023_OnOff_Camera() throws InterruptedException {

			Common.clickByText("카메라 off"); //카메라 on
			Thread.sleep(2000);
			
			Common.clickByXpath("/html/body/div[1]/div[1]/div[2]/div[3]/div[5]/div/div/div/img"); //카메라 off
			Thread.sleep(2000);
	  }
}