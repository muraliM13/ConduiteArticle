package stepDefs;


import base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;

public class Hooks {
	@BeforeAll
	public static void setupDriver() {
		TestBase.initDriver();
	}
	@After
	public void tearDown(Scenario scenario) {
		if(scenario.isFailed()) {
			
		}
	}

}
