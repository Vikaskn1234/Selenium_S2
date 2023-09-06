package in.mphasis.testsripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TestBase {
	WebDriver driver;
	@BeforeTest()
	public void LaunchApplication()
	{
		driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
	}

}
