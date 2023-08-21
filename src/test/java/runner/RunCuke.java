package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\test\\resources\\features\\Inicio.feature", glue = {"steps"})

public class RunCuke extends AbstractTestNGCucumberTests{

}
