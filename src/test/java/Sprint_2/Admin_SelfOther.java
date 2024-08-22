package Sprint_2;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import genericUtility.ExcelFileUtility;
import genericUtility.GoldBharatAdmin_BaseClass;
import genericUtility.JavaUtility;
import genericUtility.PropertyFileUtility;
import genericUtility.WebDriverUtility;
import objectRepository.GoldBharat_AdminManageOrders;
import objectRepository.GoldBharat_AdminSelfOther;

public class Admin_SelfOther extends GoldBharatAdmin_BaseClass {
	
		WebDriverUtility wUtility = new WebDriverUtility();
		JavaUtility jUtility = new JavaUtility();
		ExcelFileUtility eUtility = new ExcelFileUtility();
		public PropertyFileUtility pUtility = new PropertyFileUtility();
		

		@Test(priority = 1, groups = "GoldBharatAdminLogin")
		public void login() throws Exception {

			GoldBharat_AdminSelfOther SelfOther = new GoldBharat_AdminSelfOther(driver);
			String AdminUserName = eUtility.readDataFromExcel("GoldBharatAdminPage", 1, 1);
			SelfOther.clickOnAdminUserName();
			SelfOther.getAdminUserName().sendKeys(AdminUserName);
			Thread.sleep(1000);
			String AdminPwd = eUtility.readDataFromExcel("GoldBharatAdminPage", 2, 1);
			SelfOther.clickOnAdminPwd();
			SelfOther.getAdminPwd().sendKeys(AdminPwd);
			Thread.sleep(2000);
			wUtility.takeScreenShot(driver, "AdminLogin") ;
			SelfOther.clickOnAdminLoginBtn();
			Thread.sleep(2000);
			Thread.sleep(1000);
			SelfOther.clickOnManageOrderbtn();
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(2000);
			SelfOther.getHimselfBtn().click();
			Thread.sleep(2000);
			SelfOther.getOtpBtn().click();
			Thread.sleep(2000);
			SelfOther.getYesBtn().click();
			Thread.sleep(2000);
			SelfOther.clickOnBtn1();
			Thread.sleep(2000);
			String Otp = eUtility.readDataFromExcel("GoldBharatAdminPage", 9, 1);
			Thread.sleep(2000);
			SelfOther.getBtn1().sendKeys(Otp);
			//String Btn1 = eUtility.readDataFromExcel("GoldBharatAdminPage", 9, 1);
			
			/* char Char1 = otp.charAt(0);  
		      String Btn1 = Character.toString(Char1);  
		        /*char Char2 = otp.charAt(1);  
		        String Btn2 = Character.toString(Char2);  
		        char Char3 = otp.charAt(2);  // Get character at index i
		        String Btn3 = Character.toString(Char3);  
		        char Char4 = otp.charAt(3);  // Get character at index i
		        String Btn4 = Character.toString(Char4); 
		        char Char5 = otp.charAt(4);  // Get character at index i
		        String Btn5 = Character.toString(Char5); 
		        char Char6 = otp.charAt(5);  // Get character at index i
		        String Btn6 = Character.toString(Char6); 
		        SelfOther.clickOnBtn1();
		        SelfOther.getBtn1().sendKeys(Btn1);
		       /* SelfOther.clickOnBtn2();
		        SelfOther.getBtn2().sendKeys(Btn2);
		        SelfOther.clickOnBtn3();
		        SelfOther.getBtn3().sendKeys(Btn3);
		        SelfOther.clickOnBtn4();
		        SelfOther.getBtn4().sendKeys(Btn4);
			    SelfOther.clickOnBtn5();
			    SelfOther.getBtn5().sendKeys(Btn5);
			    SelfOther.clickOnBtn6();
			    SelfOther.getBtn6().sendKeys(Btn6);*/
			    Thread.sleep(2000);
			    SelfOther.getYesBtn1().click();
			    Thread.sleep(2000);
			    SelfOther.clickOnManageOrderbtn();
			    driver.navigate().refresh();
			    SelfOther.clickOnManageOrderbtn();
			    Thread.sleep(4000);
			    SelfOther.getlogoutBtn().click();
				Thread.sleep(2000);
				SelfOther.getLogoutYesBtn().click();
				Thread.sleep(2000);
				driver.close();
			
}
}
