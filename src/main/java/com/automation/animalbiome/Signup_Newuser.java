package com.automation.animalbiome;

import java.sql.SQLException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.automation.animalbiome.util.AnimalBiomeInitializer;
import com.automation.animalbiome.util.ElementFinder;

public class Signup_Newuser {

	final Logger logger = LogManager.getLogger(Signup_Newuser.class);
	
	AnimalBiomeInitializer initializer = new AnimalBiomeInitializer("Signup_Newuser.properties");
	WebDriver driver = initializer.getWebDriver();
	Properties prop = initializer.getProperties();

	String Domainformat = "@vomoto.com";
	String emailid = "QA_Team";

	@Test(priority = 1, enabled = true)

	public void OpeningWebApplication() throws InterruptedException {

		logger.info("Opening the WebApplication");

		driver.get("https://release.animalbiome.com/signin");

		driver.manage().window().maximize();
		// Thread.sleep(4000);

		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("Bannerclick"))));
		ElementFinder.findXPathElementAndClick(driver, "Bannerclick", prop);
		logger.info("Successfully Opened the Web Application");
	}

	@Test(priority = 2, enabled = true)
	public void SignupProcess() throws InterruptedException, SQLException {

		logger.info("Signing up to the application");

		Thread.sleep(5000);
		driver.findElement(By.xpath(prop.getProperty("signupclick"))).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(prop.getProperty("Signup_FN"))).sendKeys("animalBiome");
		Thread.sleep(1000);
		driver.findElement(By.xpath(prop.getProperty("Signup_LN"))).sendKeys("QA_Team");
		Thread.sleep(2000);
		driver.findElement(By.xpath(prop.getProperty("Signup_email"))).sendKeys(prop.getProperty("Email_Address"));
		Thread.sleep(2000);
		String copiedEmailId = driver.findElement(By.xpath(prop.getProperty("New_Email_Copy"))).getAttribute("value")
				.toString();
		driver.findElement(By.xpath(prop.getProperty("Signup_password"))).sendKeys("password");
		driver.findElement(By.xpath(prop.getProperty("Signup_confirm_pwd"))).sendKeys("password");
		Thread.sleep(2000);
		driver.findElement(By.xpath(prop.getProperty("Signup_button"))).click();

		Thread.sleep(5000);
		String expectedErrorMessage = "User with this email already exists";

		// identify actual error message
		String trimmedErrorMessage = "";
		try {
			WebElement m = driver.findElement(By.xpath(prop.getProperty("Signup_msg_capture")));
			String errorMessageFromUI = m.getText();
			trimmedErrorMessage = errorMessageFromUI.substring(1, errorMessageFromUI.length()).trim();
		} catch (NoSuchElementException e) {
			logger.info("Error Message Element Not Found Because Of New Email Id");
		}

		if (expectedErrorMessage.equals(trimmedErrorMessage)) {
			signUpByAddingTimeStampToEmailId();
		} else {
			signUpAndSignIn(copiedEmailId);
		}

	}

	private void signUpAndSignIn(String copiedText1) throws InterruptedException {
		Thread.sleep(5000);
		Actions Signup = new Actions(driver);
		WebElement Signup_confirm = driver.findElement(By.xpath(prop.getProperty("Signup_Confirm")));
		Signup.moveToElement(Signup_confirm).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(prop.getProperty("Pop_Confirm"))).click();
		Thread.sleep(4000);
		logger.info("Successfully Signedup to the application");

		logger.info("Started Signin process with the Given email address");
		driver.findElement(By.xpath(prop.getProperty("Signin_Email"))).sendKeys(copiedText1);
		Thread.sleep(2000);
		driver.findElement(By.xpath(prop.getProperty("Signin_pwd"))).sendKeys("password");
		Thread.sleep(2000);
		driver.findElement(By.xpath(prop.getProperty("Signin_Click"))).click();

		// System.out.println("Successfully Signed up to the application");
		logger.info("Successfully SignedIn to the application with the Given email address");
	}

	private void signUpByAddingTimeStampToEmailId() throws InterruptedException {
		logger.info("Signing with the New Email Address");
		Thread.sleep(2000);
		driver.findElement(By.xpath(prop.getProperty("Msg_Clear"))).click();
		Thread.sleep(3500);
		driver.findElement(By.xpath(prop.getProperty("Email_Clear"))).clear();
		Thread.sleep(5000);
		driver.findElement(By.xpath(prop.getProperty("New_Email")))
				.sendKeys((emailid) + System.currentTimeMillis() + "".concat(Domainformat));
		Thread.sleep(5000);
		String copiedText = driver.findElement(By.xpath(prop.getProperty("New_Email_Copy"))).getAttribute("value")
				.toString();
		System.out.println(copiedText);
		Thread.sleep(5000);
		driver.findElement(By.xpath(prop.getProperty("Signup_button"))).click();
		Thread.sleep(5000);
		Actions Signup = new Actions(driver);
		WebElement Signup_confirm = driver.findElement(By.xpath(prop.getProperty("Signup_Confirm")));
		Signup.moveToElement(Signup_confirm).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(prop.getProperty("Pop_Confirm"))).click();
		Thread.sleep(4000);
		logger.info("Successfully Signedup to the application with New Email Address");

		logger.info("Started Signin process with the new email address");
		driver.findElement(By.xpath(prop.getProperty("Signin_Email"))).sendKeys(copiedText);
		Thread.sleep(2000);
		driver.findElement(By.xpath(prop.getProperty("Signin_pwd"))).sendKeys("password");
		Thread.sleep(2000);
		driver.findElement(By.xpath(prop.getProperty("Signin_Click"))).click();
		logger.info("Successfully SignedIn to the application with the new email address");
	}
}
