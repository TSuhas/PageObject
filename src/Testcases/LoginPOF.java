package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepository.RediffLoginPOF;

public class LoginPOF {

	@Test 
	public void login() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suhas.tupake\\Desktop\\path\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		RediffLoginPOF pof = new RediffLoginPOF(driver);
		pof.emailid().sendKeys("123456");
		pof.password().sendKeys("789456");
		pof.signin().click();
		
	}
}
