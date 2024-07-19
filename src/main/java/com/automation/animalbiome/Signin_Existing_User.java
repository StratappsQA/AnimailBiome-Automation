package com.automation.animalbiome;


import java.sql.SQLException;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Signin_Existing_User {
	
	final Logger logger = LogManager.getLogger(Signin_Existing_User.class);
	
	WebDriver driver = Instance.getInstance();
	Properties prop = PropertiesFile.readPropertyFile("Signin_Existing_User.properties");
	
	
	
@Test(priority=5, enabled=true)
public void signin_existinguser() throws InterruptedException, SQLException {
		
driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);		


 driver.get(prop.getProperty("baseUrl")); driver.manage().window().maximize();
 Thread.sleep(3000);
 driver.findElement(By.xpath(prop.getProperty("Bannerclick"))).click();
 Thread.sleep(5000);
 
 
driver.findElement(By.xpath(prop.getProperty("username"))).
sendKeys(prop.getProperty("username_user"));
driver.findElement(By.xpath(prop.getProperty("password"))).
sendKeys(prop.getProperty("password_pdw"));
driver.findElement(By.linkText(prop.getProperty("loginbutton"))).click();
Thread.sleep(10000);
logger.info("Successfully Signed in with the Existing User");
	}
}

