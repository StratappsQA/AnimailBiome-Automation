package com.automation.animalbiome.util;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementFinder {
	

	public static void findXPathElementAndClick(WebDriver driver, String propertyKey, Properties properties) {
		driver.findElement(By.xpath(getProperty(propertyKey, properties))).click();
	}
	
	public static void findCssSelectorElementAndSendKeys(WebDriver driver, String propertyKey, Properties properties,String sendKey) {
		driver.findElement(By.cssSelector(getProperty(propertyKey, properties))).sendKeys(sendKey);
	}

	private static String getProperty(String propertyKey, Properties properties) {
		return properties.getProperty(propertyKey);
	}
}
