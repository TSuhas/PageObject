package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPOM {

	
	WebDriver driver;
	public RediffLoginPOM(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	By username= By.xpath("//input[@id='login1']");
	By password = By.xpath("//input[@id='password']");
	By signIn = By.xpath("//input[@type='submit']");
	By homepage  = By.xpath("//a[text()='rediff.com']");
	
	public WebElement emailid()
	{
		return driver.findElement(username);
	}
	
	public WebElement password()
	{
		return driver.findElement(password);
	}
	public WebElement signInButton()
	{
		return driver.findElement(signIn);
	}
	public WebElement Homepage()
	{
		return driver.findElement(homepage);
	}
}
