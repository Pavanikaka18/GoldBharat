package Sprint_3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import Sprint_2.User_LoginPage;
import genericUtility.ExcelFileUtility;
import genericUtility.PropertyFileUtility;
import genericUtility.WebDriverUtility;
import objectRepository.GoldBharat_UserBooKBuySliver;
import objectRepository.GoldBharat_UserLoginPage;
		public class User_BookBuySliver extends User_LoginPage{
			PropertyFileUtility pUtility = new PropertyFileUtility();
			ExcelFileUtility eUtility=new ExcelFileUtility();
			WebDriverUtility wUtility=new WebDriverUtility();
			@Test
			public void BookBuytest() throws Exception {
				GoldBharat_UserBooKBuySliver BookSilver=new GoldBharat_UserBooKBuySliver();
				Thread.sleep(5000);	
				driver.findElement(By.xpath("//div[@class='bookgold-main-btn ng-star-inserted']//button)[3]")).click();
				//BookSilver. clickOnBookSilverBtn();
				//Thread.sleep(3000);
				BookSilver.clickOnQuantity();
				Thread.sleep(3000);
		        Select quantitydropdown = new Select(BookSilver.getquantitydropdown());
				quantitydropdown.selectByVisibleText("500 Grams");
				Thread.sleep(2000);		
				BookSilver.getenterrate().click();;
		        String goldliverate = BookSilver.getliveprice().getText();
		        goldliverate = goldliverate.replaceAll("[^\\d.]", "");
		        try {
		        if (goldliverate.contains(".")) {  
		        	goldliverate = goldliverate.split("\\.")[0];
		        }
		        int goldnumber = Integer.parseInt(goldliverate);
		        goldnumber = goldnumber - 2;
		        String goldnumberString = Integer.toString(goldnumber);
		        BookSilver.getenterrate().click();
		        BookSilver.getenterrate().sendKeys(goldnumberString);
		            }
		         catch (NumberFormatException e) {
		           
		            System.out.println("Exception occurred: " + e.getMessage());
		        }
			 Thread.sleep(3000);
			 BookSilver.getenterrate().sendKeys(Keys.TAB, Keys.ENTER);;
		     Thread.sleep(7000);
		 	 wUtility.takeScreenShot(driver, "OrderPlaces") ;
		     Thread.sleep(7000);
		  	wUtility.takeScreenShot(driver, "OrderPlaces") ;
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
		     BookSilver.getLiveRateshome();
		     Thread.sleep(3000);
		     BookSilver.clickOnNotificationbell();
		 			boolean isClickable = BookSilver.isNotificationbellClickable();
		 			wUtility.takeScreenShot(driver, "Notificationbell") ;
		 			if (isClickable) {
		 				System.out.println(" Notification bell icon successfully clickable");
		 			} else {

		 				System.out.println("Notification bell icon is not clickable.");
		 			}
		 			Thread.sleep(3000);
		 			driver.navigate().refresh();
		 			BookSilver.clickOnNotificationbell();
			}

		
		}
		 	


