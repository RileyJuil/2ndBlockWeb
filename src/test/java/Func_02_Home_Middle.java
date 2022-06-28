package test.java;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import main.java.SetUp;


public class Func_02_Home_Middle extends SetUp{
	
	
		@Test
		public void Home_001_Middle_Banner_Logout() throws InterruptedException {
	
			//미로그인 상태에서 각 배너 클릭하여 로그인 페이지로 이동 확인

			Common.clickByXpath("/html/body/div[1]/main/div/div[1]/div/div/div[1]/span[5]"); //최상단 5번 배너
			Common.clickByXpath("/html/body/div[1]/main/div/div[1]/div/div/div[2]/div[6]/div/div/div[1]");//자세히 보기
			Common.Assert_ExistByText("페이스북 계정으로 로그인"); //From을 물고 있어서 로그인 페이지 내의 로그인 버튼으로 이동 확인
			Common.Back(); //메인으로 이동
			System.out.println("미로그인-최상단 5번 배너 확인 완료 ");
			
			Common.clickByXpath("/html/body/div[1]/main/div/div[2]/section/a[1]"); //세컨블록에서 나만의 캐릭터를 만들어보세요.
			Common.Assert_ExistByText("페이스북 계정으로 로그인"); //From을 물고 있어서 로그인 페이지 내의 로그인 버튼으로 이동 확인
			Common.Back(); //메인으로 이동
			System.out.println("미로그인-세컨블록에서 나만의 캐릭터 확인 완료 ");
			
			Common.clickByXpath("/html/body/div[1]/main/div/div[2]/section/a[2]"); //지금 바로 세컨블록 시작하기
			Common.Assert_ExistByText("페이스북 계정으로 로그인"); //From을 물고 있어서 로그인 페이지 내의 로그인 버튼으로 이동 확인
			Common.Back(); //메인으로 이동
			System.out.println("미로그인-지금 바로 세컨블록 시작하기 확인 완료 ");
			
			Common.clickByXpath("/html/body/div[1]/main/div/div[2]/div[1]/div/div[2]/div[4]"); //띠 배너
			Common.Assert_ExistByText("페이스북 계정으로 로그인"); //From을 물고 있어서 로그인 페이지 내의 로그인 버튼으로 이동 확인
			Common.Back(); //메인으로 이동
			System.out.println("미로그인-띠배너 확인 완료 ");
		
			//지금 참여가 활발한 블록은 사람이 없으면 메인페이지에 노출이 안됨 
			//지금 참여가 활발한 블록이 노출이 안되면 이런 블록 어때요? 또한 xpath가 변경되는 것 같음 
//			Common.clickByXpath("/html/body/div[1]/main/div/div[2]/div[2]/div[2]/a[1]/div[1]/div"); //지금 가장 참여가 활발한 블록
//			Common.Assert_ExistByText("페이스북 계정으로 로그인"); //From을 물고 있어서 로그인 페이지 내의 로그인 버튼으로 이동 확인
//			Common.Back(); //메인으로 이동
//			System.out.println("미로그인-지금 가장 참여가 활발한 블록 확인 완료 ");
			
//			Common.clickByXpath("/html/body/div[1]/main/div/div[2]/div[3]/div[2]/a[1]/div[1]/div"); //이런 블록 어때요?
//			Common.Assert_ExistByText("페이스북 계정으로 로그인"); //From을 물고 있어서 로그인 페이지 내의 로그인 버튼으로 이동 확인
//			Common.Back(); //메인으로 이동
//			System.out.println("미로그인-이런 블록 어때요? 확인 완료 ");
			
			//Common.facebookLogin(); //크롬 드라이버가 종료되는 것이 아니니 페이스북 로그인을 id, pw를 입력하지 않아도 바로 로그인 됨
			Common.clickByText("시작하기"); //시작하기
			Common.clickByText("페이스북 계정으로 로그인");
			Common.WinHandle(); //브라우저 탭 핸들링
	  }
	
		@Test
		public void Home_002_Middle_Banner_Top() throws InterruptedException {
	
			Common.clickByXpath("/html/body/div[1]/main/div/div[1]/div/div/div[1]/span[1]");
			Common.clickByXpath("/html/body/div[1]/main/div/div[1]/div/div/div[1]/span[2]");
			Common.clickByXpath("/html/body/div[1]/main/div/div[1]/div/div/div[1]/span[3]");
			Common.clickByXpath("/html/body/div[1]/main/div/div[1]/div/div/div[1]/span[4]");
			Common.clickByXpath("/html/body/div[1]/main/div/div[1]/div/div/div[1]/span[5]"); //최상단 5번 배너
			Common.clickByXpath("/html/body/div[1]/main/div/div[1]/div/div/div[2]/div[6]/div/div/div[1]");//자세히 보기
			Common.clickByText("블록 입장하기"); //크롬 정책으로 인해 한번이라도 클릭해야 마이크가 활성화되기 때문에 이 버튼을 넣어줌
			Thread.sleep(2000);
			Common.Assert_ExistByXpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/span/span"); //인게임 블록 제목 Xpath 확인
		    Common.Back(); //이번 버튼으로 메인 페이지 이동
	  }
		
		@Test
		public void Home_003_Middle_OwnBlock_Info() throws InterruptedException {
	
			Common.Assert_ExistByXpath("/html/body/div[1]/main/div/div[2]/section/div[1]/div[2]/a[1]/div[1]/div/div/span[2]"); //0명 접속 중
			Common.Assert_ExistByXpath("/html/body/div[1]/main/div/div[2]/section/div[1]/div[2]/a[1]/div[2]/h3"); //마이블록 제목
			Common.Assert_ExistByXpath("/html/body/div[1]/main/div/div[2]/section/div[1]/div[2]/a[1]/p"); //팔로워 0명
	  }
		
		@Test
		public void Home_004_Middle_MyBlock_Star() throws InterruptedException {
	
			Common.Assert_ExistByXpath("/html/body/div[1]/main/div/div[2]/section/div[1]/div[2]/a[1]/div[1]/div/img[2]"); //마이블록 표시 확인
	  }
		
		@Test
		public void Home_005_Middle_MyBlock_Enter() throws InterruptedException {
	
			Common.clickByXpath("/html/body/div[1]/main/div/div[2]/section/div[1]/div[2]/a[1]"); //마이블록 진입
			Common.Assert_ExistByXpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/span/span"); //인게임 블록 제목 Xpath 확인
		    Common.Back(); //이번 버튼으로 메인 페이지 이동
	  }
		
		@Test
		public void Home_006_Middle_Make_Block() throws InterruptedException {
	
			Common.clickByXpath("/html/body/div[1]/main/div/div[2]/section/div[1]/div[2]/a[2]"); // 블록 만들기 + 클릭
			Common.Assert_CheckCurrentUrl("https://2ndblock.com/space"); //블록 만들기 페이지 확인
		    Common.Back(); //이번 버튼으로 메인 페이지 이동
	  }
		
		@Test
		public void Home_007_Middle_Join_Block() throws InterruptedException {
	
			Common.clickByXpath("/html/body/div[1]/main/div/div[2]/section/div[2]/div[2]/a[1]/div[1]/div"); //내가 참여한 블록 첫번째 진입
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
		    Thread.sleep(2000);
	  }	
		
//		@Test
//		public void Home_009_Middle_Recommended_Block() throws InterruptedException {
//			Thread.sleep(2000);
//			Common.clickByXpath("/html/body/div[1]/main/div/div[2]/div[3]/div[2]/a[1]/div[1]/div"); //이런 블록 어때요? 첫번째 클릭
//			Common.Assert_ExistByXpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/span/span"); //인게임 블록 제목 Xpath 확인
//		    Common.Back(); //이번 버튼으로 메인 페이지 이동
//	  }
		
		
		
}