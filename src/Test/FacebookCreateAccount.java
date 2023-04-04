package Test;

import java.io.IOException;

import org.testng.annotations.Test;

import POM.FacebookLoginPage;
import POM.FacebookSignupPage;
import generics.BaseTest;

public class FacebookCreateAccount extends BaseTest {

	@Test
	public void createaccount() throws IOException, InterruptedException {
		FacebookLoginPage loginpage=new FacebookLoginPage(driver);
		loginpage.createAccount();
		Thread.sleep(2000);
		FacebookSignupPage signup=new FacebookSignupPage(driver);
		signup.datainput();
		
		signup.dropDown();
	}
}
