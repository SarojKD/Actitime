package POM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstant;
import generics.BasePage;
import generics.ExcelLibrary;

public class FacebookSignupPage extends BasePage implements AutoConstant {

	public WebDriver driver;
	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement firstname;
	
	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement surname;
	
	@FindBy(xpath = "//input[@name='reg_email__']")
	private WebElement mobileno;
	
	@FindBy(xpath = "//input[@name='reg_passwd__']")
	private WebElement newpassword;
	
	@FindBy(id = "day")
	private WebElement date;
	
	@FindBy(id = "month")
	private WebElement month;
	
	@FindBy(id = "year")
	private WebElement year;
	
	@FindBy(xpath = "//label[.='Male']")
	private WebElement radiobutton;
	
	@FindBy(xpath = "(//button[.='Sign Up'])[1]")
	private WebElement signup;
	
	public FacebookSignupPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void datainput() throws IOException {
		firstname.sendKeys(ExcelLibrary.getCellValue(sheet1_name, 1, 0));
		surname.sendKeys(ExcelLibrary.getCellValue(sheet1_name, 1, 1));
		newpassword.sendKeys(ExcelLibrary.getCellValue(sheet1_name, 1, 2));
		mobileno.sendKeys(ExcelLibrary.getCellValue(sheet1_name, 1, 3));
		
	   }
	public void dropDown() throws InterruptedException {
		javascriptclick(driver, date);
		Thread.sleep(1500);
		selectbyvisibletext(date, "17");
		
		javascriptclick(driver, month);
		Thread.sleep(1500);
		selectbyvisibletext(month, "Jul");
		
		javascriptclick(driver, year);
		Thread.sleep(1500);
		selectbyvisibletext(year, "2000");
		
		javascriptclick(driver, radiobutton);
		
		javascriptclick(driver, signup);
		
		
		
		
	}
}
















