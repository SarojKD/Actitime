package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.BasePage;

public class ActitimeTaskPage extends BasePage {
    public WebDriver driver;
	@FindBy(xpath = "//div[@class='addNewButton']")
	private WebElement options;

	@FindBy(xpath = "//div[@class='item createNewCustomer']")
	private WebElement newcusmo;
	@FindBy(xpath = "(//input[@placeholder='Start typing name ...'])[1]")
	private WebElement Searchname;

	@FindBy(xpath = "//span[.='Tyaggi']")
	private WebElement sett;
	public ActitimeTaskPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void createnewcustomer() throws InterruptedException {
		javascriptclick(driver, options);
		javascriptclick(driver, newcusmo);
			Thread.sleep(2000);
	}
	public void searchName() throws InterruptedException {
		Searchname.sendKeys("Tyaggi");
		Thread.sleep(2000);
		sett.click();
		Thread.sleep(1000);
	}
}
