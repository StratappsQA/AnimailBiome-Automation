package com.automation.animalbiome;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Dog_NoImg_Vet {
	WebDriver driver = Instance.getInstance();
	Properties prop = PropertiesFile.readPropertyFile("ab_datafile 1.properties");
	
	@Test(priority=4, enabled=true)
public void addpet_dog_noimg_vet() throws Exception {	
		
		//--addpet_button--------
		
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
//------------more about pet-----------------

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
driver.findElement(By.xpath(prop.getProperty("antibiotics_y"))).click();
Select s=new Select(driver.findElement(By.xpath(prop.getProperty("body_conditions_dropdown"))));
s.selectByIndex(0);
s.selectByValue("4");
driver.findElement(By.xpath(prop.getProperty("moreabout_nextstep_button"))).click();
Thread.sleep(5000);

//-----------------Health and diet-----------

driver.findElement(By.xpath(prop.getProperty("physical_conditions"))).click();
driver.findElement(By.xpath(prop.getProperty("diet"))).click();
js.executeScript("window.scrollBy(0,500)","" );
Thread.sleep(5000);
driver.findElement(By.xpath(prop.getProperty("mental_conditions"))).click();
driver.findElement(By.xpath(prop.getProperty("symptoms"))).click();	
js.executeScript("window.scrollBy(0,300)","" );
Thread.sleep(5000);
driver.findElement(By.xpath(prop.getProperty("decription"))).sendKeys(prop.getProperty("decription_info"));	
driver.findElement(By.xpath(prop.getProperty("confirm_button"))).click();
Thread.sleep(5000);
driver.findElement(By.xpath(prop.getProperty("add_vet_button"))).click();

//-------------------vet_information-------------
Thread.sleep(5000);
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
Select s1=new Select(driver.findElement(By.xpath(prop.getProperty("vet_country_dropdown"))));
s1.selectByValue("India");
driver.findElement(By.xpath(prop.getProperty("vet_email"))).sendKeys(prop.getProperty("vet_email_info"));		
driver.findElement(By.xpath(prop.getProperty("vet_phonenumber"))).sendKeys(prop.getProperty("vet_phonenumber_info"));	
driver.findElement(By.xpath(prop.getProperty("vet_add_vet"))).click();
js.executeScript("window.scrollBy(0,300)","" );
Thread.sleep(3000);
driver.findElement(By.xpath(prop.getProperty("final_submitbutton"))).click();
Thread.sleep(20000);
	
}

}
