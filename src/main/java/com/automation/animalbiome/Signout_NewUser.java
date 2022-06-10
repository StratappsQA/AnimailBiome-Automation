package com.automation.animalbiome;

import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.automation.animalbiome.util.AnimalBiomeInitializer;

public class Signout_NewUser {
	
final Logger logger = LogManager.getLogger(Signout_NewUser.class);
	
	AnimalBiomeInitializer initializer = new AnimalBiomeInitializer("Signout_Newuser.properties");
	WebDriver driver = initializer.getWebDriver();
	Properties prop = initializer.getProperties();
	
	@Test(priority = 4, enabled = true)
	public void Signingout_NewUser() throws InterruptedException {
		
		Thread.sleep(5000);
		WebElement ele = driver.findElement(By.xpath(prop.getProperty("G_My_account")));
	    Actions action =new Actions(driver);
	    action.moveToElement(ele).perform();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath(prop.getProperty("G_Sign_Out"))).click();
	    Thread.sleep(6000);
	  logger.info("NewUser is successfully signed out");
		
	}

}

