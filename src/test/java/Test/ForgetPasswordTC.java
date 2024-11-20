package Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import PageObjectModel.ForgetPassword;


public class ForgetPasswordTC {
	
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
	void ForgetPassword() throws InterruptedException
	{
	
		ForgetPassword fgpass = new ForgetPassword(driver);
		//1. Click on My Account in Home Page
		fgpass.clickonmyaccount();
		//2.Click on the Login Link in the drop down
		fgpass.clickonlogin();
		//3.Click on 'Forgotten Password' link from Login page
		fgpass.clickonforgetpasswordlink();
		//4.Enter the email address of an existing account for which you have forgot the password 
		fgpass.sendvaluesinemail("muralimanohar294@gmail.com");
		//5. Click on 'Continue' button 
		fgpass.clickoncontinue();
	}
	
	@AfterClass
	void teardown()
	{
		driver.close();
	}
}
