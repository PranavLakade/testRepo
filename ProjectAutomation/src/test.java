import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class test {
	//static WebDriver driver = null;
	public static void main(String[] args) {
		
		
		//WebDriverManager.chromedriver().setup();
		/*System.setProperty("webdriver.chrome.driver", "C:\\Pranav\\Work\\softwares\\chromedriver_win32\\chromedriver.exe");
		System.out.println("this is done");
		WebDriver driver = new ChromeDriver();*/
	
		/*System.setProperty("webdriver.ie.driver", "C:\\Pranav\\Work\\softwares\\IEDriverServer_x64_3.9.0\\IEDriverServer.exe");
		 
		System.out.println("this is done");*/
		System.setProperty("webdriver.ie.driver", "C:\\Pranav\\Work\\softwares\\IEDriverServer_Win32_3.9.0\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
	}

}