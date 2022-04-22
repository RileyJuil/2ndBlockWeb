package test.java;


import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import main.java.SetUp;

public class DeleteAccount extends SetUp{
	
		@Test
		public void scenario_01_facebookLogin() throws InterruptedException {

			Common.clickByClassName("home-start-button"); //시작하기
			Common.clickByText("페이스북 계정으로 로그인");
			Common.WinHandle(); //브라우저 탭 핸들링
    
			Common.waitForElementByName("email");
			driver.findElement(By.name("email")).sendKeys("juikjuil@nate.com");
			Thread.sleep(2000);
    
			Common.waitForElementByName("pass");
			driver.findElement(By.name("pass")).sendKeys("ju09260927@");
			Thread.sleep(2000);

	    	Common.clickByName("login"); //id, pw 입력 후 login 버튼 선택
	    	Common.WinHandle(); //브라우저 탭 핸들링
  }
	
	@Test
	  public void scenario_02_deleteAccount() throws InterruptedException {

	    Common.clickByXpath("/html/body/div[1]/div/div[1]/div/div/div[3]/div[2]/div/div[2]"); //마이메뉴
	    Common.clickByXpath("/html/body/div[1]/div/div[1]/div/div/div[3]/div[2]/ul/li[5]"); //설정
	    Common.clickByXpath("/html/body/div[12]/div/div/div[2]/div/div[2]/div/div[6]/div[4]/div[2]"); //정말 탈퇴하시겠습니까?
	    Common.clickByXpath("/html/body/div[14]/div/div/div/div[2]/div[1]"); //확인
	    Common.clickByXpath("/html/body/div[15]/div/div/div/div[2]"); //완료되었습니다. - 확인
	    
	  }
	
}