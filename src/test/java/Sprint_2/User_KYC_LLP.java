package Sprint_2;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import ObjectRepository.LLP_Kyc_Page;
import ObjectRepository.ProfilePage;
import objectRepository.GoldBharat_UserLoginPage;
import objectRepository.GoldBharat_ProfileIconandKYC;
import genericUtility.ExcelFileUtility;
import genericUtility.GoldBharat_BaseClass;
import genericUtility.PropertyFileUtility;
import genericUtility.WebDriverUtility;
import objectRepository.GoldBharat_UserLTD_KYC_Page;
import objectRepository.GoldBharat_ProfileIconandKYC;
import objectRepository.GoldBharat_UserDashboard;
import objectRepository.GoldBharat_UserLLP_KYC_Page;
	public class User_KYC_LLP extends User_LoginPage {
		PropertyFileUtility pUtility = new PropertyFileUtility();
		ExcelFileUtility eUtility=new ExcelFileUtility();
		WebDriverUtility wUtility=new WebDriverUtility();
			@Test
			public void login() throws InterruptedException, EncryptedDocumentException, IOException  {
				GoldBharat_UserLLP_KYC_Page LLPKYC= new GoldBharat_UserLLP_KYC_Page (driver);
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
				LLPKYC.getProfileIcon().click();;
				Thread.sleep(2000);
				LLPKYC.getKYC().click();
				Thread.sleep(2000);
						LLPKYC.getSelectTypeDropDown().click();
						Thread.sleep(2000);
						LLPKYC.getSelectTypeDropDown().sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
						Thread.sleep(2000);
						
						LLPKYC.getDirectorNameEdt().click();
						String Dname=eUtility.readDataFromExcel("LLP_KYC", 4, 1);
						LLPKYC.getDirectorNameEdt().sendKeys(Dname);
						
						LLPKYC.getDirectorMobileNumEdt().click();
						String Dnum=eUtility.readDataFromExcel("LLP_KYC", 5, 1);
						LLPKYC.getDirectorMobileNumEdt().sendKeys(Dnum);
						Thread.sleep(5000);
						
						LLPKYC.getDirectorAdharNumEdt().click();
						String AdharNum=eUtility.readDataFromExcel("LLP_KYC", 6, 1);
						LLPKYC.getDirectorAdharNumEdt().sendKeys(AdharNum);
						
						String projectPath= System.getProperty("user.dir");
						
						LLPKYC.getDirectorAdharFrontImgLnk().sendKeys(projectPath+"\\Images\\AadhaarCard.jpg");
						System.out.println(projectPath+"\\Images\\AadhaarCard.jpg");
						Thread.sleep(3000);
						
						wUtility.scrolldown(driver);
						Thread.sleep(5000);
						
						
						LLPKYC.getDirectorAdharBackImgLnk().sendKeys(projectPath+"\\Images\\AadhaarCard.jpg");
						System.out.println(projectPath+"\\Images\\AadhaarCard.jpg");
						Thread.sleep(3000);
						
						LLPKYC.getDirectorPanEdt().click();
						String PanNum=eUtility.readDataFromExcel("LLP_KYC", 9, 1);
						LLPKYC.getDirectorPanEdt().sendKeys(PanNum);
						
						wUtility.scrolldown(driver);
						Thread.sleep(5000);
						
						
						LLPKYC.getDirectorPanImg().sendKeys(projectPath+"\\Images\\Pancard.jpg");
						System.out.println(projectPath+"\\Images\\Pancard.jpg");
						Thread.sleep(3000);
						
						LLPKYC.getDirectorGstNumEdt().click();
						String GstNum=eUtility.readDataFromExcel("LLP_KYC", 11, 1);
						LLPKYC.getDirectorGstNumEdt().sendKeys(GstNum);
						
						wUtility.scrolldown(driver);
						Thread.sleep(5000);
						
						
						LLPKYC.getDirectorGstImg().sendKeys(projectPath+"\\Images\\gst1.jpg");
						System.out.println(projectPath+"\\Images\\gst1.jpg");
						Thread.sleep(3000);
						
						
						String CinNum=eUtility.readDataFromExcel("LLP_KYC", 13, 1);
						LLPKYC.getDirectorCinNumEdt().sendKeys(CinNum);
						
						
						LLPKYC.getDirectorCinImg().sendKeys(projectPath+"\\Images\\CINnum.jpg");
						System.out.println(projectPath+"\\Images\\CINnum.jpg");
						Thread.sleep(3000);
						
						wUtility.scrolldown(driver);
						Thread.sleep(5000);
						
						LLPKYC.getDirectorImg().sendKeys(projectPath+"\\Images\\Directorimg.jpg");
						System.out.println(projectPath+"\\Images\\Directorimg.jpg");
						Thread.sleep(3000);
						
						LLPKYC.getBankNameEdt().click();
						String BankName=eUtility.readDataFromExcel("LLP_KYC", 16, 1);
						LLPKYC.getBankNameEdt().sendKeys(BankName);
						Thread.sleep(3000);
						
						LLPKYC.getAccountNumberEdt().click();
						String AccountNum=eUtility.readDataFromExcel("LLP_KYC", 17, 1);
						LLPKYC.getAccountNumberEdt().sendKeys(AccountNum);
						
						LLPKYC.getIfscCodeEdt().click();
						String IfscCode=eUtility.readDataFromExcel("LLP_KYC", 18, 1);
						LLPKYC.getIfscCodeEdt().sendKeys(IfscCode);
						
						LLPKYC.getAccountHolderNameEdt().click();
						String HolderName=eUtility.readDataFromExcel("LLP_KYC", 19, 1);
						LLPKYC.getAccountHolderNameEdt().sendKeys(HolderName);
						
						
					    LLPKYC.getSubmitBtn().click();
						
						JavascriptExecutor js = (JavascriptExecutor) driver;
						js.executeScript("window.scrollBy(-1000,-1000)");
						
						Thread.sleep(5000);
						
						wUtility.takeScreenShot(driver, "LLP KYC Created ");
						
						Thread.sleep(3000);
					}
				
			}		

