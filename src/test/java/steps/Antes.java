package steps;

import io.cucumber.java.Before;
import utils.ExtentManager;
import utils.SeleniumDriver;

public class Antes {
	
	@Before
	public void IniciarDriver() {
		
		SeleniumDriver.cargarArchivoProperty();
		SeleniumDriver.setDriver();
		ExtentManager.getIntance();
		}
	}

