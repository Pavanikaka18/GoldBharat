
package genericUtility;
import java.util.Arrays;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import io.github.bonigarcia.wdm.WebDriverManager;


public class GoldBharat_BaseClass {

	public JavaUtility jUtility=new JavaUtility();
	public WebDriverUtility wUtility=new WebDriverUtility();
	public ExcelFileUtility eUtility=new ExcelFileUtility();
	public PropertyFileUtility pUtility=new PropertyFileUtility();
	
	public static WebDriver driver;
	public static WebDriver sDriver;
	private String originalHandle;
	
	   @BeforeSuite(alwaysRun = true)
		public void bsConfig()
		{
			System.out.println("---Database Connection Successfully---");
		}  
		
	  @BeforeSuite (groups={"GoldBharatLogin"})
		public void bcConfig() throws Exception
		{
			String BROWSER = pUtility.readDataFromPropertyFile("browser");
			String URL = pUtility.readDataFromPropertyFile("url");
			
			if(BROWSER.equalsIgnoreCase("Chrome"))
			{
			
				ChromeOptions options=new ChromeOptions();
			
								options.addArguments("--remote-allow-origins=*");
				WebDriverManager.chromedriver().clearDriverCache().setup();
				WebDriverManager.chromedriver().clearResolutionCache().setup();
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver(options);
				originalHandle = driver.getWindowHandle();
				System.out.println("Chrome Browser Launched Successfully");
			}
			else if(BROWSER.equalsIgnoreCase("Firefox"))
			{
				FirefoxOptions options = new FirefoxOptions();

		        // Create a FirefoxProfile to manage preferences
		        FirefoxProfile profile = new FirefoxProfile();

		        // Set a preference to allow or deny location access (false to deny)
		        profile.setPreference("geo.prompt.testing", true);
		        profile.setPreference("geo.prompt.testing.allow", false);

		        // Assign the profile to the FirefoxOptions
		        options.setProfile(profile);
		        
			    WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver(options); 
				System.out.println("Firefox Browser Launched Successfully");
			}
			else if(BROWSER.equalsIgnoreCase("Edge"))
			{
				EdgeOptions options = new EdgeOptions();
		        options.addArguments("--disable-settings-window");
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver(options);
				System.out.println("Edge Browser Launched Successfully");
			}
			else 
			{
				System.out.println("Invalid Browser");
			}
			sDriver = driver;   //To Take ScreenShot
			wUtility.maximizeTheWindow(driver);
			wUtility.waitUntilPageLoad(driver);
			driver.get(URL);
		}
	  

	  
/*	  @AfterSuite
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
		*/
	 
	
	

}
