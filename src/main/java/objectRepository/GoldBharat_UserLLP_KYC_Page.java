package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoldBharat_UserLLP_KYC_Page {
	@FindBy (xpath = "//option[.='LLP']") private WebElement LlpLnk;
	@FindBy(xpath="//img[@class='goldsikkaimage']")private WebElement ProfileIcon;
	 @FindBy(xpath="//p[@_ngcontent-ng-c3797498073='' and text()='KYC']")private WebElement KYC;
	 @FindBy(xpath = "//select[@class='my-select']")private WebElement SelectTypeDropDown;
	@FindBy (xpath = "//input[@formcontrolname='director_name']") private WebElement DirectorNameEdt;
	@FindBy (xpath = "//input[@formcontrolname='director_mobile']") private WebElement DirectorMobileNumEdt;
	@FindBy (xpath = "//input[@formcontrolname='director_aadhar']") private WebElement DirectorAdharNumEdt;
	@FindBy (xpath = "//input[@formcontrolname='director_aadhar_front_image']") private WebElement DirectorAdharFrontImgLnk;
	@FindBy (xpath = "//input[@formcontrolname='director_aadhar_back_image']") private WebElement DirectorAdharBackImgLnk;
	@FindBy (xpath = "//input[@formcontrolname='director_pan']") private WebElement DirectorPanEdt;
	@FindBy (xpath = "//input[@formcontrolname='director_pan_image']") private WebElement DirectorPanImg;
	@FindBy (xpath = "//input[@formcontrolname='director_gst']") private WebElement DirectorGstNumEdt;
	@FindBy (xpath = "//input[@formcontrolname='director_gst_image']") private WebElement DirectorGstImg;
	@FindBy (xpath = "//input[@formcontrolname='director_cin']") private WebElement DirectorCinNumEdt;
	@FindBy (xpath = "//input[@formcontrolname='cin_number_image']") private WebElement DirectorCinImg;
	@FindBy (xpath = "//input[@formcontrolname='profile_picture']") private WebElement DirectorImg;
	@FindBy (xpath = "//input[@formcontrolname='bank_name']") private WebElement BankNameEdt;
	@FindBy (xpath = "//input[@formcontrolname='account_number']") private WebElement AccountNumberEdt;
    @FindBy (xpath = "//input[@formcontrolname='ifsc_code']") private WebElement IfscCodeEdt;
    @FindBy (xpath = "//input[@formcontrolname='account_holder_name']") private WebElement AccountHolderNameEdt;
    @FindBy (xpath = "//button[.='Submit']") private WebElement SubmitBtn;
    
    
    public GoldBharat_UserLLP_KYC_Page(WebDriver driver) {
    	PageFactory.initElements(driver,this);
	}

    public WebElement getProfileIcon() {
    	return ProfileIcon;
    }
    public WebElement getKYC() {
    	return KYC;
    }
    public WebElement getSelectTypeDropDown() {
    	return SelectTypeDropDown;
    }
	public WebElement getLlpLnk() {
		return LlpLnk;
	}
	public WebElement getDirectorNameEdt() {
		return DirectorNameEdt;
	}
	public WebElement getDirectorMobileNumEdt() {
		return DirectorMobileNumEdt;
	}
	public WebElement getDirectorAdharNumEdt() {
		return DirectorAdharNumEdt;
	}
	public WebElement getDirectorAdharFrontImgLnk() {
		return DirectorAdharFrontImgLnk;
	}
	public WebElement getDirectorAdharBackImgLnk() {
		return DirectorAdharBackImgLnk;
	}
	public WebElement getDirectorPanEdt() {
		return DirectorPanEdt;
	}
	public WebElement getDirectorPanImg() {
		return DirectorPanImg;
	}
	public WebElement getDirectorGstNumEdt() {
		return DirectorGstNumEdt;
	}
	public WebElement getDirectorGstImg() {
		return DirectorGstImg;
	}
	public WebElement getDirectorCinNumEdt() {
		return DirectorCinNumEdt;
	}
	public WebElement getDirectorCinImg() {
		return DirectorCinImg;
	}
	public WebElement getDirectorImg() {
		return DirectorImg;
	}
	public WebElement getBankNameEdt() {
		return BankNameEdt;
	}
	public WebElement getAccountNumberEdt() {
		return AccountNumberEdt;
	}
	public WebElement getIfscCodeEdt() {
		return IfscCodeEdt;
	}
	public WebElement getAccountHolderNameEdt() {
		return AccountHolderNameEdt;
	}
	public WebElement getSubmitBtn() {
		return SubmitBtn;
	}
	
	
}


