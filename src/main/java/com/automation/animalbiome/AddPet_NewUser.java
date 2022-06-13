package com.automation.animalbiome;

import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

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
import com.automation.animalbiome.util.ElementFinder;

public class AddPet_NewUser {
	
final Logger logger = LogManager.getLogger(AddPet_NewUser.class);
	
	AnimalBiomeInitializer initializer = new AnimalBiomeInitializer("AddPet_Newuser.properties");
	WebDriver driver = initializer.getWebDriver();
	Properties prop = initializer.getProperties();
	
	@Test(priority=3,enabled=true)
    public void PetProfileCreation_NewUser() throws InterruptedException, IOException {
	
 //---------------About My Pet----------------------	
		
		AboutMyPet();

 //----------------More About my pet----------------------------
		
		JavascriptExecutor js = moreAboutMyPet();

 //-------------------Health & Diet----------------
		
		healthAndDiet(js);
		
 //---------------My Pet's Vet----------------------
		vetDetails();

}

	private void vetDetails() throws InterruptedException {
		logger.info("Providing the Vet details");
		 driver.findElement(By.xpath(prop.getProperty("G_Vet_button"))).click();
		 Thread.sleep(4000); 
		 driver.findElement(By.xpath(prop.getProperty("G_Clinic_name"))).sendKeys(prop.getProperty("G_clinicname1"));
		 Thread.sleep(2000);
		 driver.findElement(By.xpath(prop.getProperty("G_Vet_name"))).sendKeys(prop.getProperty("G_vetname1"));
		 driver.findElement(By.xpath(prop.getProperty("G_Vet_city"))).sendKeys(prop.getProperty("G_vetcity1"));
		 Thread.sleep(2000);
		 driver.findElement(By.xpath(prop.getProperty("G_Vet_state"))).sendKeys(prop.getProperty("G_vetstate1"));
		 driver.findElement(By.xpath(prop.getProperty("G_vet_street"))).sendKeys(prop.getProperty("G_vetstreet1"));
		 Thread.sleep(2000);
		 driver.findElement(By.xpath(prop.getProperty("G_vet_code"))).sendKeys(prop.getProperty("G_vetcode1"));
		 Thread.sleep(2000);
		 WebElement VetCountry= driver.findElement(By.xpath(prop.getProperty("G_vet_country")));
		 Select VetCountrySelect=new Select(VetCountry);
		 VetCountrySelect.selectByVisibleText("United States");
		 //driver.findElement(By.xpath(prop.getProperty("G_vet_email"))).sendKeys(prop.getProperty("G_vetemaiid"));
		 Thread.sleep(2000);
		 driver.findElement(By.xpath(prop.getProperty("G_vet_phone"))).sendKeys(prop.getProperty("G_vetphoneno"));
		 Thread.sleep(1000);
		 driver.findElement(By.xpath(prop.getProperty("G_Add_vet_button"))).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath(prop.getProperty("G_Submit_pet"))).click();
		 Thread.sleep(30000);
		 logger.info("Provided the Vet Details and clicked on Submit Button----Success");
		 logger.info("Successfully Completed the Pet Profile for the New User");
	}

	private void healthAndDiet(JavascriptExecutor js) throws InterruptedException {
		logger.info("Providing the details in Health & Diet Section");
		 
		 driver.findElement(By.xpath(prop.getProperty("G_pet_antibiotics"))).click();
		 Thread.sleep(3000);
		 String parent=driver.getWindowHandle();
		 driver.findElement(By.xpath(prop.getProperty("G_body_conditions_chart"))).click();
		 Thread.sleep(5000);
		 Set<String>s2=driver.getWindowHandles();
		 Iterator<String> I1= s2.iterator();
		 while(I1.hasNext())
		 {
		 String child_window=I1.next();
		 if(!parent.equals(child_window))
		 {
		 driver.switchTo().window(child_window);
		
		 System.out.println(driver.switchTo().window(child_window).getTitle());
		
		 driver.close();
		
		 }
		 }
		 driver.switchTo().window(parent);
		 Thread.sleep(3000);
		 WebElement Bodycondition= driver.findElement(By.xpath(prop.getProperty("G_select_petsconditions")));
		 Select BodyconditionSelect=new Select(Bodycondition);
		 BodyconditionSelect.selectByVisibleText("Ideal weight");
		 Thread.sleep(5000);
		 js.executeScript("window.scrollBy(0,300)");
		 Thread.sleep(2000);
		
		 driver.findElement(By.xpath(prop.getProperty("G_medications"))).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath(prop.getProperty("G_supplements"))).click();
		 Thread.sleep(1000);
		 js.executeScript("window.scrollBy(0,500)");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath(prop.getProperty("G_Animalbiome_suppelements"))).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath(prop.getProperty("G_prescription"))).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath(prop.getProperty("G_Diet"))).click();
		 Thread.sleep(1000);
		 js.executeScript("window.scrollBy(0,500)");
		 Thread.sleep(7000);
		 driver.findElement(By.xpath(prop.getProperty("physical_Gihealth"))).click();
		 driver.findElement(By.xpath(prop.getProperty("physical_gi_colitics"))).click();
		 driver.findElement(By.xpath(prop.getProperty("symptoms_skinissues"))).click();
		 driver.findElement(By.xpath(prop.getProperty("symptoms_excessive_itching"))).click();
		 Thread.sleep(1000);
		 js.executeScript("window.scrollBy(0,200)","" );
		 Thread.sleep(1000);
		 Select SeveritySelect=new
		 Select(driver.findElement(By.xpath(prop.getProperty("severity_dropdown"))));
		 SeveritySelect.selectByIndex(2);
		  Select FrequencySelect=new
		   Select(driver.findElement(By.xpath(prop.getProperty("frequency_dropdown"))));
		   FrequencySelect.selectByIndex(2);
		   js.executeScript("window.scrollBy(0,500)","" ); Thread.sleep(5000);
		 driver.findElement(By.xpath(prop.getProperty("G_Add_description"))).sendKeys(prop.getProperty("G_description_block"));
		 Thread.sleep(2000);
		 driver.findElement(By.xpath(prop.getProperty("G_confirm_button"))).click();
		 Thread.sleep(2000);
		 
		 logger.info("Provided the details of  Health & Diet and Clicked on Confirm Button----Success");
	}

	private JavascriptExecutor moreAboutMyPet() throws InterruptedException {
		logger.info("Providing the details in More about my pet section");
		 
		 driver.findElement(By.xpath(prop.getProperty("G_Select_Breed"))).click();
		 driver.findElement(By.xpath(prop.getProperty("G_Select_breed1"))).sendKeys("australian");
		 driver.findElement(By.xpath(prop.getProperty("G_Pet_breed"))).click();
		 driver.findElement(By.xpath(prop.getProperty("G_pet_weight"))).sendKeys("10");
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,300)");
		 driver.findElement(By.xpath(prop.getProperty("G_pet_weight1"))).click();
		 driver.findElement(By.name(prop.getProperty("G_pet_neutered"))).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath(prop.getProperty("G_pet_city"))).sendKeys("Oakland");
		 driver.findElement(By.xpath(prop.getProperty("G_pet_state"))).sendKeys("CA");
		 driver.findElement(By.xpath(prop.getProperty("G_pet_country"))).sendKeys("United States");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath(prop.getProperty("G_second_Next_step"))).click();
		 Thread.sleep(4000);
		 logger.info("Provided the Details in More About My Pet Section----Success");
		return js;
	}

	private void AboutMyPet() throws InterruptedException, IOException {
		logger.info("Started Creating the Pet Profile for New User");
			
 //driver.findElement(By.xpath(prop.getProperty("G_Pet_radiobutton"))).click();
 
 Thread.sleep(8000);
 driver.findElement(By.xpath(prop.getProperty("G_Pet_name"))).sendKeys("Puppy");
 driver.findElement(By.xpath(prop.getProperty("G_Pet_years"))).sendKeys("4");
 driver.findElement(By.xpath(prop.getProperty("G_Pet_months"))).sendKeys("10");
 driver.findElement(By.xpath(prop.getProperty("G_Pet_gender"))).click();
		
 Thread.sleep(10000);
	
	  driver.findElement(By.xpath(prop.getProperty("G_upload_image"))).click();
	  Thread.sleep(10000);
	  Runtime.getRuntime().exec(prop.getProperty("G_Auto_imageupload2"));
	  
	  
	  Thread.sleep(4000); Actions crop = new Actions(driver); Thread.sleep(10000);
	  WebElement
	  cropTracker=driver.findElement(By.xpath(prop.getProperty("G_crop_image")));
	  crop.dragAndDropBy(cropTracker, -10,100).perform(); Thread.sleep(1000);
	  Thread.sleep(4000); JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0,300)"); Thread.sleep(1000);
	  driver.findElement(By.xpath(prop.getProperty("G_image_submit"))).click();
	  Thread.sleep(2000);
	 
		 
 driver.findElement(By.xpath(prop.getProperty("G_first_Next_step"))).click();
 Thread.sleep(5000);
 logger.info("Provided the Details in About My Pet Section----Success");
	}
}

