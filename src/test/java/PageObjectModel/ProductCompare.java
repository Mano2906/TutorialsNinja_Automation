package PageObjectModel;


import java.io.File;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ProductCompare extends BasePage{

		
		public ProductCompare(WebDriver driver)
		{
			super(driver);
		}
		
		//Actual method 
		
		
		public void sendvaluesinsearchfield(String prod) throws InterruptedException
		{
			Thread.sleep(2000);
			driver.findElement(search).sendKeys(prod);
		}
		
		public void clickonsearchbutton() throws InterruptedException
		{
			Thread.sleep(2000);
			driver.findElement(searchButton).click();
		}
		public void clickonproductdisplay() throws InterruptedException
		{
			Thread.sleep(2000);
			//Scroll Down script
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement Element = driver.findElement(prodselect);
			// Scrolling down the page till the element is found		
	        js.executeScript("arguments[0].scrollIntoView();", Element);
	        Thread.sleep(2000);
	        
	        driver.findElement(prodselect).click();
		}
		
		
		public void hovercursor() throws InterruptedException
		{
			Thread.sleep(2000);
			
			//Creating object of an Actions class
			Actions action = new Actions(driver);
			WebElement ele = driver.findElement(Cmpthisprodbutton);
			//Performing the mouse hover action on the target element.
			action.moveToElement(ele).perform();
				
		}
		
		
		public void clickoncomparethisproductbutton() throws InterruptedException
		{
			Thread.sleep(2000);
			driver.findElement(Cmpthisprodbutton).click();
		}
		public void clickonproductcompaerlink() throws InterruptedException
		{
			Thread.sleep(2000);
			driver.findElement(prodcomplink).click();
			 Thread.sleep(2000);
		        
				TakesScreenshot ts = (TakesScreenshot)driver;  //Typecasted
			    File sourcelocation = ts.getScreenshotAs(OutputType.FILE);
			    File targetlocation = new File("D:\\STS\\Selenium_TutorialNinja_Project\\Screenshot\\ProductCompareAutomation_1.png");
			    sourcelocation.renameTo(targetlocation);
		}
		
}



