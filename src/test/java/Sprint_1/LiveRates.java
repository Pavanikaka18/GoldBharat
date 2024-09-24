package Sprint_1;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import genericUtility.GoldBharat_BaseClass;
import genericUtility.PropertyFileUtility;
import genericUtility.ScreenRecorderUtil;
import genericUtility.WebDriverUtility;
import objectRepository.GoldBharat_UserLiveRates;

public class LiveRates  extends Login {

	PropertyFileUtility pUtil = new PropertyFileUtility();
	WebDriverUtility wUtility = new WebDriverUtility();
 
		@Test
		public void LiveRatesmethod() throws Exception   {
			ScreenRecorderUtil.startRecord("LiveRatesmethod");
			GoldBharat_UserLiveRates liverates = new GoldBharat_UserLiveRates(driver);
			 Thread.sleep(5000);
			//liverates.clickOnChart();
			try {
				liverates.clickOnChart();

			} catch (Exception e) {
				// If the regular click fails, use JavaScript to click
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", liverates.getChart());
			}

			 Thread.sleep(5000);
	        // Create an instance of the Select class
	        Select timedropdown = new Select(liverates.getTimeselect());
	        Thread.sleep(5000);
	        Select typedropdown = new Select(liverates.getTypeselect());
	        JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0, 100)");
	        // Select by visible text
	        timedropdown.selectByVisibleText("30 Minute's");  
	        typedropdown.selectByVisibleText("Gold (24Carat)"); 
	        Thread.sleep(5000);
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
	        liverates.clickOnrateAlert();
	        Select ordertypedrpdwn = new Select(liverates.getordertypedrpdwn());
	        ordertypedrpdwn.selectByVisibleText("Spot Gold");  
	        Thread.sleep(4000);
	       String goldliverate = liverates.getliveprice().getText();
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
            liverates.getenterrate().clear();;
 
            // Send the string to the input field
            liverates.getenterrate().sendKeys(goldnumberString);
	            }
	         catch (NumberFormatException e) {
	            // Handle the exception if the string cannot be parsed
	            System.out.println("Exception occurred: " + e.getMessage());
	        }

	       Thread.sleep(3000);
	       liverates.clickOncreatealert();
	       Thread.sleep(7000);
	       ordertypedrpdwn.selectByVisibleText("Spot Silver");  
	       Thread.sleep(4000);
	       String silverliverate = liverates.getliveprice().getText();
	       
	       silverliverate = silverliverate.replaceAll("[^\\d.]", "");
 
	       try {
	  	    
	              if (silverliverate.contains(".")) {
	                 
	            	  silverliverate = silverliverate.split("\\.")[0];
	              }
 
	              int silvernumber = Integer.parseInt(silverliverate);
 
	              silvernumber = silvernumber - 10;
 
	              String silvernumberString = Integer.toString(silvernumber);
 
	              liverates.getenterrate().clear();
 
	              liverates.getenterrate().sendKeys(silvernumberString);
	  	            }
	  	         catch (NumberFormatException e) {
	  	           
	  	            System.out.println("Exception occurred: " + e.getMessage());
	  	        }
	       Thread.sleep(3000);
	       liverates.clickOncreatealert();
	       Thread.sleep(7000);;
	       ScreenRecorderUtil.stopRecord();


	      
	       
	
}
}
