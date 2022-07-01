package test.java;


import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import main.java.SetUp;


public class Func_06_Setting extends SetUp{
	
	
//		@Test
//		public void InGame_000_HomeBtn() throws InterruptedException {
//		
//		Common.facebookLogin(); //페이스북 로그인
//		Thread.sleep(1000);
//		Common.clickByXpath("/html/body/div[1]/main/div/div[1]/div/div/div[1]/span[3]"); //빅배너에서 소개 블록 선택
//		Common.clickByXpath("/html/body/div[1]/main/div/div[1]/div/div/div[2]/div[4]/div/div/div[1]");//자세히 보기
//		//Common.clickByText("블록 입장하기"); //최상단 배너에서 블록 입장하기 생김
//		}
	
		@Test
		public void Setting_001_MyMenu_MediaSetting() throws InterruptedException {
			
			Common.clickByXpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div/img"); //마이메뉴
			Common.clickByText("설정"); //설정 클릭
		    Common.Assert_ExistByText("미디어 설정"); //미디어 설정 탭 유무로 확인
		}
		
		@Test
		public void Setting_002_MediaSetting_OnOffMike() throws InterruptedException {
			Thread.sleep(2000);
			Common.clickByXpath("/html/body/div[7]/div/div/div[3]/div/div[1]/div[1]/div[1]/div/div[1]/img"); //마이크 on
			Thread.sleep(2000);
			Common.clickByXpath("/html/body/div[7]/div/div/div[3]/div/div[1]/div[1]/div[1]/div/div[1]/img"); //마이크 off
		}
		
		@Test
		public void Setting_003_MediaSetting_OnOffCamera() throws InterruptedException {
			Thread.sleep(2000);
			Common.clickByXpath("/html/body/div[7]/div/div/div[3]/div/div[1]/div[1]/div[1]/div/div[2]/img"); //카메라 on
			Thread.sleep(2000);
			Common.clickByXpath("/html/body/div[7]/div/div/div[3]/div/div[1]/div[1]/div[1]/div/div[2]/img"); //카메라 off
		}
	
		@Test
		public void Setting_004_MediaSetting_Filter() throws InterruptedException {
			Thread.sleep(2000);
			Common.clickByXpath("/html/body/div[7]/div/div/div[3]/div/div[1]/div[2]/div[2]/div[2]"); //필터씌우기 첫번째 선택
			Thread.sleep(4000);
		}
	
		@Test
		public void Setting_005_MediaSetting_BG() throws InterruptedException {
			Common.clickByXpath("/html/body/div[7]/div/div/div[3]/div/div[1]/div[2]/div[4]/div[2]"); //배경 필터 첫번째 선택
			Thread.sleep(4000);
	  }
		
		@Test
		public void Setting_006_MediaSetting_Save() throws InterruptedException {
			Common.clickByText("변경사항 저장"); //변경 사항 저장
			Thread.sleep(3000);
			Common.clickByXpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]"); //메인으로 이동
	  }
		
		@Test
		public void Setting_007_ProfileSetting() throws InterruptedException {
			Common.clickByXpath("/html/body/div[1]/header/div/div[2]/div[2]/div"); //마이메뉴
			Common.clickByText("설정"); //설정 클릭
			
			Common.Assert_ExistByText("juikjuil@nate.com");
			Common.Assert_ExistByText("페이스북 계정으로 로그인됨");
		}
		
		@Test
		public void Setting_008_ProfileSetting_Nick_Guide() throws InterruptedException {
			
			Common.Assert_ExistByXpath("/html/body/div[7]/div/div/div[3]/div/div[1]/div[1]/div[2]/div[3]/div"); //닉네임 변경 가이드 문구 확인
		}
		
		@Test
		public void Setting_009_ProfileSetting_Nick_Xbtn() throws InterruptedException {
			Common.clickByXpath("/html/body/div[7]/div/div/div[3]/div/div[1]/div[1]/div[2]/div[2]/img"); //X버튼 클릭
			Common.Assert_ExistByText("닉네임을 입력해주세요.");
		}
		
		@Test
		public void Setting_010_ProfileSetting_Nick_1Text20() throws InterruptedException {
			
			driver.findElement(By.xpath("/html/body/div[7]/div/div/div[3]/div/div[1]/div[1]/div[2]/div[2]/input")).sendKeys("페"); //닉네임 1자 입력
		    Common.Assert_ExistByText("닉네임은 2~20자 사이로 입력해주세요."); //닉네임 에러 메시지 확인
		    Thread.sleep(1000);
		    Common.clickByXpath("/html/body/div[7]/div/div/div[3]/div/div[1]/div[1]/div[2]/div[2]/img"); //입력한 닉네임 X버튼으로 삭제
		    Thread.sleep(1000);
		    
		    driver.findElement(By.xpath("/html/body/div[7]/div/div/div[3]/div/div[1]/div[1]/div[2]/div[2]/input")).sendKeys("일이삼사오륙칠팔구십일이삼사오륙칠팔구십일"); //닉네임 21자 입력
		    Thread.sleep(1000);

		    Common.clickByXpath("/html/body/div[7]/div/div/div[3]/div/div[1]/div[1]/div[2]/div[2]/img"); //입력한 닉네임 X버튼으로 삭제
		    Thread.sleep(1000);
		  }
		
		@Test
		public void Setting_011_ProfileSetting_Nick_NotText() throws InterruptedException {
			
			driver.findElement(By.xpath("/html/body/div[7]/div/div/div[3]/div/div[1]/div[1]/div[2]/div[2]/input")).sendKeys("ㄱㄴ!"); //닉네임 특수문자 입력
			Thread.sleep(1000);
			Common.Assert_ExistByText("특수문자(괄호, 마침표 제외)와 단일 자음, 모음은 사용이 불가능합니다."); //닉네임 에러 메시지 확인
		  }
		
		@Test
		public void Setting_012_ProfileSetting_Nick_Duplicate() throws InterruptedException {
			
			Thread.sleep(1000);
			Common.clickByXpath("/html/body/div[7]/div/div/div[3]/div/div[1]/div[1]/div[2]/div[2]/img"); //입력한 닉네임 X버튼으로 삭제
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[7]/div/div/div[3]/div/div[1]/div[1]/div[2]/div[2]/input")).sendKeys("Riley"); //닉네임 중복 입력
			Thread.sleep(1000);
			Common.Assert_ExistByText("중복된 닉네임입니다."); //닉네임 에러 메시지 확인
		  }
		
		@Test
		public void Setting_013_ProfileSetting_Nick_Clear() throws InterruptedException {
			
			Thread.sleep(1000);
			Common.clickByXpath("/html/body/div[7]/div/div/div[3]/div/div[1]/div[1]/div[2]/div[2]/img"); //X버튼 클릭
			Common.Assert_ExistByText("닉네임을 입력해주세요.");
			Thread.sleep(1000);
		    
		  }
		
		@Test
		public void Setting_014_ProfileSetting_Nick_Normal() throws InterruptedException {

			Date date = new Date();
			System.out.println(date.toString());
			
		    driver.findElement(By.xpath("/html/body/div[7]/div/div/div[3]/div/div[1]/div[1]/div[2]/div[2]/input")).sendKeys("라일리"+ date.toString()); //닉네임 입력
		    
		  }
		
		@Test
		public void Setting_015_ProfileSetting_ADagree() throws InterruptedException {
			
			Thread.sleep(1000);
			Common.clickByXpath("/html/body/div[7]/div/div/div[3]/div/div[1]/div[4]/label"); //광고 동의 OFF
			Common.clickByText("변경사항 저장");
			Thread.sleep(1000);
			Common.clickByText("확인");
		  }
		
		@Test
		public void Setting_016_ProfileSetting_ReCheck() throws InterruptedException {
			
			Common.clickByXpath("/html/body/div[1]/header/div/div[2]/div[2]/div"); //마이메뉴
			Common.clickByText("설정"); //설정 클릭
			Thread.sleep(1000);
			Common.Assert_ExistByText("페이스북(라일리)new");
			Thread.sleep(1000);
		    Common.clickByXpath("/html/body/div[7]/div/div/div[1]/img"); //설정 모달 닫기
		  }
		
		
		
		
}