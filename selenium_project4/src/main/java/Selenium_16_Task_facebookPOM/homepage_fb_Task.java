package Selenium_16_Task_facebookPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AmazonPOM.javascriptproject2;

public class homepage_fb_Task {
WebDriver driver;
	@FindBy(name = "email") WebElement emailfield;
	@FindBy(name = "pass") WebElement passwordfield;
	@FindBy(name = "login")WebElement login;

public  void   emailfieldbox(String email) throws InterruptedException {
			emailfield.click();
		Thread.sleep(2000);
		
		emailfield.clear();
		
		emailfield.sendKeys(email);
		Thread.sleep(1000);
	}
	public   void    passwordfieldbox(String password) throws InterruptedException {
		passwordfield.click();
	Thread.sleep(1000);
	passwordfield.sendKeys(password);
	Thread.sleep(1000);
	}
public   void   loginbutton() throws InterruptedException {
		
		login.click();
		Thread.sleep(1000);
		
		}
	public   homepage_fb_Task(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}



	}
