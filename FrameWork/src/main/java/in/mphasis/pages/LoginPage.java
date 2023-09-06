package in.mphasis.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(id="Email")
	static WebElement EmaiTextbox;
	@FindBy(id="Password")
	static WebElement PassWordTextbox;
	
	@FindBy(xpath="//input[contains(@class, 'button-1 login-button')]")
	static WebElement LoginBtn;
	
	@FindBy(linkText="Log out")
	static WebElement logout;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void LoginDetails(String u, String p)
	{
		EmaiTextbox.sendKeys(u);
		PassWordTextbox.sendKeys(p);
		LoginBtn.click();
	}
	public void Logoutbtn()
	{
		 logout.click();
	}
	

}
