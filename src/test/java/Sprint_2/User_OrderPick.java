package Sprint_2;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import genericUtility.ExcelFileUtility;
import genericUtility.GoldBharat_BaseClass;
import genericUtility.JavaUtility;
import genericUtility.PropertyFileUtility;
import genericUtility.WebDriverUtility;
import objectRepository.GoldBharat_UserLoginPage;
import objectRepository.GoldBharat_UserOrderPick;


	public class User_OrderPick extends User_LoginPage {

		WebDriverUtility wUtility = new WebDriverUtility();
		JavaUtility jUtility = new JavaUtility();
		ExcelFileUtility eUtility = new ExcelFileUtility();
		public PropertyFileUtility pUtility = new PropertyFileUtility();

		@Test
		public void login() throws InterruptedException, EncryptedDocumentException, IOException {
			GoldBharat_UserLoginPage loginPage= new GoldBharat_UserLoginPage(driver);
			GoldBharat_UserOrderPick OrderPick = new GoldBharat_UserOrderPick(driver);
			Thread.sleep(2000);
			loginPage.clickOnLoginBtn();
			Thread.sleep(1000);
			String PhoneNumber = eUtility.readDataFromExcel("GoldBharat", 1, 1);
			loginPage.clickOnPhnNum();
			loginPage.getPhnNum().sendKeys(PhoneNumber);
			Thread.sleep(1000);
			wUtility.takeScreenShot(driver, "Login phone number") ;
			loginPage.clickOnSubmitBtn();
			Thread.sleep(2000);
			String otp = eUtility.readDataFromExcel("GoldBharat", 2, 1);
			
		      char Char1 = otp.charAt(0);  // Get character at index i
		        String otp1 = Character.toString(Char1);  // Convert char to String
		        char Char2 = otp.charAt(1);  // Get character at index i
		        String otp2 = Character.toString(Char2);  // Convert char to String
		        char Char3 = otp.charAt(2);  // Get character at index i
		        String otp3 = Character.toString(Char3);  // Convert char to String
		        char Char4 = otp.charAt(3);  // Get character at index i
		        String otp4 = Character.toString(Char4);  // Convert char to String
		        char Char5 = otp.charAt(4);  // Get character at index i
		        String otp5 = Character.toString(Char5);  // Convert char to String
		        char Char6 = otp.charAt(5);  // Get character at index i
		        String otp6 = Character.toString(Char6);  // Convert char to String
				loginPage.clickOnotp1();
			loginPage.getotp1().sendKeys(otp1);
			loginPage.clickOnotp2();
			loginPage.getotp2().sendKeys(otp2);
			loginPage.clickOnotp3();
			loginPage.getotp3().sendKeys(otp3);
			loginPage.clickOnotp4();
			loginPage.getotp4().sendKeys(otp4);
			loginPage.clickOnotp5();
			loginPage.getotp5().sendKeys(otp5);
			loginPage.clickOnotp6();
			loginPage.getotp6().sendKeys(otp6);
			Thread.sleep(2000);
			wUtility.takeScreenShot(driver, "Login Success") ;
			Thread.sleep(5000);
			OrderPick.getProfileIcon().click();;
			Thread.sleep(2000);
			OrderPick.getOrders().click();
			Thread.sleep(4000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(500,500)");
			OrderPick.clickOnConformpaymentBtn();
			Thread.sleep(4000);
			OrderPick.clickOnSubmitBtn();
			Thread.sleep(4000);
			OrderPick.clickOnCloseBtn();
			Thread.sleep(2000);
			OrderPick.getProfileIcon().click();
			Thread.sleep(2000);
			OrderPick.getLogoutBtn().click();
			Thread.sleep(2000);
			OrderPick.getOkBtn().click();
			Thread.sleep(2000);
			driver.quit();
			
		}
		
}
