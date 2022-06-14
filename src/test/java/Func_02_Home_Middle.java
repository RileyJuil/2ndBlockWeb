package test.java;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import main.java.SetUp;


public class Func_02_Home_Middle extends SetUp{
	
	
		@Test
		public void Home_001_Middle_Banner_Logout() throws InterruptedException {
	
			//미로그인 상태에서 각 배너 클릭하여 로그인 페이지로 이동 확인

			Common.clickByXpath("/html/body/div[1]/main/div/div[1]/div/div/div[1]/span[5]"); //최상단 5번 배너
			Common.clickByXpath("/html/body/div[1]/main/div/div[1]/div/div/div[2]/div[6]/div/div/div[4]/span");//자세히 보기
			Common.Assert_ExistByText("페이스북 계정으로 로그인"); //From을 물고 있어서 로그인 페이지 내의 로그인 버튼으로 이동 확인
			Common.Back(); //메인으로 이동
			
			Common.clickByXpath("/html/body/div[1]/main/div/div[2]/section/a[1]/img"); //세컨블록에서 나만의 캐릭터를 만들어보세요.
			Common.Assert_ExistByText("페이스북 계정으로 로그인"); //From을 물고 있어서 로그인 페이지 내의 로그인 버튼으로 이동 확인
			Common.Back(); //메인으로 이동
			
			Common.clickByXpath("/html/body/div[1]/main/div/div[2]/section/a[2]/img"); //지금 바로 세컨블록 시작하기
			Common.Assert_ExistByText("페이스북 계정으로 로그인"); //From을 물고 있어서 로그인 페이지 내의 로그인 버튼으로 이동 확인
			Common.Back(); //메인으로 이동
			
			Common.clickByXpath("/html/body/div[1]/main/div/div[2]/div[1]/div/div[2]/div[4]/img"); //띠 배너
			Common.Assert_ExistByText("페이스북 계정으로 로그인"); //From을 물고 있어서 로그인 페이지 내의 로그인 버튼으로 이동 확인
			Common.Back(); //메인으로 이동
			
			Common.clickByXpath("/html/body/div[1]/main/div/div[2]/div[2]/div[2]/div[1]/div[1]/div/img"); //지금 가장 참여가 활발한 블록
			Common.Assert_ExistByText("페이스북 계정으로 로그인"); //From을 물고 있어서 로그인 페이지 내의 로그인 버튼으로 이동 확인
			Common.Back(); //메인으로 이동
			
			Common.clickByXpath("/html/body/div[1]/main/div/div[2]/div[3]/div[2]/div[1]/div[1]/div/img"); //이런 블록 어때요?
			Common.Assert_ExistByText("페이스북 계정으로 로그인"); //From을 물고 있어서 로그인 페이지 내의 로그인 버튼으로 이동 확인
			Common.Back(); //메인으로 이동
			
			Common.facebookLogin(); //로그인 진행
	  }
	
		@Test
		public void Home_002_Middle_Banner_Top() throws InterruptedException {
	
			Common.clickByXpath("/html/body/div[1]/main/div/div[1]/div/div/div[1]/span[1]");
			Common.clickByXpath("/html/body/div[1]/main/div/div[1]/div/div/div[1]/span[2]");
			Common.clickByXpath("/html/body/div[1]/main/div/div[1]/div/div/div[1]/span[3]");
			Common.clickByXpath("/html/body/div[1]/main/div/div[1]/div/div/div[1]/span[4]");
			Common.clickByXpath("/html/body/div[1]/main/div/div[1]/div/div/div[1]/span[5]"); //최상단 5번 배너
			Common.clickByXpath("/html/body/div[1]/main/div/div[1]/div/div/div[2]/div[6]/div/div/div[4]/span");//자세히 보기
			Common.Assert_ExistByXpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/span/span"); //인게임 블록 제목 Xpath 확인
		    Common.Back(); //이번 버튼으로 메인 페이지 이동
	  }
		
		@Test
		public void Home_003_Middle_OwnBlock_Info() throws InterruptedException {
	
			Common.Assert_ExistByXpath("/html/body/div[1]/main/div/div[2]/section/div[1]/div[2]/div[1]/div[1]/div/div/span[2]"); //0명 접속 중
			Common.Assert_ExistByXpath("/html/body/div[1]/main/div/div[2]/section/div[1]/div[2]/div[1]/div[2]/h3"); //마이블록 제목
			Common.Assert_ExistByXpath("/html/body/div[1]/main/div/div[2]/section/div[1]/div[2]/div[1]/p"); //팔로워 0명
	  }
		
		@Test
		public void Home_004_Middle_MyBlock_Star() throws InterruptedException {
	
			Common.Assert_ExistByXpath("/html/body/div[1]/main/div/div[2]/section/div[1]/div[2]/div[1]/div[1]/div/img[2]"); //마이블록 표시 확인
	  }
		
		@Test
		public void Home_005_Middle_MyBlock_Enter() throws InterruptedException {
	
			Common.clickByXpath("/html/body/div[1]/main/div/div[2]/section/div[1]/div[2]/div[1]/div[1]/div/img[1]"); //마이블록 진입
			Common.Assert_ExistByXpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/span/span"); //인게임 블록 제목 Xpath 확인
		    Common.Back(); //이번 버튼으로 메인 페이지 이동
	  }
		
		@Test
		public void Home_006_Middle_Make_Block() throws InterruptedException {
	
			Common.clickByXpath("/html/body/div[1]/main/div/div[2]/section/div[1]/div[2]/a/div/img"); // 블록 만들기 + 클릭
			Common.Assert_CheckCurrentUrl("https://2ndblock.com/space"); //블록 만들기 페이지 확인
		    Common.Back(); //이번 버튼으로 메인 페이지 이동
	  }
		
		@Test
		public void Home_007_Middle_Join_Block() throws InterruptedException {
	
			Common.clickByXpath("/html/body/div[1]/main/div/div[2]/section/div[2]/div[2]/div[1]/div[1]/div/img"); //내가 참여한 블록 첫번째 진입
			Common.Assert_ExistByXpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/span/span"); //인게임 블록 제목 Xpath 확인
		    Common.Back(); //이번 버튼으로 메인 페이지 이동
	  }
		
		@Test
		public void Home_008_Middle_LineBanner() throws InterruptedException {
	
			Common.clickByXpath("/html/body/div[1]/main/div/div[2]/div[1]/div/div[1]/span[2]"); //띠배너2 포커스
			Common.clickByXpath("/html/body/div[1]/main/div/div[2]/div[1]/div/div[1]/span[1]"); //띠배너1 포커스
			Common.clickByXpath("/html/body/div[1]/main/div/div[2]/div[1]/div/div[2]/div[2]/img"); //띠배너1 클릭
			Common.Assert_CheckCurrentUrl("https://2ndblock.com/space#100"); //url로 비교
		    Common.Back(); //이번 버튼으로 메인 페이지 이동
	  }	
		
		@Test
		public void Home_009_Middle_Recommended_Block() throws InterruptedException {
	
			Common.clickByXpath("/html/body/div[1]/main/div/div[2]/div[3]/div[2]/div[1]/div[1]/div/img"); //이런 블록 어때요? 첫번째 클릭
			Common.Assert_ExistByXpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/span/span"); //인게임 블록 제목 Xpath 확인
		    Common.Back(); //이번 버튼으로 메인 페이지 이동
	  }	
		
		
		
		
		
		
		
}