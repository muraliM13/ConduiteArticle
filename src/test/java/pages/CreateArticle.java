package pages;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

//import base.TestBase;

public class CreateArticle {

	//@FindBy(xpath = "//a[@class='nav-link '] and //i[@class='ion-compose']")
	//@FindBy(xpath = "//ul[@class='nav navbar-nav pull-xs-right'] and a[@class='nav-link ' and contains(text(),'New Article')]")
	//@FindBy(xpath = "//a[@class='nav-link ']")
	//@FindBy(xpath = "//i[@class='ion-compose']")
	//@FindBy(css = "#/editor")
	//@FindBy(linkText = "New Article")
	//@FindBy(xpath = "//*[text()='New Article']")
	//@FindBy(xpath = "//a[@class='nav-link ' and contains(.,'New Article')]")
	@FindBy(xpath = "//a[@href='#/editor']")
	WebElement newArticle;
	@FindBy(css = "input[name='title']")
	WebElement ArticleTitle;
	@FindBy(css = "input[name='description']")
	WebElement ArticleDescrpt;
	@FindBy(css = "textarea[name='body']")
	WebElement ArticleBody;
	@FindBy(css = "input[name='tags']")
	WebElement ArticleTag;
	@FindBy(css = "button[type='submit']")
	WebElement ArticlePub;
	@FindBy(xpath = "//span[contains(text(), 'Title already exists..']")
	WebElement existMsg;
	//@FindBy(linkText = "Title already exists..")
	//WebElement existMsg;
	
	public CreateArticle(WebDriver driver){
	  PageFactory.initElements(driver, this);
		  
	}
  //Actions
	public void NewArticle(String strTitle, String strDescrpt, String strBody, String strTag) {	
		newArticle.click();
		ArticleTitle.sendKeys(strTitle);
		ArticleDescrpt.sendKeys(strDescrpt);
		ArticleBody.sendKeys(strBody);
		ArticleTag.sendKeys(strTag);
		ArticlePub.click();
		
  }
	public boolean isSubmitFails() {
		return existMsg.isDisplayed();
	}
	
}
