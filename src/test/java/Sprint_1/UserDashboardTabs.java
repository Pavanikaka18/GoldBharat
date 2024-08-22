package Sprint_1;

import java.io.IOException;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import genericUtility.GoldBharat_BaseClass;
import genericUtility.PropertyFileUtility;
import genericUtility.WebDriverUtility;
import objectRepository.GoldBharat_UserDashboard;
import java.time.Duration;
import genericUtility.GoldBharat_BaseClass;
import objectRepository.GoldBharat_UserLoginPage;
public class UserDashboardTabs extends Login {
PropertyFileUtility pUtil = new PropertyFileUtility();
WebDriverUtility wUtility = new WebDriverUtility();

	@Test
	public void UserDashboardTab() throws InterruptedException, IOException {
	GoldBharat_UserDashboard Header = new GoldBharat_UserDashboard(driver);
	Header.clickOnLiveRates();
	 Thread.sleep(2000);
	wUtility.takeScreenShot(driver, "LiveRates") ;
    Thread.sleep(2000);
    Header.clickOnAboutus();
    Thread.sleep(2000);
    wUtility.takeScreenShot(driver, "AboutUs") ;
    Thread.sleep(7000);
    Header.clickOnProducts();
    Thread.sleep(2000);
    wUtility.takeScreenShot(driver, "Products") ;
    Thread.sleep(7000);
    Header.clickOnLocateUs();
    Thread.sleep(2000);
    wUtility.takeScreenShot(driver, "LocateUs") ;
    Thread.sleep(7000);
    Header.clickOnPrivacyPolicy();
    Thread.sleep(1000);
    wUtility.takeScreenShot(driver, "LocateUs") ;
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(250, 250)");
    Thread.sleep(1000);
    js.executeScript("window.scrollBy(250, 250)");
    Thread.sleep(1000);
    js.executeScript("window.scrollBy(250, 250)");
    Thread.sleep(1000);
    js.executeScript("window.scrollBy(250, 250)");
    Thread.sleep(7000);
    GoldBharat_UserDashboard Userdashboard = new GoldBharat_UserDashboard(driver);
		try {
			Userdashboard.clickOnChart();

		} catch (Exception e) {
			// If the regular click fails, use JavaScript to click
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", Userdashboard.getChart());
		}
		 Thread.sleep(2000);
        // Create an instance of the Select class
        Select timedropdown = new Select(Userdashboard.getTimeselect());
        Thread.sleep(2000);
        Select typedropdown = new Select(Userdashboard.getTypeselect());
      
		js.executeScript("window.scrollBy(0, 100)");
        // Select by visible text
        timedropdown.selectByVisibleText("30 Minute's");  
        typedropdown.selectByVisibleText("Gold (24Carat)"); 
        Thread.sleep(2000);
        wUtility.takeScreenShot(driver, "30 Minute's-24 carat") ;

        timedropdown.selectByVisibleText("30 Minute's");  
        typedropdown.selectByVisibleText("Gold (22Carat)"); 
        Thread.sleep(5000);
        wUtility.takeScreenShot(driver, "30 Minute's-22 carat") ;

        timedropdown.selectByVisibleText("30 Minute's");  
        typedropdown.selectByVisibleText("Silver"); 
        Thread.sleep(5000);
        wUtility.takeScreenShot(driver, "30 Minute's-Silver") ;

        timedropdown.selectByVisibleText("15 Minute's");  
        typedropdown.selectByVisibleText("Gold (24Carat)"); 
        Thread.sleep(5000);
        wUtility.takeScreenShot(driver, "15 Minute's-Gold (24Carat)") ;

        timedropdown.selectByVisibleText("15 Minute's");  
        typedropdown.selectByVisibleText("Gold (22Carat)"); 
        Thread.sleep(5000);
        wUtility.takeScreenShot(driver, "15 Minute's-Gold (22Carat)") ;

        timedropdown.selectByVisibleText("15 Minute's"); 
        typedropdown.selectByVisibleText("Silver"); 
        Thread.sleep(5000);
        wUtility.takeScreenShot(driver, "15 Minute's-Silver") ;


        /*RateAlert*/
        
		Thread.sleep(3000);
		Userdashboard.clickOnrateAlert();
        Select ordertypedrpdwn = new Select(Userdashboard.getordertypedrpdwn());
        ordertypedrpdwn.selectByVisibleText("Spot Gold");  
        Thread.sleep(4000);
       String goldliverate = Userdashboard.getliveprice().getText();
       // Remove any non-numeric characters except for the decimal point
        goldliverate = goldliverate.replaceAll("[^\\d.]", "");
        try {
      // Check if the string contains a decimal point
        if (goldliverate.contains(".")) {
            // Split the string at the decimal point and take only the integer part
        	goldliverate = goldliverate.split("\\.")[0];
        }

        // Convert the cleaned string to an integer
        int goldnumber = Integer.parseInt(goldliverate);

        // Subtract 10 from the integer number
        goldnumber = goldnumber - 10;

        // Convert the integer number to a string
        String goldnumberString = Integer.toString(goldnumber);

        // Clear the input field before sending the value
        Userdashboard.getenterrate().clear();;

        // Send the string to the input field
        Userdashboard.getenterrate().sendKeys(goldnumberString);
            }
         catch (NumberFormatException e) {
            // Handle the exception if the string cannot be parsed
            System.out.println("Exception occurred: " + e.getMessage());
        }

       Thread.sleep(3000);
       Userdashboard.clickOncreatealert();
       Thread.sleep(7000);
       ordertypedrpdwn.selectByVisibleText("Spot Silver");  
       Thread.sleep(4000);
       String silverliverate = Userdashboard.getliveprice().getText();
       // Remove any non-numeric characters except for the decimal point
       silverliverate = silverliverate.replaceAll("[^\\d.]", "");

       try {
  	     // Check if the string contains a decimal point
              if (silverliverate.contains(".")) {
                  // Split the string at the decimal point and take only the integer part
            	  silverliverate = silverliverate.split("\\.")[0];
              }

              // Convert the cleaned string to an integer
              int silvernumber = Integer.parseInt(silverliverate);

              // Subtract 10 from the integer number
              silvernumber = silvernumber - 10;

              // Convert the integer number to a string
              String silvernumberString = Integer.toString(silvernumber);

              // Clear the input field before sending the value
              Userdashboard.getenterrate().clear();

              // Send the string to the input field
              Userdashboard.getenterrate().sendKeys(silvernumberString);
  	            }
  	         catch (NumberFormatException e) {
  	            // Handle the exception if the string cannot be parsed
  	            System.out.println("Exception occurred: " + e.getMessage());
  	        }
       Thread.sleep(3000);
       Userdashboard.clickOncreatealert();

       Thread.sleep(7000);;
//Margin
       Userdashboard.clickOnMargin();
       Select selecttypedrpdwn = new Select(Userdashboard.getMargindropdown());
        selecttypedrpdwn.selectByValue("Gold");  
        Thread.sleep(4000);
        wUtility.takeScreenShot(driver, "Gold Margin") ;
        selecttypedrpdwn.selectByValue("Silver");
        Thread.sleep(3000);
        wUtility.takeScreenShot(driver, "Silver Margin") ;
		Thread.sleep(2000);
		Userdashboard.clickOnNotificationbell();
		boolean isClickable = Userdashboard.isNotificationbellClickable();
		wUtility.takeScreenShot(driver, "Notificationbell") ;
		if (isClickable) {
			System.out.println(" Notification bell icon successfully clickable");
		} else {

			System.out.println("Notification bell icon is not clickable.");
		}

		Thread.sleep(3000);
		driver.navigate().refresh();
		Userdashboard.clickOnNotificationbell();
		Thread.sleep(7000);
		Userdashboard.clickOnBooking();
		Thread.sleep(2000);
		wUtility.takeScreenShot(driver, "Booking") ;
		js.executeScript("window.scrollBy(0, 100)");
		// Initialize WebDriverWait with a duration
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Thread.sleep(3000);
		
		try {
			wait.until(ExpectedConditions.visibilityOf(Userdashboard.getXyug()));
			// Wait until the element is clickable
			wait.until(ExpectedConditions.elementToBeClickable(Userdashboard.getXyug()));

			// Scroll the element into view using JavaScript
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
					Userdashboard.getXyug());

			Thread.sleep(7000);
			try {
				Userdashboard.clickOnXyug();
				wUtility.takeScreenShot(driver, "Xyug Technologies") ;

			} catch (Exception e) {
				// If the regular click fails, use JavaScript to click
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", Userdashboard.getXyug());
			}
			Thread.sleep(7000);
			js.executeScript("window.history.back()");
			Thread.sleep(7000);
		} catch (Exception e) {
			// Handle any exceptions
			System.out.println("Exception occurred: " + e.getMessage());
		}
		js.executeScript("window.scrollBy(0, 1000)");

		try {
			wait.until(ExpectedConditions.visibilityOf(Userdashboard.getFacebook()));
			// Wait until the element is clickable
			wait.until(ExpectedConditions.elementToBeClickable(Userdashboard.getFacebook()));

			// Scroll the element into view using JavaScript
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
					Userdashboard.getFacebook());

			Thread.sleep(7000);
			try {
				Userdashboard.clickOnFacebook();
				Userdashboard.clickOnFacebookClose();
				wUtility.takeScreenShot(driver, "Facebook") ;

			} catch (Exception e) {
				// If the regular click fails, use JavaScript to click
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", Userdashboard.getFacebook());
			}
			Thread.sleep(7000);
			js.executeScript("window.history.back()");
			Thread.sleep(7000);
		} catch (Exception e) {
			// Handle any exceptions
			System.out.println("Exception occurred: " + e.getMessage());
		}
		js.executeScript("window.scrollBy(0, 1000)");

		try {
			wait.until(ExpectedConditions.visibilityOf(Userdashboard.getInstagram()));
			// Wait until the element is clickable
			wait.until(ExpectedConditions.elementToBeClickable(Userdashboard.getInstagram()));

			Thread.sleep(6000);
			// Scroll the element into view using JavaScript
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
					Userdashboard.getInstagram());
			try {
				Userdashboard.clickOnInstagram();
				wUtility.takeScreenShot(driver, "Instagram") ;
			} catch (Exception e) {
				// If the regular click fails, use JavaScript to click
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", 
						Userdashboard.getInstagram());
			}
			Thread.sleep(6000);
			js.executeScript("window.history.back()");
			Thread.sleep(6000);
		} catch (Exception e) {
			// Handle any exceptions
			System.out.println("Exception occurred: " + e.getMessage());
		}
		try {
			wait.until(ExpectedConditions.visibilityOf(Userdashboard.getLinkedin()));
			// Wait until the element is clickable
			wait.until(ExpectedConditions.elementToBeClickable(Userdashboard.getLinkedin()));
			Thread.sleep(6000);
			// Scroll the element into view using JavaScript
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
					Userdashboard.getLinkedin());
			try {
				Userdashboard.clickOnLinkedin();
				wUtility.takeScreenShot(driver, "LinkedIn") ;

			} catch (Exception e) {
				// If the regular click fails, use JavaScript to click
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", Userdashboard.getLinkedin());
			}
			Thread.sleep(4000);
			js.executeScript("window.history.back()");
			Thread.sleep(4000);

		} catch (Exception e) {
			// Handle any exceptions
			System.out.println("Exception occurred: " + e.getMessage());
		}

		try {
			wait.until(ExpectedConditions.visibilityOf(Userdashboard.getTwitter()));
			// Wait until the element is clickable
			wait.until(ExpectedConditions.elementToBeClickable(Userdashboard.getTwitter()));
			// Scroll the element into view using JavaScript
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
					Userdashboard.getTwitter());
	
			Thread.sleep(4000);
			try {
				Userdashboard.clickOnTwitter();
				Userdashboard.clickOnTwitterClose();
				wUtility.takeScreenShot(driver, "Twitter") ;

			} catch (Exception e) {
				// If the regular click fails, use JavaScript to click
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", Userdashboard.getTwitter());
			}
			Thread.sleep(3000);
			js.executeScript("window.history.back()");
			Thread.sleep(3000);
			js.executeScript("window.history.back()");
			Thread.sleep(3000);

		} catch (Exception e) {
			// Handle any exceptions
			System.out.println("Exception occurred: " + e.getMessage());
		}
		try {
			wait.until(ExpectedConditions.visibilityOf(Userdashboard.getGooglePlayStore()));
			// Wait until the element is clickable
			wait.until(ExpectedConditions.elementToBeClickable(Userdashboard.getGooglePlayStore()));

			// Scroll the element into view using JavaScript
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
					Userdashboard.getGooglePlayStore());
			Thread.sleep(5000);
			try {
				Userdashboard.clickOnGooglePlayStore();
				wUtility.takeScreenShot(driver, "Playstore") ;

			} catch (Exception e) {
				// If the regular click fails, use JavaScript to click
				((JavascriptExecutor) driver).executeScript("arguments[0].click();",
						Userdashboard.getGooglePlayStore());
			}
			Thread.sleep(3000);
			js.executeScript("window.history.back()");
			Thread.sleep(3000);
		} catch (Exception e) {
			// Handle any exceptions
			System.out.println("Exception occurred: " + e.getMessage());
		}

		try {
			wait.until(ExpectedConditions.visibilityOf(Userdashboard.getAppStore()));
			// Wait until the element is clickable
			wait.until(ExpectedConditions.elementToBeClickable(Userdashboard.getAppStore()));

			// Scroll the element into view using JavaScript
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
					Userdashboard.getAppStore());
			Thread.sleep(5000);
			try {
				Userdashboard.clickOnAppStore();
				wUtility.takeScreenShot(driver, "AppStore") ;

			} catch (Exception e) {
			// If the regular click fails, use JavaScript to click
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", Userdashboard.getAppStore());
			}

			Thread.sleep(3000);
			js.executeScript("window.history.back()");
			Thread.sleep(3000);
		} catch (Exception e) {
			// Handle any exceptions
			System.out.println("Exception occurred: " + e.getMessage());
		}
		
		driver.quit();

	}
}
		

	