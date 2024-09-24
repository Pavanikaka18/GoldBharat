package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoldBharat_UserOrderDelivered {

	 @FindBy(xpath="//button[@class='logout']")private WebElement Profilebtn;
	 @FindBy(xpath="//img[@class='goldsikkaimage']")private WebElement ProfileIcon;
	 @FindBy(xpath="//p[.='Orders']")private WebElement Orders;
	 @FindBy(xpath="//p[.='Log Out']")private WebElement LogoutBtn;
	 @FindBy(xpath="//button[.='Ok']")private WebElement OkBtn;
	 
	 
	 public GoldBharat_UserOrderDelivered(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
	 public WebElement getProfileIcon() {
			return ProfileIcon;
		}
	 public WebElement getProfilebtn() {
			return Profilebtn;
		}
		public WebElement getOrders() {
			return Orders;
		}
	 
		public WebElement getLogoutBtn() {
			return LogoutBtn;
		}
		public WebElement getOkBtn() {
			return OkBtn;
		}
	 
	 
	 
	 
}
