package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepository.RediffHomePOM;

import ObjectRepository.RediffLoginPOM;


public class LoginPOM {

	@Test
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suhas.tupake\\Desktop\\path\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		RediffLoginPOM rd = new RediffLoginPOM(driver);
		
		rd.emailid().sendKeys("hello");
		rd.password().sendKeys("987654321");
		rd.signInButton().click();
		rd.Homepage().click();
		
		RediffHomePOM hm = new RediffHomePOM(driver);
		hm.entertextinsearch().sendKeys("suhas");
		hm.clicksaerch().click();
		
	}
}
