package test.java;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import main.java.SetUp;


public class Func_04_Home_Footer extends SetUp{
	
	
		@Test
		public void Home_001_Footer_Help() throws InterruptedException {
	
			Common.clickByText("도움말");
			Common.Assert_CheckCurrentUrl("https://secondblock.zendesk.com/hc/ko/categories/4409499212313-도움말"); //도움말 페이지 확인
			driver.close(); //도움말 탭 닫기

	  }
		
		@Test
		public void Home_002_Footer_Term() throws InterruptedException {
	
			Common.clickByText("서비스 이용약관");
			Common.Assert_CheckCurrentUrl("https://2ndblock.com/agreements/term"); //이용약관 페이지 확인
		    Common.Back(); //이번 버튼으로 메인 페이지 이동
	  }

		@Test
		public void Home_003_Footer_Privacy() throws InterruptedException {
	
			Common.clickByText("개인정보 처리방침");
			Common.Assert_CheckCurrentUrl("https://2ndblock.com/agreements/privacy"); //개인정보 처리방침 페이지 확인
		    Common.Back(); //이번 버튼으로 메인 페이지 이동
	  }
		
		@Test
		public void Home_004_Footer_Address() throws InterruptedException {
	
			System.out.println(driver.findElement(By.xpath("/html/body/div[1]/footer/div/address")).getText());
	  }
		
		
		
}