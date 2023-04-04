package Test;

import java.io.IOException;

import org.testng.annotations.Test;

import POM.ActitimeHomePage;
import POM.ActitimeLoginPage;
import POM.ActitimeTypeOfWorkPage;
import generics.BaseTest;

public class ActitimeDeleteTypeofWork extends BaseTest {

	
	@Test
	public void deleteTypeofWork() throws IOException, InterruptedException {
		ActitimeLoginPage loginpage=new ActitimeLoginPage(driver);
		loginpage.loginMethod();
		
		ActitimeHomePage homepage=new ActitimeHomePage(driver);
		homepage.settingIcon();
		
		ActitimeTypeOfWorkPage typeofWorkPage=new ActitimeTypeOfWorkPage(driver);
		typeofWorkPage.worktoDelete();
				
		
		homepage.tologout();
		
	}
}
