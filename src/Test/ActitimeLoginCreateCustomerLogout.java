package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import POM.ActitimeHomePage;
import POM.ActitimeLoginPage;
import POM.ActitimeTaskPage;
import POM.ActititmeCreateCustomerPage;
import generics.BaseTest;

public class ActitimeLoginCreateCustomerLogout extends BaseTest {
   
	@Test
	public void createCustomer() throws IOException, InterruptedException {
	ActitimeLoginPage loginpage=new ActitimeLoginPage(driver);
	loginpage.loginMethod();
	
	ActitimeHomePage homepage=new ActitimeHomePage(driver);
	homepage.taskpage();
	
	ActitimeTaskPage taskpage=new ActitimeTaskPage(driver);
	taskpage.createnewcustomer();
	
	ActititmeCreateCustomerPage createpage=new ActititmeCreateCustomerPage(driver);
	createpage.customername();
	
	homepage.tologout();
	
	
}
}