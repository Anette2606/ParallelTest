package com.test.junitdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.junit.*;
import org.junit.experimental.ParallelComputer;
import org.junit.runner.JUnitCore;


public class AddACustomer {
	
	WebDriver driver;
	
	 @Test
	    public void test_LT_ToDoApp() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\DiversA\\chromedriver_win32\\chromedriver.exe");  
 		driver = new ChromeDriver();
	    	driver.manage().window().maximize();
	        driver.navigate().to("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
	        
	        //I click in Bank Manger Login   
	       
	        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[2]/button")).click();
	        
			//I click in Add customer
	        
	        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[1]")).click();
			
			
			//I fill the firstname with Anette
	        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input")).click();
	        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input")).sendKeys("Anette");
	        Thread.sleep(3000);
	      //I fill the lastname with Avila
	        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input")).click();
			driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input")).sendKeys("Avila");
			Thread.sleep(3000);
			//I fill the postalcode
			driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input")).click();
			driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input")).sendKeys("29000");
			Thread.sleep(3000);
			//I click in Add customer2
			driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/button")).click();
			Thread.sleep(3000);
	        //The popup Customer added successfully with customer should be displayed
			Alert alert = driver.switchTo().alert();
			alert.accept();
			
	    }
}


        
      