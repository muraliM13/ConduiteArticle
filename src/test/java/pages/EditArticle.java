package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;

import base.TestBase;

public class EditArticle {
	
	//@FindBy(xpath ="//div[@class='article-actions']//a[@class='nav-link']//i[@class='ion-edit'] and contains(.,'Edit Article')")
	@FindBy(xpath = "//a[@href='#/editor/murali1']")
	WebElement editArticle;
	//@FindBy(xpath ="//button[@class='btn btn-sm' and index(.,' Edit Article']")
	//WebElement editArticle;
	//@FindBy(xpath = "//a[@class='nav-link' and href='#/editor/muraliatricle1' and contains(., ' Edit Article')]")
	//WebElement editArticle;
	//@FindBy(xpath = "//a[@class='nav-link' and contains(text(), ' Edit Article')]")
	//WebElement editArticle;
	//@FindBy(partialLinkText = " Edit Article")
	////WebElement editArticle;
	//public By editArticle =By.xpath("//div[@class='article-actions']//a[@class='nav-link'][normalize-space()='Edit Article']");
	///public By editArticle =By.xpath("//button[@class='btn btn-sm']//a[@class='nav-link'][normalize-space()='Edit Article']");
	
	//public By editArticle = By.xpath("//div[@class='article-actions']//a[@class='nav-link']//i[@class='ion-edit'] and contains(.,'Edit Article')");
	
	//@FindBy(xpath = "//i[@class='ion-compose' and contains(.,'Home')]")
	@FindBy(xpath = "//a[@aria-current='page']")
	WebElement homebtn;
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
	//
	//@FindBy(xpath = "//a[@class='preview-link' and contains(.,'Murali3')]")
	@FindBy(xpath = "//a[@href='#/article/murali3']")
	WebElement ArticleName;
	@FindBy(xpath = "//button[@class='nav-link ' and contains(.,'Global Feed')]")
	WebElement Articles;
	@FindBy(xpath = "//img[@alt='Murali']")
	WebElement myArticles;
	@FindBy(xpath = "//a[@href='#/profile/Murali']")
	WebElement myProfile;
	
	

	WebDriver driver;
	public EditArticle(WebDriver driver){
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		}
	@BeforeTest
	public void setup() {
		TestBase.openUrl("https://conduit-realworld-example-app.fly.dev/#/article/murali");
		
		//Thread.sleep(5000);
	}

	//Actions
	public void EditArticle(String strTitle, String strDescrpt, String strBody, String strTag) {// throws InterruptedException{	
		editArticle.click();
		ArticleTitle.sendKeys(strTitle);
		ArticleDescrpt.sendKeys(strDescrpt);
		ArticleBody.sendKeys(strBody);
		ArticleTag.sendKeys(strTag);
		ArticlePub.click();
		
  }
	public void ViewArticle() {// throws InterruptedException{	
		myArticles.click();
		myProfile.click();
		ArticleName.click();
	}
	public void FindArticle() {	
		JavascriptExecutor js = (JavascriptExecutor)driver; 
		js.executeScript("window.scrollBy(100, document.body.scrollHeight)");
		ArticleName.click();
	}
}
