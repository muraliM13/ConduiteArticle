package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteArticle {

	//@FindBy(xpath = "//a[@class='nav-link' and href='#/editor/muraliatricle1' and contains(., ' Edit Article')]")
		//WebElement editArticle;
		//@FindBy(xpath = "//a[@class='nav-link' and contains(text(), ' Edit Article')]")
		//WebElement editArticle;
		@FindBy(partialLinkText = " Edit Article")
		WebElement editArticle;
		
		@FindBy(xpath = "//a[@class='nav-link active' and contains(.,'Home')]")
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
		
		public DeleteArticle(WebDriver driver){
			PageFactory.initElements(driver, this);
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
			}

		//Actions
		public void DeleteArticle() {
			homebtn.click();
			Articles.click();
			ArticleName.click();
			editArticle.click();
		}
	}
