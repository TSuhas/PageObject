package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepository.FacebookPOM;

public class LoginFacebookPOM {

	@Test 
	public void LoginFacebookPOM() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suhas.tupake\\Desktop\\path\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		FacebookPOM fb = new FacebookPOM(driver);
		fb.setusername().sendKeys("12345");
		fb.setpassword().sendKeys("789456");
		fb.clicklogin().click();
		
	}
}
