package PageObjectModel;

import static org.testng.Assert.assertFalse;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Search extends BasePage 
	{
			public Search(WebDriver driver)
			{
				super(driver);
			}
			
			
			
			//Actual method
			//Search Field Box
			public void sendvaluesinsearchfield(String prod) throws InterruptedException
			{
				Thread.sleep(4000);
				driver.findElement(search).sendKeys(prod);
			}
			//Search Button
			public void clickonsearchbutton() throws InterruptedException
			{
				Thread.sleep(2000);
				driver.findElement(searchButton).click();
			}
				
			public void sendemptyvaluesinsearch(String novalue) throws InterruptedException
			{
				Thread.sleep(2000);
				driver.findElement(search).sendKeys(novalue);
			}
			
			public void sendvaluesinsearchmulti(String multivalue) throws InterruptedException
			{
				Thread.sleep(2000);
				driver.findElement(search).sendKeys(multivalue);
			}
			
			public void clear() throws InterruptedException
			{
				Thread.sleep(2000);
				driver.findElement(search).clear();
			}
			
			public void screenshot() throws InterruptedException
			{
				Thread.sleep(2000);
				//Scroll Down script
				JavascriptExecutor js = (JavascriptExecutor) driver;
				WebElement Element = driver.findElement(By.xpath("//div[@class='product-thumb']"));
				// Scrolling down the page till the element is found		
		        js.executeScript("arguments[0].scrollIntoView();", Element);
		        Thread.sleep(2000);
		        
				TakesScreenshot ts = (TakesScreenshot)driver;  //Typecasted
			    File sourcelocation = ts.getScreenshotAs(OutputType.FILE);
			    File targetlocation = new File("D:\\STS\\Selenium_TutorialNinja_Project\\Screenshot\\searchAutomation_1.png");
			    sourcelocation.renameTo(targetlocation);
//			    //Assertion
//			    Boolean verifySearch1 = driver.getTitle().equalsIgnoreCase("Shoes");
//			    assertFalse(verifySearch1);
			}
			
			public void screenshot2() throws InterruptedException
			{	        
				TakesScreenshot ts = (TakesScreenshot)driver;  //Typecasted
			    File sourcelocation = ts.getScreenshotAs(OutputType.FILE);
			    File targetlocation = new File("D:\\STS\\Selenium_TutorialNinja_Project\\Screenshot\\SearchNoProdAutomation_2.png");
			    sourcelocation.renameTo(targetlocation);
//			    //Assertion
//			    Boolean verifySearch2 = driver.getTitle().equalsIgnoreCase("shoes");
//			    assertFalse(verifySearch2);
			}			
			public void screenshot3() throws InterruptedException
			{	        
				TakesScreenshot ts = (TakesScreenshot)driver;  //Typecasted
			    File sourcelocation = ts.getScreenshotAs(OutputType.FILE);
			    File targetlocation = new File("D:\\STS\\Selenium_TutorialNinja_Project\\Screenshot\\SearchNullAutomation_3.png");
			    sourcelocation.renameTo(targetlocation);
//			    //Assertion
//			    Boolean verifySearch3 = driver.getTitle().equalsIgnoreCase("");
//			    assertFalse(verifySearch3);
			}
			
			public void screenshot4() throws InterruptedException
			{	        
				Thread.sleep(2000);
				//Scroll Down script
				JavascriptExecutor js = (JavascriptExecutor) driver;
				WebElement Element = driver.findElement(By.xpath("//h2[text()='Products meeting the search criteria']"));
				// Scrolling down the page till the element is found		
				js.executeScript("arguments[0].scrollIntoView();", Element);
				Thread.sleep(2000);
				
				TakesScreenshot ts = (TakesScreenshot)driver;  //Typecasted
			    File sourcelocation = ts.getScreenshotAs(OutputType.FILE);
			    File targetlocation = new File("D:\\STS\\Selenium_TutorialNinja_Project\\Screenshot\\SearchMultiProdAutomation_4.png");
			    sourcelocation.renameTo(targetlocation);
//			    //Assertion
//			    Boolean verifySearch4 = driver.getTitle().equalsIgnoreCase("mac");
//			    assertFalse(verifySearch4);
			}
	}
