package main.java;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Common {

	public static WebDriver driver;
	public String text;

	public Common(WebDriver driver) {
		this.driver = driver;

	}

	
//--------------------------------------------------------------------------------------------------------------------------------------------------
	//엘리먼트 별 클릭
	//추가로 숨겨진 메뉴를 클릭할 때 사용하기위해 히든 만들어놓음
	
	public void clickByText(String text) throws InterruptedException {

		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(), '" + text + "')]")));
		driver.findElement(By.xpath("//*[contains(text(), '" + text + "')]")).click();
		Thread.sleep(2000); 

		}
	
	public void clickByXpath(String text) throws InterruptedException {

		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("" + text + "")));
		driver.findElement(By.xpath("" + text + "")).click();
		Thread.sleep(2000); 

		}
	
	public void clickByXpath_Hidden(String text) throws InterruptedException {

		Thread.sleep(2000); 
		driver.findElement(By.xpath("" + text + "")).click();
		Thread.sleep(2000); 

		}
	
	public void clickByClassName(String text) throws InterruptedException {

		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.className("" + text + "")));
		driver.findElement(By.className("" + text + "")).click();
		Thread.sleep(2000); 

		}
	
	public void clickByName(String text) throws InterruptedException {

		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.name("" + text + "")));
		driver.findElement(By.name("" + text + "")).click();
		Thread.sleep(2000); 

		}
	
	
//--------------------------------------------------------------------------------------------------------------------------------------------------
	//엘리먼트 별 대기
	
	
	public void waitForElementByName(String text) {

		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.name("" + text + "")));
		
		}
		
	public void waitForElementByXpath(String text) {

		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("" + text + "")));
		
		}
	
	public void waitForElementByClassName(String text) {

		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.className("" + text + "")));
		
		}
	

//--------------------------------------------------------------------------------------------------------------------------------------------------	
	//엘리먼트 별 존재 확인
	
	public void Assert_ExistByText(String text) throws InterruptedException {

		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(), '" + text + "')]")));
		Assert.assertNotNull(driver.findElement(By.xpath("//*[contains(text(), '" + text + "')]")));
		Thread.sleep(2000); 
		}
	
	public void Assert_ExistByXpath(String text) throws InterruptedException {
		
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("" + text + "")));
		Assert.assertNotNull(driver.findElement(By.xpath("" + text + "")));
		Thread.sleep(2000); 
		}
	
	
//--------------------------------------------------------------------------------------------------------------------------------------------------	
	//URL로 해당 페이지 이동했는지 확인
	public void Assert_CheckCurrentUrl(String text) throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Assert.assertEquals(driver.getCurrentUrl(), "" + text + "");
		Thread.sleep(2000); 
		}
	
	
	
	
	
//--------------------------------------------------------------------------------------------------------------------------------------------------	
	
	public void Back() throws InterruptedException {

		Thread.sleep(1000); 
		driver.navigate().back();
		Thread.sleep(1000); 
		}
		
	public void Refresh() throws InterruptedException {

		Thread.sleep(1000); 
		driver.navigate().refresh();
		Thread.sleep(1000); 
		}
	
	public void WinHandle() throws InterruptedException {

		Thread.sleep(3000); 
		
		for(String winHandle : driver.getWindowHandles()){
    		driver.switchTo().window(winHandle);}
		
		Thread.sleep(3000); 
		}
		
	
//--------------------------------------------------------------------------------------------------------------------------------------------------	
	//페이스북으로 로그인
	
	public void facebookLogin() throws InterruptedException {

		waitForElementByClassName("home-start-button");
		driver.findElement(By.className("home-start-button")).click(); //시작하기
		Thread.sleep(2000); 

		clickByText("페이스북 계정으로 로그인");
		Thread.sleep(2000);

		for(String winHandle : driver.getWindowHandles()){
    		driver.switchTo().window(winHandle);
    	}
		
		Thread.sleep(2000); 
		waitForElementByName("email");
		driver.findElement(By.name("email")).sendKeys("juikjuil@nate.com");
		Thread.sleep(1000);

		waitForElementByName("pass");
		driver.findElement(By.name("pass")).sendKeys("ju09260927@");
		Thread.sleep(1000);

		waitForElementByName("login");
    	driver.findElement(By.name("login")).click();
    	Thread.sleep(3000);
    	
    	for(String winHandle : driver.getWindowHandles()){
    		driver.switchTo().window(winHandle);
    	}
    	
    	Thread.sleep(3000);
		}

}