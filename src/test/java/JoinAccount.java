package test.java;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import main.java.SetUp;


public class JoinAccount extends SetUp{
		
	@Test
	public void Join_001_Login_Facebook() throws InterruptedException {

		//점검화면 뚫기
//			Thread.sleep(1000);
//			Common.InputTextXpath("/html/body/div[1]/header/div/div[2]/a", "s");
//			Common.InputTextXpath("/html/body/div[1]/header/div/div[2]/a", "e");
//			Common.InputTextXpath("/html/body/div[1]/header/div/div[2]/a", "c");
//			Common.InputTextXpath("/html/body/div[1]/header/div/div[2]/a", "o");
//			Common.InputTextXpath("/html/body/div[1]/header/div/div[2]/a", "n");
//			Common.InputTextXpath("/html/body/div[1]/header/div/div[2]/a", "d");
		
		//하나만 돌릴 때 열기
		//Common.facebookLogin(); //페이스북 로그인
		
		
		//연결해서 돌릴 때 열기
		Common.clickByText("시작하기"); //시작하기
		Common.clickByText("페이스북 계정으로 로그인");
		Common.WinHandle(); //브라우저 탭 핸들링
		
		
		//Before & After Class 로 돌리지 않으면 세션이 유지되어 페이스북 로그인 버튼을 클릭하면 이메일, 패스워드 입력할 필요없이 바로 로그인되므로 일단 막고 진행		
//		Common.waitForElementByName("email");
//		driver.findElement(By.name("email")).sendKeys("juikjuil@nate.com");
//		Thread.sleep(2000);
//
//		Common.waitForElementByName("pass");
//		driver.findElement(By.name("pass")).sendKeys("ju09260927@");
//		Thread.sleep(2000);
//
//    	Common.clickByName("login"); //id, pw 입력 후 login 버튼 선택
//    	Common.WinHandle(); //브라우저 탭 핸들링
		}
	
	@Test
	  public void Join_002_Nickname_Placeholder() throws InterruptedException {
		
		Assert.assertEquals(driver.findElement(By.xpath("/html/body/div[1]/main/div/div[1]/section[1]/form/div[2]/div[2]/div/div/input")).getAttribute("placeholder"), "닉네임을 입력하세요");
		Thread.sleep(1000);

		Assert.assertFalse(driver.findElement(By.xpath("/html/body/div[1]/main/div/div[2]/button")).isEnabled());//회원 가입하기 버튼 비활성화 확인
		
		}
	@Test
	  public void Join_003_Nickname_GuideText() throws InterruptedException {
		
		Common.Assert_ExistByText("다른 사용자에게 공개되는 닉네임이며, 한 달에 한 번 변경할 수 있습니다."); //가이드 텍스트 확인  
		Thread.sleep(1000);
	}
	
	@Test
	  public void Join_004_Nickname_1Text20() throws InterruptedException {
		
		driver.findElement(By.xpath("/html/body/div[1]/main/div/div[1]/section[1]/form/div[2]/div[2]/div/div/input")).sendKeys("페"); //닉네임 1자 입력
	    Common.Assert_ExistByText("닉네임은 2~20자 사이로 입력하세요."); //닉네임 에러 메시지 확인
	    Common.clickByXpath("/html/body/div[1]/main/div/div[1]/section[1]/form/div[2]/div[2]/div/div/img"); //입력한 닉네임 X버튼으로 삭제
	    
	    driver.findElement(By.xpath("/html/body/div[1]/main/div/div[1]/section[1]/form/div[2]/div[2]/div/div/input")).sendKeys("일이삼사오륙칠팔구십일이삼사오륙칠팔구십일"); //닉네임 21자 입력
	    Common.Assert_ExistByText("닉네임은 2~20자 사이로 입력하세요."); //닉네임 에러 메시지 확인
	    	    
	    Thread.sleep(1000);
	    Common.clickByXpath("/html/body/div[1]/main/div/div[1]/section[1]/form/div[2]/div[2]/div/div/img"); //입력한 닉네임 X버튼으로 삭제
	    Thread.sleep(1000);
	  }
	
	@Test
	  public void Join_005_Nickname_NotText() throws InterruptedException {
		
		driver.findElement(By.xpath("/html/body/div[1]/main/div/div[1]/section[1]/form/div[2]/div[2]/div/div/input")).sendKeys("ㄱㄴ!"); //닉네임 특수문자 입력
	    Common.Assert_ExistByText("특수문자(괄호, 마침표 제외)와 단일 자음, 모음은 사용이 불가능합니다."); //닉네임 에러 메시지 확인
	    Assert.assertFalse(driver.findElement(By.xpath("/html/body/div[1]/main/div/div[2]/button")).isEnabled());//회원 가입하기 버튼 비활성화 확인
	  }
	
	@Test
	  public void Join_006_Nickname_Duplicate() throws InterruptedException {
		
		Thread.sleep(1000);
		Common.clickByXpath("/html/body/div[1]/main/div/div[1]/section[1]/form/div[2]/div[2]/div/div/img"); //입력한 닉네임 X버튼으로 삭제
		driver.findElement(By.xpath("/html/body/div[1]/main/div/div[1]/section[1]/form/div[2]/div[2]/div/div/input")).sendKeys("Riley"); //닉네임 중복 입력
	    Common.Assert_ExistByText("이미 사용중인 닉네임입니다."); //닉네임 에러 메시지 확인
	    Assert.assertFalse(driver.findElement(By.xpath("/html/body/div[1]/main/div/div[2]/button")).isEnabled());//회원 가입하기 버튼 비활성화 확인
	  }
	
	@Test
	  public void Join_007_Nickname_Clear() throws InterruptedException {
		
		Thread.sleep(1000);
		Common.clickByXpath("/html/body/div[1]/main/div/div[1]/section[1]/form/div[2]/div[2]/div/div/img"); //입력한 닉네임 X버튼으로 삭제
		Assert.assertEquals(driver.findElement(By.xpath("/html/body/div[1]/main/div/div[1]/section[1]/form/div[2]/div[2]/div/div/input")).getAttribute("placeholder"), "닉네임을 입력하세요");
		Thread.sleep(1000);
	    
	  }
	
	@Test
	  public void Join_008_Nickname_Normal() throws InterruptedException {

	    driver.findElement(By.xpath("/html/body/div[1]/main/div/div[1]/section[1]/form/div[2]/div[2]/div/div/input")).sendKeys("페이스북(라일리)"); //닉네임 입력
	    Common.Assert_ExistByText("닉네임을 사용할 수 있습니다."); //닉네임 사용 확인

	  }
	
	@Test
	  public void Join_009_Agree_Check() throws InterruptedException {

	    
	    Common.clickByXpath("/html/body/div[1]/main/div/div[1]/section[2]/div[2]/div[1]/div[1]/label/img"); //서비스 이용약관
	    Common.clickByXpath("/html/body/div[1]/main/div/div[1]/section[2]/div[2]/div[2]/div[1]/label/img"); //개인정보 수집 및 이용 동의
	    Assert.assertFalse(driver.findElement(By.xpath("/html/body/div[1]/main/div/div[2]/button")).isEnabled());//회원 가입하기 버튼 비활성화 확인
	    
	    Common.clickByXpath("/html/body/div[1]/main/div/div[1]/section[2]/div[2]/div[3]/div/label/img"); //만 14세
	    Common.clickByXpath("/html/body/div[1]/main/div/div[1]/section[2]/div[2]/div[4]/div/label/img"); //광고와 마케팅
	    
	    Common.clickByText("회원 가입하기");
	    
	    Common.Assert_CheckCurrentUrl("https://2ndblock.com/"); //회원 가입되며 메인으로 이동 확인
	  }
}