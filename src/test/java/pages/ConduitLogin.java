package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ConduitLogin {
	WebDriver driver;
	@FindBy(xpath = "//a[text()='Login']")
	WebElement btnLogin;
	@FindBy(name = "email")
	WebElement userId;
	@FindBy(name = "password")
	WebElement pwd;
	@FindBy(xpath = "//button[text()='Login']")
	WebElement LoginBtn;
	
	public ConduitLogin(WebDriver driver) {
	  PageFactory.initElements(driver, this);
	}
  //Actions
	public void LoginIntoApp(String strUser, String strPwd) {		
		btnLogin.click();	
		userId.sendKeys(strUser);
		pwd.sendKeys(strPwd);
		LoginBtn.click();
  }
}
