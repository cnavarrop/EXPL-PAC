package steps;

import io.cucumber.java.After;
import utils.ExtentManager;
import utils.SeleniumDriver;

public class Despues {
	
	@After
	public void closeDriver() {
		ExtentManager.endReport();
		SeleniumDriver.tearDown();
		
	}

}
