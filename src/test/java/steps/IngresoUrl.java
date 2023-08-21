package steps;

import acciones.AccionesPACInicio;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.SeleniumDriver;


public class IngresoUrl {
	
	AccionesPACInicio accionesPACInicio = new AccionesPACInicio();
	
	@Given("Ingreso a la url PAC")
	public void ingreso_a_la_url_pac() {
		SeleniumDriver.getDriver().get("http://testfront.afphabitat.cl/portalAtencionClienteWeb/public/login.htm");
	}

	@When("ingreso mis credenciales de acceso")
	public void ingreso_mis_credenciales_de_acceso() {
	   accionesPACInicio.ingresarAPAC();
	}

	@Then("Se muestra la pantalla de inicio del PAC")
	public void se_muestra_la_pantalla_de_inicio_del_pac() {
	    accionesPACInicio.validarPantallaInicio();
	}


}
