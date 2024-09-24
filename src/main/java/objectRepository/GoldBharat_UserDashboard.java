package objectRepository;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class GoldBharat_UserDashboard {
	//Finding WebElements Using @FindBy Annotations 
    @FindBy(xpath="//i[@class='fa-solid fa-bell fa-xl']")private WebElement Notificationbell;
    @FindBy(xpath="//li[@routerlink=\"/home\"]")private WebElement LiveRates;
    @FindBy(xpath="//li[@routerlink=\"/Booking\"]")private WebElement Booking;
    @FindBy(xpath="//li[@routerlink=\"/aboutus\"]")private WebElement Aboutus;
  //@FindBy(xpath="//p[contains(text(), 'Goldsikka Limited is part of a diversified three decades old Aztar Group')]")private String Aboutustext;
    @FindBy(xpath="/html/body/app-root/app-layout/app-aboutus/section/div/div[2]/div/p/text()")private String Aboutustext;
    @FindBy(xpath="//img[contains(@src, '../../assets/googlplay.png') and @alt='']")private WebElement GooglePlayStore;
    @FindBy(xpath="//img[contains(@src, '../../assets/GooglepalyStore.png') and @alt='']")private WebElement AppStore;
    @FindBy(xpath="//i[@class='fa-brands fa-facebook']")private WebElement Facebook;
    @FindBy(xpath="//i[@class='fa-brands fa-instagram']")private WebElement Instagram;
    @FindBy(xpath="//i[@class='fa-brands fa-linkedin']")private WebElement Linkedin;
    @FindBy(xpath="//img[@class='twiter_icon']")private WebElement Twitter;
    @FindBy(xpath="//li[@routerlink='/products']")private WebElement Products;
    @FindBy(xpath="//li[@routerlink='/locateus']")private WebElement LocateUs;
    @FindBy(xpath="//li[@routerlink='/policy']")private WebElement PrivacyPolicy;
  	@FindBy(xpath="//li[@routerlink='/chart']")private WebElement Chart;
  	@FindBy(xpath="//select[@name='timeSelect']")private WebElement Timeselect;
  	@FindBy(xpath="//select[@name='typeSelect']")private WebElement Typeselect ;
  	@FindBy(xpath="//li[@routerlink='/rate-alert']")private WebElement rateAlert;
  	@FindBy(xpath="//select[@formcontrolname='order_type']")private WebElement ordertypedrpdwn;
  	@FindBy(xpath="//h6[@class='spot-para']")private WebElement liveprice;
  	@FindBy(xpath="//input[@placeholder='Enter Your Rate']")private WebElement enterrate;
  	@FindBy(xpath="//i[@class='fa-solid fa-bell fa-lg']")private WebElement createalert;
  	@FindBy(xpath="//li[@routerlink='/margin']")private WebElement Margin;
  	@FindBy(xpath="//select[@class='my-select-gold']")private WebElement Margindropdown;
  	@FindBy(xpath="//a[.=' X-YUG Technologies']")private WebElement Xyug;
	@FindBy(xpath="//div[@aria-label='Close']")private WebElement FacebookClose;
	@FindBy(xpath="//button[@aria-label='Close']")private WebElement TwitterClose;
    
	//Create a constructor to initialize these elements
    
	public  GoldBharat_UserDashboard(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//Provide getters to access these variables
	public WebElement getNotificationbell() {
		return Notificationbell;
	}
	public WebElement getLiveRates() {
		return LiveRates;
	}
	public WebElement getBooking() {
		return Booking;
	}
	public WebElement getAboutus() {
		return Aboutus;
	}
	public String getAboutustext() {
		return Aboutustext;
	}
	public WebElement getGooglePlayStore() {
		return GooglePlayStore;
	}
	public WebElement getAppStore() {
		return AppStore;
	}
	public WebElement getFacebook() {
		return Facebook;
	}
	public WebElement getInstagram() {
		return Instagram;
	}
	public WebElement getLinkedin() {
		return Linkedin;
	}
	public WebElement getTwitter() {
		return Twitter;
	}
	public WebElement getProducts() {
		return Products;
	}
	public WebElement getLocateUs() {
		return LocateUs;
	}
	public WebElement getPrivacyPolicy() {
		return PrivacyPolicy;
	}
	public WebElement getXyug() {
		return Xyug;
	}
	public WebElement getFacebookClose() {
		return FacebookClose;
	}
	public WebElement getTwitterClose() {
		return TwitterClose;
	}
	//Business Librariers
	public void clickOnNotificationbell() {
		Notificationbell.click();
	}
public boolean isNotificationbellClickable() {
		try {
			return true;	
		} catch (Exception e) {
			// TODO: handle exception
		}
		//Notificationbell.click();
		return false; 
	}
public void clickOnLiveRates() {
		LiveRates.click();	
	}
public void clickOnProducts() {
	Products.click();	
}
public void clickOnBooking() {
	Booking.click();	
}
public void clickOnAboutus() {
	Aboutus.click();	
}
public void clickOnLocateUs() {
	LocateUs.click();	
}
public void clickOnGooglePlayStore() {
	GooglePlayStore.click();
	
}
public void clickOnAppStore() {
	AppStore.click();
	
}
public void clickOnFacebook() {
	Facebook.click();
	
}
public void clickOnInstagram() {
	Instagram.click();
	
}
public void clickOnFacebookClose() {
	FacebookClose.click();
}
public void clickOnLinkedin() {
	Linkedin.click();	
}
public void clickOnTwitter() {
Twitter.click();
}
public void clickOnPrivacyPolicy() {
PrivacyPolicy.click();
}
//getters  
public WebElement getChart() {
	return Chart;
	}
//Create a constructor to initialize these elements
public void clickOnChart() {
	Chart.click();
		}
public WebElement getTimeselect() 
{
	return Timeselect;
	}
public WebElement getTypeselect() 
{
	return Typeselect;
	}
public void clickOnTimeselect() 
{
	Timeselect.click();
	}
public void clickOnrateAlert() 
{
	rateAlert.click();
		}
public WebElement getordertypedrpdwn() 
{
	// TODO Auto-generated method stub
	return ordertypedrpdwn;
		}
public void clickOnordertypedrpdwn() 
{
	// TODO Auto-generated method stub
	ordertypedrpdwn.click();
		}
public WebElement getliveprice() 
{
	// TODO Auto-generated method stub
	return liveprice;
		}
public void clickOnliveprice() 
{
	// TODO Auto-generated method stub
	liveprice.click();
		}
public WebElement getenterrate() 
{
	// TODO Auto-generated method stub
	return enterrate;
		}
public WebElement getMargindropdown() 
{
	// TODO Auto-generated method stub
	return Margindropdown;
		}
public void clickOnenterrate() 
{
	// TODO Auto-generated method stub
	enterrate.click();
		}
public void clickOncreatealert() 
{
	// TODO Auto-generated method stub
	createalert.click();
		}
public void clickOnMargindropdown() 
{
	Margindropdown.click();
		}
public void clickOnMargin() 
{
	Margin.click();	
}
public void clickOnTwitterClose() 
{
	TwitterClose.click();	
}
public void clickOnXyug()
{
	Xyug.click();
	}

}

	
























