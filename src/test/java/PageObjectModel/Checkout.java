package PageObjectModel;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Checkout extends BasePage 
{

	public Checkout(WebDriver driver)
	{
		super(driver);
	}
			public void sendvaluesinsearchfield(String prod) throws InterruptedException
			{
				Thread.sleep(3000);
				driver.findElement(search).sendKeys(prod);
			}
			
			public void clickonsearchbutton() throws InterruptedException
			{
				Thread.sleep(3000);
				driver.findElement(searchbutton).click();
			}
			
			public void productdisplay() throws InterruptedException
			{
				Thread.sleep(2000);
				//Scroll Down script
				JavascriptExecutor js = (JavascriptExecutor) driver;
				WebElement Element = driver.findElement(scrolldown);
				// Scrolling down the page till the element is found		
		        js.executeScript("arguments[0].scrollIntoView();", Element);
		        Thread.sleep(2000);
		        
		        driver.findElement(productdisplay).click();
			}
			
			public void clickaddtocartbutton() throws InterruptedException
			{
				Thread.sleep(3000);
				driver.findElement(clkatcbtn).click();
			}
			
			public void clickonshoppingcartlink() throws InterruptedException
			{
				Thread.sleep(3000);
				driver.findElement(shpgcartlink).click();;
			}
			
			public void clickonchkoutbutton() throws InterruptedException
			{
				Thread.sleep(2000);
				//Scroll Down script
				JavascriptExecutor js = (JavascriptExecutor) driver;
				WebElement Element = driver.findElement(chkoutbtn);
				// Scrolling down the page till the element is found		
		        js.executeScript("arguments[0].scrollIntoView();", Element);
		        Thread.sleep(2000);
	
				driver.findElement(chkoutbtn).click();
			}
			
			public void sendvaluesinemailfield(String email) throws InterruptedException
			{
				Thread.sleep(3000);
				driver.findElement(mail).sendKeys(email);
			}
			
			public void sendvaluesinpasswordfield(String password) throws InterruptedException
			{
				Thread.sleep(3000);
				driver.findElement(pass).sendKeys(password);
			}
			
			public void clickonloginbutton() throws InterruptedException
			{
				Thread.sleep(3000);
				driver.findElement(login).click();
			}
			
			public void clickoncontinuebutton() throws InterruptedException
			{
				Thread.sleep(2000);
				//Scroll Down script
				JavascriptExecutor js = (JavascriptExecutor) driver;
				WebElement Element = driver.findElement(billcont);
				// Scrolling down the page till the element is found		
		        js.executeScript("arguments[0].scrollIntoView();", Element);
		        Thread.sleep(2000);
				
				driver.findElement(billcont).click();
			}
			
			public void clickondlvrydtlscontbutton() throws InterruptedException
			{
				Thread.sleep(2000);		        
				driver.findElement(dlvrydtlscont).click();
			}
			
			public void clickondlvrymtdbutton() throws InterruptedException
			{
				Thread.sleep(2000);
				driver.findElement(dlvrymtdcont).click();
			}
			
			public void clickontermsandconditionscheckbox() throws InterruptedException
			{
				Thread.sleep(2000);
				driver.findElement(trmscondchkbox).click();
			}
			
			public void clickonpymtmtdcontbutton() throws InterruptedException
			{
				Thread.sleep(3000);
				driver.findElement(pymtmtdcont).click();
			}
			
			public void clickonconfirmorderbutton() throws InterruptedException
			{
				Thread.sleep(2000);
				driver.findElement(cnforder).click();
			}
}
