package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath="//a[text()='Home']")
	WebElement btnHomePage;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void vfyHomePage() {
		btnHomePage.isDisplayed();
	}
	


}
