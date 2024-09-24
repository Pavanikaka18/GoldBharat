package Sprint_2;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.ScreenRecorderUtil;
import objectRepository.GoldBharat_UserBooKBuy;
import objectRepository.GoldBharat_UserLoginPage;
@Listeners(genericUtility.ListnersImplementationClass.class)
public class User_BookBuy extends User_LoginPage{

@Test
public void BookBuytest() throws Exception {
	ScreenRecorderUtil.startRecord("BookBuytest");
			//GoldBharat_LoginPage loginPage = new GoldBharat_LoginPage(driver);
			GoldBharat_UserBooKBuy BookGold=new GoldBharat_UserBooKBuy(driver);
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
			Thread.sleep(5000);	
			BookGold.getBookGoldBtn().click();;
			Thread.sleep(3000);
			BookGold.clickOnQuantity();
			Thread.sleep(3000);
			
	        Select quantitydropdown = new Select(BookGold.getquantitydropdown());
			quantitydropdown.selectByVisibleText("100 Grams");
			Thread.sleep(2000);		
			BookGold.getenterrate().click();;
	        String goldliverate = BookGold.getliveprice().getText();
	        goldliverate = goldliverate.replaceAll("[^\\d.]", "");
	        try {
	        if (goldliverate.contains(".")) {  
	        	goldliverate = goldliverate.split("\\.")[0];
	        }
	        int goldnumber = Integer.parseInt(goldliverate);
	        goldnumber = goldnumber - 2;
	        String goldnumberString = Integer.toString(goldnumber);
	        BookGold.getenterrate().click();
	        BookGold.getenterrate().sendKeys(goldnumberString);
	            }
	         catch (NumberFormatException e) {
	           
	            System.out.println("Exception occurred: " + e.getMessage());
	        }
		 Thread.sleep(3000);
		 BookGold.getenterrate().sendKeys(Keys.TAB, Keys.ENTER);;
	     Thread.sleep(7000);
	 	 wUtility.takeScreenShot(driver, "OrderPlaces") ;
	 	 driver.findElement(By.xpath("//button[@class='buy-gold-btn ng-star-inserted']")).click();
	 	 Thread.sleep(3000);
	 	 driver.findElement(By.xpath("(//select[@formcontrolname='quantity_purchased'])[4]")).sendKeys("100 Grams");
	     Thread.sleep(6000);
	     driver.findElement(By.xpath("(//button[.=' Buy '])[2]")).click();
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("//img[@class='goldsikkaimage']")).click();
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("//p[.='Orders']")).click();
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("//button[.='Update Payment']")).click();
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\Pavan\\Downloads\\Invoice_48-Ronak-Panchal_pages-to-jpg-0001.jpg");
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("//input[@placeholder='Enter transaction id']")).sendKeys("12345678");
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("//button[.=' Upload ']")).click();
	     Thread.sleep(3000);
	     BookGold.getLiveRateshome();
	     Thread.sleep(3000);
	     BookGold.clickOnNotificationbell();
	 			boolean isClickable = BookGold.isNotificationbellClickable();
	 			wUtility.takeScreenShot(driver, "Notificationbell") ;
	 			if (isClickable) {
	 				System.out.println(" Notification bell icon successfully clickable");
	 			} else {

	 				System.out.println("Notification bell icon is not clickable.");
	 			}
	 			Thread.sleep(3000);
	 			driver.navigate().refresh();
	 			BookGold.clickOnNotificationbell();
	 			BookGold.getProfileIcon().click();
	 			Thread.sleep(2000);
	 			BookGold.getOrders().click();
	 			Thread.sleep(5000);
	 			BookGold.getProfileIcon().click();
	 			Thread.sleep(2000);
	 			BookGold.getLogoutBtn().click();
	 			Thread.sleep(2000);
	 			BookGold.getOkBtn().click();
	 			driver.quit();
	 			ScreenRecorderUtil.stopRecord();
	 			
		}

	
	}
	 	
