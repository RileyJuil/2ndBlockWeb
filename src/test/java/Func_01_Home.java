package test.java;


import org.testng.annotations.Test;

import main.java.SetUp;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.interactions.touch.ScrollAction;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Func_01_Home extends SetUp{
	
//	
//		@Test
//		public void Home_001_Gnb_About() throws InterruptedException {
//
//			Thread.sleep(2000); 
//			Common.clickByXpath("/html/body/div[1]/div/div/div/div[1]/div/div/div[2]/div[1]"); //GNB - About 클릭
//			Common.Assert_CheckCurrentUrl("https://2ndblock.com/about");
//	  }
//	
//		@Test
//		public void Home_002_Gnb_About_Start() throws InterruptedException {
//
//			Common.clickByXpath("/html/body/div[1]/div/div[5]/div"); //About 페이지 내의 하단에 "시작하기" 버튼
//			Common.Assert_ExistByText("페이스북 계정으로 로그인");
//			Common.Refresh();
//	  }
//		
//		@Test
//		public void Home_003_Gnb_Guide() throws InterruptedException {
//
//			Common.clickByXpath("/html/body/div[1]/div/div[1]/div/div/div[2]/div[2]"); //GNB - Guide 클릭
//			Common.Assert_CheckCurrentUrl("https://2ndblock.com/guide");
//	  }
//		
//		@Test
//		public void Home_004_Gnb_Notice() throws InterruptedException {
//
//			Common.clickByXpath("/html/body/div[1]/div/div/div[1]/div[1]/div/div/div[2]/div[3]"); //GNB - Notice 클릭
//			Common.Assert_CheckCurrentUrl("https://2ndblock.com/notice");
//	  }
//		
//		@Test
//		public void Home_005_Gnb_Faq() throws InterruptedException {
//
//			Common.clickByXpath("/html/body/div[1]/div/div/div[1]/div[1]/div/div/div[2]/div[4]"); //GNB - FAQ 클릭
//			Common.Assert_CheckCurrentUrl("https://2ndblock.com/faq");
//	  }
//		
//		@Test
//		public void Home_006_Gnb_Logo() throws InterruptedException {
//								
//			Common.clickByXpath("/html/body/div[1]/div/div/div/div[1]/div/div/div[1]"); //GNB - Logo 클릭
//			Common.Assert_CheckCurrentUrl("https://2ndblock.com/");
//      }
//		
//		@Test
//		public void Home_007_Gnb_EN() throws InterruptedException {
//
//			Common.clickByXpath("/html/body/div[1]/div/div/div/div[1]/div/div/div[3]/div[1]/div/div[3]"); //GNB - EN 클릭
//			Common.Assert_ExistByText("Recommended max");
//      }
//		
//		@Test
//		public void Home_008_Gnb_KR() throws InterruptedException {
//
//			Common.clickByXpath("/html/body/div[1]/div/div/div/div[1]/div/div/div[3]/div[1]/div/div[1]"); //GNB - KR 클릭
//			Common.Assert_ExistByText("권장 최대 인원");
//      }
//
//		@Test
//		public void Home_009_Gnb_HomeStart() throws InterruptedException {
//
//			Common.facebookLogin(); //GNB -시작하기를 통해 페이스북으로 로그인
//      }
//		
//		@Test
//		public void Home_010_Gnb_MyMenu() throws InterruptedException {
//
//		    Common.clickByXpath_Hidden("/html/body/div[1]/div/div[1]/div/div/div[3]/div[2]/div"); //마이메뉴
//	
//      }
//		
//		@Test
//		public void Home_011_Gnb_MyMenu_MyBlock() throws InterruptedException {
//
//			Common.clickByText("마이블록 입장");
//			Common.clickByText("입장하기");
//			Common.Assert_ExistByXpath("/html/body/div[1]/div/div[1]/div[3]/div[1]/div[2]/div/div[1]/div/img"); //방장 썸네일로 확인
//		    Common.clickByXpath("/html/body/div[1]/div/div[1]/div[3]/div[1]/div[1]"); //블록 내의 홈 버튼 클릭하여 메인으로 이동
//      }
//		
//		@Test
//		public void Home_012_Gnb_MyMenu_BlockiMade() throws InterruptedException {
//
//			Home_010_Gnb_MyMenu();  //마이메뉴
//			Common.clickByText("내가 만든 블록");
//			Common.Assert_ExistByXpath("/html/body/div[1]/div/div[2]");
//			Common.Back(); //Back으로 메인으로 이동
//      }
//		
//		@Test
//		public void Home_013_Gnb_MyMenu_MakeNewBlock() throws InterruptedException {
//
//			Home_010_Gnb_MyMenu();  //마이메뉴
//			Common.clickByText("새 블록 만들기");
//			Common.Assert_ExistByText("직접 만들기");
//			Common.Back(); //Back으로 메인으로 이동
//      }
//		
//		@Test
//		public void Home_014_Gnb_MyMenu_EditChar() throws InterruptedException {
//
//			Home_010_Gnb_MyMenu();  //마이메뉴
//			Common.clickByText("캐릭터 꾸미기");
//			Common.Assert_ExistByText("변경사항 저장");
//			Common.clickByXpath("/html/body/div[3]/div/div/div[1]/div[2]/img"); // X버튼 클릭하여 모달창 닫기
//      }
//		
//		@Test
//		public void Home_015_Gnb_MyMenu_Setting() throws InterruptedException {
//
//			Home_010_Gnb_MyMenu();  //마이메뉴
//			Common.clickByText("설정");
//			Common.Assert_ExistByText("개인 설정");
//			Common.clickByXpath("/html/body/div[12]/div/div/div[2]/div/div[1]/div[2]/img"); // X버튼 클릭하여 모달창 닫기
//      }
//		
//		@Test
//		public void Home_016_Gnb_MyMenu_LogOut() throws InterruptedException {
//
//			Home_010_Gnb_MyMenu();  //마이메뉴
//			Common.clickByXpath("/html/body/div[1]/div/div[1]/div/div/div[3]/div[2]/ul/li[6]"); // Text로 안잡혀서 Xpath로 변경
//			Common.clickByText("확인"); //경고 얼럿 확인
//			Common.clickByText("확인"); //완료 얼럿 확인
//			Common.Assert_ExistByText("시작하기");
//      }
		
		@Test
		public void Home_017_Footer_Faq() throws InterruptedException {

			Common.clickByText("자주 묻는 질문");
			Common.Assert_CheckCurrentUrl("https://2ndblock.com/faq");
			Common.Back(); //Back으로 메인으로 이동
	  }
		
		@Test
		public void Home_018_Footer_Notice() throws InterruptedException {

			Common.clickByText("공지사항");
			Common.Assert_CheckCurrentUrl("https://2ndblock.com/notice");
			Common.Back(); //Back으로 메인으로 이동
	  }
		
		@Test
		public void Home_019_Footer_terms_of_service() throws InterruptedException {

			Common.clickByText("이용약관");
			Common.WinHandle();
			Common.Assert_CheckCurrentUrl("https://info.2ndblock.com/terms_of_service.html");
			driver.close();
			Common.WinHandle();
	  }
		
		@Test
		public void Home_020_Footer_privacy_policy() throws InterruptedException {

			Common.clickByText("개인정보 처리방침");
			Common.WinHandle();
			Common.Assert_CheckCurrentUrl("https://info.2ndblock.com/privacy_policy.html");
			driver.close();
			Common.WinHandle();
	  }
		
}