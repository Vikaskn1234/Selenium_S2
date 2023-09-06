package in.mphasis.testsripts;


import java.io.IOException;

import org.testng.annotations.Test;

import in.mphasis.pages.HomePage;
import in.mphasis.pages.LoginPage;




public class LoginTest extends TestBase {

	@Test
	public void Login() throws IOException
	{
	 HomePage page=new HomePage(driver);
	 page.ClickLoginlink();
	 
	 LoginPage page1=new LoginPage(driver);
	 
	
		
    page1.LoginDetails("Itest@test.com", "Itest@test");
       page1.Logoutbtn();
	}
	}

