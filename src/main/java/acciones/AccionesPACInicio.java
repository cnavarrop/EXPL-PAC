package acciones;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.fasterxml.jackson.databind.annotation.JsonAppend.Prop;

import elementos.ElementosPACInicio;
import utils.SeleniumDriver;

public class AccionesPACInicio {
	
	WebDriver driver = SeleniumDriver.getDriver();
	
	ElementosPACInicio elementosPACInicio;
	
	public AccionesPACInicio(){
		
		elementosPACInicio = new ElementosPACInicio();
		PageFactory.initElements(driver, elementosPACInicio);
	}

	
	public void ingresarAPAC()
	{
	 elementosPACInicio.username.sendKeys(SeleniumDriver.prop.getProperty("usuario"));
	 elementosPACInicio.password.sendKeys(SeleniumDriver.prop.getProperty("password"));
	 elementosPACInicio.btnIniciarSesion.click();
	 //elementosPACInicio.irAlHome.click();
	}


	public void validarPantallaInicio() {
		String titulo = driver.getTitle();
		Assert.assertEquals(titulo, "Portal Unico de Atención a Clientes AFP Habitat");
		
	}
	
	
}
