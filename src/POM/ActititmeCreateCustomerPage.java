package POM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstant;
import generics.BasePage;
import generics.ExcelLibrary;

public class ActititmeCreateCustomerPage extends BasePage implements AutoConstant {
    public WebDriver driver;
	@FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement name;
	@FindBy(xpath = "//div[.='Create Customer']")
	private WebElement createcusmo;

	public ActititmeCreateCustomerPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void customername() throws InterruptedException, IOException {
		name.sendKeys(ExcelLibrary.getCellValue(sheet1_name, 1, 0));
		javascriptclick(driver, createcusmo);
		Thread.sleep(2000);
	}
}
