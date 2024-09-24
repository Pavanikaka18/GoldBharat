package Sprint_2;

	import java.time.Duration;
	import java.util.List;

import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.Listeners;
	import org.testng.annotations.Test;
	import genericUtility.ExcelFileUtility;
	import genericUtility.GoldBharatAdmin_BaseClass;
	import genericUtility.JavaUtility;
	import genericUtility.PropertyFileUtility;
import genericUtility.ScreenRecorderUtil;
import genericUtility.WebDriverUtility;
	import objectRepository.GoldBharat_AdminLoginPage;


	public class Admin_KycAccept extends GoldBharatAdmin_BaseClass {

		WebDriverUtility wUtility = new WebDriverUtility();
		JavaUtility jUtility = new JavaUtility();
		ExcelFileUtility eUtility = new ExcelFileUtility();
		public PropertyFileUtility pUtility = new PropertyFileUtility();
		

		@Test(priority = 1, groups = "GoldBharatAdminLogin")
		public void login() throws Exception {
			ScreenRecorderUtil.startRecord("login");
			GoldBharat_AdminLoginPage AdminloginPage = new GoldBharat_AdminLoginPage(driver);
			Thread.sleep(1000);
			String AdminUserName = eUtility.readDataFromExcel("GoldBharatAdminPage", 1, 1);
			AdminloginPage.clickOnAdminUserName();
			AdminloginPage.getAdminUserName().sendKeys(AdminUserName);
			Thread.sleep(1000);
			String AdminPwd = eUtility.readDataFromExcel("GoldBharatAdminPage", 2, 1);
			AdminloginPage.clickOnAdminPwd();
			AdminloginPage.getAdminPwd().sendKeys(AdminPwd);
			Thread.sleep(2000);
			wUtility.takeScreenShot(driver, "AdminLogin") ;
			AdminloginPage.clickOnAdminLoginBtn();
			Thread.sleep(2000);
			AdminloginPage.clickOnManageLink();
			Thread.sleep(2000);
			wUtility.takeScreenShot(driver, "Manageditributor") ;
			// Wait for the table to be fully loaded
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10 seconds timeout
			// Get all rows of the table
					List<WebElement> rows = AdminloginPage.gettables();
							String phoneNumberfromdatasheet =  eUtility.readDataFromExcel("GoldBharat", 1, 1);
					// Loop through each row to find the phone number and click the edit button
					for (WebElement row : rows) {
									List<WebElement> cells = row.findElements(By.tagName("td"));
									if (cells.size() > 0) {
							System.out.println(cells.get(4).getText());
							// Assuming the phone number is in the 5th column (index 4)
							String phoneNumber = cells.get(4).getText();
							System.out.println("Found phone number: " + phoneNumber);
							if (phoneNumberfromdatasheet.equals(phoneNumber)) {				
								WebElement editButton = row.findElement(By.xpath(".//i[@class='fa fa-pencil']"));						
								 editButton.click();					
								break;
							}
						}
					}
				
			Thread.sleep(2000);
			wUtility.takeScreenShot(driver, "ActionEdit") ;
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0, 250)");
			Thread.sleep(2000);
	        js.executeScript("window.scrollBy(0, 250)");
			Thread.sleep(5000);
		    AdminloginPage.clickOnAccept();  
			  Thread.sleep(5000);
			 wUtility.takeScreenShot(driver, "KYC Accept") ;
			  AdminloginPage.clickOnManageDistributor();
				Thread.sleep(5000);
				wUtility.takeScreenShot(driver, "Manage distributor") ;
						for (WebElement row : rows) {
										List<WebElement> cells = row.findElements(By.tagName("td"));
										if (cells.size() > 0) {
								System.out.println(cells.get(4).getText());
								// Assuming the phone number is in the 5th column (index 4)
								String phoneNumber = cells.get(4).getText();
								System.out.println("Found phone number: " + phoneNumber);
								if (phoneNumberfromdatasheet.equals(phoneNumber)) {				
									WebElement editButton = row.findElement(By.xpath(".//i[@class='fa fa-pencil']"));						
									 editButton.click();					
									break;
								}
							}
						}
				
				 wUtility.takeScreenShot(driver, "Action edit") ;
				 Thread.sleep(5000);	  
			js.executeScript("window.scrollBy(0, 500)");
			Thread.sleep(5000);
			AdminloginPage.clickOnSilverlimit();
			String Silverlimit = eUtility.readDataFromExcel("GoldBharatAdminPage", 3, 1);	
			AdminloginPage.getSilverlimit().sendKeys(Silverlimit);
			Thread.sleep(5000);	
			AdminloginPage.clickOnmaxlimit();
			String Goldlimit = eUtility.readDataFromExcel("GoldBharatAdminPage", 4, 1);	
			AdminloginPage.getmaxlimit().sendKeys(Goldlimit);
			Thread.sleep(5000);
			wUtility.takeScreenShot(driver, "Silver and Gold Limits in Admin") ;
			AdminloginPage.clickOnSubmitBtn();
			Thread.sleep(5000);
			wUtility.takeScreenShot(driver, "Admin submission") ;
			AdminloginPage.clickOnProfilebtn();
			Thread.sleep(5000);
			AdminloginPage.clickOnYes();			
			//driver.close();
			ScreenRecorderUtil.stopRecord();
	}
	}


