package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPOF  {

	WebDriver driver;
	public  RediffLoginPOF(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	// for username
	@FindBy(xpath="//input[@id='login1']")
	
	WebElement username1;
	
	// for password
	@FindBy(xpath="//input[@id='password']")
	WebElement password1;
	
	// for sign in button
	@FindBy(xpath= "//input[@type='submit']")
	WebElement signin1;
	
	
	public WebElement emailid() {
		return username1;
	}
	public WebElement password() {
		return password1;
	}
	public WebElement signin() {
		return signin1;
	}
	
}
