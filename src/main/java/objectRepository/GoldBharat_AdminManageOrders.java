package objectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoldBharat_AdminManageOrders {

	//Finding WebElements Using @FindBy Annotations

   @FindBy(xpath="//input[@formcontrolname='userId']")private WebElement AdminUserName;
   @FindBy(xpath="//input[@formcontrolname='password']")private WebElement AdminPwd;
   @FindBy(xpath="//button[@type='submit']")private WebElement AdminLoginBtn;
   @FindBy(xpath="//span[.='Distributor Manage Order']")private WebElement ManageOrderbtn; 
  @FindBy(xpath="//button[@class='btn btn-success']")private WebElement Accept;  
  @FindBy(xpath="//button[@class='logout']")private WebElement Profilebtn;
  @FindBy(xpath="//button[@class='swal2-confirm swal2-styled swal2-default-outline']")private WebElement Yes;
  @FindBy(xpath="(//button[.='Inprocess'])[1]")private WebElement InprocessBtn;
  @FindBy(xpath="(//button[.='Confirm Payment'])[1]")private WebElement ConfirmPaymentBtn;
  @FindBy(xpath="//button[.='Accept']")private WebElement AcceptBtn;
  @FindBy(xpath="(//button[.='Verify Order'])[1]")private WebElement VerifyOrderBtn;
  @FindBy(xpath="//input[@id='message']")private WebElement MessageField;
  @FindBy(xpath="(//input[@class='swal2-input'])[2]")private WebElement DateField;
  @FindBy(xpath="//button[@class='swal2-confirm swal2-styled swal2-default-outline']")private WebElement YesBtn;//confirm Dispatch
  @FindBy(xpath="//button[@class='logout']")private WebElement logoutBtn;
  @FindBy(xpath="//button[@class='swal2-confirm swal2-styled swal2-default-outline']")private WebElement LogoutYesBtn;
  //Create a constructor to initialize these elements
    
	public GoldBharat_AdminManageOrders(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
    
	//Provide getters to access these variables

	public WebElement getAdminUserName() {
		return AdminUserName;
	}
	public WebElement getMessageField() {
	return MessageField;
	}
	public WebElement getlogoutBtn() {
		return logoutBtn;
		}
	public WebElement getLogoutYesBtn() {
		return LogoutYesBtn;
		}
	public WebElement getVerifyOrderBtn() {
		return VerifyOrderBtn;
	}
	public WebElement getDateField() {
		return DateField;
	}
	public WebElement getYesBtn() {
		return YesBtn;
	}

	public WebElement getAdminPwd() {
		return AdminPwd;
	}
	public WebElement getAdminLoginBtn() {
		return AdminLoginBtn;
	}
	public WebElement getInprocessBtn() {
		return InprocessBtn;
	}

	public WebElement getManageOrderbtn() {
		return ManageOrderbtn;
	}
	public WebElement getConfirmPaymentBtn() {
		return ConfirmPaymentBtn;
	}
	public WebElement getAcceptBtn() {
		return AcceptBtn;
	}
	//Business Libraries
	
	public void clickOnAdminUserName()
	{
		AdminUserName.click();
	}
	
	public void clickOnAdminPwd()
	{
		AdminPwd.click();
	}
	
	public void clickOnAdminLoginBtn()
	{
		AdminLoginBtn.click();
	}
public WebElement getProfilebtn()
{
	return Profilebtn;
}
public WebElement getYes()
{
	return Yes;
}
public void clickOnProfilebtn()
{
	Profilebtn.click();
}
public void clickOnMessageField()
{
	MessageField.click();
}
public void clickOnYes()
{
	Yes.click();
}
public void clickOnYesBtn()
{
	YesBtn.click();
}
public void clickOnVerifyOrderBtn()
{
	VerifyOrderBtn.click();
}
public void clickOnInprocessBtn()
{
	InprocessBtn.click();
}

public void clickOnConfirmPaymentBtn()
{
	ConfirmPaymentBtn.click();
}
public void clickOnAcceptBtn()
{
	AcceptBtn.click();
}
public void clickOnAccept()
{
	Accept.click();
}
public void clickOnManageOrderbtn()
{
	ManageOrderbtn.click();
}

}
