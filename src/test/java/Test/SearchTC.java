package Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObjectModel.Search;



public class SearchTC 
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
	void searchTest() throws InterruptedException
	{
		Search s = new Search(driver);
		//1. Enter any existing product name into the 'Search' text box field.
		s.sendvaluesinsearchfield("iphone");
		//2.Click on the button having search icon.
		s.clickonsearchbutton();
		//Scrolling Down to the product 
		s.screenshot();
		//This line of script is used to clear the search bar.
		s.clear();
		//3.Enter non existing product name into the 'Search' text box field - <Refer Test Data>
		s.sendvaluesinsearchfield("Shoes");
		//4.Click on the button having search icon 
		s.clickonsearchbutton();
		//Screenshot for non product in Website 
		s.screenshot2();
		s.clear();
		//5. Don't enter anything into the 'Search' text box field 
		s.sendemptyvaluesinsearch("");
		//6.Click on the button having search icon 
		s.clickonsearchbutton();
		//Screenshot for no value given in search
		s.screenshot3();
		//7. Enter the search criteria in the 'Search' text box field which can result in multiple products 
		s.sendvaluesinsearchmulti("mac");
		//Click on the button having search icon 
		s.clickonsearchbutton();
		//Screenshot for multi-value displayed 
		s.screenshot4();
		}
	
	@AfterClass
	void teardown()
	{
		driver.close();
	}

}
