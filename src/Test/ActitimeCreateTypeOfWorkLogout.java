package Test;

import java.io.IOException;

import org.testng.annotations.Test;

import POM.ActitimeHomePage;
import POM.ActitimeLoginPage;
import POM.ActitimeTypeOfWorkPage;
import generics.BaseTest;

public class ActitimeCreateTypeOfWorkLogout extends BaseTest{

	@Test
	public void createTypeofWork() throws IOException, InterruptedException {
		
		ActitimeLoginPage loginpage=new ActitimeLoginPage(driver);
		loginpage.loginMethod();
		
		ActitimeHomePage homepage=new ActitimeHomePage(driver);
		homepage.settingIcon();
        
		ActitimeTypeOfWorkPage typeofwork=new ActitimeTypeOfWorkPage(driver);
		typeofwork.typeofWork();
		
		homepage.tologout();
		
	}
	
}
