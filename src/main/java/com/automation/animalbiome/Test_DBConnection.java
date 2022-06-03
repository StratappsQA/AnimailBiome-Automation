package com.automation.animalbiome;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test_DBConnection {
	


	public static void main(String args[]) {
	      Connection c = null;
	      try {
	         Class.forName("org.postgresql.Driver");
	         c = DriverManager
	            .getConnection("jdbc:postgresql://139.59.1.205:5432/animalbiome_release",
	            "postgres", "Xtremand12");
	      } catch (Exception e) {
	         e.printStackTrace();
	         System.err.println(e.getClass().getName()+": "+e.getMessage());
	         System.exit(0);
	      }
	      System.out.println("Opened database successfully");
	   }
	}