package com.automation.animalbiome;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Properties;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Register_Sample_Dog_Gut {
	
	final Logger logger = LogManager.getLogger(Register_Sample_Dog_Gut.class);

	WebDriver driver = Instance.getInstance();
	Properties prop = PropertiesFile.readPropertyFile("Register_Sample_Dog_Gut.properties");

	@Test(priority=10,enabled=true)
	public void register_sample_dog_gut() throws Exception {	
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath(prop.getProperty("p_Register_button"))).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath(prop.getProperty("p_pet_dropdown"))).click();
		driver.findElement(By.xpath(prop.getProperty("p_pet_dropdown"))).sendKeys("Archer_16516653");
		Thread.sleep(5000);
		driver.findElement(By.xpath(prop.getProperty("p_pet_select"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(prop.getProperty("p_select_drop"))).click();
		List<WebElement> li=driver.findElements(By.xpath(prop.getProperty("p_select_droplist")));
		for(int i=0;i<li.size()-1;i++)
		{
			li.get(0).click();
			
		}
		JavascriptExecutor js12 = (JavascriptExecutor) driver;
		  js12.executeScript("window.scrollBy(0,100)","" );
		  Thread.sleep(5000); 
		  driver.findElement(By.xpath(prop.getProperty("p_sampleid"))).sendKeys("HMTDJU");
		  driver.findElement(By.xpath(prop.getProperty("p_calender"))).click();
		  Thread.sleep(5000); 
			
			/*
			 * WebDriverWait wait = new WebDriverWait(driver,50);
			 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(prop.getProperty(
			 * "p_date_select")))).click();
			 */
			  
		 // driver.findElement(By.xpath(prop.getProperty("p_date_select"))).click();
		  Thread.sleep(3000);
			  driver.findElement(By.xpath(prop.getProperty("p_consistancy_image"))).click();
			   js12.executeScript("window.scrollBy(0,200)","" );
			  Thread.sleep(1000);
			  driver.findElement(By.xpath(prop.getProperty("p_fecal_redstreak"))).click();
			  driver.findElement(By.xpath(prop.getProperty("p_fecal_blood"))).click();
			  driver.findElement(By.xpath(prop.getProperty("p_animalbiome_suppliments_teef"))).click();
			  js12.executeScript("window.scrollBy(0,300)","" );
			  Thread.sleep(1000);
			  driver.findElement(By.xpath(prop.getProperty("p_medication_anti"))).click(); 
			  js12.executeScript("window.scrollBy(0,200)","" );
			  Thread.sleep(1000);
			  driver.findElement(By.xpath(prop.getProperty("p_suppliments_Probiotics"))).click();
			   js12.executeScript("window.scrollBy(0,800)","" );
			   Thread.sleep(1000); 
			   driver.findElement(By.xpath(prop.getProperty("p_physical_gi_Acute_Gastritis"))).click();
			   driver.findElement(By.xpath(prop.getProperty("p_diet_wet/canned"))).click();
			   js12.executeScript("window.scrollBy(0,1000)","" );
			   Thread.sleep(1000); 
			   driver.findElement(By.xpath(prop.getProperty("symptoms_skinissues"))).click();
				 driver.findElement(By.xpath(prop.getProperty("symptoms_excessive_itching"))).click();
				 js12.executeScript("window.scrollBy(0,300)","" ); 
				 Select s2=new Select(driver.findElement(By.xpath(prop.getProperty("p_severity_dropdown")))); 
				 s2.selectByIndex(2); Select s3=new
				 Select(driver.findElement(By.xpath(prop.getProperty("p_frequency_dropdown")))); 
				 s3.selectByIndex(2);
				 driver.findElement(By.xpath(prop.getProperty("p_register_submit"))).click();
				 Thread.sleep(10000);
				 logger.info("Gut Sample for Dog Registered Successfully");
	}

	public static void main(String[] args) throws SQLException {

		try {
			String query1 = "update assessments_assessment set status ='unregistered' where sample_registration_key ='HMTDJU'";

			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection con = DriverManager.getConnection("jdbc:postgresql://139.59.1.205:5432/animalbiome_release",
					"postgres", "Xtremand12");
			Statement stmt = con.createStatement();

			int count = stmt.executeUpdate(query1);
			System.out.println("Number of rows updated by executing query1 =  " + count);
			System.out.println("Update Query Executed Successfully");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
