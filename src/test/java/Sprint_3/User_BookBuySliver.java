package Sprint_3;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Sprint_2.User_LoginPage;
import genericUtility.ExcelFileUtility;
import genericUtility.PropertyFileUtility;
import genericUtility.ScreenRecorderUtil;
import genericUtility.WebDriverUtility;
import objectRepository.GoldBharat_UserBooKBuySliver;
import objectRepository.GoldBharat_UserLoginPage;
@Listeners(genericUtility.ListnersImplementationClass.class)
@Test
public class User_BookBuySliver extends User_LoginPage{
PropertyFileUtility pUtility = new PropertyFileUtility();
ExcelFileUtility eUtility=new ExcelFileUtility();
WebDriverUtility wUtility=new WebDriverUtility();
public void BookBuytest() throws Exception {
ScreenRecorderUtil.startRecord("BookBuytest");          //to start the screenrecording
GoldBharat_UserLoginPage loginPage= new GoldBharat_UserLoginPage(driver);
GoldBharat_UserBooKBuySliver BookSilver=new GoldBharat_UserBooKBuySliver(driver);
{
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
driver.findElement(By.xpath("(//div[@class='bookgold-main-btn ng-star-inserted'])[2]//button[.='Book Silver']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("(//select[@class='formselect-gold ng-untouched ng-pristine ng-invalid'])[3]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("(//select[@formcontrolname='quantity_purchased'])[3]")).sendKeys("500 Grams");
driver.findElement(By.xpath("(//input[@placeholder='Enter your amount'])[2]")).click();	
String Sliverliverate = driver.findElement(By.xpath("(//h4[@class='price-popup-counter-second'])[2]")).getText();
Sliverliverate = Sliverliverate.replaceAll("[^\\d.]", "");
try {
if (Sliverliverate.contains(".")) {  
	Sliverliverate = Sliverliverate.split("\\.")[0];
}
int Slivernumber = Integer.parseInt(Sliverliverate);
Slivernumber = Slivernumber - 2;
String SlivernumberString = Integer.toString(Slivernumber);
driver.findElement(By.xpath("(//input[@placeholder='Enter your amount'])[2]")).click();
driver.findElement(By.xpath("(//input[@placeholder='Enter your amount'])[2]")).sendKeys(SlivernumberString);
    }
 catch (NumberFormatException e) {
   
    System.out.println("Exception occurred: " + e.getMessage());
}
Thread.sleep(3000);
driver.findElement(By.xpath("//button[@type='submit']")).sendKeys(Keys.ENTER);;
Thread.sleep(2000);
wUtility.takeScreenShot(driver, "OrderPlaces") ;
Thread.sleep(3000);
driver.findElement(By.xpath("//li[.=' Live Rates ']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//button[.='Buy Silver']")).click();
Thread.sleep(3000);
//driver.findElement(By.xpath("(//select[@class='formselect-gold ng-pristine ng-invalid ng-touched'])[2]")).sendKeys("1000 Grams");
driver.findElement(By.xpath("(//select[@formcontrolname='quantity_purchased'])[2]")).sendKeys("1000 Grams");
Thread.sleep(6000);
driver.findElement(By.xpath("(//button[.=' Buy '])[1]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//img[@class='goldsikkaimage']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//p[.='Orders']")).click();
Thread.sleep(8000);
driver.findElement(By.xpath("//select[@class='formselect-gold-value']")).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
Thread.sleep(8000);
driver.navigate().refresh();
Thread.sleep(8000);
driver.findElement(By.xpath("//button[.='Update Payment']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\Pavan\\Downloads\\Invoice_48-Ronak-Panchal_pages-to-jpg-0001.jpg");
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@placeholder='Enter transaction id']")).sendKeys("12345678");
Thread.sleep(3000);
driver.findElement(By.xpath("//button[.=' Upload ']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//li[.=' Live Rates ']")).click();
//  BookSilver.getLiveRateshome();		     
Thread.sleep(3000);
driver.findElement(By.xpath("//div[@class='icon-container']")).click();
driver.navigate().refresh();
Thread.sleep(8000);
}
driver.quit();
ScreenRecorderUtil.stopRecord();		
}
}				
		 	
