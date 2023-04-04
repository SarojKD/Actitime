package POM;

	import java.io.IOException;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

import generics.AutoConstant;
import generics.BasePage;
import generics.ExcelLibrary;

	public class ActitimeLoginPage extends BasePage implements AutoConstant  
	{
		public WebDriver driver;
		
		@FindBy(id = "usernam")
		private WebElement usernameTextfield;
		
		@FindBy(name = "pwd")
		private WebElement passwordTextfield;
		
		@FindBy(id = "loginButton")
		private WebElement loginButton;
		
		public ActitimeLoginPage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	 public void loginMethod() throws IOException, InterruptedException {
		 highlight(driver, usernameTextfield);
		 usernameTextfield.sendKeys(ExcelLibrary.getCellValue(sheet_name, 1, 0));
		 highlight(driver, passwordTextfield);
		 passwordTextfield.sendKeys(ExcelLibrary.getCellValue(sheet_name, 1, 1));
		 
		 javascriptclick(driver, loginButton);
	     Thread.sleep(2000);
	     gettitle(driver, "Time-Track");
	 }
	}	 
	 
	 
	 
	 
	 
	 
	 
	    

