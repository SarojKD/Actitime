package Test;

import java.io.IOException;


import org.testng.annotations.Test;

import POM.ActitimeHomePage;
import POM.ActitimeLoginPage;
import generics.BaseTest;


public class ActitimeLoginLogout extends BaseTest{
    
	@Test
	public void loginlogout() throws IOException, InterruptedException {
		
		ActitimeLoginPage loginpage=new ActitimeLoginPage(driver);
		loginpage.loginMethod();
		
		ActitimeHomePage homepage=new ActitimeHomePage(driver);
		homepage.tologout();
	}
	
}
