package utils;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
	
	/*
	 * para poder visualizar el reporte bien en jenkins se debe instalar el plugin
	 * Html publisher y al ejecutar jenkins ingresar el siguiente parametro: java
	 * -Dhudson.model.DirectoryBrowserSupport.CSP="" -jar jenkins.war
	 */

	public static ExtentReports extent;
	public static ExtentHtmlReporter html;
	public static ExtentTest test;

	public static ExtentReports getIntance() {
		if (extent == null) {
			html = new ExtentHtmlReporter(System.getProperty("user.dir") + "\\test-output\\html\\ExtentReport.html");
			html.config().setDocumentTitle("Reporte de test Automatizados");
			html.config().setTheme(Theme.DARK);
			html.config().setCss(".r-img { width: 30%; }");
			extent = new ExtentReports();
			extent.attachReporter(html);
		}
			return extent;	
	}

	public static void endReport() {
		extent.flush();
	}

}
