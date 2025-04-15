package stepDefs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateArticleStepDef {
	WebDriver driver = TestBase.getDriver();
	
	@Given("User is on Home Page")
	public void user_is_on_home_page() {
		 driver  = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.manage().window().maximize();
		 driver.get("https://conduit-realworld-example-app.fly.dev/#/login");		  
	}
	@When("")
	public void login_into_app() {
		TestBase.openUrl("https://conduit-realworld-example-app.fly.dev/#/login");
		driver.findElement(By.xpath("//a[contains(text(), 'Novels & Stories')]")).click();
	}
	@Then("Should display novel result page")
	public void should_display_novel_result_page()	{
		String strUrl = driver.getCurrentUrl();
		Assert.assertTrue(strUrl.contains("novel"));
	}
		
	@When("User search Crime & Thrillers")
	public void user_search_crime_thriller() {
		driver.findElement(By.xpath("//a[contains(text(), 'Crime & Thrillers')]")).click();
	}
	@Then("Should display Crime & Thrillers result page")
	public void should_display_crime_thrillers_result_page(){
		String strUrl = driver.getCurrentUrl();
		Assert.assertTrue(strUrl.contains("thriller"));
	}
	@After
	public void attachScreen(Scenario scenario) {
		if(scenario.isFailed()) {
			TakesScreenshot screen = (TakesScreenshot)driver;
			byte[] img = screen.getScreenshotAs(OutputType.BYTES);
			scenario.attach(img,"image/png","FailedScenarioImage");
		}
	}

}
