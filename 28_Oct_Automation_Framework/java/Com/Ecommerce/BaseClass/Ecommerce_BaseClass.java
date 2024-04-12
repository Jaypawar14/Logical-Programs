package Com.Ecommerce.BaseClass;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import Com.Ecommerce.Configuration.ReadConfiguration;
import Com.Ecommerce.Utilites.WaitUtils;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Ecommerce_BaseClass {

	public static Logger logger;

	public static WebDriver driver;

	ReadConfiguration readconfig = new ReadConfiguration();

	public String BASEURL = readconfig.GetApplicationURL();
	public String UNAME = readconfig.Username();
	public String PASS = readconfig.Password();
	
	@Parameters("Browser")
	@BeforeMethod
	public void Setup ( String BrowserName ) {

		logger = logger.getLogger("28 Oct Automation Framework");

		String Property = "C:\\Users\\Jay\\eclipse-workspace\\28_Oct_Automation_Framework\\src\\test\\resources\\Configuration\\log4j.properties";

		PropertyConfigurator.configure(Property);

		if (BrowserName.equals("Chrome")) {

			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();
			logger.info("Chrome Browser Open");

		} else if (BrowserName.equals("FireFox")) {

			WebDriverManager.firefoxdriver().setup();

			driver = new FirefoxDriver();
			logger.info("FireFox Browser Open");
		} else if (BrowserName.equals("Edge")) {

			WebDriverManager.edgedriver().setup();

			driver = new EdgeDriver();
			logger.info("Edge Browser Open");
		}
		
//		WebDriverManager.chromedriver().setup();   
//		
//		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(WaitUtils.IMPLICIT_WAIT, TimeUnit.SECONDS);

		driver.manage().timeouts().pageLoadTimeout(WaitUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);

		driver.get(BASEURL);
		logger.info("URL fetched from Config file");
	}

	@AfterMethod
	public void TearDown() throws InterruptedException {

		Thread.sleep(8000);

		driver.quit();

		logger.info("Browser Close");

	}

}
