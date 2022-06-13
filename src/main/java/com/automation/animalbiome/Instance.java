package com.automation.animalbiome;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Instance {

		public static WebDriver driver;

		  public static WebDriver getInstance() 	  {
			  if (driver == null) 
			   {
				  
				System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
			   	ChromeOptions options = new ChromeOptions();
			   	//options.setBinary("C:\\ThePAthtoChrome.exe");
			   	options.addArguments("incognito");
			   	options.addArguments("use-fake-ui-for-media-stream"); 
			   	driver = new ChromeDriver(options);
			   }
			   return driver;
			 }
	}

