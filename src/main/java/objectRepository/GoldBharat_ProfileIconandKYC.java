package objectRepository;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoldBharat_ProfileIconandKYC {

	//Finding WebElements Using @FindBy Annotations

	  @FindBy(xpath="//img[@class='goldsikkaimage']")private WebElement ProfileIcon;
	    @FindBy(xpath="//p[@_ngcontent-ng-c3797498073='' and text()='KYC']")private WebElement KYC;
	    @FindBy(xpath="//button[@class='btn-close']")private WebElement Close;
	    
	    
	    @FindBy(xpath="//input[@formcontrolname='proprietor_name']")private WebElement ProprietorName;
	    @FindBy(xpath="//input[@formcontrolname='proprietor_pan']")private WebElement ProprietorPan;
	   @FindBy(xpath="//input[@formcontrolname='proprietor_pan_image']")private WebElement proprietor_pan_image;
	   @FindBy(xpath="//input[@formcontrolname='proprietor_gst_image']")private WebElement proprietor_gst_image;
	   
	  	    @FindBy(xpath="//input[@formcontrolname='proprietor_gst']")private WebElement ProprietorGSTNO;
	    @FindBy(xpath="//input[@formcontrolname='bank_name']")private WebElement BankName;
	    @FindBy(xpath="//input[@formcontrolname='account_number']")private WebElement AccountNumber;
	    @FindBy(xpath="//input[@formcontrolname='ifsc_code']")private WebElement IFSCCode;
	    @FindBy(xpath="//input[@formcontrolname='account_holder_name']")private WebElement HolderName;
	
	    

		
		public GoldBharat_ProfileIconandKYC(WebDriver driver) {
			PageFactory.initElements(driver, this);
			// TODO Auto-generated constructor stub
		}
		public WebElement getKYC() {
			return KYC;
		}
		public WebElement getclose() {
			return Close;
		}
		
		
		public WebElement getProprietorName() {
			return ProprietorName;
		}
		public WebElement getProprietorPan() {
			return ProprietorPan;
		}
		
		public WebElement getproprietor_pan_image() {
			return proprietor_pan_image;
		}
		public WebElement getProfileIcon() {
			return ProfileIcon;
		}
		public WebElement getproprietor_gst_image() {
			return proprietor_gst_image;
		}
		
		public WebElement getProprietorGSTNO() {
			return ProprietorGSTNO;
		}
		public WebElement getBankName() {
			return BankName;
		}
		public WebElement getAccountNumber() {
			return AccountNumber;
		}
		public WebElement getIFSCCode() {
			return IFSCCode;
		}
		public WebElement getHolderName() {
			return HolderName;
		}
	//Business Libraries
	
		public boolean isProfileIconClickable() {
			try {
				return true;
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			// TODO Auto-generated method stub
			return false;
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
	public void clickOnclose() {
			
			Close.click();
		}

		public Object navigate() {
			// TODO Auto-generated method stub
			return null;
		}
		
		
		

		public void clickOnProprietorName() {
			ProprietorName.click();
			
			
		}


		public void clickOnProprietorPan() {
			ProprietorPan.click();
			
		}
		

		public void clickOnProprietorGSTNO() {
			
			ProprietorGSTNO.click();
			// TODO Auto-generated method stub
			
		}


		public void clickOnBankName() {
		BankName.click();
			
		}


		public void clickOnAccountNumber() {
			
			AccountNumber.click();
		}

		
public void clickOnproprietor_gst_image() {
			
			proprietor_gst_image.click();
			
			
		}
		public void clickOnProfileIcon() {
			
			ProfileIcon.click();
			
			
		}
		
public void clickOnproprietor_pan_image() {
			
	proprietor_pan_image.click();
			
			
		}
		
		public void clickOnIFSCCode() {
			IFSCCode.click();
			
		}
		public void clickOnHolderName() {
			HolderName.click();
			
		}

	
	

}
