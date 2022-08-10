package com.automation.animalbiome;

import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;



public class MyAccount_Sharepet_Public {
	WebDriver driver = Instance.getInstance();
	Properties prop = PropertiesFile.readPropertyFile("ab_datafile.properties");
	
	@Test(priority=17, enabled=true)
	public  void MyAccount_sharepetpublic() throws Exception {
		 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElement(By.xpath(prop.getProperty("p_Myaccount"))).click();
		 driver.findElement(By.xpath(prop.getProperty("p_userprofile"))).click(); 
		 Thread.sleep(5000);
			/*
			 * driver.findElement(By.xpath("//i[@class='fa fa-th-list p10']")).click();
			 * Thread.sleep(5000);
			 */
	driver.findElement(By.xpath(prop.getProperty("p_search_particular"))).click();
	 driver.findElement(By.xpath(prop.getProperty("p_search_particular"))).sendKeys("Booster");
	 driver.findElement(By.xpath(prop.getProperty("p_search_bar1"))).click();
	 Thread.sleep(8000);
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,300)","" );
	 Thread.sleep(5000);
		
		  Actions act=new Actions(driver);
		  act.moveToElement(driver.findElement(By.xpath(prop.getProperty(
		  "p_flipback_last_1")))).perform(); Thread.sleep(5000);
		 
	 driver.findElement(By.xpath(prop.getProperty("p_viewpet"))).click();
	 driver.findElement(By.xpath(prop.getProperty("p_sharepetlinkpublic"))).click();
	 Thread.sleep(9000);
	 WebElement abc=driver.findElement(By.xpath("//a[text()='Copy Link']"));
	 String typedText =driver.findElement(By.xpath("//input[@readonly='readonly']")).getAttribute("value");
	 System.out.println("public link is " + typedText);
	 ((JavascriptExecutor)driver).executeScript("window.open()"); 
	 ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	  driver.switchTo().window(tabs.get(1));
	  driver.get(typedText);
	 Thread.sleep(20000); 
	 driver.close(); 
	 driver.switchTo().window(tabs.get(0)); 
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//button[@class='col-xs-1 col-md-1 col-sm-1 close-circle']")).click();
	// Thread.sleep(6000);
		/*
		 * WebElement ele =
		 * driver.findElement(By.xpath(prop.getProperty("G_My_account"))); Actions
		 * action =new Actions(driver); action.moveToElement(ele).perform();
		 * Thread.sleep(3000);
		 * driver.findElement(By.xpath(prop.getProperty("G_Sign_Out"))).click();
		 */
	 Thread.sleep(10000);
	}
}
