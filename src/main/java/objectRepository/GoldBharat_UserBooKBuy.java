package objectRepository;

	import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class GoldBharat_UserBooKBuy {
		
		@FindBy (xpath = "//button[.='Book Gold']")private WebElement BookGoldBtn;
		@FindBy (xpath = "//button[.='Buy Gold']")private WebElement BuyGoldBtn;
		@FindBy (xpath = "//button[.='Book Silver']")private WebElement BookSilverBtn;
		@FindBy (xpath = "//button[.='Buy Silver']")private WebElement BuySilverBtn;
		@FindBy(xpath="//img[@class='goldsikkaimage']")private WebElement ProfileIcon;
		@FindBy(xpath="//select[@formcontrolname='quantity_purchased'][1]")private WebElement Quantity;
		@FindBy(xpath="//h4[@class='price-popup-counter'][1]")private WebElement liveprice;
		@FindBy(xpath="//select[@formcontrolname='quantity_purchased'][1]")private WebElement quantitydropdown;
		@FindBy(xpath="//input[@type='text'][1]")private WebElement enterrate;
		@FindBy(xpath="(//button[.=' Book '])[1]")private WebElement Book;
		@FindBy(xpath="//button[@class='buy-gold-popup-valid ng-star-inserted'][2]")private WebElement Buy;
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
	  @FindBy(xpath="//li[@routerlink=\"/home\"]")private WebElement LiveRateshome;
		 @FindBy(xpath="//p[.='Log Out']")private WebElement LogoutBtn;
		 @FindBy(xpath="//button[.='Ok']")private WebElement OkBtn;
		 
	  
	public GoldBharat_UserBooKBuy(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		public WebElement getBookGoldBtn() {
			return BookGoldBtn;
		}
		public WebElement getLiveRateshome() {
			return LiveRateshome;
		}
		public WebElement getBuyGoldBtn() {
			return BuyGoldBtn;
		}
		public WebElement getBookSilverBtn() {
			return BookSilverBtn;
		}
		public WebElement getBuySilverBtn() {
			return BuySilverBtn;
		}
		public WebElement getProfileIcon() {
			return ProfileIcon;
		}
		public WebElement getQuantity() {
			return Quantity;
		}
		public WebElement getliveprice() {
			return liveprice;
		}
	
		public WebElement getBook() {
			return Book;
		}
		public WebElement getBuy() {
			return Buy;
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
		public void clickOnBuyGoldBtn()
		{
			BuyGoldBtn.click();
		}
		public void clickOnQuantity()
		{
			Quantity.click();
		}
		public void clickOnBookGoldBtn()
		{
			BookGoldBtn.click();
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
		public void clickOnBuy()
		{
			Buy.click();
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

		public WebElement getLogoutBtn() {
			return LogoutBtn;
		}
		public WebElement getOkBtn() {
			return OkBtn;
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
	
	
