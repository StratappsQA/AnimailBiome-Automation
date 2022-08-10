package com.automation.animalbiome;


	import java.util.Properties;

	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.Test;

	public class MyAccount_EditCat {
		
		
	WebDriver driver = Instance.getInstance();
	Properties prop = PropertiesFile.readPropertyFile("MyAccount_EditCat.properties");

	@Test(priority = 14, enabled = true)
	public void MyAccount_editcat() throws Exception {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		  driver.findElement(By.xpath(prop.getProperty("p_Myaccount"))).click();
		  driver.findElement(By.xpath(prop.getProperty("p_userprofile"))).click();
		 
		Thread.sleep(10000);
		driver.findElement(By.xpath(prop.getProperty("p_searchbar"))).click();
		driver.findElement(By.xpath(prop.getProperty("p_searchbar"))).sendKeys("Charlie");
		driver.findElement(By.xpath(prop.getProperty("p_searchicon"))).click();
		Thread.sleep(5000);

		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath(prop.getProperty("p_flipback_last_1")))).perform();
		Thread.sleep(10000);
		WebDriverWait wait = new WebDriverWait(driver, 50);
		WebElement element3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(prop.getProperty("p_edit"))));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element3);
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.findElement(By.xpath(prop.getProperty("edit_next_about"))).click();
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(1000);
		driver.findElement(By.xpath(prop.getProperty("edit_moreabout_next"))).click();
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(2000);
		driver.findElement(By.xpath(prop.getProperty("p_cat_medication_Antihistamines"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(prop.getProperty("p_cat_suppliments"))).click();
		js.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(1000);
		driver.findElement(By.xpath(prop.getProperty("p_cat_Animalbiome_gutmaintanance"))).click();
		driver.findElement(By.xpath(prop.getProperty("p_edit_diet_wet/canned"))).click();
		js.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(2000);
		driver.findElement(By.xpath(prop.getProperty("p_cat_oral"))).click();
		driver.findElement(By.xpath(prop.getProperty("p_oral_child"))).click();

		// js.executeScript("window.scrollBy(0,900)","" ); Thread.sleep(1000);
		driver.findElement(By.xpath(prop.getProperty("symptoms_skinissues"))).click();

		driver.findElement(By.xpath(prop.getProperty("symptoms_excessive_itching"))).click();
		js.executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(5000);

		Select s2 = new Select(driver.findElement(By.xpath(prop.getProperty("p_severity_dropdown"))));
		s2.selectByIndex(2);

		Select s3 = new Select(driver.findElement(By.xpath(prop.getProperty("p_frequency_dropdown"))));
		s3.selectByIndex(2);
		js.executeScript("window.scrollBy(0,900)", "");
		Thread.sleep(1000);
		driver.findElement(By.xpath(prop.getProperty("p_confirm_edit"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(prop.getProperty("p_edit_submit"))).click();
		Thread.sleep(20000);

		driver.findElement(By.xpath(prop.getProperty("p_Myaccount"))).click();
		driver.findElement(By.xpath(prop.getProperty("p_userprofile"))).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath(prop.getProperty("p_searchbar"))).click();
		driver.findElement(By.xpath(prop.getProperty("p_searchbar"))).sendKeys("Charlie");
		driver.findElement(By.xpath(prop.getProperty("p_searchicon"))).click();
		Thread.sleep(5000);
		Actions act1 = new Actions(driver);
		act1.moveToElement(driver.findElement(By.xpath(prop.getProperty("p_flipback_last_1")))).perform();
		Thread.sleep(10000);
		WebDriverWait wait1 = new WebDriverWait(driver, 50);
		WebElement element31 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath(prop.getProperty("p_edit"))));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element31);
		
		/*
		 * //Actions act=new Actions(driver);
		 * act.moveToElement(driver.findElement(By.xpath(prop.getProperty(
		 * "p_flipback_last")))).perform(); Thread.sleep(10000); WebDriverWait wait1 =
		 * new WebDriverWait(driver,50); // WebElement
		 * element31=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(prop.
		 * getProperty("p_edit"))));
		 * ((JavascriptExecutor)driver).executeScript("arguments[0].click();",element3);
		 * Thread.sleep(5000);
		 * 
		 * //WebDriverWait wait =new WebDriverWait(driver,50);
		 * 
		 * WebElement element31=wait.until(ExpectedConditions.elementToBeClickable(By.
		 * xpath("(//div[@class='flip-card-back'])[last()]/div/button[2]")));
		 * 
		 * 
		 * 
		 * ((JavascriptExecutor)driver).executeScript("arguments[0].click();",
		 * element31);
		 */

		js.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(1000);
		driver.findElement(By.xpath(prop.getProperty("edit_next_about"))).click();
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(1000);
		driver.findElement(By.xpath(prop.getProperty("edit_moreabout_next"))).click();
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,800)", "");
		Thread.sleep(1000);
		driver.findElement(By.xpath(prop.getProperty("edit_cat_none_med"))).click();
		driver.findElement(By.xpath(prop.getProperty("edit_cat_none_suppliments"))).click();
		js.executeScript("window.scrollBy(0,400)", "");

		Thread.sleep(3000);

		driver.findElement(By.xpath(prop.getProperty("edit_cat_ab_none_suppli"))).click();
		driver.findElement(By.xpath(prop.getProperty("Edit_pet_diet_wet_food"))).click();
		js.executeScript("window.scrollBy(0,500)", "");

		Thread.sleep(2000);
		driver.findElement(By.xpath(prop.getProperty("edit_symptoms_none"))).click();
		js.executeScript("window.scrollBy(0,300)", "");

		Thread.sleep(3000);
		driver.findElement(By.xpath(prop.getProperty("edit_physical_none"))).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(prop.getProperty("p_confirm_edit"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(prop.getProperty("p_edit_submit"))).click();
		Thread.sleep(20000);
	}

}
