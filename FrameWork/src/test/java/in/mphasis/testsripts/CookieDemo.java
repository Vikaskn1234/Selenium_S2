package in.mphasis.testsripts;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;

public class CookieDemo extends TestBase{
	
	@Test
	public void cookies()
	{
		Set<Cookie>mycookies=driver.manage().getCookies();
		System.out.println("Cokkies is"+mycookies.size());
		for(Cookie s:mycookies)
		{
			System.out.println(s.getDomain());
			System.out.println(s.getPath());
			System.out.println(s.getExpiry());
			System.out.println(s.getValue());
		}
		Cookie ck=new Cookie("a", "1234");
		driver.manage().addCookie(ck);
		Set<Cookie>mynewcookies=driver.manage().getCookies();
		System.out.println("Cokkies is"+mynewcookies.size());
	}
	
	

}
