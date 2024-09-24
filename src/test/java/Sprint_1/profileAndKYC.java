package Sprint_1;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import genericUtility.PropertyFileUtility;
import genericUtility.ScreenRecorderUtil;
import objectRepository.GoldBharat_ProfileIconandKYC;


public class profileAndKYC  extends Login {

	PropertyFileUtility pUtil = new PropertyFileUtility();
	

		@Test
		public void profile() throws Exception  {
			ScreenRecorderUtil.startRecord("profile");	
			
			GoldBharat_ProfileIconandKYC profile = new GoldBharat_ProfileIconandKYC(driver);
	
			profile.clickOnProfileIcon();
			
			boolean isClickable1 = profile.isProfileIconClickable();
					
					if (isClickable1) {
					System.out.println(" Profile icon successfully clickable");
				 } else {
					 
					 System.out.println("Profile icon is not clickable.");
			     }
					
					//KYC Operation perform
					
					profile.clickOnKYC();
					
					
					
					Thread.sleep(2000);
					
					profile.clickOnclose();
					
					
					boolean isClickable2 = profile.isKYCClickable();
							
							if (isClickable2) {
								
							
							
							System.out.println(" KYC successfully clickable");
						 } else {
							 
							 System.out.println("KYC is not clickable.");
					     }
							
							
							
							profile.clickOnProprietorName();
							
							String ProprietorName = eUtility.readDataFromExcel("GoldBharat", 5, 1);
							profile.getProprietorName().sendKeys(ProprietorName);
							
							Thread.sleep(2000);
							
			                 profile.clickOnProprietorPan();
			                 String ProprietorPan = eUtility.readDataFromExcel("GoldBharat", 10, 1);
							 profile.getProprietorPan().sendKeys(ProprietorPan);
							
							Thread.sleep(2000);
					
							
							String projectPath= System.getProperty("user.dir");
							
	                        profile.getproprietor_pan_image().sendKeys(projectPath+"\\Images\\pan.jpg");  
	                        System.out.println(projectPath+"\\Images\\pan.jpg");
                            Thread.sleep(3000);
			                profile.clickOnProprietorGSTNO();
							
							profile.getProprietorGSTNO().sendKeys("22AAAAA0000A1Z5", Keys.TAB,Keys.TAB);
							
							Thread.sleep(2000);
							
							//*******************Click On Proprietor_GST_Image**************//
							
							
							
							profile.getproprietor_gst_image().sendKeys(projectPath+"\\Images\\gst.jpg");		
							Thread.sleep(4000);
							
			profile.clickOnBankName();
			String BankName = eUtility.readDataFromExcel("GoldBharat", 11, 1);
							profile.getBankName().sendKeys(BankName);
							
							Thread.sleep(2000);
			profile.clickOnAccountNumber();
			String AccountNumber = eUtility.readDataFromExcel("GoldBharat", 12, 1);
							profile.getAccountNumber().sendKeys(AccountNumber);
							
							Thread.sleep(2000);
			profile.clickOnIFSCCode();
			String IFSCCode = eUtility.readDataFromExcel("GoldBharat", 13, 1);
							profile.getIFSCCode().sendKeys(IFSCCode);
							
							Thread.sleep(2000);
			profile.clickOnHolderName();
			String HolderName = eUtility.readDataFromExcel("GoldBharat", 14, 1);
							profile.getHolderName().sendKeys(HolderName);
							
							Thread.sleep(2000);
							profile.getHolderName().sendKeys(Keys.TAB,Keys.ENTER);
							Thread.sleep(2000);   
							JavascriptExecutor js = (JavascriptExecutor) driver;
							js.executeScript("window.scrollBy(-1000,-1000)");
							Thread.sleep(2000); 
							wUtility.takeScreenShot(driver, "KYC") ;
							
							driver.close();
							ScreenRecorderUtil.stopRecord();
}
}
