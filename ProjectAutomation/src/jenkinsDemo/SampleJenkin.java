package jenkinsDemo;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class SampleJenkin {

	 WebDriver driver = null;
	 WebDriverWait wait=null;
	private static Logger log = Logger.getLogger(SampleJenkin.class);
	
	 public void setBrowser(){
		 System.out.println("its before class");
	 }
	 
	 @BeforeSuite
	 public  void setLoggingReporting(){
		log.info("Testing before suite ");
	 }
	 
	 @BeforeClass
	 @Parameters("BrowserName")
	 public void launchBrowser(String BrowserName) throws Exception{
		 switch (BrowserName) {
		case "Chrome":
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();

			break;
		default:
			System.out.println("Invalid Browser Name...");
			break;
		}
		 log.info("browser launched");
		 log.debug("just debug");
		 wait =new WebDriverWait(driver, 20);
		 driver.manage().window().maximize();
		 Thread.sleep(4000);
		 
	 }		
	 
	 @Test(priority=1,enabled=true)
	 public void openWebsite() throws Exception{
		 log.info("Method 1");
		 
		 driver.navigate().to("https://www.google.nl");
		 log.info("Navigated to Google");
		 Thread.sleep(4000);
		 wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("lst-ib"))));
		 driver.findElement(By.id("lst-ib")).sendKeys("SeleniumHQ");
		 log.info("Type Search item");
		 Actions action=new Actions(driver);
		 action.sendKeys(Keys.TAB).perform();
		 Thread.sleep(2000);
		 driver.findElement(By.name("btnK")).click();
		 log.info("Search Button clicked");
		 Thread.sleep(2000);
	 }
	 @Test(priority=2,enabled=true)
	 public void selectLink() throws Exception{
		 wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText("Selenium - Web Browser Automation"))));
		 driver.findElement(By.linkText("Selenium - Web Browser Automation")).click();
		 log.info("Selenium link clicked");
		 Thread.sleep(4000); 
	 } 
	 
	 @AfterClass
	 public void tearDown(){
		 log.info("Closing Browser");
		driver.close();
		log.info("Tear Down Success");
		log.info("--------------------------------------------------------");
	 }
	 
	 @AfterSuite
	 public  void afterSuiteReporting(){
		log.info("Testing after suite : Reporting can be implemented.");
	 }
	
}
