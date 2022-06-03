package com.automation.animalbiome.util;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.automation.animalbiome.Instance;
import com.automation.animalbiome.PropertiesFile;

public class AnimalBiomeInitializer {

	public AnimalBiomeInitializer(String propertiesFileName) {
		super();
		this.propertiesFileName = propertiesFileName;
	}

	private WebDriver webDriver;

	private Properties properties;

	private String propertiesFileName;

	public String getPropertiesFileName() {
		return propertiesFileName;
	}

	public void setPropertiesFileName(String propertiesFileName) {
		this.propertiesFileName = propertiesFileName;
	}

	public WebDriver getWebDriver() {
		webDriver = Instance.getInstance();
		return webDriver;
	}

	public void setWebDriver(WebDriver webDriver) {
		this.webDriver = webDriver;
	}

	public Properties getProperties() {
		properties = PropertiesFile.readPropertyFile(this.propertiesFileName);
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}


}
