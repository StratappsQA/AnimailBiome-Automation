package com.automation.animalbiome;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.automation.animalbiome.util.AnimalBiomeInitializer;


public class MyAccount_EditDog {
	final Logger logger = LogManager.getLogger(AddPet_NewUser.class);
	AnimalBiomeInitializer initializer = new AnimalBiomeInitializer("MyAccount_EditDog.properties");
	WebDriver driver = initializer.getWebDriver();
	Properties prop = initializer.getProperties();
	

	@Test(priority = 13, enabled = true)
	public void MyAccount_editdog() throws Exception {
		
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		//-------------------User profile-----------
		
		myaccount_userprofile();
		//------------------other then none----------
		JavascriptExecutor js=	Edit_health_Diet_None();
		
		health_and_otherthan_none(js);
		//------------------edit none--------------
		
				
	}
			
	private JavascriptExecutor health_and_otherthan_none(JavascriptExecutor js) throws Exception {
		logger.info("Started edit profile with health and diet other than none");
		
		
		  driver.findElement(By.xpath(prop.getProperty("p_Myaccount"))).click();
		  driver.findElement(By.xpath(prop.getProperty("p_userprofile"))).click();
		 
		//driver.findElement(By.xpath(prop.getProperty("p_grid_view"))).click();
		 Thread.sleep(10000);
		  logger.info("selected the user profile through my account");
		  driver.findElement(By.xpath(prop.getProperty("p_searchbar"))).click();
		  driver.findElement(By.xpath(prop.getProperty("p_searchbar"))).sendKeys("Booster");
		  logger.info("searched the particular pet through search bar");
		  
		  driver.findElement(By.xpath(prop.getProperty("p_searchicon"))).click();
		  Thread.sleep(8000);
		  js.executeScript("window.scrollBy(0,400)", "");
		  Actions act = new Actions(driver);
		  act.moveToElement(driver.findElement(By.xpath(prop.getProperty(
		  "p_flipback_last")))).perform();
		  Thread.sleep(10000); 
		  WebDriverWait wait1 =new WebDriverWait(driver, 50); 
		  WebElement element4 =wait1.until(ExpectedConditions.elementToBeClickable(By.xpath(prop.getProperty(
		  "p_edit")))); ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element4);
		  js.executeScript("window.scrollBy(0,200)","");
		  WebElement ele1 =driver.findElement(By.xpath(prop.getProperty("p_edit_nextbutton")));
		  js.executeScript("arguments[0].click()", ele1);
		  js.executeScript("window.scrollBy(0,300)","");
		  Thread.sleep(2000);
		 driver.findElement(By.xpath(prop.getProperty("p_edit_nextbutton"))).click();
		 Thread.sleep(8000);
		 js.executeScript("window.scrollBy(0,500)","" );
		   Thread.sleep(5000);
		   driver.findElement(By.xpath(prop.getProperty("p_edit_medication_behaviour"))).click();
		   driver.findElement(By.xpath(prop.getProperty("p_edit_suppliments_Digestive"))).click();
		  js.executeScript("window.scrollBy(0,500)","" );
		  Thread.sleep(5000);
		  driver.findElement(By.xpath(prop.getProperty("p_edit_animalbiome_Doggybiome"))).click();
		  driver.findElement(By.xpath(prop.getProperty("diet_Non_prescription"))).click();
		  driver.findElement(By.xpath(prop.getProperty("p_edit_diet_wet/canned"))).click();
		  driver.findElement(By.xpath(prop.getProperty("p_edit_other_diet"))).click();
		  js.executeScript("window.scrollBy(0,500)","" );
		  Thread.sleep(5000);
		  driver.findElement(By.xpath(prop.getProperty("physical_Gihealth"))).click();
		  driver.findElement(By.xpath(prop.getProperty("physical_gi_colitics"))).click();
		  driver.findElement(By.xpath(prop.getProperty("symptoms_skinissues"))).click();
		  driver.findElement(By.xpath(prop.getProperty("symptoms_excessive_itching"))).click();
		  Thread.sleep(1000);
		  js.executeScript("window.scrollBy(0,200)","" );
		  Thread.sleep(1000);
		  Select s1=new
		  Select(driver.findElement(By.xpath(prop.getProperty("severity_dropdown"))));
		  s1.selectByIndex(2);
		   Select s2=new
		    Select(driver.findElement(By.xpath(prop.getProperty("frequency_dropdown"))));
		    s2.selectByIndex(2);
		    Thread.sleep(2000);
			  driver.findElement(By.xpath(prop.getProperty("p_confirm_button"))).click();
			  Thread.sleep(3000);
			  driver.findElement(By.xpath(prop.getProperty("p_edit_submit"))).click();
			  Thread.sleep(10000);
			 
		logger.info("Dog profile through my account edited successfully");
		return js;
	}

	private JavascriptExecutor Edit_health_Diet_None() throws Exception {
		logger.info("Started edit profile with health and diet as none");
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath(prop.getProperty("p_flipback_last")))).perform();
		Thread.sleep(10000); 
		WebDriverWait wait = new WebDriverWait(driver, 50);
		WebElement element3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(prop.getProperty("p_edit"))));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript("arguments[0].click();", element3);
		js.executeScript("window.scrollBy(0,300)", "");
		  Thread.sleep(2000);
		 driver.findElement(By.xpath(prop.getProperty("p_edit_nextbutton"))).click();
		 Thread.sleep(2000);
		 js.executeScript("window.scrollBy(0,500)", "" );
		 Thread.sleep(2000);
		  driver.findElement(By.xpath(prop.getProperty("p_edit_nextbutton"))).click();
		  Thread.sleep(3000);
		  js.executeScript("window.scrollBy(0,600)", "");
		  Thread.sleep(5000);
		 
		driver.findElement(By.xpath(prop.getProperty("p_edit_none_medication"))).click();
		  driver.findElement(By.xpath(prop.getProperty("p_edit_none_suppliments"))).click();
		  driver.findElement(By.xpath(prop.getProperty("p_edit_none_animalbiome_suppliments"))).click();
		  js.executeScript("window.scrollBy(0,500)", "");
		  driver.findElement(By.xpath(prop.getProperty("p_edit_other_diet"))).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath(prop.getProperty("p_edit_other_diet_child"))).click(); 
		  js.executeScript("window.scrollBy(0,500)", "");
		  driver.findElement(By.xpath(prop.getProperty("p_edit_none_physical"))).click();	  
		  WebElement ele = driver.findElement(By.xpath(prop.getProperty("p_edit_none_symptoms1")));  
		  js.executeScript("arguments[0].click()", ele);
		  //driver.findElement(By.xpath(prop.getProperty("p_edit_none_symptoms1"))).click(); 
		  Thread.sleep(2000);
		  driver.findElement(By.xpath(prop.getProperty("p_confirm_button"))).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath(prop.getProperty("p_edit_submit"))).click();
		  Thread.sleep(10000);
		  logger.info("Dog Profile is edited succesfully with health and diet as none");
		return js;
		
	}
		private void myaccount_userprofile() throws Exception {
			logger.info("Start editing the Dog profile through my account");
			
			driver.findElement(By.xpath(prop.getProperty("p_Myaccount"))).click();
			driver.findElement(By.xpath(prop.getProperty("p_userprofile"))).click();
			Thread.sleep(10000);
			logger.info("Selected the user profile through my account");
			
			  driver.findElement(By.xpath(prop.getProperty("p_searchbar"))).click();
			  driver.findElement(By.xpath(prop.getProperty("p_searchbar"))).sendKeys(
			  "Booster");
			  driver.findElement(By.xpath(prop.getProperty("p_searchicon"))).click();
			  Thread.sleep(5000); logger.info("Selected the Dog through the search bar");
			 
	}


}
