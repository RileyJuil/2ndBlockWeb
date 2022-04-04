package test.java;



import java.io.IOException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



import main.java.Common;

public class DeleteAccount {
	
	public static WebDriver driver;
	public static main.java.Common Common = null;
	
	@BeforeTest
	public void createAndStartService() throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Phillip\\Downloads\\chromedriver.exe");
			
		ChromeOptions chromeOptions = new ChromeOptions();
		driver = new RemoteWebDriver(new URL("http://172.17.160.181:4444/wd/hub"), chromeOptions);
		driver.manage().window().maximize();
		driver.get("https://2ndblock.com/");
		Thread.sleep(5000);
			
//		DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("browserName", "chrome"); 	//To specify the browser
//        capabilities.setCapability("version", "100");		//To specify the browser version
//		driver = new RemoteWebDriver(new URL("http://172.17.160.181:4444/wd/hub"), capabilities);
//		driver.manage().window().maximize();
//		driver.get("https://2ndblock.com/");

	
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://2ndblock.com/");

		Common = new Common(driver);
	}
	
	
	
	
		@Test
		public void scenario_01_facebookLogin() throws InterruptedException {

			Thread.sleep(3000); 
			driver.findElement(By.className("home-start-button")).click(); //시작하기
			Thread.sleep(2000); 
    
			main.java.Common.clickByText("페이스북 계정으로 로그인");
			Thread.sleep(2000);
    
			for(String winHandle : driver.getWindowHandles()){
				driver.switchTo().window(winHandle);
			}
    
			Thread.sleep(2000);
			driver.findElement(By.name("email")).sendKeys("juikjuil@nate.com");
			Thread.sleep(2000);
    
			driver.findElement(By.name("pass")).sendKeys("ju09260927@");
			Thread.sleep(2000);
    
	    	driver.findElement(By.name("login")).click();
	    	Thread.sleep(3000);
    
	    	for(String winHandle : driver.getWindowHandles()){
	    		driver.switchTo().window(winHandle);
	    	}	
	    	
	    	Thread.sleep(2000);
  }
	
	@Test
	  public void scenario_02_deleteAccount() throws InterruptedException {

		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div[3]/div[2]/div/div[2]")));
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div[3]/div[2]/div/div[2]")).click(); //마이메뉴
	    Thread.sleep(2000); 
	    
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div[3]/div[2]/ul/li[5]")).click(); //설정
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[12]/div/div/div[2]/div/div[2]/div/div[6]/div[4]/div[2]")).click(); //정말 탈퇴하시겠습니까?
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[14]/div/div/div/div[2]/div[1]")).click(); //확인
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[15]/div/div/div/div[2]")).click(); //완료되었습니다. - 확인
	    Thread.sleep(3000);
	    
	  }
	
}