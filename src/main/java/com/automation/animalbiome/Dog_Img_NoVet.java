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

public class Dog_Img_NoVet {
	WebDriver driver = Instance.getInstance();
	Properties prop = PropertiesFile.readPropertyFile("ab_datafile 1.properties");
	
	@Test(priority=3, enabled=true)
public void addpet_dogimg_novet() throws Exception {	
		
		//----------add pet button------------
		
driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
WebDriverWait wait = new WebDriverWait(driver,50);
wait.until(ExpectedConditions.elementToBeClickable(By.xpath(prop.getProperty("addpet_button")))).click();
		 
	 //--------------------addpet------------
	 
driver.findElement(By.xpath(prop.getProperty("pet_name"))).sendKeys((prop.getProperty("pet_name_info"))+"_" +System.currentTimeMillis());
driver.findElement(By.xpath(prop.getProperty("pet_years"))).sendKeys("3");
driver.findElement(By.xpath(prop.getProperty("pet_months"))).sendKeys("3");
Thread.sleep(5000);
driver.findElement(By.xpath(prop.getProperty("female_radiobutton"))).click();

WebElement pet_profile=driver.findElement(By.xpath(prop.getProperty("profile_image")));
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,400)","" );
Thread.sleep(5000);
/*
 * driver.findElement(By.xpath(prop.getProperty("profile_image"))).click();
 * Thread.sleep(5000);
 * Runtime.getRuntime().exec(prop.getProperty("Archer_image1"));
 * Thread.sleep(10000);
 * driver.findElement(By.xpath(prop.getProperty("popup_submitbutton"))).click();
 */
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
driver.findElement(By.xpath(prop.getProperty("kgs_radio"))).click();
js.executeScript("window.scrollBy(0,500)","" );
Thread.sleep(5000);
driver.findElement(By.xpath(prop.getProperty("neutered_n"))).click();
driver.findElement(By.xpath(prop.getProperty("pet_city"))).sendKeys(prop.getProperty("pet_city_info"));
driver.findElement(By.xpath(prop.getProperty("pet_state"))).sendKeys(prop.getProperty("pet_state_info"));
driver.findElement(By.xpath(prop.getProperty("pet_country"))).sendKeys(prop.getProperty("pet_country_info"));

driver.findElement(By.xpath(prop.getProperty("moreabout_nextstep_button"))).click();
Thread.sleep(5000);

//-----------------Health and diet-----------

driver.findElement(By.xpath(prop.getProperty("antibiotics_y"))).click();
Select s1=new Select(driver.findElement(By.xpath(prop.getProperty(
"body_conditions_dropdown"))));
s1.selectByIndex(0); 
s1.selectByValue("4");
js.executeScript("window.scrollBy(0,500)","" );
Thread.sleep(5000);

driver.findElement(By.xpath(prop.getProperty("medication_molitary"))).click();
driver.findElement(By.xpath(prop.getProperty("medication_molitary_child"))).click();
js.executeScript("window.scrollBy(0,200)","" );
driver.findElement(By.xpath(prop.getProperty("suppliments_fibre"))).click();
driver.findElement(By.xpath(prop.getProperty("suppiments_fibre_child"))).click();
js.executeScript("window.scrollBy(0,500)","" );
driver.findElement(By.xpath(prop.getProperty("Animalbiome_Gutrestore_suppliments"))).click();
driver.findElement(By.xpath(prop.getProperty("Animalbiome_Gutrestore_30_cap"))).click();
driver.findElement(By.xpath(prop.getProperty("Animalbiome_Gutrestore_60_cap"))).click();
driver.findElement(By.xpath(prop.getProperty("diet_prescription"))).click();
driver.findElement(By.xpath(prop.getProperty("diet_Fresh_frozen_cooked"))).click();
driver.findElement(By.xpath(prop.getProperty("diet_fresh_frozen_child_commercial"))).click();
driver.findElement(By.xpath(prop.getProperty("diet_fresh_frozen_child_homemade"))).click();
js.executeScript("window.scrollBy(0,500)","" );
driver.findElement(By.xpath(prop.getProperty("physical_Gihealth"))).click();
driver.findElement(By.xpath(prop.getProperty("physical_gi_ibd"))).click();
driver.findElement(By.xpath(prop.getProperty("physical_gi_ibd_suspected"))).click();
js.executeScript("window.scrollBy(0,400)","" );
driver.findElement(By.xpath(prop.getProperty("physical_gi_ibd_suspected_tylosin"))).click();
/*
 * driver.findElement(By.xpath(prop.getProperty("physical_conditions"))).click()
 * ; driver.findElement(By.xpath(prop.getProperty("diet"))).click();
 * js.executeScript("window.scrollBy(0,500)","" ); Thread.sleep(5000);
 * driver.findElement(By.xpath(prop.getProperty("mental_conditions"))).click();
 * driver.findElement(By.xpath(prop.getProperty("symptoms"))).click();
 * js.executeScript("window.scrollBy(0,300)","" ); Thread.sleep(5000);
 * driver.findElement(By.xpath(prop.getProperty("decription"))).sendKeys(prop.
 * getProperty("decription_info"));
 * driver.findElement(By.xpath(prop.getProperty("confirm_button"))).click();
 * Thread.sleep(3000);
 * driver.findElement(By.xpath(prop.getProperty("final_submitbutton"))).click();
 * Thread.sleep(20000);
 */
	}

}
