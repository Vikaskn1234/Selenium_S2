package in.mphasis.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(linkText="Log in")
	static WebElement loginlink;
	

	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
	public void ClickLoginlink()
	{
		 loginlink.click();
	}

}
