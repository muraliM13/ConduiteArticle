package runners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
			features = ".//src//test//resources//features//createArticle.feature", // give particular feature file name to run alone or it will run all the files in the project  
			glue = {"stepDefs"},
			monochrome = true,
			dryRun = false,	//if true then it will not open chrome/any browser, it will just run the code and provides result,      if false it will execute all the code
			plugin = {"pretty",
					"html:target/Reports/HtmlReport.html"					
			}
			)

	public class CreateArticleRunner extends AbstractTestNGCucumberTests {

	}

