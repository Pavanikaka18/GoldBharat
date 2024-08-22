package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoldBharat_AdminSelfOther {

    @FindBy(xpath="//input[@formcontrolname='userId']")private WebElement AdminUserName;
    @FindBy(xpath="//input[@formcontrolname='password']")private WebElement AdminPwd;
    @FindBy(xpath="//button[@type='submit']")private WebElement AdminLoginBtn;
    @FindBy(xpath="//span[.='Distributor Manage Order']")private WebElement ManageOrderbtn;
    @FindBy(xpath="//button[.='Himself/Herself']")private WebElement HimselfBtn;
    @FindBy(xpath="//button[.='Send OTP']")private WebElement OtpBtn;
    @FindBy(xpath="//button[@class='swal2-confirm swal2-styled swal2-default-outline']")private WebElement YesBtn;
    @FindBy(xpath="//input[@autocomplete='one-time-code']") private WebElement Btn1;
    //@FindBy(xpath="(//input[@class='otp-input ng-untouched ng-pristine ng-valid ng-star-inserted'])[1]")private WebElement Btn2;
   // @FindBy(xpath= "(//input[@class='otp-input ng-pristine ng-valid ng-star-inserted ng-touched'])[1]")private WebElement Btn3;
  //  @FindBy(xpath="(//input[@class='otp-input ng-pristine ng-valid ng-star-inserted ng-touched'])[1]")private WebElement Btn4;
  //  @FindBy(xpath="//input[@class='otp-input ng-untouched ng-pristine ng-valid ng-star-inserted']")private WebElement Btn5;
  //  @FindBy(xpath="(//input[@class='otp-input ng-pristine ng-valid ng-star-inserted ng-touched'])[2]")private WebElement Btn6;
    @FindBy(xpath="//button[@class='swal2-confirm swal2-styled swal2-default-outline']")private WebElement YesBtn1;
    @FindBy(xpath="//button[@class='logout']")private WebElement logoutBtn;
    @FindBy(xpath="//button[.='Yes']")private WebElement LogoutYesBtn;
    
    
    public GoldBharat_AdminSelfOther(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
    
    
    public WebElement getAdminUserName() {
		return AdminUserName;
    }
    public WebElement getAdminPwd() {
    	return AdminPwd;
    }
    public WebElement getAdminLoginBtn() {
    	return AdminLoginBtn;
    }
    public WebElement getManageOrderbtn() {
    	return ManageOrderbtn;
    }
    public WebElement getHimselfBtn() {
    	return HimselfBtn;
    }
    public WebElement getOtpBtn() {
    	return OtpBtn;
    }
    public WebElement getYesBtn() {
    	return YesBtn;
    }
    public WebElement getBtn1() {
    	return Btn1;
    }
   /* public WebElement getBtn2() {
    	return Btn2;
    }
    public WebElement getBtn3() {
    	return Btn3;
    }
    public WebElement getBtn4() {
    	return Btn4;
    }
    public WebElement getBtn5() {
    	return Btn5;
    }
    public WebElement getBtn6() {
    	return Btn6;
    }*/
    public WebElement getYesBtn1() {
    	return YesBtn1;
    }
    public WebElement getlogoutBtn() {
		return logoutBtn;
		}
	public WebElement getLogoutYesBtn() {
		return LogoutYesBtn;
		}
    
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
		public void clickOnManageOrderbtn()
		{
			ManageOrderbtn.click();
		}
		public void clickOnBtn1()
		{
			Btn1.click();
		}
		/*public void clickOnBtn2()
		{
			Btn2.click();
		}
		public void clickOnBtn3()
		{
			Btn3.click();
		}
		public void clickOnBtn4()
		{
			Btn4.click();
		}
		public void clickOnBtn5()
		{
			Btn5.click();
		}
		public void clickOnBtn6()
		{
			Btn6.click();
		}*/

	}

