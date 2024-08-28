package com.automation.animalbiome;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.automation.animalbiome.util.AnimalBiomeInitializer;

public class Cat_Img_NoVet {
	final Logger logger = LogManager.getLogger(Cat_Img_Vet.class);
	AnimalBiomeInitializer initializer = new AnimalBiomeInitializer("Cat_Img_NoVet.properties");
	WebDriver driver = initializer.getWebDriver();
	Properties prop = initializer.getProperties();
	@Test(priority=18, enabled=true)
	public void Cat_img_Novet() throws Exception {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//----about pet----
		
		JavascriptExecutor js=AboutMyPet();
		
		//--------more about my pet------------
		moreAboutMyPet(js);
		
		//-------health and diet-------
		healthAndDiet(js);
		
		
	}


private void healthAndDiet(JavascriptExecutor js) throws Exception {
	
	logger.info("Providing the details in Health & Diet Section");
	driver.findElement(By.xpath(prop.getProperty("antibiotics_y"))).click();
	   Select s=new Select(driver.findElement(By.xpath(prop.getProperty(
	   "body_conditions_dropdown")))); s.selectByIndex(0); s.selectByValue("4");
	   js.executeScript("window.scrollBy(0,500)","" );
	   Thread.sleep(5000);
	   
	   
	   driver.findElement(By.xpath(prop.getProperty("cat_medication_Chemotherapeutics"))).click();
	   driver.findElement(By.xpath(prop.getProperty("cat_medication_Gastroprotectants"))).click();
	   
	   driver.findElement(By.xpath(prop.getProperty("cat_supplements_Joint_Health_Supplements"))).click();
	   driver.findElement(By.xpath(prop.getProperty("cat_supplements_Digestive_Enzymes"))).click(); 
	  js.executeScript("window.scrollBy(0,500)","" );
	  Thread.sleep(5000);
	  driver.findElement(By.xpath(prop.getProperty("cat_animalbiome_supplements_KittyBiomeTM_Gut"))).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath(prop.getProperty("cat_diet_prescription"))).click();
	 // Thread.sleep(2000);
	  driver.findElement(By.xpath(prop.getProperty("diet"))).click();
	  Thread.sleep(2000);
	  js.executeScript("window.scrollBy(0,500)","" );
	  Thread.sleep(5000);
	  driver.findElement(By.xpath(prop.getProperty("physical_Gihealth"))).click();
	  driver.findElement(By.xpath(prop.getProperty("cat_Acute_Gastritis"))).click();
	  driver.findElement(By.xpath(prop.getProperty("cat_colitics"))).click();
	  driver.findElement(By.xpath(prop.getProperty("cat_food_sensitivity"))).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath(prop.getProperty("cat_symptoms_none"))).click();
	    js.executeScript("window.scrollBy(0,500)","" ); 
	    Thread.sleep(5000);
	    driver.findElement(By.xpath(prop.getProperty("decription"))).sendKeys(prop.
	    getProperty("decription_info"));
	    driver.findElement(By.xpath(prop.getProperty("confirm_button"))).click();
	    
	    logger.info("Provided the details of  Health & Diet and Clicked on Confirm Button----Success");
	    Thread.sleep(5000);
	    driver.findElement(By.xpath(prop.getProperty("final_submitbutton"))).click();
	    Thread.sleep(20000);
		logger.info("Successfully Completed the Cat Profile with my account");
	
}


private void moreAboutMyPet(JavascriptExecutor js) throws Exception {
	
	logger.info("Providing the details in More about my pet section");
	driver.findElement(By.xpath(prop.getProperty("pet_breed1"))).click();
	  driver.findElement(By.xpath(prop.getProperty("pet_breed1"))).sendKeys("akita");
	  driver.findElement(By.xpath(prop.getProperty("pet_breed_select"))).click();
	  driver.findElement(By.xpath(prop.getProperty("pet_bread2"))).click();
	  driver.findElement(By.xpath(prop.getProperty("pet_bread2"))).sendKeys("akita" );
	  driver.findElement(By.xpath(prop.getProperty("pet_breed_select2"))).click();
	  Thread.sleep(5000);
	  driver.findElement(By.xpath(prop.getProperty("pet_weight"))).sendKeys("3");
	  Thread.sleep(5000);
	  driver.findElement(By.xpath(prop.getProperty("pet_weight_unit"))).click();
	  js.executeScript("window.scrollBy(0,500)","" );
	  Thread.sleep(5000);
	  driver.findElement(By.xpath(prop.getProperty("neutered_y"))).click();
	  driver.findElement(By.xpath(prop.getProperty("pet_city"))).sendKeys(prop.
	  getProperty("pet_city_info"));
	  driver.findElement(By.xpath(prop.getProperty("pet_state"))).sendKeys(prop.
	  getProperty("pet_state_info"));
	  driver.findElement(By.xpath(prop.getProperty("pet_country"))).sendKeys(prop.
	  getProperty("pet_country_info"));
	  driver.findElement(By.xpath(prop.getProperty("moreabout_nextstep_button"))).click(); 
	  Thread.sleep(5000);	
	  logger.info("Provided the Details in More About My Pet Section----Success");
}

private JavascriptExecutor AboutMyPet() throws Exception {
	/*
	 * WebDriverWait wait = new WebDriverWait(driver,50);
	 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(prop.getProperty(
	 * "p_addpet")))).click();
	 */	
	Thread.sleep(4000);
	logger.info("Providing the Details of cat in About My Pet Section");
	  driver.findElement(By.xpath(prop.getProperty("p_catradio"))).click();
	  driver.findElement(By.xpath(prop.getProperty("pet_name"))).sendKeys((prop.
			  getProperty("p_pet_cname_info"))+"_" +System.currentTimeMillis());
			  driver.findElement(By.xpath(prop.getProperty("pet_years"))).sendKeys("3");
			  driver.findElement(By.xpath(prop.getProperty("pet_months"))).sendKeys("3");
			  Thread.sleep(5000);
			  driver.findElement(By.xpath(prop.getProperty("male_radiobutton"))).click();
				
				  WebElement
				  pet_profile=driver.findElement(By.xpath(prop.getProperty("profile_image")));
				  
				  JavascriptExecutor js = (JavascriptExecutor) driver;
				  js.executeScript("window.scrollBy(0,400)","" );
				  Thread.sleep(5000);
					
					
					  driver.findElement(By.xpath(prop.getProperty("profile_image"))).click();
					  Thread.sleep(5000);
					  Runtime.getRuntime().exec(prop.getProperty("p_catimage"));
					  Thread.sleep(10000);
					  driver.findElement(By.xpath(prop.getProperty("popup_submitbutton"))).click();
					 
			  
			  driver.findElement(By.xpath(prop.getProperty("aboutpet_nextstepbutton"))).
			  click(); Thread.sleep(8000); 
			  logger.info("Provided the Details in About My Pet Section----Success");
return js;
	}

}
