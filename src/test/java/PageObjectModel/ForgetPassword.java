package PageObjectModel;

import org.openqa.selenium.WebDriver;


public class ForgetPassword extends BasePage {

	public ForgetPassword(WebDriver driver)
	{
		super(driver);
	}
	
		//ActualMethod
		
		public void clickonmyaccount() throws InterruptedException 
		{
			Thread.sleep(2000);
			driver.findElement(clkmyact).click();
		}
		public void clickonlogin() throws InterruptedException
		{
			Thread.sleep(2000);
			driver.findElement(clklogin).click();
		}
		public void clickonforgetpasswordlink() throws InterruptedException
		{
			Thread.sleep(2000);
			driver.findElement(clckfrgtpass).click();
		}
		public void sendvaluesinemail(String email) throws InterruptedException
		{
			Thread.sleep(2000);
			driver.findElement(mail).sendKeys(email);;
		}
		public void clickoncontinue() throws InterruptedException
		{
			Thread.sleep(2000);
			driver.findElement(clkcont).click();
		}
}
