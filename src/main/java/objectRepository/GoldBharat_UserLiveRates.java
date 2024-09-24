package objectRepository;


import org.apache.poi.hssf.record.Margin;
import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
 
public class GoldBharat_UserLiveRates  {
 
	//Finding WebElements Using @FindBy Annotations
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


 
	//getters  
	
	//Create a constructor to initialize these elements
		public GoldBharat_UserLiveRates(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		public WebElement getChart() {
			return Chart;
		}
		public void clickOnChart() {
			Chart.click();

		}
		public WebElement getTimeselect() {
			return Timeselect;}
		public WebElement getTypeselect() {
			return Typeselect;}
 
		public void clickOnTimeselect() {
			Timeselect.click();
		}
		public void clickOnrateAlert() {
			rateAlert.click();
		}
 
		public WebElement getordertypedrpdwn() {
			// TODO Auto-generated method stub
			return ordertypedrpdwn;
		}
		public void clickOnordertypedrpdwn() {
			// TODO Auto-generated method stub
			ordertypedrpdwn.click();
		}
 
 
		public WebElement getliveprice() {
			// TODO Auto-generated method stub
			return liveprice;
		}
		public void clickOnliveprice() {
			// TODO Auto-generated method stub
			liveprice.click();
		}

		public WebElement getenterrate() {
			// TODO Auto-generated method stub
			return enterrate;
		}
		public WebElement getMargindropdown() {
			// TODO Auto-generated method stub
			return Margindropdown;
		}
		public void clickOnenterrate() {
			// TODO Auto-generated method stub
			enterrate.click();
		}

 
		public void clickOncreatealert() {
			// TODO Auto-generated method stub
			createalert.click();
		}
		public void clickOnMargindropdown() {
			Margindropdown.click();
			
		}
		public void clickOnMargin() {
			Margin.click();
			
		}
		


		}

	