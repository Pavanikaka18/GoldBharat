package Sprint_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import genericUtility.ScreenRecorderUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(genericUtility.ListnersImplementationClass.class)
@Test
public class Negative_KYC {
	public static void main(String[] args)throws Exception {
		ScreenRecorderUtil.startRecord("main");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://goldbharat.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='loginbotn']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder=' Enter Your Number']")).sendKeys("6309631698");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='ng-otp-input-wrapper wrapper ng-star-inserted']")).sendKeys("123456");
		driver.findElement(By.xpath("(//div[@class='bookgold-main-btn ng-star-inserted'])[2]//button[.='Book Silver']")).click();
		Thread.sleep(3000);
	    driver.findElement(By.xpath("(//select[@class='formselect-gold ng-untouched ng-pristine ng-invalid'])[3]")).click();
		Thread.sleep(3000);
        driver.findElement(By.xpath("(//select[@formcontrolname='quantity_purchased'])[3]")).sendKeys("500 Grams");
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//input[@placeholder='Enter your amount'])[2]")).click();
		driver.close();
		ScreenRecorderUtil.stopRecord();
	}

	
	}


