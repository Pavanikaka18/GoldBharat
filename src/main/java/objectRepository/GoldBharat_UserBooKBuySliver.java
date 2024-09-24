package objectRepository;

	import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class GoldBharat_UserBooKBuySliver {
		
		//@FindBy(xpath="((//div[@class='bookgold-main-btn ng-star-inserted'])[2]//button)[1]")private WebElement BookSilverBtn;
		@FindBy (xpath = "(//div[@class='bookgold-main-btn ng-star-inserted']//button)[3]")private WebElement BookSilverBtn;
		@FindBy (xpath = "//button[.='Book Silver']")private WebElement BuySilverBtn;
		@FindBy(xpath="//img[@class='goldsikkaimage']")private WebElement ProfileIcon;
		@FindBy(xpath="(//select[@class='formselect-gold ng-untouched ng-pristine ng-invalid'])[3]")private WebElement Quantity;
		@FindBy(xpath="(//select[@formcontrolname='quantity_purchased'])[3]")private WebElement QuantityClick;
		@FindBy(xpath="(//h4[@class='price-popup-counter-second'])[2]")private WebElement liveprice;
		@FindBy(xpath="(//select[@formcontrolname='quantity_purchased'])[3]")private WebElement quantitydropdown;
		@FindBy(xpath="(//input[@type='text'])[2]")private WebElement enterrate;
		@FindBy(xpath="(//button[.=' Book '])[2]")private WebElement Book;
		@FindBy(xpath ="//button[.='Buy Gold']") private WebElement BuyGold;
	    @FindBy(xpath="//i[@class='fa-solid fa-bell fa-xl']")private WebElement Notificationbell;
	    @FindBy(xpath="//div[@class='power-play-div'][1]")private WebElement Orders;
	  @FindBy(xpath="//select[@class='formselect-gold-value']")private WebElement Ordertype;
	  @FindBy(xpath="//button[.='Update Payment'][1]")private WebElement Updatebtn;
	  @FindBy(xpath="//input[@class='formselect-gold ng-pristine ng-invalid ng-touched']")private WebElement choosefile;
	  @FindBy(xpath ="//input[@formcontrolname='transation_id']")private WebElement transactionid;
	  @FindBy(xpath="//button[.=' Upload ']")private WebElement Upload;
	  @FindBy(xpath="//li[.=' Live Rates ']")private WebElement LiveRates;
	  @FindBy(xpath="formselect-gold ng-untouched ng-pristine ng-invalid'][4]")private WebElement quantitydwn;
	  @FindBy(xpath="//select[@class='formselect-gold ng-untouched ng-pristine ng-invalid'][4]")private WebElement Buyquantity;
	  @FindBy(xpath="//input[@formcontrolname='transaction_image']")private WebElement transactionimagebtn;
	  @FindBy(xpath="//input[@formcontrolname='transation_id']")private WebElement trasactionidnum;
	  @FindBy(xpath="//li[@class='active']")private WebElement LiveRateshome;
	  @FindBy(xpath="//option[@value='500']")private WebElement value;
	  
	public GoldBharat_UserBooKBuySliver(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}
	public void GoldBharat_UserBooKBuy(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		public WebElement getLiveRateshome() {
			return LiveRateshome;
		}
		public WebElement getBookSilverBtn() {
			return BookSilverBtn;
		}
		public WebElement getvalue() {
			return value;
		}
		public WebElement getBuySilverBtn() {
			return BuySilverBtn;
		}
		public WebElement getBuyGold() {
			return BuyGold;
		}
		public WebElement getProfileIcon() {
			return ProfileIcon;
		}
		public WebElement getQuantity() {
			return Quantity;
		}
		public WebElement getQuantityClick() {
			return QuantityClick;
		}
		public WebElement getliveprice() {
			return liveprice;
		}
	
		public WebElement getBook() {
			return Book;
		}
		
		public WebElement getNotificationbell() {
			return Notificationbell;
		}
		public WebElement getOrders() {
			return Orders;
		}
		public WebElement getOrdertype() {
			return Ordertype;
		}
		public WebElement getUpdatebtn() {
			return Updatebtn;
		}
		public WebElement getchoosefile() {
			return choosefile;
		}
		public WebElement getquantitydwn() {
			return quantitydwn;
		}
		public WebElement gettrasactionid() {
			return transactionid;
		}
		public WebElement getLiveRates() {
			return LiveRates;
		}
		public WebElement getBuyquantity() {
			return Buyquantity;
		}
		public WebElement gettransactionimagebtn() {
			return transactionimagebtn;
		}
		public WebElement getquantitydropdown() {
			return quantitydropdown;
		}
		public WebElement gettrasactionidnum() {
			return trasactionidnum;
		}
		public WebElement getenterrate() {
			return enterrate;
		}
		
		public void clickOnQuantity()
		{
			Quantity.click();
		}
		
		public void clickOnBuySilverBtn()
		{
			BuySilverBtn.click();
		}
		public void clickOnBookSilverBtn()
		{
			BookSilverBtn.click();
		}
		public void clickOnProfileIcon()
		{
			ProfileIcon.click();
		}
		
		public void clickOnquantitydropdown()
		{
			quantitydropdown.click();
		}
		public void clickOnquantitydwn()
		{
			quantitydwn.click();
		}
		public void clickOnenterrate()
		{
			enterrate.click();
		}
		public void clickOnliveprice()
		{
			liveprice.click();
		}
		public void clickOnBook()
		{
			Book.click();
		}
		
		public void clickOnOrders()
		{
			Orders.click();
		}
		public void clickOnUpdatebtn()
		{
			Updatebtn.click();
		}
		public void clickOnOrdertype()
		{
			Ordertype.click();
		}
		public void clickOnchoosefile()
		{
			choosefile.click();
		}
		public void clickOntrasactionid()
		{
			transactionid.click();
		}
		public void clickOnUpload()
		{
			Upload.click();
		}
		public void clickOnNotificationbell()
		{
			Notificationbell.click();
		}
		public void clickOnLiveRates()
		{
			LiveRates.click();
		}
		public void clickOnBuyquantity()
		{
			Buyquantity.click();
		}
		public void clickOntransactionimagebtn()
		{
			transactionimagebtn.click();
		}
		public void clickOntrasactionidnum()
		{
			trasactionidnum.click();
		}
		public void clickOnLiveRateshome()
		{
			LiveRateshome.click();
		}
		
		public boolean isNotificationbellClickable() {
			try {
				return true;	
			} catch (Exception e) {
			}
			//Notificationbell.click();
			return false; 
		}
		public void click() {
			// TODO Auto-generated method stub
			
		}
	}
	
	


