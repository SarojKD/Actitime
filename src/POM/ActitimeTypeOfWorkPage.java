package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.BasePage;

public class ActitimeTypeOfWorkPage extends BasePage{
    public WebDriver driver;
	@FindBy(xpath = "//span[.='Create Type of Work']")
	private WebElement createtypesofwork;

	@FindBy(name = "name" )
	private WebElement nameofwork;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement clicoperation;

	@FindBy(xpath = "//input[@value='Show Types of Work']")
	private WebElement showwork;

	@FindBy(xpath = "//a[.='MiaJi']/../..//a[contains(text(),'delete')]")
	private WebElement deletework;

    public ActitimeTypeOfWorkPage(WebDriver driver) {
	    this.driver=driver;
    	PageFactory.initElements(driver, this);
	}
	public void typeofWork() throws InterruptedException {
		javascriptclick(driver, createtypesofwork);
		Thread.sleep(1500);
		nameofwork.sendKeys("MiaJi");
		javascriptclick(driver, clicoperation);
		Thread.sleep(2000);
	}
	
	public void worktoDelete() {
		javascriptclick(driver, showwork);;
		javascriptclick(driver, deletework);
		alertaccept(driver);
}
}
