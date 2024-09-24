package objectRepository;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoldBharat_LoginPage {

	//Finding WebElements Using @FindBy Annotations

    @FindBy(xpath="//button[@class='loginbotn']")private WebElement LoginBtn;
    @FindBy(xpath="//input[@placeholder=' Enter Your Number']")private WebElement PhnNum;
    @FindBy(xpath="//button[@type='submit']")private WebElement SubmitBtn;
    @FindBy(xpath="//ng-otp-input/div/input[1]")private WebElement otp1;
    @FindBy(xpath="//ng-otp-input/div/input[2]")private WebElement otp2;
    @FindBy(xpath="//ng-otp-input/div/input[3]")private WebElement otp3;
    @FindBy(xpath="//ng-otp-input/div/input[4]")private WebElement otp4;
    @FindBy(xpath="//ng-otp-input/div/input[5]")private WebElement otp5;
    @FindBy(xpath="//ng-otp-input/div/input[6]")private WebElement otp6;
   
        
	//Create a constructor to initialize these elements
    
	public GoldBharat_LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
    

	//Provide getters to access these variables

	public WebElement getLoginBtn() {
		return LoginBtn;
	}

	public WebElement getSubmitBtn() {
		return SubmitBtn;
	}
	public WebElement getPhnNum() {
		return PhnNum;
	}
	
	
	public WebElement getotp1() {
		return otp1;
	}
	
	public WebElement getotp2() {
		return otp2;
	}
	public WebElement getotp3() {
		return otp3;
	}
	public WebElement getotp4() {
		return otp4;
	}
	public WebElement getotp5() {
		return otp5;
	}
	public WebElement getotp6() {
		return otp6;
	}
	
	
	//Business Libraries
	
	public void clickOnLoginBtn()
	{
		LoginBtn.click();
	}
	
	public void clickOnPhnNum()
	{
		PhnNum.click();
	}
	
	public void clickOnSubmitBtn()
	{
		SubmitBtn.click();
	}
	public void clickOnotp1()
	{
		otp1.click();
	}
	
	
	public void clickOnotp2()
	{
		otp2.click();
	}
	public void clickOnotp3()
	{
		otp3.click();
	}
	public void clickOnotp4()
	{
		otp4.click();
	}
	public void clickOnotp5()
	{
		otp5.click();
	}
	public void clickOnotp6()
	{
		otp6.click();
	}


	
}
