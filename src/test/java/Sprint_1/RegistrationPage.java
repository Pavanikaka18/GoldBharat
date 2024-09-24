package Sprint_1;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;
import org.apache.commons.math3.geometry.spherical.twod.Circle;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import com.github.dockerjava.api.model.Driver;
import org.openqa.selenium.JavascriptExecutor;
import genericUtility.ExcelFileUtility;
import genericUtility.GoldBharat_BaseClass;
import genericUtility.JavaUtility;
import genericUtility.PropertyFileUtility;
import genericUtility.ScreenRecorderUtil;
import genericUtility.WebDriverUtility;

import objectRepository.GoldBharat_UserLoginPage;
import objectRepository.GoldBharat_RegistrationPage;

public class RegistrationPage extends GoldBharat_BaseClass {

	WebDriverUtility wUtility = new WebDriverUtility();
	JavaUtility jUtility = new JavaUtility();
	ExcelFileUtility eUtility = new ExcelFileUtility();
	//WebDriver  driver=new ChromeDriver();

	public PropertyFileUtility pUtility = new PropertyFileUtility();

	@Test
	public void Registration () throws Exception
	{
		ScreenRecorderUtil.startRecord("Registration");
		GoldBharat_RegistrationPage RegistrationPage = new GoldBharat_RegistrationPage(driver);
		Thread.sleep(1000);
		
		RegistrationPage.clickOnRegisterBtn();
					Thread.sleep(1000);
				
				/*	String BusinessName = eUtility.readDataFromExcel("GoldBharat", 4, 1);
					RegistrationPage.clickOnBusinessName();
					RegistrationPage.getBusinessName().sendKeys(BusinessName);
					Thread.sleep(1000);*/
		   
			String PersonName = eUtility.readDataFromExcel("GoldBharat", 5, 1);
			RegistrationPage.clickOnPersonName();
			RegistrationPage.getPersonName().sendKeys(PersonName);
			Thread.sleep(1000);
			
			String Email = eUtility.readDataFromExcel("GoldBharat", 6, 1);
			RegistrationPage.clickOnEmail();
			RegistrationPage.getEmail().sendKeys(Email);
			Thread.sleep(1000);
			
			
			//long randomNumber = ThreadLocalRandom.current().nextLong(1000000000L, 10000000000L);
	        //String PhoneNumber = Long.toString(randomNumber);
			String PhoneNumber = eUtility.readDataFromExcel("GoldBharat", 1, 1);
			RegistrationPage.clickOnPhoneNumber ();
			RegistrationPage.getPhoneNumber().sendKeys(PhoneNumber, Keys.TAB, "07/24/2024");
			Thread.sleep(3000);
			
			//String Date = eUtility.readDataFromExcel("GoldBharat", 7, 1);
			//RegistrationPage.clickOndate();
			//RegistrationPage.getdate().sendKeys(Date);
			Thread.sleep(5000);
			RegistrationPage.getdate().sendKeys(Keys.TAB);
		
			
			String PinCode = eUtility.readDataFromExcel("GoldBharat", 8, 1);
			RegistrationPage.clickOnPinCode();
			RegistrationPage.getPinCode().sendKeys(PinCode);
			Thread.sleep(5000);
			wUtility.scrollPageDown(1);
			wUtility.scrollPageDown(3);
			RegistrationPage.clickOnCircle();
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0, 200)");
			Thread.sleep(4000);
			String businessAddress = eUtility.readDataFromExcel("GoldBharat", 9, 1);
			RegistrationPage.clickOnbusinessAddress();
			RegistrationPage.getbusinessAddress().sendKeys(businessAddress);
			Thread.sleep(5000);
			RegistrationPage.clickOnRegisterBtn2();
			Thread.sleep(3000);
			RegistrationPage.clickOnPhoneNumber ();
			RegistrationPage.getPhoneNumber().sendKeys(PhoneNumber);
			Thread.sleep(5000);
			wUtility.takeScreenShot(driver, "Registrationbeforesubmit") ;
			RegistrationPage.clickOnSubmitBtn();
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
		
		        RegistrationPage.clickOnotp1();
		        RegistrationPage.getotp1().sendKeys(otp1);
		        RegistrationPage.clickOnotp2();
		        RegistrationPage.getotp2().sendKeys(otp2);
		        RegistrationPage.clickOnotp3();
		        RegistrationPage.getotp3().sendKeys(otp3);
		        RegistrationPage.clickOnotp4();
		        RegistrationPage.getotp4().sendKeys(otp4);
		        RegistrationPage.clickOnotp5();
		        RegistrationPage.getotp5().sendKeys(otp5);
		        RegistrationPage.clickOnotp6();
		        RegistrationPage.getotp6().sendKeys(otp6);
		        Thread.sleep(4000);
		        wUtility.takeScreenShot(driver, "Registration success") ;
		        driver.close();
		        ScreenRecorderUtil.stopRecord();
	}

	
}