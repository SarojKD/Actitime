package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.BasePage;

public class ActitimeHomePage extends BasePage {
    public WebDriver driver;
	
	@FindBy(xpath = "(//div[@class='menu_icon'])[2]")
	private WebElement setting;
		
	@FindBy(xpath = "//a[.='Types of Work']")
	private WebElement typework;

	public ActitimeHomePage(WebDriver driver ) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "container_tasks")
	private WebElement taskicon;

	@FindBy(id = "logoutLink")
	private WebElement logout;
	
	public void settingIcon() throws InterruptedException {
		javascriptclick(driver, setting);
		Thread.sleep(2000);
		javascriptclick(driver, typework);
		Thread.sleep(2500);
	}
	public void tologout() {
	    javascriptclick(driver, logout);	
	}
	public void taskpage() throws InterruptedException {
		javascriptclick(driver, taskicon);
		Thread.sleep(2000);
	}
}
