package Selleniun_start_projects.Selleniun_start_projects;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.lang.System;
public class Selenium_calculator {
	
	static WebDriver  browser;
	 
	 @Before
	  public void setup() {
		 
		 System.setProperty("webdriver.gecko.driver", "C:\\selenium webdriver\\FirefoxDriver\\geckodriver.exe");
	    	
			FirefoxOptions options = new FirefoxOptions();
			options.setBinary("C:\\Program Files\\Mozilla Firefox\\Firefox.exe");
			
			browser = new FirefoxDriver(options);
		  	  browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			  String url="https://testpages.eviltester.com/styled/apps/calculator.html";
		      browser.get(url);
		
	  }
	 
	 @Test
		public void Plus1() {
	    	
			
				browser.findElement(By.id("button01")).click();
				browser.findElement(By.id("buttonplus")).click();
				browser.findElement(By.id("button02")).click();
				try {
					  Thread.sleep(1000);
					} catch (InterruptedException e) {
					  Thread.currentThread().interrupt();
					}
				
				browser.findElement(By.id("buttonequals")).click();
		
				
				String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
				System.out.println(result);	
				String Expected= "3";
				assertEquals(Expected,result);
				
	 		}
	 
	 
	 
	 @Test
		public void Plus2() {
		 		browser.findElement(By.id("buttonallclear")).click();
		 		browser.findElement(By.id("buttonminus")).click();
				browser.findElement(By.id("button03")).click();
				browser.findElement(By.id("buttonplus")).click();
				browser.findElement(By.id("button02")).click();
				try {
					  Thread.sleep(1000);
					} catch (InterruptedException e) {
					  Thread.currentThread().interrupt();
					}
				
				browser.findElement(By.id("buttonequals")).click();
		
				
				String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
				System.out.println(result);	
				String Expected= "-1";
				assertEquals(Expected,result);
				
	 		}
	 
	 
	 @Test
		public void Minus1() {
	    	
		 		
				browser.findElement(By.id("button06")).click();
				browser.findElement(By.id("buttonminus")).click();
				browser.findElement(By.id("button01")).click();
				try {
					  Thread.sleep(1000);
					} catch (InterruptedException e) {
					  Thread.currentThread().interrupt();
					}
				
				browser.findElement(By.id("buttonequals")).click();
		
				
				String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
				System.out.println(result);	
				String Expected= "5";
				assertEquals(Expected,result);
				
	 		}
	 
	 

	 @Test
		public void Minus2() {
		 		browser.findElement(By.id("buttonallclear")).click();
		 		browser.findElement(By.id("buttonminus")).click();
				browser.findElement(By.id("button01")).click();
				browser.findElement(By.id("buttonminus")).click();
				browser.findElement(By.id("button08")).click();
				try {
					  Thread.sleep(1000);
					} catch (InterruptedException e) {
					  Thread.currentThread().interrupt();
					}
				
				browser.findElement(By.id("buttonequals")).click();
		
				
				String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
				System.out.println(result);	
				String Expected= "-9";
				assertEquals(Expected,result);
				
	 		}
	 
	 
	 @Test
		public void Multiply1() {
	    	
			
				browser.findElement(By.id("button09")).click();
				browser.findElement(By.id("buttonmultiply")).click();
				browser.findElement(By.id("button09")).click();
				try {
					  Thread.sleep(1000);
					} catch (InterruptedException e) {
					  Thread.currentThread().interrupt();
					}
				
				browser.findElement(By.id("buttonequals")).click();
		
				
				String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
				System.out.println(result);	
				String Expected= "81";
				assertEquals(Expected,result);
				
	 		}
	 
	 
	 
	 @Test
		public void Multiply2() {
		 		browser.findElement(By.id("buttonallclear")).click();
		 		browser.findElement(By.id("buttonminus")).click();
				browser.findElement(By.id("button05")).click();
				browser.findElement(By.id("buttonmultiply")).click();
				browser.findElement(By.id("button05")).click();
				try {
					  Thread.sleep(1000);
					} catch (InterruptedException e) {
					  Thread.currentThread().interrupt();
					}
				
				browser.findElement(By.id("buttonequals")).click();
		
				
				String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
				System.out.println(result);	
				String Expected= "-25";
				assertEquals(Expected,result);
				
	 		}
	 
	 @Test
		public void Divide1() {
	    	
			
				browser.findElement(By.id("button09")).click();
				browser.findElement(By.id("buttondivide")).click();
				browser.findElement(By.id("button09")).click();
				try {
					  Thread.sleep(1000);
					} catch (InterruptedException e) {
					  Thread.currentThread().interrupt();
					}
				
				browser.findElement(By.id("buttonequals")).click();
		
				
				String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
				System.out.println(result);	
				String Expected= "1";
				assertEquals(Expected,result);
				
	 		}
	 
	 
	 
	 @Test
		public void Divide2() {
		 		browser.findElement(By.id("buttonallclear")).click();
				browser.findElement(By.id("buttonminus")).click();
				browser.findElement(By.id("button05")).click();
				browser.findElement(By.id("buttondivide")).click();
				browser.findElement(By.id("button01")).click();
				try {
					  Thread.sleep(1000);
					} catch (InterruptedException e) {
					  Thread.currentThread().interrupt();
					}
				
				browser.findElement(By.id("buttonequals")).click();
		
				
				String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
				System.out.println(result);	
				String Expected= "-5";
				assertEquals(Expected,result);
				
	 		}
	 
	 @Test
		public void Divide_by_zero() {
	    	
			
				browser.findElement(By.id("button07")).click();
				browser.findElement(By.id("buttondivide")).click();
				browser.findElement(By.id("button00")).click();
				try {
					  Thread.sleep(1000);
					} catch (InterruptedException e) {
					  Thread.currentThread().interrupt();
					}
				
				browser.findElement(By.id("buttonequals")).click();
		
				
				String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
				System.out.println(result);	
				String Expected= "Infinity";
				assertEquals(Expected,result);
				
	 		}
	 
	 

}