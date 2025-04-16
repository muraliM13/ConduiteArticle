package stepDefs;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.internal.Utils;
import io.cucumber.datatable.DataTable;
import base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ConduitLogin;
import pages.CreateArticle;
import pages.EditArticle;
import pages.HomePage;

public class CreateArticleStepDef {
	WebDriver driver = TestBase.getDriver();
	ConduitLogin login = new ConduitLogin(driver);
	HomePage home = new HomePage(driver);
	CreateArticle article = new CreateArticle(driver); 
	EditArticle editarticle = new EditArticle(driver); 
	@Given("User is on Login Page")
	public void user_is_on_login_page() {
		 TestBase.openUrl("https://conduit-realworld-example-app.fly.dev/#/login");
	}
	@When("User provides {string} and {string}")
	public void user_provides_and(String strUsr, String strPwd)  {
		login.LoginIntoApp(strUsr, strPwd);
	}
	@Then("User should be on Home Page")
	public void user_should_be_on_home_page()	{
		home.vfyHomePage();
	}
	
	@Given("User Should be on login Page")
	public void user_should_be_on_login_page() {
		TestBase.openUrl("https://conduit-realworld-example-app.fly.dev/");//https://conduit-realworld-example-app.fly.dev/#/
		
	}
	@When("User enters Article details")
	public void user_enters_atricle_details(DataTable usrData) {
		List<List<String>> data = usrData.asLists();
		String strTitle = data.get(0).get(0);
		String strDesc = data.get(0).get(1);
		String strCont = data.get(0).get(2);
		String strTag = data.get(0).get(3);
		article.NewArticle(strTitle,strDesc,strCont,strTag);
	}
	@Then("Article must be created")
	public void article_must_be_created() {
		
	}
	@Given("User Should be on Article Page")
	public void user_should_be_on_article_page() {
		TestBase.openUrl("https://conduit-realworld-example-app.fly.dev/");
		//editarticle.ViewArticle();
		//editarticle.FindArticle();
		//editarticle.EditArticle();
	}
	@When("User enters edit Article details")
	public void user_enters_edit_atricle_details(DataTable usrData) {
		List<List<String>> data = usrData.asLists();
		String strTitle = data.get(0).get(0);
		String strDesc = data.get(0).get(1);
		String strCont = data.get(0).get(2);
		String strTag = data.get(0).get(3);
		editarticle.EditArticle(strTitle,strDesc,strCont,strTag);
	}
	@Then("Article must be edited and created")
	public void article_must_be_edited_and_created() {
		
	}
	
//	@After
//	public void attachScreen(Scenario scenario) {
//		if(scenario.isFailed()) {
//			TakesScreenshot screen = (TakesScreenshot)driver;
//			byte[] img = screen.getScreenshotAs(OutputType.BYTES);
//			scenario.attach(img,"image/png","FailedScenarioImage");
//		}
//	}

}
