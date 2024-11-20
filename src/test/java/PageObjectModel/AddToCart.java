package PageObjectModel;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class AddToCart extends BasePage
{

	public AddToCart(WebDriver driver)
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
		WebElement Element = driver.findElement(scrolldown1);
		// Scrolling down the page till the element is found		
        js.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(2000);
		driver.findElement(prodselect1).click();
	}
	
	public void clickonaddtocartbutton() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(addtocartbutton).click();
	}
	
	public void clickonshoppingcartlink() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(shoppingcartlink).click();
		Thread.sleep(2000);
	}
}
