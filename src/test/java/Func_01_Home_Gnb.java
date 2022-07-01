package test.java;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import main.java.SetUp;


public class Func_01_Home_Gnb extends SetUp{
	
	
		@Test
		public void Home_001_Gnb_About() throws InterruptedException {
	
			//Common.facebookLogin(); //페이스북 로그인
			//로그아웃하는 부분을 넎어줌
			
			//220701 가입 30일 이슈로 잠시 막음
			//Home_012_Gnb_MyMenu_LogOut();
			//Home_013_Gnb_MyMenu_LogOut_Complete();

			Common.clickByText("세컨블록 소개");
			Common.Assert_CheckCurrentUrl("https://2ndblock.com/about"); //about 페이지 이동 확인
	  }
	
		@Test
		public void Home_002_Gnb_About_Start() throws InterruptedException {

			Common.PageScrollBottom();
			Common.clickByXpath("/html/body/div[1]/main/div/div[6]/div/div/div[2]"); //About 페이지 내의 하단에 "시작하기" 버튼
			Common.Assert_CheckCurrentUrl("https://2ndblock.com/login"); //로그인 페이지 이동 확인

	  }
		
		@Test
		public void Home_003_Gnb_MainLogo() throws InterruptedException {

			Common.clickByXpath("/html/body/div[1]/header/div/div[1]/a/img"); //GNB 최상단 좌측의 로고 클릭
			Common.Assert_CheckCurrentUrl("https://2ndblock.com/"); //메인 페이지 이동 확인

	  }		
		
		@Test
		public void Home_004_Gnb_CustormerCenter() throws InterruptedException {

			Common.clickByText("고객센터");
			Common.WinHandle();
			Common.Assert_CheckCurrentUrl("https://secondblock.zendesk.com/hc/ko");
			driver.close();
			Common.WinHandle();
	  }
		
		@Test
		public void Home_005_Gnb_Start() throws InterruptedException {
			
			//220701 가입 30일 이슈로 잠시 열어놓음
			Common.facebookLogin(); //크롬 드라이버가 종료되는 것이 아니니 페이스북 로그인을 id, pw를 입력하지 않아도 바로 로그인 됨
			
			//220701 가입 30일 이슈로 잠시 막음
//			Common.clickByText("시작하기"); //시작하기
//			Common.clickByText("페이스북 계정으로 로그인");
//			Common.WinHandle(); //브라우저 탭 핸들링
	  }
		
		@Test
		public void Home_006_Gnb_MyMenu() throws InterruptedException {
			
			Common.clickByXpath("/html/body/div[1]/header/div/div[2]/div[2]/div"); //마이메뉴
		    Common.Assert_ExistByText("마이블록 입장");
	  }
		
		@Test
		public void Home_007_Gnb_MyMenu_MyBlock() throws InterruptedException {
			
			Common.clickByText("마이블록 입장"); //마이블록 입장 클릭
		    Common.Assert_ExistByXpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/span/span"); //블록 제목 Xpath 확인
		    Common.Back(); //이번 버튼으로 메인 페이지 이동
	  }
		
		@Test
		public void Home_008_Gnb_MyMenu_OwnBlock() throws InterruptedException {
			
			Common.clickByXpath("/html/body/div[1]/header/div/div[2]/div[2]/div"); //마이메뉴
			Common.clickByText("내가 만든 블록"); //"내가 만든 블록" 클릭
			Common.Assert_CheckCurrentUrl("https://2ndblock.com/blocks/own"); //"내가 만든 블록" 페이지 이동 확인
			Common.Back(); //이번 버튼으로 메인 페이지 이동
	  }
		
		@Test
		public void Home_009_Gnb_MyMenu_MakeBlock() throws InterruptedException {
			
			Common.clickByXpath("/html/body/div[1]/header/div/div[2]/div[2]/div"); //마이메뉴
			Common.clickByText("블록 만들기"); //"블록 만들기" 클릭
			Common.Assert_CheckCurrentUrl("https://2ndblock.com/space"); //"블록 만들기" 페이지 이동 확인
			Common.Back(); //이번 버튼으로 메인 페이지 이동
	  }
		
		@Test
		public void Home_010_Gnb_MyMenu_Character() throws InterruptedException {
			
			Common.clickByXpath("/html/body/div[1]/header/div/div[2]/div[2]/div"); //마이메뉴
			Common.clickByText("캐릭터 꾸미기"); //"캐릭터 꾸미기" 클릭
			Common.Assert_ExistByText("피부"); //캐릭터꾸미기 모달 확인
			Common.clickByXpath("/html/body/div[5]/div/div/div[1]/div[2]"); //닫기 버튼으로 메인 페이지 이동
	  }
		
		@Test
		public void Home_011_Gnb_MyMenu_Setting() throws InterruptedException {
			
			Common.clickByXpath("/html/body/div[1]/header/div/div[2]/div[2]/div"); //마이메뉴
			Common.clickByText("설정"); //설정 클릭
		    Common.Assert_ExistByText("정말 탈퇴하시겠습니까?"); //탈퇴 버튼 유무로 확인
			Common.clickByXpath("/html/body/div[7]/div/div/div[1]/img"); //닫기 버튼으로 메인 페이지 이동
	  }
		
		@Test
		public void Home_012_Gnb_MyMenu_LogOut() throws InterruptedException {
			
			Common.clickByXpath("/html/body/div[1]/header/div/div[2]/div[2]/div"); //마이메뉴
			Common.clickByXpath("/html/body/div[1]/header/div/div[2]/div[2]/ul/li[6]"); //로그아웃 클릭
		    Common.Assert_ExistByText("정말로 로그아웃 하시겠습니까?"); //로그아웃 문구 유무로 확인
		    Common.clickByText("확인"); //로그아웃 - 확인 클릭
	  }
		
		@Test
		public void Home_013_Gnb_MyMenu_LogOut_Complete() throws InterruptedException {
			
		    Common.clickByText("확인"); //완료-확인 클릭
		    Common.Assert_ExistByText("시작하기"); //로그아웃 후에 시작하기 버튼 노출 확인
	  }

}