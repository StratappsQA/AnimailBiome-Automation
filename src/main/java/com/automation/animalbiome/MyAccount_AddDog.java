package com.automation.animalbiome;

import java.util.List;
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



public class MyAccount_AddDog {
	final Logger logger = LogManager.getLogger(AddPet_NewUser.class);
	AnimalBiomeInitializer initializer = new AnimalBiomeInitializer("MyAccount_AddDog.properties");
	WebDriver driver = initializer.getWebDriver();
	Properties prop = initializer.getProperties();
	
	
	@Test(priority=12, enabled=true)
	

public void my_account_adddog() throws Exception {
			
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				
			myaccount_userprofile();
			
			
				//----about pet----
				
				JavascriptExecutor js=AboutMyPet();
				
				//--------more about my pet------------
				moreAboutMyPet(js);
				
				//-------health and diet-------
				healthAndDiet(js);
				
				//----vet details-----
				
				vetDetails(js);
				//----------pagination-------
				Pagination(js);
				
				
			}
		
	 
	  private void Pagination(JavascriptExecutor js) throws Exception {
		  logger.info("Checking the pagination");
		  driver.findElement(By.xpath(prop.getProperty("p_Myaccount"))).click();
		  driver.findElement(By.xpath(prop.getProperty("p_userprofile"))).click();
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//i[@class='fa fa-th-list p10']")).click();
		  Thread.sleep(5000);
		 
//JavascriptExecutor js3 = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,900)","" );
List<WebElement>pagination1=driver.findElements(By.xpath("(//ul[@class='pagination'])/li/a"));

for(int i=3;i<=pagination1.size()-3;i++)
{ 
	pagination1.get(i).click();
js.executeScript("window.scrollBy(0,900)","" );
Thread.sleep(8000);

 } 
logger.info("Pagination is working");
	}

	private void vetDetails(JavascriptExecutor js) throws InterruptedException {
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
		    prop.getProperty("vet_postalcode_info")); Select s3=new
		    Select(driver.findElement(By.xpath(prop.getProperty("vet_country_dropdown"))));
		    s3.selectByValue("India");
		    driver.findElement(By.xpath(prop.getProperty("vet_email"))).sendKeys(prop.
		    getProperty("vet_email_info"));
		    driver.findElement(By.xpath(prop.getProperty("vet_phonenumber"))).sendKeys(
		    prop.getProperty("vet_phonenumber_info"));
		    driver.findElement(By.xpath(prop.getProperty("vet_add_vet"))).click();
		    js.executeScript("window.scrollBy(0,300)","" ); Thread.sleep(3000);
		    driver.findElement(By.xpath(prop.getProperty("final_submitbutton"))).click();
		    Thread.sleep(20000);
		    logger.info("Provided the Vet Details and clicked on Submit Button----Success");
			logger.info("Successfully Completed the Dog Profile with my account");
		
	}

	private void healthAndDiet(JavascriptExecutor js) throws Exception {
		logger.info("Providing the details in Health & Diet Section");
		  driver.findElement(By.xpath(prop.getProperty("antibiotics_y"))).click();
		   Select s=new Select(driver.findElement(By.xpath(prop.getProperty(
		   "body_conditions_dropdown")))); s.selectByIndex(0); s.selectByValue("4");
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
		  Thread.sleep(1000);
		  Select s1=new
		  Select(driver.findElement(By.xpath(prop.getProperty("severity_dropdown"))));
		  s1.selectByIndex(2);
		   Select s2=new
		    Select(driver.findElement(By.xpath(prop.getProperty("frequency_dropdown"))));
		    s2.selectByIndex(2);
		    js.executeScript("window.scrollBy(0,500)","" ); 
		    Thread.sleep(5000);
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
		  driver.findElement(By.xpath(prop.getProperty("pet_breed1"))).sendKeys("akita"
		  );
		  driver.findElement(By.xpath(prop.getProperty("pet_breed_select"))).click();
		  driver.findElement(By.xpath(prop.getProperty("pet_bread2"))).click();
		  driver.findElement(By.xpath(prop.getProperty("pet_bread2"))).sendKeys("akita"
		  );
		  driver.findElement(By.xpath(prop.getProperty("pet_breed_select2"))).click();
		  Thread.sleep(5000);
		  driver.findElement(By.xpath(prop.getProperty("pet_weight"))).sendKeys("3");
		  Thread.sleep(5000);
		  driver.findElement(By.xpath(prop.getProperty("lbs_radio"))).click();
		  js.executeScript("window.scrollBy(0,500)","" ); Thread.sleep(5000);
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
		
		  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		  logger.info("Providing the Details of Dog in About My Pet Section");
		  driver.findElement(By.xpath(prop.getProperty("pet_name"))).sendKeys((prop.
		  getProperty("p_pet_name_info"))+"_" +System.currentTimeMillis());
		  driver.findElement(By.xpath(prop.getProperty("pet_years"))).sendKeys("3");
		  driver.findElement(By.xpath(prop.getProperty("pet_months"))).sendKeys("3");
		  Thread.sleep(5000);
		  driver.findElement(By.xpath(prop.getProperty("male_radiobutton"))).click();
		  WebElement
		  pet_profile=driver.findElement(By.xpath(prop.getProperty("profile_image")));
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,400)","" ); Thread.sleep(5000);
		  driver.findElement(By.xpath(prop.getProperty("aboutpet_nextstepbutton"))).
		  click(); 
		  Thread.sleep(5000); 
		  logger.info("Provided the Details in About My Pet Section----Success");  
		
		return js;
	}



	private void myaccount_userprofile() throws Exception {
		  logger.info("Started Creating the Dog Profile for exist User with my account");
		  driver.findElement(By.xpath(prop.getProperty("p_Myaccount"))).click();
		  Thread.sleep(5000); 
		  List<WebElement> list2=driver.findElements(By.xpath(prop.getProperty("p_droplist")));
		  
		  for(int i=0;i<list2.size();i++) {
		  if(list2.get(i).getText().contains("User Profile"))
		  { 
			  list2.get(i).click();
		  break;
		  } } Thread.sleep(5000);
		  WebDriverWait wait = new WebDriverWait(driver,50);
		  wait.until(ExpectedConditions.elementToBeClickable(By.xpath(prop.getProperty(
		  "p_addpet")))).click(); 
	  
	  logger.info("Selected the User profile through my account");
	  }
	  	  

}
