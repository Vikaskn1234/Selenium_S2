package in.mphasis.testsripts;

import java.io.IOException;

import org.testng.annotations.Test;

import in.mphasis.pages.HomePage;
import in.mphasis.pages.LoginPage;
import utils.ReadExcell;

public class DataDrivenFramework extends TestBase{
	

	@Test
	public void Login() throws IOException
	{
	 HomePage page=new HomePage(driver);
	 page.ClickLoginlink();
	 
	 LoginPage page1=new LoginPage(driver);
	 
	 
	String[][] data=ReadExcell.getData("resources//TestData1.xlsx", "Sheet1");
		
		for(int i=1;i<6;i++) {
		String Email=data[i][1];
		String Password=data[i][1];
		
    page1.LoginDetails(Email, Password);
       //page1.Logoutbtn();
	}
	}

}
