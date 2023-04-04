package generics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseTest implements AutoConstant {
    
	public static WebDriver driver;
	@BeforeSuite
	public void executionStart() {
		    System.out.println("Started");
	}
	
	@BeforeClass
	public void setup() {
		
		    ChromeOptions options=new ChromeOptions();
		    options.addArguments("--remote-allow-origins=*");
		    driver=new ChromeDriver(options);
		    driver.manage().window().maximize();
		    driver.get(url1);
	}
	
	@AfterClass
	public void teardown() {
		
		  //  driver.quit();
	}
	
	@AfterSuite
	public void executionEnds() {
		
		    System.out.println("Ended");
	}
}
