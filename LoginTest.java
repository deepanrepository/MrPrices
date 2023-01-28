package org.Testfacebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import facebookobject.LoginObject;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
 LoginObject obj;
WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DEEPAN\\eclipse-workspace\\facebook\\src\\test\\resources\\chromedriver.exe");
		driver=new ChromeDriver();
		obj=new LoginObject(driver);
		driver.get("https://www.facebook.com/");
	
		
		
		
		

		
	}
	@Test
	public void logintesting() {
		obj.login();
		

	}
	@Test
	public void verify() {
		

	}
	

	
	
	

}
