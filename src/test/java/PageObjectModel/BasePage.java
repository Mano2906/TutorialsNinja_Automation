package PageObjectModel;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class BasePage
	{
	//Constructor
	WebDriver driver;
	
		public BasePage(WebDriver driver)
		{
			this.driver = driver;
		}
		
		//Search Locators
		By search =By.xpath("//input[@placeholder='Search']");
		By searchButton =By.xpath("//button[@class='btn btn-default btn-lg']");
		
		// ProductCompare Locators
		By prodselect = By.xpath("//img[@title='Canon EOS 5D']");
		By img = By.xpath("//img[@class='img-responsive']");
		By Cmpthisprodbutton = By.xpath("//i[@class='fa fa-exchange']");
		By prodcomplink = By.xpath("//a[text()='product comparison']");
		
		//ForgetPassword Locators 		
		By clkmyact = By.xpath("//span[text() ='My Account']");
		By clklogin = By.xpath("//a[text() ='Login']");
		By clckfrgtpass = By.xpath("//a[text() ='Forgotten Password']");
		By mail = By.id("input-email");
		By clkcont = By.xpath("//input[@value='Continue']");
		
		// Checkout Locators 		
		By pass	= By.id("input-password");
		By login = By.id("button-login");
		By searchbutton =By.xpath("//button[@class='btn btn-default btn-lg']");
		By productdisplay = By.xpath("//img[@title='iPod Touch']");
		By scrolldown = By.xpath("//h2[text()='Products meeting the search criteria']");
		By clkatcbtn = By.id("button-cart");
		By shpgcartlink = By.xpath("//a[text()='shopping cart']");
		By chkoutbtn = By.xpath("//a[@class='btn btn-primary']");
		By billcont = By.id("button-payment-address");
		By dlvrydtlscont = By.id("button-shipping-address");
		By dlvrymtdcont = By.id("button-shipping-method");
		By trmscondchkbox = By.xpath("//input[@name='agree']");
		By pymtmtdcont = By.id("button-payment-method");
		By cnforder = By.id("button-confirm");
		
		//AddToCart Locators
		By scrolldown1 = By.xpath("//h2[text()='Products meeting the search criteria']");
		By prodselect1 = By.xpath("//img[@title='MacBook Air']");
		By addtocartbutton = By.id("button-cart");
		By shoppingcartlink = By.xpath("//a[text()='shopping cart']");
		
		
	}
