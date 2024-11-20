package Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObjectModel.AddToCart;


public class AddToCartTC 
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
	void addToCartTest() throws InterruptedException
	{
		AddToCart adtc = new AddToCart(driver);
		//1.Enter any existing Product name into the Search text box field
		adtc.sendvaluesinsearchfield("MacBook Air");
		//2. Click on the button having search icon
		adtc.clickonsearchbutton();
		//3.Click on the Product displayed in the Search results
		adtc.clickonproductdisplay();
		//4.Click on 'Add to Cart' button in the displayed 'Product Display' page
		adtc.clickonaddtocartbutton();
		//5.Click on the 'shopping cart!' link in the displayed success message
		adtc.clickonshoppingcartlink();
	}
	
	@AfterClass
	void teardown()
	{
		driver.close();
	}
 }
