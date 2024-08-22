package objectRepository;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoldBharat_UserPvtLtd_KYC_Page {
	      @FindBy(xpath="//img[@class='goldsikkaimage']")private WebElement ProfileIcon;
	      @FindBy(xpath="//p[@_ngcontent-ng-c3797498073='' and text()='KYC']")private WebElement KYC;
	      @FindBy(xpath = "//select[@class='my-select']")private WebElement SelectTypeDropDown;
		// @FindBy(xpath = "//option[.='Select Type']")private WebElement SelectTypeDropDown;
		 @FindBy(xpath = "//option[.='Pvt LTD']")private WebElement PvtltdOption;
		 @FindBy(xpath = "//input[@formcontrolname='director_nameone']")private WebElement DirectorNameEdit;
		 @FindBy(xpath = "//input[@formcontrolname='director_mobile']")private WebElement DirectorMobileEdit;
		 @FindBy(xpath = "//input[@formcontrolname='director_aadharone']")private WebElement DirectorAdharNumEdit;
		 @FindBy(xpath = "//input[@formcontrolname='director_aadhar_front_imageone']")private WebElement UploadAdharFrontImg;
		 @FindBy(xpath = "//input[@formcontrolname='director_aadhar_back_imageone']")private WebElement UploadAdharBackImg;
		 @FindBy(xpath = "//input[@formcontrolname='director_panone']")private WebElement DirectorPanNumEdit;
		 @FindBy(xpath = "//input[@formcontrolname='director_pan_imageone']")private WebElement DirectorPanImg;
		 @FindBy(xpath = "//input[@formcontrolname='director_nametwo']")private WebElement SecondDirectorNameEdit;
		 @FindBy(xpath = "//input[@formcontrolname='director_aadhartwo']")private WebElement SecondDirectorAdharEdit;
		 @FindBy(xpath = "//input[@formcontrolname='director_aadhar_front_imagetwo']")private WebElement secondDirectorFrontAdharImg;
		 @FindBy(xpath = "//input[@formcontrolname='director_aadhar_back_imagetwo']")private WebElement secondDirectorBackAdharImg;
		 @FindBy(xpath = "//input[@formcontrolname='director_pantwo']")private WebElement SecondDirectorPanNumEdit;
		 @FindBy(xpath = "//input[@formcontrolname='director_pan_imagetwo']")private WebElement SecondDirectorPanImg;
		 @FindBy(xpath = "//input[@formcontrolname='director_gst']")private WebElement DirectorGSTNumEdit;
		 @FindBy(xpath = "//input[@formcontrolname='director_gst_image']")private WebElement DirectorGSTImg;
		 @FindBy(xpath = "//input[@formcontrolname='director_cin']")private WebElement DirectorCINNumEdit;
		 @FindBy(xpath = "//input[@formcontrolname='cin_number_image']")private WebElement DirectorCINImg;;
		 @FindBy(xpath = "//input[@formcontrolname='profile_picture']")private WebElement UploadYourImg;;
		 @FindBy(xpath = "//input[@formcontrolname='bank_name']")private WebElement BankNameEdit;
		 @FindBy(xpath = "//input[@formcontrolname='account_number']")private WebElement AccountNumEdit;
		 @FindBy(xpath = "//input[@formcontrolname='ifsc_code']")private WebElement IFSCCodeEdit;
		 @FindBy(xpath = "//input[@formcontrolname='account_holder_name']")private WebElement AccountHolderNameEdit;
		 @FindBy(xpath = "//button[.='Submit']")private WebElement SubmitBtn;
		@FindBy(xpath="//p[.='Log Out']")private WebElement LogoutBtn;
		@FindBy(xpath="//button[.='Ok']")private WebElement OkBtn;
			

		 
		 
		 public GoldBharat_UserPvtLtd_KYC_Page(WebDriver driver) {
			 PageFactory.initElements(driver,this);
		}

		public WebElement getSelectTypeDropDown() {
			return SelectTypeDropDown;
		}
		public WebElement getProfileIcon() {
			return ProfileIcon;
		}
		public WebElement getPvtltdOption() {
			return PvtltdOption;
		}
		public WebElement getKYC() {
			return KYC;
		}
		public WebElement getDirectorNameEdit() {
			return DirectorNameEdit;
		}
		public WebElement getDirectorMobileEdit() {
			return DirectorMobileEdit;
		}
		public WebElement getDirectorAdharNumEdit() {
			return DirectorAdharNumEdit;
		}
		public WebElement getUploadAdharFrontImg() {
			return UploadAdharFrontImg;
		}
		public WebElement getUploadAdharBackImg() {
			return UploadAdharBackImg;
		}
		public WebElement getDirectorPanNumEdit() {
			return DirectorPanNumEdit;
		}
		public WebElement getDirectorPanImg() {
			return DirectorPanImg;
		}
		public WebElement getSecondDirectorNameEdit() {
			return SecondDirectorNameEdit;
		}
		public WebElement getSecondDirectorAdharEdit() {
			return SecondDirectorAdharEdit;
		}
		public WebElement getSecondDirectorFrontAdharImg() {
			return secondDirectorFrontAdharImg;
		}
		public WebElement getSecondDirectorBackAdharImg() {
			return secondDirectorBackAdharImg;
		}
		public WebElement getSecondDirectorPanNumEdit() {
			return SecondDirectorPanNumEdit;
		}
		public WebElement getSecondDirectorPanImg() {
			return SecondDirectorPanImg;
		}
		public WebElement getDirectorGSTNumEdit() {
			return DirectorGSTNumEdit;
		}
		public WebElement getDirectorGSTImg() {
			return DirectorGSTImg;
		}
		public WebElement getDirectorCINNumEdit() {
			return DirectorCINNumEdit;
		}
		public WebElement getDirectorCINImg() {
			return DirectorCINImg;
		}
		public WebElement getUploadYourImg() {
			return UploadYourImg;
		}
		public WebElement getBankNameEdit() {
			return BankNameEdit;
		}
		public WebElement getAccountNumEdit() {
			return AccountNumEdit;
		}
		public WebElement getIFSCCodeEdit() {
			return IFSCCodeEdit;
		}
		public WebElement getAccountHolderNameEdit() {
			return AccountHolderNameEdit;
		}
		public WebElement getSubmitBtn() {
			return SubmitBtn;
		}
		public WebElement getLogoutBtn() {
			return LogoutBtn;
		}
		public WebElement getOkBtn() {
			return OkBtn;
		}
	public void clickOnKYC() {
			
			KYC.click();
		}
	public boolean isKYCClickable() {
			try {
				return true;
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			// TODO Auto-generated method stub
			return false;
	}
}


