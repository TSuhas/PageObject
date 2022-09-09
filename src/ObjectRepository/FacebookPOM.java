package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookPOM {

	WebDriver driver;
	public  FacebookPOM(WebDriver driver) {
		this.driver=driver;
		
	}
	By username= By.xpath("//input[@id='email']");
	By password = By.xpath("//input[@id='pass']");
	By login = By.xpath("//button[text()='Log In']");
	
	
	public WebElement setusername()
	{
		return driver.findElement(username);
	}
	public WebElement setpassword()
	{
		return driver.findElement(password);
	}
	public WebElement clicklogin()
	{
		return driver.findElement(login);
	}
	
}
