package objectRepository;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoldBharat_UserLTD_KYC_Page {
	 @FindBy(xpath="//img[@class='goldsikkaimage']")private WebElement ProfileIcon;
	 @FindBy(xpath="//p[@_ngcontent-ng-c3797498073='' and text()='KYC']")private WebElement KYC;
	 @FindBy(xpath = "//select[@class='my-select']")private WebElement SelectTypeDropDown;
	 @FindBy(xpath="//input[@formcontrolname='director_nameone']")private WebElement DirectorName;
	 @FindBy(xpath="//input[@formcontrolname='director_mobile']")private WebElement DirectorNum;
	 @FindBy(xpath = "//input[@formcontrolname='director_nameone']")private WebElement FirstdirectorNameEdt;
	 @FindBy(xpath = "//input[@formcontrolname='director_mobile']")private WebElement DirectorMobileNumEdit;
	 @FindBy(xpath = "//input[@formcontrolname='director_aadharone']")private WebElement DirectorAdharNumEdit;
	 @FindBy(xpath = "//input[@formcontrolname='director_aadhar_front_imageone']")private WebElement AdharFrontImg;
	 @FindBy(xpath = "//input[@formcontrolname='director_aadhar_back_imageone']")private WebElement AdharBackImg;
	 @FindBy(xpath = "//input[@formcontrolname='director_panone']")private WebElement DirectorPanNumEdit;
	 @FindBy(xpath = "//input[@formcontrolname='director_pan_imageone']")private WebElement DirectorPanImg;
	 @FindBy(xpath = "//input[@formcontrolname='director_nametwo']")private WebElement SecondDirectorNameEdit;
	 @FindBy(xpath = "//input[@formcontrolname='director_aadhartwo']")private WebElement SecondDirectorAdharNumEdit;
	 @FindBy(xpath = "//input[@formcontrolname='director_aadhar_front_imagetwo']")private WebElement SecondDirectorAdharFrontImg;
	 @FindBy(xpath = "//input[@formcontrolname='director_aadhar_back_imagetwo']")private WebElement SecondDirectorAdharBackImg;
	 @FindBy(xpath = "//input[@formcontrolname='director_pantwo']")private WebElement SecondDirectorPanNumEdit;
	 @FindBy(xpath = "//input[@formcontrolname='director_pan_imagetwo']")private WebElement SecondDirectorPanImg;
	 @FindBy(xpath = "//input[@formcontrolname='director_gst']")private WebElement SecondDirectorGSTNumEdit;
	 @FindBy(xpath = "//input[@formcontrolname='director_gst_image']")private WebElement SecondDirectorGSTImg;
	 @FindBy(xpath = "//input[@formcontrolname='director_cin']")private WebElement SecondDirectorCINNumEdit;
	 @FindBy(xpath = "//input[@formcontrolname='cin_number_image']")private WebElement SecondDirectorCINImg;
	 @FindBy(xpath = "//input[@formcontrolname='bank_name']")private WebElement DirectorBankNameEdit;
	 @FindBy(xpath = "//input[@formcontrolname='account_number']")private WebElement DirectorAccountNumEdit;
	 @FindBy(xpath = "//input[@formcontrolname='ifsc_code']")private WebElement DirectorIFSCCodeEdit;
	 @FindBy(xpath = "//input[@formcontrolname='account_holder_name']")private WebElement AccountHolderNameEdit;
	 @FindBy(xpath = "//input[@formcontrolname='profile_picture']")private WebElement DirectorImg;	 
	 @FindBy(xpath = "//button[.='Submit']")private WebElement SubmitBtn;
	 @FindBy (xpath = "//p[.='KYC']") private WebElement KycLnk;
	 @FindBy(xpath = "//option[.='LTD']")private WebElement LtdOption;
	 
	 
	 public GoldBharat_UserLTD_KYC_Page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	 public WebElement getSelectTypeDropDown() {
		return SelectTypeDropDown;
	}
	 public WebElement getFirstdirectorNameEdt() {
		return FirstdirectorNameEdt;
	}
	 public WebElement getDirectorMobileNumEdit() {
		return DirectorMobileNumEdit;
	}
	 public WebElement getDirectorAdharNumEdit() {
		return DirectorAdharNumEdit;
	}
	 public WebElement getAdharFrontImg() {
		return AdharFrontImg;
	}
	 public WebElement getAdharBackImg() {
		return AdharBackImg;
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
	 public WebElement getSecondDirectorAdharNumEdit() {
		return SecondDirectorAdharNumEdit;
	}
	 public WebElement getSecondDirectorAdharFrontImg() {
		return SecondDirectorAdharFrontImg;
	}
	 public WebElement getSecondDirectorAdharBackImg() {
		return SecondDirectorAdharBackImg;
	}
	 public WebElement getSecondDirectorPanNumEdit() {
		return SecondDirectorPanNumEdit;
	}
	 public WebElement getSecondDirectorPanImg() {
		return SecondDirectorPanImg;
	}
	 public WebElement getSecondDirectorGSTNumEdit() {
		return SecondDirectorGSTNumEdit;
	}
	 public WebElement getSecondDirectorGSTImg() {
		return SecondDirectorGSTImg;
	}
	 public WebElement getSecondDirectorCINNumEdit() {
		return SecondDirectorCINNumEdit;
	}
	 public WebElement getSecondDirectorCINImg() {
		return SecondDirectorCINImg;
	}
	 public WebElement getDirectorBankNameEdit() {
		return DirectorBankNameEdit;
	}
	 public WebElement getDirectorAccountNumEdit() {
		return DirectorAccountNumEdit;
	}
	 public WebElement getDirectorIFSCCodeEdit() {
		return DirectorIFSCCodeEdit;
	}
	 public WebElement getAccountHolderNameEdit() {
		return AccountHolderNameEdit;
	}
	 public WebElement getSubmitBtn() {
		return SubmitBtn;
	}
	 public WebElement getDirectorImg() {
			return DirectorImg;
		}
	 public WebElement getKycLnk() {
			return KycLnk;
		}
	 public WebElement getProfileIcon() {
			return ProfileIcon;
		}
	 public WebElement getLtdOption() {
			return LtdOption;
		}
	 public WebElement getDirectorName() {
			return DirectorName;
		}
	 public WebElement getDirectorNum() {
			return DirectorNum;
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






