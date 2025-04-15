package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewArticle{
	@FindBy(xpath = "//a[@class='nav-link' and contains(.,' Edit Article')]")
	WebElement editArticle;
	public ViewArticle(WebDriver driver){
		PageFactory.initElements(driver, this);
	  
	}
//Actions
	public void ViewArticle() {//String strTitle, String strDescrpt, String strBody, String strTag) {// throws InterruptedException{	
		
		editArticle.click();
	}
}
