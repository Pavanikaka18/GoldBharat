package Sprint_2;
	import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;
	import genericUtility.ExcelFileUtility;
	import genericUtility.GoldBharatAdmin_BaseClass;
	import genericUtility.JavaUtility;
	import genericUtility.PropertyFileUtility;
import genericUtility.ScreenRecorderUtil;
import genericUtility.WebDriverUtility;
	import objectRepository.GoldBharat_AdminManageOrders;


	public class Admin_ManageOrders extends GoldBharatAdmin_BaseClass {

		WebDriverUtility wUtility = new WebDriverUtility();
		JavaUtility jUtility = new JavaUtility();
		ExcelFileUtility eUtility = new ExcelFileUtility();
		public PropertyFileUtility pUtility = new PropertyFileUtility();
		

		@Test(priority = 1, groups = "GoldBharatAdminLogin")
		public void login() throws Exception {
			ScreenRecorderUtil.startRecord("login");
			GoldBharat_AdminManageOrders ManageOrders = new GoldBharat_AdminManageOrders(driver);
			String AdminUserName = eUtility.readDataFromExcel("GoldBharatAdminPage", 1, 1);
			ManageOrders.clickOnAdminUserName();
			ManageOrders.getAdminUserName().sendKeys(AdminUserName);
			Thread.sleep(1000);
			String AdminPwd = eUtility.readDataFromExcel("GoldBharatAdminPage", 2, 1);
			ManageOrders.clickOnAdminPwd();
			ManageOrders.getAdminPwd().sendKeys(AdminPwd);
			Thread.sleep(2000);
			wUtility.takeScreenShot(driver, "AdminLogin") ;
			ManageOrders.clickOnAdminLoginBtn();
			Thread.sleep(2000);
			Thread.sleep(1000);
			ManageOrders.clickOnManageOrderbtn();
			driver.navigate().refresh();
			Thread.sleep(6000);
			ManageOrders.clickOnConfirmPaymentBtn();
			Thread.sleep(4000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			//js.executeScript("window.scrollBy(0, 250)");
			wUtility.scrollPageDown(5);
			Thread.sleep(4000);
			ManageOrders.clickOnAcceptBtn();
			Thread.sleep(4000);
			ManageOrders.clickOnVerifyOrderBtn();
			Thread.sleep(4000);
			ManageOrders.getMessageField().sendKeys("Delivery Time in 3 days");
			Thread.sleep(4000);
		        try {
		            WebElement datetimeInput = driver.findElement(By.id("time"));
		            String dateTimeValue = "24/09/2024T18:00"; 
		            datetimeInput.sendKeys(dateTimeValue);
		            WebElement submitButton = driver.findElement(By.xpath("[.='Yes']"));
		            submitButton.click();
		            driver.close();
		        
		        } finally {
			Thread.sleep(4000);
			ManageOrders.clickOnYesBtn();
			Thread.sleep(4000);
			ManageOrders.getYesBtn().click();
			Thread.sleep(4000);
			ManageOrders.clickOnManageOrderbtn();
			Thread.sleep(4000);
			wUtility.scrollPageDown(5);
			
			//WebElement scroll=driver.findElement(By.xpath("(//td[@class='ng-star-inserted'])[1]"));

			//JavascriptExecutor javascriptExecutor=(JavascriptExecutor)driver;

			//js.executeScript("document.querySelector(scroll).scrollLeft=1000");
			ManageOrders.getlogoutBtn().click();
			Thread.sleep(4000);
			ManageOrders.getLogoutYesBtn().click();
			driver.close();
			ScreenRecorderUtil.stopRecord();
			
			
		
		        }
	}
	
	
		}
	
	

