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

public class Edit_Dog_Profile {
	final Logger logger = LogManager.getLogger(AddPet_NewUser.class);
	AnimalBiomeInitializer initializer = new AnimalBiomeInitializer("Edit_Dog_Profile.properties");
	WebDriver driver = initializer.getWebDriver();
	Properties prop = initializer.getProperties();

	@Test(priority = 6, enabled = true)
	public void edit_dog_profile() throws Exception {

		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		logger.info("Started editing the Dog Profile through the Dashbpoard");

		driver.findElement(By.xpath(prop.getProperty("Edit_pet_searchbutton"))).click();

		driver.findElement(By.xpath(prop.getProperty("Edit_pet_searchbutton"))).sendKeys(("Booster"));
		driver.findElement(By.xpath(prop.getProperty("Edit_pet_search_icon"))).click();
		Thread.sleep(8000);
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath(prop.getProperty("p_flipback_last")))).perform();
		Thread.sleep(10000);
		/*
		 * WebDriverWait wait =new WebDriverWait(driver, 50); WebElement
		 * element3=wait.until(ExpectedConditions.elementToBeClickable(By.
		 * xpath("(//div[@class='flip-card-back'])[last()]/div/button[2]")));
		 * 
		 * ((JavascriptExecutor) driver).executeScript("arguments[0].click();",
		 * element3);
		 */

		/*
		 * WebDriverWait wait1 = new WebDriverWait(driver, 50); WebElement element31 =
		 * wait1.until(ExpectedConditions.elementToBeClickable(By.xpath(prop.
		 * getProperty( "p_edit")))); ((JavascriptExecutor)
		 * driver).executeScript("arguments[0].click();", element31);
		 */

		Thread.sleep(8000);
		JavascriptExecutor js6 = (JavascriptExecutor) driver;
		js6.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(3000);
		driver.findElement(By.xpath(prop.getProperty("p_edit_nextbutton"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(prop.getProperty("p_edit_nextbutton"))).click();
		Thread.sleep(3000);
		js6.executeScript("window.scrollBy(0,600)", "");
		Thread.sleep(5000);
		driver.findElement(By.xpath(prop.getProperty("p_edit_none_medication"))).click();

		driver.findElement(By.xpath(prop.getProperty("p_edit_none_suppliments"))).click();
		driver.findElement(By.xpath(prop.getProperty("p_edit_none_animalbiome_suppliments"))).click();
		js6.executeScript("window.scrollBy(0,500)", "");
		driver.findElement(By.xpath(prop.getProperty("p_edit_other_diet"))).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(prop.getProperty("p_edit_other_diet_child"))).click();
		js6.executeScript("window.scrollBy(0,500)", "");
		driver.findElement(By.xpath(prop.getProperty("p_edit_none_physical"))).click();

		WebElement ele = driver.findElement(By.xpath(prop.getProperty("p_edit_none_symptoms1")));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click()", ele);
		Thread.sleep(2000);
		driver.findElement(By.xpath(prop.getProperty("p_confirm_button"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(prop.getProperty("p_edit_submit"))).click();
		Thread.sleep(10000);

		// Actions act = new Actions(driver);
		// JavascriptExecutor js6 = (JavascriptExecutor) driver;
		driver.findElement(By.xpath(prop.getProperty("Edit_pet_searchbutton"))).click();
		driver.findElement(By.xpath(prop.getProperty("Edit_pet_searchbutton"))).sendKeys(("Booster"));
		driver.findElement(By.xpath(prop.getProperty("Edit_pet_search_icon"))).click();
		Thread.sleep(8000);

		act.moveToElement(driver.findElement(By.xpath(prop.getProperty("p_flipback_last")))).perform();
		Thread.sleep(10000);
		/*
		 * WebDriverWait wait1 = new WebDriverWait(driver, 50); WebElement element311 =
		 * wait1.until(ExpectedConditions .elementToBeClickable(By.xpath(
		 * "(//div[@class='flip-card-back'])[last()]/div/button[2]")));
		 * ((JavascriptExecutor) driver).executeScript("arguments[0].click();",
		 * element311);
		 */

		Thread.sleep(5000);
		js6.executeScript("window.scrollBy(0,200)", "");
		WebElement ele1 = driver.findElement(By.xpath(prop.getProperty("p_edit_nextbutton")));
		js6.executeScript("arguments[0].click()", ele1);
		js6.executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(2000);
		driver.findElement(By.xpath(prop.getProperty("p_edit_nextbutton"))).click();
		Thread.sleep(2000);
		js6.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(5000);
		driver.findElement(By.xpath(prop.getProperty("p_edit_medication_behaviour"))).click();
		driver.findElement(By.xpath(prop.getProperty("p_edit_suppliments_Digestive"))).click();
		js6.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(5000);
		driver.findElement(By.xpath(prop.getProperty("p_edit_animalbiome_Doggybiome"))).click();
		driver.findElement(By.xpath(prop.getProperty("diet_Non_prescription"))).click();
		driver.findElement(By.xpath(prop.getProperty("p_edit_diet_wet/canned"))).click();
		driver.findElement(By.xpath(prop.getProperty("p_edit_other_diet"))).click();
		js6.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(5000);
		driver.findElement(By.xpath(prop.getProperty("physical_Gihealth"))).click();
		driver.findElement(By.xpath(prop.getProperty("physical_gi_colitics"))).click();
		driver.findElement(By.xpath(prop.getProperty("symptoms_skinissues"))).click();
		driver.findElement(By.xpath(prop.getProperty("symptoms_excessive_itching"))).click();
		Thread.sleep(1000);
		js6.executeScript("window.scrollBy(0,200)", "");
		Thread.sleep(1000);
		Select s1 = new Select(driver.findElement(By.xpath(prop.getProperty("severity_dropdown"))));
		s1.selectByIndex(2);
		Select s2 = new Select(driver.findElement(By.xpath(prop.getProperty("frequency_dropdown"))));
		s2.selectByIndex(2);
		Thread.sleep(2000);
		driver.findElement(By.xpath(prop.getProperty("p_confirm_button"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(prop.getProperty("p_edit_submit"))).click();
		Thread.sleep(10000);
		logger.info("Dog profile for Dashboard edited successfully");

	}
}
