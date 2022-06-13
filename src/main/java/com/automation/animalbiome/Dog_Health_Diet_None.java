
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

public class Dog_Health_Diet_None {

	final Logger logger = LogManager.getLogger(Dog_Health_Diet_None.class);
	AnimalBiomeInitializer initializer = new AnimalBiomeInitializer("Dog_Health_Diet_None.properties");
	WebDriver driver = initializer.getWebDriver();
	Properties prop = initializer.getProperties();
	
	@Test(priority=9, enabled=true)
public void PetprofileCreation_existuser_addpet_dog_health_diet_none() throws Exception {
		
		//----about pet----
		
		JavascriptExecutor js=AboutMyPet();
		
		//--------more about my pet------------
		moreAboutMyPet(js);
		
		//-------health and diet-------
		healthAndDiet(js);
		
		//----vet details-----
		
		vetDetails(js);
		
		
		
	}
		
	private JavascriptExecutor AboutMyPet() throws Exception {
		logger.info("Started Creating the Dog Profile for exist User with health and diet none");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		  WebDriverWait wait = new WebDriverWait(driver,50);
		  wait.until(ExpectedConditions.elementToBeClickable(By.xpath(prop.getProperty( "addpet_button")))).click(); 
		  driver.findElement(By.xpath(prop.getProperty("pet_name"))).sendKeys((prop.
		  getProperty("pet_name_info"))+"_" +System.currentTimeMillis());
		  driver.findElement(By.xpath(prop.getProperty("pet_years"))).sendKeys("3");
		  driver.findElement(By.xpath(prop.getProperty("pet_months"))).sendKeys("3");
		  Thread.sleep(5000);
		  driver.findElement(By.xpath(prop.getProperty("female_radiobutton"))).click();
		  
		  WebElement
		  pet_profile=driver.findElement(By.xpath(prop.getProperty("profile_image")));
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,400)","" ); Thread.sleep(5000);
		  driver.findElement(By.xpath(prop.getProperty("profile_image"))).click();
		  Thread.sleep(5000);
		  Runtime.getRuntime().exec(prop.getProperty("Archer_image2"));
		  Thread.sleep(10000);
		  driver.findElement(By.xpath(prop.getProperty("popup_submitbutton"))).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath(prop.getProperty("aboutpet_nextstepbutton"))).
		  click(); Thread.sleep(5000);
		  logger.info("Provided the Details in About My Pet Section----Success");
		return js;
	}

	private void moreAboutMyPet(JavascriptExecutor js) throws Exception {
		logger.info("Providing the details in More about my pet section");
		driver.findElement(By.xpath(prop.getProperty("pet_breed1"))).click();
		  driver.findElement(By.xpath(prop.getProperty("pet_breed1"))).sendKeys("akita");
		  driver.findElement(By.xpath(prop.getProperty("pet_breed_select"))).click();
		  driver.findElement(By.xpath(prop.getProperty("pet_bread2"))).click();
		  driver.findElement(By.xpath(prop.getProperty("pet_bread2"))).sendKeys("akita");
		  driver.findElement(By.xpath(prop.getProperty("pet_breed_select2"))).click();
		  Thread.sleep(5000);
		  driver.findElement(By.xpath(prop.getProperty("pet_weight"))).sendKeys("3");
		  Thread.sleep(5000);
		  driver.findElement(By.xpath(prop.getProperty("kgs_radio"))).click();
		  js.executeScript("window.scrollBy(0,500)","" ); Thread.sleep(5000);
		  driver.findElement(By.xpath(prop.getProperty("neutered_n"))).click();
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

	private void healthAndDiet(JavascriptExecutor js) throws Exception {
		logger.info("Providing the details in Health & Diet Section");
          driver.findElement(By.xpath(prop.getProperty("antibiotics_y"))).click();
		  Select s1=new Select(driver.findElement(By.xpath(prop.getProperty("body_conditions_dropdown")))); 
		  s1.selectByIndex(0); s1.selectByValue("4");
		  Thread.sleep(1000);
		  
		  driver.findElement(By.xpath(prop.getProperty("medication_none"))).click();
		  driver.findElement(By.xpath(prop.getProperty("suplliments_none"))).click();
		  driver.findElement(By.xpath(prop.getProperty("Animalbiome_suppliments_None"))).click();
		  driver.findElement(By.xpath(prop.getProperty("diet_prescription"))).click();
		  Thread.sleep(500); js.executeScript("window.scrollBy(0,300)","" );
		  driver.findElement(By.xpath(prop.getProperty("Diet_other"))).click();
		  driver.findElement(By.xpath(prop.getProperty("Diet_other_commercial"))).click();
		  driver.findElement(By.xpath(prop.getProperty("symptoms_None"))).click();
		  driver.findElement(By.xpath(prop.getProperty("physical_None"))).click();
		  js.executeScript("window.scrollBy(0,500)","" ); Thread.sleep(5000);
		  driver.findElement(By.xpath(prop.getProperty("decription"))).sendKeys(prop.
		  getProperty("decription_info"));
		  driver.findElement(By.xpath(prop.getProperty("confirm_button"))).click();
		  Thread.sleep(5000);
		  driver.findElement(By.xpath(prop.getProperty("add_vet_button"))).click();
		  logger.info("Provided the details of  Health & Diet and Clicked on Confirm Button----Success");
	}

	private void vetDetails(JavascriptExecutor js) throws Exception {
		Thread.sleep(5000);
		logger.info("Providing the Vet details");
		  driver.findElement(By.xpath(prop.getProperty("Veterinary_clinic_name"))).
		  sendKeys(prop.getProperty("Veterinary_clinic_name_info"));
		  driver.findElement(By.xpath(prop.getProperty("Vet_Name"))).sendKeys(prop.
		  getProperty("Vet_Name_info"));
		  driver.findElement(By.xpath(prop.getProperty("vet_city"))).sendKeys(prop.
		  getProperty("vet_city_info"));
		  driver.findElement(By.xpath(prop.getProperty("vet_state"))).sendKeys(prop.
		  getProperty("vet_state_info"));
		  driver.findElement(By.xpath(prop.getProperty("vet_street"))).sendKeys(prop.
		  getProperty("vet_street_info")); Thread.sleep(5000); WebElement
		  m=driver.findElement(By.xpath("(//div[@class='modal-footer'])[2]"));
		  js.executeScript("arguments[0].scrollIntoView(true);", m);
		  Thread.sleep(5000);
		  driver.findElement(By.xpath(prop.getProperty("vet_postalcode"))).sendKeys(
		  prop.getProperty("vet_postalcode_info")); Select s2=new
		  Select(driver.findElement(By.xpath(prop.getProperty("vet_country_dropdown")))
		  ); s2.selectByValue("India");
		  driver.findElement(By.xpath(prop.getProperty("vet_email"))).sendKeys(prop.
		  getProperty("vet_email_info"));
		  driver.findElement(By.xpath(prop.getProperty("vet_phonenumber"))).sendKeys(
		  prop.getProperty("vet_phonenumber_info"));
		  driver.findElement(By.xpath(prop.getProperty("vet_add_vet"))).click();
		  js.executeScript("window.scrollBy(0,300)","" ); Thread.sleep(3000);
		  driver.findElement(By.xpath(prop.getProperty("final_submitbutton"))).click();
		  Thread.sleep(20000);
		  logger.info("Provided the Vet Details and clicked on Submit Button----Success");
		  logger.info("Successfully Completed the Dog Profile with health and diet none");
	}

	
	}



