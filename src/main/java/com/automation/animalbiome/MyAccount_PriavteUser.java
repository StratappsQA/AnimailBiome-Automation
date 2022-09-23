package com.automation.animalbiome;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.automation.animalbiome.util.AnimalBiomeInitializer;



public class MyAccount_PriavteUser {
	final Logger logger = LogManager.getLogger(AddPet_NewUser.class);
	AnimalBiomeInitializer initializer = new AnimalBiomeInitializer("MyAccount_PriavteUser.properties");
	WebDriver driver = initializer.getWebDriver();
	Properties prop = initializer.getProperties();
	
	
	@Test(priority=14, enabled=true)
public void MyAccount_privateuser() throws Exception {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Thread.sleep(5000);
		logger.info("Started editing the user frofile public to private");
	driver.findElement(By.xpath(prop.getProperty("p_Myaccount"))).click();
	driver.findElement(By.xpath(prop.getProperty("p_userprofile"))).click(); 
	Thread.sleep(10000);	
	JavascriptExecutor js9 = (JavascriptExecutor) driver;
	js9.executeScript("window.scrollBy(0,400)","" );
	Thread.sleep(3000);
	driver.findElement(By.xpath(prop.getProperty("p_edituser"))).click();
	driver.findElement(By.xpath(prop.getProperty("p_edit_userfirstname"))).clear();
	Thread.sleep(2000);
	driver.findElement(By.xpath(prop.getProperty("p_edit_userfirstname"))).sendKeys(prop.getProperty("P_name_private_first"));
	
	
	 driver.findElement(By.xpath(prop.getProperty("p_edit_lastname"))).clear();
	 driver.findElement(By.xpath(prop.getProperty("p_edit_lastname"))).sendKeys(prop.getProperty("p_edit_lastname_info"));
	
		js9.executeScript("window.scrollBy(0,200)","" );

	 Thread.sleep(3000);
		
		  driver.findElement(By.xpath(prop.getProperty("p_upload_userprofile"))).click(
		  ); Thread.sleep(5000);
		  Runtime.getRuntime().exec(prop.getProperty("p_uploaduserimage"));
		  driver.findElement(By.xpath(prop.getProperty("p_profileimage_submit_button"))
		  ).click(); Thread.sleep(3000);
		 
	 driver.findElement(By.xpath(prop.getProperty("p_private_radio"))).click();
	 Thread.sleep(2000);
	driver.findElement(By.xpath(prop.getProperty("p_update_profile1"))).click();
	logger.info("User profile Edited from public to private");
	
	 Thread.sleep(5000);
	}

}
