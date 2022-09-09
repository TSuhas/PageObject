package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomePOM {

	
	WebDriver driver;
	public RediffHomePOM(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	By search = By.xpath("//input[@id='srchword']");
	By clicksearch = By.xpath("(//input[@class='newsrchbtn'])[1]");
	
	
	
	public WebElement entertextinsearch() {
		 return driver.findElement(search);
	}
	public WebElement clicksaerch() {
		 return driver.findElement(clicksearch);
	}
}
