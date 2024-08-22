package Sprint_2;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import objectRepository.GoldBharat_UserLoginPage;
import genericUtility.ExcelFileUtility;
import genericUtility.PropertyFileUtility;
import genericUtility.WebDriverUtility;
import objectRepository.GoldBharat_UserLTD_KYC_Page;

	public class User_KYC_LTD extends User_LoginPage {
		PropertyFileUtility pUtil = new PropertyFileUtility();
		ExcelFileUtility eUtil=new ExcelFileUtility();
		WebDriverUtility wUtil=new WebDriverUtility();
			@Test
			public void login() throws InterruptedException, EncryptedDocumentException, IOException  {
				GoldBharat_UserLTD_KYC_Page LTDKYC= new GoldBharat_UserLTD_KYC_Page (driver);
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
				LTDKYC.getProfileIcon().click();;
				Thread.sleep(2000);
				LTDKYC.clickOnKYC();
				Thread.sleep(2000);
						LTDKYC.getSelectTypeDropDown().click();
						Thread.sleep(2000);
						LTDKYC.getSelectTypeDropDown().sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
						Thread.sleep(2000);
						LTDKYC.getDirectorName().click();
                        String DirectorName=eUtil.readDataFromExcel("LTD_KYC", 4, 1);
                        LTDKYC.getDirectorName().sendKeys(DirectorName);
                        
                        LTDKYC.getDirectorNum().click();
						String DiretorNum=eUtil.readDataFromExcel("LTD_KYC", 5, 1);
						LTDKYC.getDirectorNum().sendKeys(DiretorNum);
						
						LTDKYC.getDirectorAdharNumEdit().click();
						String AdharNum=eUtil.readDataFromExcel("LTD_KYC", 6, 1);
						LTDKYC.getDirectorAdharNumEdit().sendKeys(AdharNum);
						
						String projectPath= System.getProperty("user.dir");
						LTDKYC.getAdharFrontImg().click();
						LTDKYC.getAdharFrontImg().sendKeys(projectPath+"\\Images\\pan.jpg" );
						System.out.println(projectPath+"\\Images\\pan.jpg");
						Thread.sleep(3000);
						
						wUtil.scrolldown(driver);
						Thread.sleep(2000);
						
						LTDKYC.getAdharBackImg().click();
						LTDKYC.getAdharBackImg().sendKeys(projectPath+"\\Images\\gst.jpg");
						System.out.println(projectPath+"\\Images\\gst.jpg");
						Thread.sleep(3000);
						
						LTDKYC.getDirectorPanNumEdit().click();
						String PanNum=eUtil.readDataFromExcel("LTD_KYC", 9, 1);
						LTDKYC.getDirectorPanNumEdit().sendKeys(PanNum);
						
						LTDKYC.getDirectorPanImg().click();
						LTDKYC.getDirectorPanImg().sendKeys(projectPath+"\\Images\\gst.jpg");
						System.out.println(projectPath+"\\Images\\gst.jpg");
						Thread.sleep(3000);
						
						wUtil.scrolldown(driver);
						Thread.sleep(2000);
						
						LTDKYC.getSecondDirectorNameEdit().click();
						String SecondDirectorName=eUtil.readDataFromExcel("LTD_KYC", 11, 1);
						LTDKYC.getSecondDirectorNameEdit().sendKeys(SecondDirectorName);
						
						LTDKYC.getSecondDirectorAdharNumEdit().click();
						String SecondDirectorAdharNum=eUtil.readDataFromExcel("LTD_KYC", 12, 1);
						LTDKYC.getSecondDirectorAdharNumEdit().sendKeys(SecondDirectorAdharNum);
						wUtil.scrolldown(driver);
						Thread.sleep(2000);
						
						LTDKYC.getSecondDirectorAdharFrontImg().click();
						LTDKYC.getSecondDirectorAdharFrontImg().sendKeys(projectPath+"\\Images\\gst.jpg");
						System.out.println(projectPath+"\\Images\\gst.jpg");
						Thread.sleep(3000);
						
						wUtil.scrolldown(driver);
						Thread.sleep(2000);
						
						LTDKYC.getSecondDirectorAdharBackImg().click();
						LTDKYC.getSecondDirectorAdharBackImg().sendKeys(projectPath+"\\Images\\gst.jpg");
						System.out.println(projectPath+"\\Images\\gst.jpg");
						Thread.sleep(3000);
						
						LTDKYC.getSecondDirectorPanNumEdit().click();
						String SecondDirectorPanNum=eUtil.readDataFromExcel("LTD_KYC", 15, 1);
						LTDKYC.getSecondDirectorPanNumEdit().sendKeys(SecondDirectorPanNum);
						
						wUtil.scrolldown(driver);
						Thread.sleep(2000);
						
						LTDKYC.getSecondDirectorPanImg().click();
						LTDKYC.getSecondDirectorPanImg().sendKeys(projectPath+"\\Images\\gst.jpg");
						System.out.println(projectPath+"\\Images\\gst.jpg");
						Thread.sleep(3000);
						
						LTDKYC.getSecondDirectorGSTNumEdit().click();
						String GstNum=eUtil.readDataFromExcel("LTD_KYC", 17, 1);
						LTDKYC.getSecondDirectorGSTNumEdit().sendKeys(GstNum);
						
						wUtil.scrolldown(driver);
						Thread.sleep(2000);
						
						LTDKYC.getSecondDirectorGSTImg().click();
						LTDKYC.getSecondDirectorGSTImg().sendKeys(projectPath+"\\Images\\gst.jpg");
						System.out.println(projectPath+"\\Images\\gst.jpg");
						Thread.sleep(3000);
						
						LTDKYC.getSecondDirectorCINNumEdit().click();
						String CinNum=eUtil.readDataFromExcel("LTD_KYC", 19, 1);
						LTDKYC.getSecondDirectorCINNumEdit().sendKeys(CinNum);
						
						LTDKYC.getSecondDirectorCINImg().click();
						LTDKYC.getSecondDirectorCINImg().sendKeys(projectPath+"\\Images\\gst.jpg");
						System.out.println(projectPath+"\\Images\\gst.jpg");
						Thread.sleep(3000);
						
						wUtil.scrolldown(driver);
						Thread.sleep(2000);
						
						LTDKYC.getDirectorImg().click();
						LTDKYC.getDirectorImg().sendKeys(projectPath+"\\Images\\gst.jpg");
						System.out.println(projectPath+"\\Images\\gst.jpg");
						Thread.sleep(3000);
						
						LTDKYC.getDirectorBankNameEdit().click();	
						String BankName=eUtil.readDataFromExcel("LTD_KYC", 22, 1);
						LTDKYC.getDirectorBankNameEdit().sendKeys(BankName);
						
						LTDKYC.getDirectorAccountNumEdit().click();
						String AccountNum=eUtil.readDataFromExcel("LTD_KYC", 23, 1);
						LTDKYC.getDirectorAccountNumEdit().sendKeys(AccountNum);

						wUtil.scrolldown(driver);
						Thread.sleep(2000);
					
						LTDKYC.getDirectorIFSCCodeEdit().click();
						String IFSCCode=eUtil.readDataFromExcel("LTD_KYC", 24, 1);
						LTDKYC.getDirectorIFSCCodeEdit().sendKeys(IFSCCode);
						
						
						LTDKYC.getAccountHolderNameEdit().click();
						String AccountHolderName=eUtil.readDataFromExcel("LTD_KYC", 25, 1);	
						LTDKYC.getAccountHolderNameEdit().sendKeys(AccountHolderName);
						Thread.sleep(3000);
						
						LTDKYC.getSubmitBtn().click();
						
						JavascriptExecutor js = (JavascriptExecutor) driver;
						js.executeScript("window.scrollBy(-1000,-1000)");
						
						Thread.sleep(2000);
						wUtil.takeScreenShot(driver, "LTD Kyc Created PopUp");
						
						Thread.sleep(3000);
					
					}

			}					

