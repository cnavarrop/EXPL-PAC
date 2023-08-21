package elementos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ElementosPACInicio {
	
	@FindBy(how = How.ID, using = "username")
	public WebElement username;
	
	@FindBy(how = How.ID, using = "password")
	public WebElement password;
	
	@FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div[2]/div[2]/div[2]/div[2]/form/input[5]")
	public WebElement btnIniciarSesion;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[2]/a[2]")
	public WebElement irAlHome;
		
	
}
