package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoldBharat_UserOrderPick {
	
	@FindBy(xpath="//img[@class='goldsikkaimage']")private WebElement ProfileIcon;
	@FindBy(xpath="//p[.='Orders']")private WebElement Orders;
	@FindBy(xpath="(//p[@class='psubmited ng-star-inserted'])[1]")private WebElement ConformpaymentBtn;
	@FindBy(xpath="//button[@class='login-btn ng-star-inserted']")private WebElement SubmitBtn;
	@FindBy(xpath="//select[@class='input-filed']")private WebElement OrderPick;
	@FindBy(xpath="//input[@placeholder=' Enter Your Name']")private WebElement Name;
	@FindBy(xpath="//input[@placeholder=' Enter Your Number']")private WebElement Number;
	@FindBy(xpath="//input[@placeholder='Ex:Aadhar/Pan/License']")private WebElement ID;
	@FindBy(xpath="//input[@class='input-filed']")private WebElement UploadID;
	@FindBy(xpath="//button[.='Submit']")private WebElement Submit;
	@FindBy(xpath="(//button[@class='btn-close'])[3]")private WebElement CloseBtn;
	@FindBy(xpath="//p[.='Log Out']")private WebElement LogoutBtn;
	@FindBy(xpath="//button[.='Ok']")private WebElement OkBtn;
	
	public GoldBharat_UserOrderPick(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getProfileIcon() {
		return ProfileIcon;
	}
	public WebElement getOrders() {
		return Orders;
	}
	public WebElement getOrderPick() {
		return OrderPick;
	}
	public WebElement getName() {
		return Name;
	}
	public WebElement getNumber() {
		return Number;
	}
	public WebElement getID() {
		return ID;
	}
	public WebElement getUploadID() {
		return UploadID;
	}
	public WebElement getSubmit() {
		return Submit;
	}
	public WebElement getLogoutBtn() {
		return LogoutBtn;
	}
	public WebElement getOkBtn() {
		return OkBtn;
	}
	public WebElement getConformpaymentBtn() {
		return ProfileIcon;
	}
	public WebElement getSubmitBtn() {
		return ProfileIcon;
	}
	public WebElement getCloseBtn() {
		return CloseBtn;
	}
	
	public void clickOnConformpaymentBtn()
	{
		ConformpaymentBtn.click();
	}
	public void clickOnOrders()
	{
		Orders.click();
	}
	public void clickOnSubmitBtn()
	{
		SubmitBtn.click();
	}
	public void clickOnCloseBtn()
	{
		CloseBtn.click();
	}
	
	
}
