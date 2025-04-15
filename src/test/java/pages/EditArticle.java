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
	
	@FindBy(xpath ="//div[@class='article-actions']//a[@class='nav-link']//i[@class='ion-edit'] and contains(.,'Edit Article')")
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
	
	@FindBy(xpath = "//i[@class='ion-compose' and contains(.,'Home')]")
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
	
	@FindBy(xpath = "//a[@class='preview-link' and contains(.,'MuraliAtricle1')]")
	WebElement ArticleName;
	@FindBy(linkText = "Global Feed")
	WebElement Articles;
	@FindBy(xpath = "//img[@alt='Murali']")
	WebElement myArticles;
	//@FindBy(xpath = "//div[@class='dropdown-menu'] and contains(text(),'Profile']")
	@FindBy(xpath = "//a[@class='author'] and contains(.,'Murali']")
	WebElement myProfile;
	

	
	public EditArticle(WebDriver driver){
		PageFactory.initElements(driver, this);
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		}
	@BeforeTest
	public void setup() throws InterruptedException {
		TestBase.openUrl("https://conduit-realworld-example-app.fly.dev/#/profile/Murali");
		Thread.sleep(5000);
	}
//	@BeforeTest
//	public void setup() throws InterruptedException {
//		TestBase.openUrl("https://conduit-realworld-example-app.fly.dev/#/login");
//		loginPage.LoginIntoApp("murali123.muluka@gmail.com", "AyaanSri@143#");
//		Thread.sleep(5000);
//	}
	//Actions
	public void EditArticle(String strTitle, String strDescrpt, String strBody, String strTag) {// throws InterruptedException{	
		//myArticles.click();
		myProfile.click();
		ArticleName.click();
		editArticle.click();
		ArticleTitle.sendKeys(strTitle);
		ArticleDescrpt.sendKeys(strDescrpt);
		ArticleBody.sendKeys(strBody);
		ArticleTag.sendKeys(strTag);
		ArticlePub.click();
		
  }
	public void ViewArticle() {// throws InterruptedException{	
		homebtn.click();
		Articles.click();
		ArticleName.click();
	}
}
