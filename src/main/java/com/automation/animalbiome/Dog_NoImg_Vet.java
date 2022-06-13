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

public class Dog_NoImg_Vet {
	
	final Logger logger = LogManager.getLogger(Dog_NoImg_Vet.class);
	AnimalBiomeInitializer initializer = new AnimalBiomeInitializer("Dog_NoImg_Vet.properties");
	WebDriver driver = initializer.getWebDriver();
	Properties prop = initializer.getProperties();
	
	@Test(priority=4, enabled=true)
public void  PetprofileCreation_Existuser_addpet_dog_noimg_vet() throws Exception {	
		
		//--------------------addpet------------
		
	JavascriptExecutor js = AboutMyPet();
		
 //----------------More About my pet----------------------------
		
		moreAboutMyPet(js);
		
 //-------------------Health & Diet----------------
		
		healthAndDiet(js);
		
//---------------My Pet's Vet----------------------	
		vetDetails(js);
						
	}

	private void vetDetails(JavascriptExecutor js) throws Exception {
		Thread.sleep(5000);
		logger.info("Providing the Vet details");
		driver.findElement(By.xpath(prop.getProperty("Veterinary_clinic_name"))).sendKeys(prop.getProperty("Veterinary_clinic_name_info"));
		driver.findElement(By.xpath(prop.getProperty("Vet_Name"))).sendKeys(prop.getProperty("Vet_Name_info"));			
		driver.findElement(By.xpath(prop.getProperty("vet_city"))).sendKeys(prop.getProperty("vet_city_info"));			
		driver.findElement(By.xpath(prop.getProperty("vet_state"))).sendKeys(prop.getProperty("vet_state_info"));			
		driver.findElement(By.xpath(prop.getProperty("vet_street"))).sendKeys(prop.getProperty("vet_street_info"));	
		Thread.sleep(5000);
		WebElement m=driver.findElement(By.xpath("(//div[@class='modal-footer'])[2]"));
		js.executeScript("arguments[0].scrollIntoView(true);", m);
		Thread.sleep(5000);
		driver.findElement(By.xpath(prop.getProperty("vet_postalcode"))).sendKeys(prop.getProperty("vet_postalcode_info"));	
		Select s4=new Select(driver.findElement(By.xpath(prop.getProperty("vet_country_dropdown"))));
		s4.selectByValue("India");
		driver.findElement(By.xpath(prop.getProperty("vet_email"))).sendKeys(prop.getProperty("vet_email_info"));		
		driver.findElement(By.xpath(prop.getProperty("vet_phonenumber"))).sendKeys(prop.getProperty("vet_phonenumber_info"));	
		driver.findElement(By.xpath(prop.getProperty("vet_add_vet"))).click();
		js.executeScript("window.scrollBy(0,300)","" );
		Thread.sleep(3000);
		driver.findElement(By.xpath(prop.getProperty("final_submitbutton"))).click();
		Thread.sleep(20000);	
		logger.info("Provided the Vet Details and clicked on Submit Button----Success");
		  logger.info("Successfully Completed the Dog Profile with no image and vet details");
	}

	private void healthAndDiet(JavascriptExecutor js) throws Exception {
		logger.info("Providing the details in Health & Diet Section");
		driver.findElement(By.xpath(prop.getProperty("antibiotics_y"))).click();
		Select s1=new Select(driver.findElement(By.xpath(prop.getProperty(
		"body_conditions_dropdown")))); s1.selectByIndex(0); s1.selectByValue("4");
		js.executeScript("window.scrollBy(0,500)","" );
		Thread.sleep(5000);
		driver.findElement(By.xpath(prop.getProperty("medication_Antiparasitics/Antiprotozoals"))).click();
		driver.findElement(By.xpath(prop.getProperty("suppliments_Postbiotics"))).click();
		js.executeScript("window.scrollBy(0,500)","" );
		Thread.sleep(5000);
		driver.findElement(By.xpath(prop.getProperty("Animalbiome_suppliments"))).click();
		driver.findElement(By.xpath(prop.getProperty("diet_Non_prescription"))).click();
		driver.findElement(By.xpath(prop.getProperty("diet"))).click();
		js.executeScript("window.scrollBy(0,500)","" );
		Thread.sleep(5000);
		driver.findElement(By.xpath(prop.getProperty("physical_Gihealth"))).click();
		driver.findElement(By.xpath(prop.getProperty("physical_gi_colitics"))).click();
		driver.findElement(By.xpath(prop.getProperty("symptoms_skinissues"))).click();
		driver.findElement(By.xpath(prop.getProperty("symptoms_excessive_itching"))).click();
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,200)","" );
		Thread.sleep(2000);
		Select s2=new Select(driver.findElement(By.xpath(prop.getProperty("severity_dropdown"))));
		s2.selectByIndex(2);
		Thread.sleep(1000);
		Select s3=new Select(driver.findElement(By.xpath(prop.getProperty("frequency_dropdown"))));
		 s3.selectByIndex(2);
		 js.executeScript("window.scrollBy(0,500)","" ); Thread.sleep(5000);
		 driver.findElement(By.xpath(prop.getProperty("decription"))).sendKeys(prop.
		 getProperty("decription_info"));
		 driver.findElement(By.xpath(prop.getProperty("confirm_button"))).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath(prop.getProperty("add_vet_button"))).click();
		 logger.info("Provided the details of  Health & Diet and Clicked on Confirm Button----Success");	
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
		driver.findElement(By.xpath(prop.getProperty("lbs_radio"))).click();
		js.executeScript("window.scrollBy(0,500)","" );
		Thread.sleep(5000);
		driver.findElement(By.xpath(prop.getProperty("neutered_y"))).click();
		driver.findElement(By.xpath(prop.getProperty("pet_city"))).sendKeys(prop.getProperty("pet_city_info"));
		driver.findElement(By.xpath(prop.getProperty("pet_state"))).sendKeys(prop.getProperty("pet_state_info"));
		driver.findElement(By.xpath(prop.getProperty("pet_country"))).sendKeys(prop.getProperty("pet_country_info"));
		driver.findElement(By.xpath(prop.getProperty("moreabout_nextstep_button"))).click();
		Thread.sleep(5000);
		logger.info("Provided the Details in More About My Pet Section----Success");
		
	}

	private JavascriptExecutor AboutMyPet() throws Exception {
		logger.info("Started Creating the Dog Profile for exist User with no image and vet details");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);	
		WebDriverWait wait = new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(prop.getProperty("addpet_button")))).click(); 
			 
			 //--------------------addpet------------
			 
		driver.findElement(By.xpath(prop.getProperty("pet_name"))).sendKeys((prop.getProperty("pet_name_info"))+"_" +System.currentTimeMillis());
		driver.findElement(By.xpath(prop.getProperty("pet_years"))).sendKeys("3");
		driver.findElement(By.xpath(prop.getProperty("pet_months"))).sendKeys("3");
		Thread.sleep(5000);
		driver.findElement(By.xpath(prop.getProperty("male_radiobutton"))).click();

		WebElement pet_profile=driver.findElement(By.xpath(prop.getProperty("profile_image")));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)","" );
		Thread.sleep(5000);
		driver.findElement(By.xpath(prop.getProperty("aboutpet_nextstepbutton"))).click();
		Thread.sleep(5000);
		
		 logger.info("Provided the Details in About My Pet Section----Success");
		 return js;
		
	}	
		
}
