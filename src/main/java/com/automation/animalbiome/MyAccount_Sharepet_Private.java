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



public class MyAccount_Sharepet_Private {
	WebDriver driver = Instance.getInstance();
	Properties prop = PropertiesFile.readPropertyFile("MyAccount_Sharepet_Private.properties");
	
	@Test(priority=15, enabled=true)
	public  void MyAccount_sahrepet_public() throws Exception {
		Thread.sleep(8000);
		 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		 driver.findElement(By.xpath(prop.getProperty("p_Myaccount"))).click();
		 driver.findElement(By.xpath(prop.getProperty("p_userprofile"))).click(); 
		 Thread.sleep(5000);
	driver.findElement(By.xpath(prop.getProperty("p_search_particular"))).click();
	 driver.findElement(By.xpath(prop.getProperty("p_search_particular"))).sendKeys("Booster");
	 driver.findElement(By.xpath(prop.getProperty("p_search_bar1"))).click();
	 Thread.sleep(8000);
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,300)","" );
	 Thread.sleep(3000);
	 Actions act=new Actions(driver);
	  act.moveToElement(driver.findElement(By.xpath(prop.getProperty(
	  "p_flipback_last_1")))).perform(); 
	  Thread.sleep(5000);
		/*
		 * Actions act=new Actions(driver);
		 * act.moveToElement(driver.findElement(By.xpath(prop.getProperty(
		 * "p_sharepetlinkprivate")))).perform(); Thread.sleep(5000);
		 */
		/*
		 * WebDriverWait wait = new WebDriverWait(driver,50); WebElement
		 * element3=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(prop.
		 * getProperty("p_viewpet"))));
		 * ((JavascriptExecutor)driver).executeScript("arguments[0].click();",
		 * element3);
		 */
	 driver.findElement(By.xpath(prop.getProperty("p_viewpet"))).click();
	 driver.findElement(By.xpath(prop.getProperty("p_sharepetlinkpublic"))).click();
	 Thread.sleep(6000);
	 WebElement abc=driver.findElement(By.xpath(prop.getProperty("p_copylink")));
	 String typedText1 =driver.findElement(By.xpath(prop.getProperty("p_readtext"))).getAttribute("value");
	 System.out.println("private link is " + typedText1);
	 ((JavascriptExecutor)driver).executeScript("window.open()"); 
	 ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	  driver.switchTo().window(tabs.get(1));
	  driver.get(typedText1);
	 Thread.sleep(10000); 
	 driver.close(); 
	 driver.switchTo().window(tabs.get(0)); 
	 Thread.sleep(2000);
	 driver.findElement(By.xpath(prop.getProperty("p_close"))).click();
	 Thread.sleep(20000);

}
	}
