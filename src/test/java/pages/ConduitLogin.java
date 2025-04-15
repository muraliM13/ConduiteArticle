package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ConduitLogin {
	WebDriver driver;
	@FindBy(name = "email")
	WebElement userId;
	@FindBy(name = "password")
	WebElement pwd;
	@FindBy(xpath = "//button[@class='btn btn-lg btn-primary pull-xs-right']")
	WebElement btnLogin;
	
	public ConduitLogin(WebDriver driver) {
	  PageFactory.initElements(driver, this);
	}
  //Actions
	public void LoginIntoApp(String strUser, String strPwd) {		
		userId.sendKeys(strUser);
		pwd.sendKeys(strPwd);
	 	btnLogin.click();	  
  }
}
