package com.automation.animalbiome;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class MyAccount_PublicUser {
	WebDriver driver = Instance.getInstance();
	Properties prop = PropertiesFile.readPropertyFile("MyAccount_PublicUser.properties");
	
	@Test(priority=16, enabled=true)
public void MyAccount_publicuser() throws Exception {
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//logger.info("Started editing the user frofile public to private");
		driver.findElement(By.xpath(prop.getProperty("p_Myaccount"))).click();
		driver.findElement(By.xpath(prop.getProperty("p_userprofile"))).click(); 
		Thread.sleep(10000);	
		JavascriptExecutor js9 = (JavascriptExecutor) driver;
		js9.executeScript("window.scrollBy(0,400)","" );
		driver.findElement(By.xpath(prop.getProperty("p_edituser"))).click();
		driver.findElement(By.xpath(prop.getProperty("p_edit_userfirstname"))).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath(prop.getProperty("p_edit_userfirstname"))).sendKeys(prop.getProperty("p_public_first"));
		
		
		 driver.findElement(By.xpath(prop.getProperty("p_edit_lastname"))).clear();
		 driver.findElement(By.xpath(prop.getProperty("p_edit_lastname"))).sendKeys(prop.getProperty("p_public_last"));
		
			js9.executeScript("window.scrollBy(0,200)","" );

		 Thread.sleep(2000);
		 driver.findElement(By.xpath(prop.getProperty("p_upload_userprofile"))).click(); 
		 Thread.sleep(2000);
		 Runtime.getRuntime().exec(prop.getProperty("p_uploaduserimage1"));
		 driver.findElement(By.xpath(prop.getProperty("p_profileimage_submit_button"))).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath(prop.getProperty("p_publicradio"))).click();
		driver.findElement(By.xpath(prop.getProperty("p_update_profile1"))).click();
		//driver.findElement(By.xpath("//a[text()='Submit']")).click();
		 Thread.sleep(20000);
		//logger.info("User profile Edited from public to private");
		
		 Thread.sleep(5000);
		}
		/*
		 * WebElement ele =
		 * driver.findElement(By.xpath(prop.getProperty("G_My_account"))); Actions
		 * action =new Actions(driver); action.moveToElement(ele).perform();
		 * Thread.sleep(3000);
		 * driver.findElement(By.xpath(prop.getProperty("G_Sign_Out"))).click();
		 */
		 

}
