package Sprint_2;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import objectRepository.GoldBharat_UserLoginPage;
import objectRepository.GoldBharat_UserPvtLtd_KYC_Page;
import genericUtility.ExcelFileUtility;
import genericUtility.PropertyFileUtility;
import genericUtility.WebDriverUtility;

		public class User_KYC_Pvt_Ltd extends User_LoginPage {
			PropertyFileUtility pUtility = new PropertyFileUtility();
			ExcelFileUtility eUtility=new ExcelFileUtility();
			WebDriverUtility wUtility=new WebDriverUtility();
				@Test
				public void login() throws InterruptedException, EncryptedDocumentException, IOException  {
					GoldBharat_UserPvtLtd_KYC_Page PvtLtdKYC= new GoldBharat_UserPvtLtd_KYC_Page (driver);
					GoldBharat_UserLoginPage loginPage= new GoldBharat_UserLoginPage(driver);
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
				      char Char1 = otp.charAt(0);  
				        String otp1 = Character.toString(Char1); 
				        char Char2 = otp.charAt(1);  
				        String otp2 = Character.toString(Char2); 
				        char Char3 = otp.charAt(2);  
				        String otp3 = Character.toString(Char3);  
				        char Char4 = otp.charAt(3);  
				        String otp4 = Character.toString(Char4);  
				        char Char5 = otp.charAt(4);  
				        String otp5 = Character.toString(Char5); 
				        char Char6 = otp.charAt(5);  
				        String otp6 = Character.toString(Char6);  
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
					PvtLtdKYC.getProfileIcon().click();;
					Thread.sleep(2000);
					PvtLtdKYC.clickOnKYC();
					Thread.sleep(2000);
					PvtLtdKYC.getSelectTypeDropDown().click();
					Thread.sleep(2000);
					PvtLtdKYC.getSelectTypeDropDown().sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
					Thread.sleep(2000);
					
					PvtLtdKYC.getDirectorNameEdit().click();
					String dname=eUtility.readDataFromExcel("PVT_LTD_KYC", 4, 1);
					PvtLtdKYC.getDirectorNameEdit().sendKeys(dname);
					
					PvtLtdKYC.getDirectorMobileEdit().click();
					String MobileNum=eUtility.readDataFromExcel("PVT_LTD_KYC", 5, 1);
					PvtLtdKYC.getDirectorMobileEdit().sendKeys(MobileNum);
					
					PvtLtdKYC.getDirectorAdharNumEdit().click();
					String AdharNum=eUtility.readDataFromExcel("PVT_LTD_KYC", 6, 1);
					PvtLtdKYC.getDirectorAdharNumEdit().sendKeys(AdharNum);
					
					
					String projectPath= System.getProperty("user.dir");
					PvtLtdKYC.getUploadAdharFrontImg().sendKeys(projectPath+"\\Images\\AadhaarCard.jpg" );
					System.out.println(projectPath+"\\Images\\AadhaarCard.jpg");
					
					Thread.sleep(2000);
					wUtility.scrolldown(driver);
					Thread.sleep(2000);
					
					PvtLtdKYC.getUploadAdharBackImg().sendKeys(projectPath+"\\Images\\AadhaarCard.jpg" );
					System.out.println(projectPath+"\\Images\\AadhaarCard.jpg");
			
					PvtLtdKYC.getDirectorPanNumEdit().click();
					String PanNum=eUtility.readDataFromExcel("PVT_LTD_KYC", 9, 1);
					PvtLtdKYC.getDirectorPanNumEdit().sendKeys(PanNum);
					
					PvtLtdKYC.getDirectorPanImg().sendKeys(projectPath+"\\Images\\Pancard.jpg" );
					System.out.println(projectPath+"\\Images\\Pancard.jpg");
					
					Thread.sleep(2000);
					wUtility.scrolldown(driver);
					Thread.sleep(2000);
					
					PvtLtdKYC.getSecondDirectorNameEdit().click();
					String SecondDname=eUtility.readDataFromExcel("PVT_LTD_KYC", 11, 1);
					PvtLtdKYC.getSecondDirectorNameEdit().sendKeys(SecondDname);
					
					PvtLtdKYC.getSecondDirectorAdharEdit().click();
					String SecondAdharNum=eUtility.readDataFromExcel("PVT_LTD_KYC", 12, 1);
					PvtLtdKYC.getSecondDirectorAdharEdit().sendKeys(SecondAdharNum);
					
					Thread.sleep(2000);
					wUtility.scrolldown(driver);
					Thread.sleep(2000);
					

					PvtLtdKYC.getSecondDirectorFrontAdharImg().sendKeys(projectPath+"\\Images\\AadhaarCard.jpg" );
					System.out.println(projectPath+"\\Images\\AadhaarCard.jpg");
					Thread.sleep(3000);
					
					PvtLtdKYC.getSecondDirectorBackAdharImg().sendKeys(projectPath+"\\Images\\AadhaarCard.jpg" );
					System.out.println(projectPath+"\\Images\\AadhaarCard.jpg");
	
					Thread.sleep(2000);
					wUtility.scrolldown(driver);
					Thread.sleep(2000);
					
					PvtLtdKYC.getSecondDirectorPanNumEdit().click();
					String SecondPanNum=eUtility.readDataFromExcel("PVT_LTD_KYC", 15, 1);
					PvtLtdKYC.getSecondDirectorPanNumEdit().sendKeys(SecondPanNum);
					
					
					PvtLtdKYC.getSecondDirectorPanImg().sendKeys(projectPath+"\\Images\\Pancard.jpg" );
					System.out.println(projectPath+"\\Images\\Pancard.jpg");
					
					PvtLtdKYC.getDirectorGSTNumEdit().click();
					String GstNum=eUtility.readDataFromExcel("PVT_LTD_KYC", 17, 1);
					PvtLtdKYC.getDirectorGSTNumEdit().sendKeys(GstNum);
					
					
					PvtLtdKYC.getDirectorGSTImg().sendKeys(projectPath+"\\Images\\gst1.jpg" );
					System.out.println(projectPath+"\\Images\\gst1.jpg");
					Thread.sleep(2000);
					wUtility.scrolldown(driver);
					Thread.sleep(2000);
					PvtLtdKYC.getDirectorCINNumEdit().click();
					String CinNum=eUtility.readDataFromExcel("PVT_LTD_KYC", 19, 1);
					PvtLtdKYC.getDirectorCINNumEdit().sendKeys(CinNum);
					Thread.sleep(2000);
					wUtility.scrolldown(driver);
					Thread.sleep(2000);
					PvtLtdKYC.getDirectorCINImg().sendKeys(projectPath+"\\Images\\CINnum.jpg" );
					System.out.println(projectPath+"\\Images\\CINnum.jpg");
					Thread.sleep(2000);
					wUtility.scrolldown(driver);
					Thread.sleep(2000);
					PvtLtdKYC.getUploadYourImg().sendKeys(projectPath+"\\Images\\Directorimg.jpg" );
					System.out.println(projectPath+"\\Images\\Directorimg.jpg");
					Thread.sleep(2000);
					wUtility.scrolldown(driver);
					Thread.sleep(2000);
					PvtLtdKYC.getBankNameEdit().click();
					String BankName=eUtility.readDataFromExcel("PVT_LTD_KYC", 22, 1);
					PvtLtdKYC.getBankNameEdit().sendKeys(BankName);
					PvtLtdKYC.getAccountNumEdit().click();
					String AccountNum=eUtility.readDataFromExcel("PVT_LTD_KYC", 23, 1);
					PvtLtdKYC.getAccountNumEdit().sendKeys(AccountNum);
					PvtLtdKYC.getIFSCCodeEdit().click();
					String IfscCode=eUtility.readDataFromExcel("PVT_LTD_KYC", 24, 1);
					PvtLtdKYC.getIFSCCodeEdit().sendKeys(IfscCode);
					PvtLtdKYC.getAccountHolderNameEdit().click();
					String HolderName=eUtility.readDataFromExcel("PVT_LTD_KYC", 25, 1);
					PvtLtdKYC.getAccountHolderNameEdit().sendKeys(HolderName);
					Thread.sleep(2000);
					wUtility.scrolldown(driver);
					Thread.sleep(2000);
					PvtLtdKYC.getSubmitBtn().click();
					
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("window.scrollBy(-1000,-1000)");
					Thread.sleep(2000);
					wUtility.takeScreenShot(driver, "Kyc Created PopUp");
					PvtLtdKYC.getProfileIcon().click();
					Thread.sleep(2000);
					PvtLtdKYC.getLogoutBtn().click();
					Thread.sleep(2000);
					PvtLtdKYC.getOkBtn().click();
					driver.quit();
				}
					
}
