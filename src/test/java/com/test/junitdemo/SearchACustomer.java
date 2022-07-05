package com.test.junitdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.junit.*;
import org.junit.experimental.ParallelComputer;
import org.junit.runner.JUnitCore;
public class SearchACustomer {
	
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
	        
			//I click in Customers
	        
	        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[3]")).click();
	        
	        //I search for the name
	        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/form/div/div/input")).click();
	        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/form/div/div/input")).sendKeys("Ron");
	        
	        //I validate the customer exists
	        WebElement findelement = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/table/tbody/tr/td[1]"));
			assert findelement.isDisplayed()==true;
	        
			
	    }
}


        
      