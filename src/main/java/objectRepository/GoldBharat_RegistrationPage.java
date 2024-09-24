package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoldBharat_RegistrationPage {

	//Finding WebElements Using @FindBy Annotations

    @FindBy(xpath="//button[@class='registerbotn']")private WebElement RegisterBtn;
    @FindBy(xpath="//input[@formcontrolname='businessName']")private WebElement BusinessName;
    @FindBy(xpath="//input[@formcontrolname='personName']")private WebElement PersonName;
    @FindBy(xpath="//input[@formcontrolname='email']")private WebElement Email;
    @FindBy(xpath="//input[@formcontrolname='phone']")private WebElement PhoneNumber;
    @FindBy(xpath="//input[@formcontrolname='establishedDate']")private WebElement date;  
   @FindBy(xpath="//input[@formcontrolname='pincode']")private WebElement PinCode;
   @FindBy(xpath="/html/body/app-root/app-register/section/div/div/div/form/div[9]/div[1]/p[2]/input")private WebElement Circle;
   @FindBy(xpath="//textarea[@formcontrolname='businessAddress']")private WebElement businessAddress;
   @FindBy(xpath="//button[contains(text(), 'Register')]")private WebElement RegisterBtn2;
   @FindBy(xpath="//input[@formcontrolname='phone']")private WebElement Phonenum;
   @FindBy(xpath="//button[@type='submit']")private WebElement SubmitBtn;
   @FindBy(xpath="//button[@type='submit']")private WebElement Register;
    @FindBy(xpath="//ng-otp-input/div/input[1]")private WebElement otp1;
    @FindBy(xpath="//ng-otp-input/div/input[2]")private WebElement otp2;
    @FindBy(xpath="//ng-otp-input/div/input[3]")private WebElement otp3;
    @FindBy(xpath="//ng-otp-input/div/input[4]")private WebElement otp4;
    @FindBy(xpath="//ng-otp-input/div/input[5]")private WebElement otp5;
    @FindBy(xpath="//ng-otp-input/div/input[6]")private WebElement otp6;
    
       
     
	//Create a constructor to initialize these elements
    
	public GoldBharat_RegistrationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
    

	//Provide getters to access these variables

	public WebElement getRegisterBtn() {
		return RegisterBtn;
	}

	public WebElement getBusinessName() {
		return BusinessName;
	}
	
	public WebElement getPersonName() {
		return PersonName;
	}
	public WebElement getEmail() {
		return Email;
	}
	public WebElement getPhoneNumber() {
		return PhoneNumber;
	}
	public WebElement getdate() {
		return date;
	}
	public WebElement getPinCode() {
		return PinCode;
	}
	
	public WebElement getbusinessAddress() {
		return businessAddress;
	}
	public WebElement getRegister() {
		return Register;
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
	
	public void clickOnRegisterBtn()
	{
		RegisterBtn.click();
	}
	
	public void clickOnBusinessName()
	{
		BusinessName.click();
	}
	
	public void clickOnPersonName()
	{
		PersonName.click();
	}
	public void clickOnEmail()
	{
		Email.click();
	}
	public void PhoneNumber()
	{
		PhoneNumber.click();
	}

	public void clickOndate()
	{
		date.click();
	}
	public void clickOnPinCode()
	{
		PinCode.click();
	}
	public void clickOnCircle()
	{
		Circle.click();
	}
	
	public void clickOnbusinessAddress()
	{
		businessAddress.click();
	}
	public void clickOnRegisterBtn2()
	{
		RegisterBtn2.click();
	}


	public void clickOnPhoneNumber() {
		// TODO Auto-generated method stub
		
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
