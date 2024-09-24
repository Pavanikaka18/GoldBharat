package GoldBharat;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import genericUtility.GoldBharat_BaseClass;
import genericUtility.PropertyFileUtility;
import genericUtility.WebDriverUtility;
import objectRepository.GoldBharat_UserDashboard;
import java.time.Duration;
import genericUtility.GoldBharat_BaseClass;
import objectRepository.GoldBharat_LoginPage;

public class UserDashboardTabs extends GoldBharat_BaseClass {

	PropertyFileUtility pUtil = new PropertyFileUtility();
	WebDriverUtility wUtility = new WebDriverUtility();
	@Test
	public void UserDashboardTab() throws InterruptedException, IOException {

		GoldBharat_UserDashboard Userdashboard = new GoldBharat_UserDashboard(driver);

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

		Userdashboard.clickOnNotificationbell();

		Userdashboard.clickOnLiveRates();
		wUtility.takeScreenShot(driver, "Liverates") ;

		Thread.sleep(7000);

		Userdashboard.clickOnBooking();
		
		Thread.sleep(2000);
		wUtility.takeScreenShot(driver, "Booking") ;

		Userdashboard.clickOnAboutus();

		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 1000)");

		// Initialize WebDriverWait with a duration
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		Thread.sleep(3000);

		try {
			wait.until(ExpectedConditions.visibilityOf(Userdashboard.getFacebook()));
			// Wait until the element is clickable
			wait.until(ExpectedConditions.elementToBeClickable(Userdashboard.getFacebook()));

			// Scroll the element into view using JavaScript
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
					Userdashboard.getFacebook());
			Thread.sleep(3000);
			try {
				Userdashboard.clickOnFacebook();

			} catch (Exception e) {
				// If the regular click fails, use JavaScript to click
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", Userdashboard.getFacebook());
			}

			Thread.sleep(3000);
			js.executeScript("window.history.back()");
			Thread.sleep(3000);
		} catch (Exception e) {
			// Handle any exceptions
			System.out.println("Exception occurred: " + e.getMessage());
		}

		js.executeScript("window.scrollBy(0, 1000)");

		try {
			wait.until(ExpectedConditions.visibilityOf(Userdashboard.getInstagram()));
			// Wait until the element is clickable
			wait.until(ExpectedConditions.elementToBeClickable(Userdashboard.getInstagram()));
			Thread.sleep(3000);
			// Scroll the element into view using JavaScript
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
					Userdashboard.getInstagram());

			try {
				Userdashboard.clickOnInstagram();

			} catch (Exception e) {
				// If the regular click fails, use JavaScript to click
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", Userdashboard.getInstagram());
			}
			Thread.sleep(3000);
			js.executeScript("window.history.back()");
			Thread.sleep(3000);
		} catch (Exception e) {
			// Handle any exceptions
			System.out.println("Exception occurred: " + e.getMessage());
		}

		try {
			wait.until(ExpectedConditions.visibilityOf(Userdashboard.getLinkedin()));
			// Wait until the element is clickable
			wait.until(ExpectedConditions.elementToBeClickable(Userdashboard.getLinkedin()));
			Thread.sleep(3000);
			// Scroll the element into view using JavaScript
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
					Userdashboard.getLinkedin());

			try {
				Userdashboard.clickOnLinkedin();

			} catch (Exception e) {
				// If the regular click fails, use JavaScript to click
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", Userdashboard.getLinkedin());
			}

			Thread.sleep(4000);
			js.executeScript("window.history.back()");
			Thread.sleep(3000);

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
			Thread.sleep(3000);
			try {
				Userdashboard.clickOnTwitter();

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
			Thread.sleep(3000);
			try {
				Userdashboard.clickOnGooglePlayStore();

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
			Thread.sleep(3000);
			try {
				Userdashboard.clickOnAppStore();

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
