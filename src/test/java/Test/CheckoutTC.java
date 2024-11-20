package Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObjectModel.Checkout;

public class CheckoutTC 
{
	WebDriver driver;

	@BeforeClass
	void setup()
	{
		
		driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	void checkout() throws InterruptedException
	{
	
		Checkout chkout = new Checkout(driver);
		//1.Enter any existing Product name into the Search text box field 
		chkout.sendvaluesinsearchfield("iPod Touch");
		//2. Click on the button having search icon
		chkout.clickonsearchbutton();
		//3. click on product display image
		chkout.productdisplay();
		//4. Click on 'Add to Cart' button on the Product displayed in the Search results
		chkout.clickaddtocartbutton();
		//5. Click on the 'shopping cart!' link in the displayed success message
		chkout.clickonshoppingcartlink();
		//6. Click on 'Checkout' button in the 'Shopping Cart' page 
		chkout.clickonchkoutbutton();
		//7. Enter the Mail id
		chkout.sendvaluesinemailfield("muralimanohar294@gmail.com");
		//8. Enter the password  
		chkout.sendvaluesinpasswordfield("qwerty1234");
		//9.Click on login button
		chkout.clickonloginbutton();
		//10. Click on 'Continue' button  
		chkout.clickoncontinuebutton();
		//11. Click on 'Continue' button  
		chkout.clickondlvrydtlscontbutton();
		//12. Click on 'Continue' button  
		chkout.clickondlvrymtdbutton();
		//13. Select the 'Terms & Conditions' check box field
		chkout.clickontermsandconditionscheckbox();
		//14.Click on 'Continue' button
		chkout.clickonpymtmtdcontbutton();
		//15. Click on 'Confirm Order' button 
		chkout.clickonconfirmorderbutton();
	}
	
	@AfterClass
	void teardown()
	{
		driver.close();
	}

}
