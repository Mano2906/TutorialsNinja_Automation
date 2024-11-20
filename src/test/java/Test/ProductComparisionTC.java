package Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObjectModel.ProductCompare;

public class ProductComparisionTC 
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
	void prodComparision() throws InterruptedException
	{
		ProductCompare prdcmp = new ProductCompare(driver);
		//1.Enter any existing Product name into the Search text box field 
		prdcmp.sendvaluesinsearchfield("Canon EOS 5D");
		//2. Click on the button having search icon
		prdcmp.clickonsearchbutton();
		//3. Click on the Product displayed in the Search results
		prdcmp.clickonproductdisplay();
		//4. Hover the mouse cursor on 'Compare this Product' option from the displayed Product Display Page 
		prdcmp.hovercursor();
		//5.Select 'Compare this Product' option  
		prdcmp.clickoncomparethisproductbutton();
		//6.Click on 'product comparison' link from the displayed success message
		prdcmp.clickonproductcompaerlink();
	}
	
	@AfterClass
	void teardown()
	{
		driver.close();
	}

}
