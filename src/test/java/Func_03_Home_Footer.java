package test.java;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import main.java.SetUp;


public class Func_03_Home_Footer extends SetUp{
	
	
		@Test
		public void Home_001_Footer_MailTo() throws InterruptedException {
	
			Common.waitForElementByText("문의하기");
			Assert.assertEquals(driver.findElement(By.xpath("//*[contains(text(), '문의하기')]")).getAttribute("href"), "mailto:cs@2ndblock.com");
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