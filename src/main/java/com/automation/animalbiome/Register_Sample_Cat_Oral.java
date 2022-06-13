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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;



public class Register_Sample_Cat_Oral {
	
	final Logger logger = LogManager.getLogger(Register_Sample_Cat_Oral.class);
	WebDriver driver = Instance.getInstance();
	Properties prop = PropertiesFile.readPropertyFile("Register_Sample_Cat_Oral.properties");
	
	@Test(priority=13, enabled=true)
public void register_sample_cat_oral() throws Exception {	
					
driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
driver.findElement(By.xpath(prop.getProperty("p_Register_button"))).click();
Thread.sleep(15000);
driver.findElement(By.xpath(prop.getProperty("p_pet_dropdown"))).click();
driver.findElement(By.xpath(prop.getProperty("p_pet_dropdown"))).sendKeys("cat_pet");
Thread.sleep(5000);
driver.findElement(By.xpath(prop.getProperty("p_pet_select"))).click();
Thread.sleep(5000);
List<WebElement> li=driver.findElements(By.xpath(prop.getProperty("p_select_droplist")));
for(int i=0;i<li.size()-1;i++)
{
	li.get(1).click();
}

  JavascriptExecutor js12 = (JavascriptExecutor) driver;
  js12.executeScript("window.scrollBy(0,100)","" );
  Thread.sleep(5000); 
  driver.findElement(By.xpath(prop.getProperty("p_sampleid"))).sendKeys("KGNRRJ");
  driver.findElement(By.xpath(prop.getProperty("p_calender"))).click();
  Thread.sleep(5000); 
	/*
	 * Actions act= new Actions(driver);
	 * act.moveToElement(driver.findElement(By.xpath(prop.getProperty(
	 * "p_date_select")))).click();
	 */
	
	/*
	 * WebDriverWait wait = new WebDriverWait(driver,50);
	 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(prop.getProperty(
	 * "p_date_select")))).click();
	 */
	 
  driver.findElement(By.xpath("(//div[@class='dayContainer'])/span[@aria-current='date']")).click();
  Thread.sleep(1000);
  js12.executeScript("window.scrollBy(0,500)","" );
  Thread.sleep(1000);
  driver.findElement(By.xpath(prop.getProperty("p_cat_Animalbiome_gutmaintanance"))).click();
  driver.findElement(By.xpath(prop.getProperty("p_diet_wet/canned"))).click();
  js12.executeScript("window.scrollBy(0,500)","" );
  Thread.sleep(1000);
  driver.findElement(By.xpath(prop.getProperty("p_medication_anti"))).click();
  driver.findElement(By.xpath(prop.getProperty("p_suppliments_Probiotics"))).click();
  js12.executeScript("window.scrollBy(0,700)","" );
  Thread.sleep(1000);
  driver.findElement(By.xpath(prop.getProperty("p_physical_colitics_cat"))).click();
  driver.findElement(By.xpath(prop.getProperty("p_symptoms_none"))).click();
  js12.executeScript("window.scrollBy(0,600)","" );
  Thread.sleep(1000);
  driver.findElement(By.xpath(prop.getProperty("p_register_submit"))).click();
  Thread.sleep(15000);
  logger.info("Oral Sample for Cat Registered Successfully");

	}
	
	
	public static void main(String[] args) throws SQLException {

		try {
			String query1 = "update assessments_assessment set status ='unregistered' where sample_registration_key ='KGNRRJ'";

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

}}


