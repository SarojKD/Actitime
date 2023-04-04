package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.BasePage;

public class FacebookLoginPage extends BasePage  {

	public WebDriver driver;
	@FindBy(xpath = "//a[.='Create new account']")
	private WebElement createaccount;
	
	public FacebookLoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void createAccount() {
		javascriptclick(driver, createaccount);
		
	}
}
