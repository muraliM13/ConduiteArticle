package pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.ConduitLogin;
import pages.CreateArticle;
import pages.DeleteArticle;
import pages.EditArticle;
import pages.ViewArticle;

public class CreateArticleTest {
	WebDriver driver;
	ConduitLogin loginPage;
	CreateArticle createArticle;
	ViewArticle viewArticle;
	EditArticle editArticle;
	DeleteArticle deleteAtricle;

	public CreateArticleTest(){
		TestBase.initDriver();
		driver = TestBase.getDriver();
		loginPage = new ConduitLogin(driver); 	
		createArticle = new CreateArticle(driver);
		viewArticle = new ViewArticle(driver);
		editArticle = new EditArticle(driver);
		deleteAtricle = new DeleteArticle(driver);
	}
	@BeforeTest
	public void setup() throws InterruptedException {
		TestBase.openUrl("https://conduit-realworld-example-app.fly.dev/#/login");
		loginPage.LoginIntoApp("murali123.muluka@gmail.com", "AyaanSri@143#");
		Thread.sleep(5000);
	}
	@Test (priority=1)
	public void createNewArticle() {
		createArticle.NewArticle("MuraliAtricle1","Hi This is Murali","Creating a NEW ARTICLE","Article1");
	//	Assert.assertTrue(createArticle.isSubmitFails());
	}
	@Test (priority=2)
	public void editArticle() {
//		viewArticle.ViewArticle();
		editArticle.EditArticle("MuraliAtricle1","Selenium is one of the most widely used open source Web UI (User Interface) automation testing suite.","editing a ARTICLE","Article2");
    }

//	@Test (priority=2)
//	public void DeleteArticles() {
//		deleteAtricle.DeleteArticle();
//	}
	
}
