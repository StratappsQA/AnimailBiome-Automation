package com.automation.animalbiome;

import org.testng.annotations.Test;

public class ABTestNG {
	
	@Test(priority = 1, enabled = true)
	   public void OpeningWebApplication() {
	      System.out.println("Successfully Opened the Web Application");
	   }
	   @Test(priority = 2, enabled = true)
	   public void SignupProcess() {
	      System.out.println("Successfully Signed up and signed In to the application");
	   }
	   @Test(priority = 3, enabled = true)
	   public void Signingout_NewUser() {
	      System.out.println("NewUser Successfully got Signed Out");
	   }
}
