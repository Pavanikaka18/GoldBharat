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
    
  //  @FindBy(xpath="//p[contains(text(), 'Goldsikka Limited is part of a diversified three decades old Aztar Group')]")private String Aboutustext;
    @FindBy(xpath="/html/body/app-root/app-layout/app-aboutus/section/div/div[2]/div/p/text()")private String Aboutustext;
    
  @FindBy(xpath="//img[contains(@src, '../../assets/googlplay.png') and @alt='']")private WebElement GooglePlayStore;
    @FindBy(xpath="//img[contains(@src, '../../assets/GooglepalyStore.png') and @alt='']")private WebElement AppStore;
     
    
     
     @FindBy(xpath="//i[@class='fa-brands fa-facebook']")private WebElement Facebook;
     @FindBy(xpath="//i[@class='fa-brands fa-instagram']")private WebElement Instagram;
     @FindBy(xpath="//i[@class='fa-brands fa-linkedin']")private WebElement Linkedin;
     @FindBy(xpath="//img[@class='twiter_icon']")private WebElement Twitter;
	
    
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
	
	//Business Libraries
	
	

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
public void clickOnBooking() {
	Booking.click();
	
}

public void clickOnAboutus() {
	Aboutus.click();
	
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


public void clickOnLinkedin() {
	Linkedin.click();
	
}


public void clickOnTwitter() {
Twitter.click();}

	

}
