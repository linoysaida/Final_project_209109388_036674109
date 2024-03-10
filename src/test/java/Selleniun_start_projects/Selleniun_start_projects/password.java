package Selleniun_start_projects.Selleniun_start_projects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;

public class password {
	
	static WebDriver  browser;
	 
	 @Before
	  public void setup() {
		 
		 System.setProperty("webdriver.gecko.driver", "C:\\selenium webdriver\\FirefoxDriver\\geckodriver.exe");
	    	
			FirefoxOptions options = new FirefoxOptions();
			options.setBinary("C:\\Program Files\\Mozilla Firefox\\Firefox.exe");
			
			browser = new FirefoxDriver(options);
		  	  browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			
		      browser.get("https://testpages.eviltester.com/styled/apps/7charval/simple7charvalidation.html");
		
	  }
		
	@Test
	public void Incorrect_character() {
   	
		
			WebElement textBox = browser.findElement(By.name("characters"));
			textBox.sendKeys("Guuu66ח");
			browser.findElement(By.name("validate")).click();
		
			String result=browser.findElement(By.name("validation_message")).getAttribute("value").toString();
			String expected="Invalid Value"	;
			
			assertEquals(expected, result);
	}

	
	
	@Test
	public void Good_password_1() {
	   	
		
		WebElement textBox = browser.findElement(By.name("characters"));
		textBox.sendKeys("G575*hk");
		browser.findElement(By.name("validate")).click();
	
		String result=browser.findElement(By.name("validation_message")).getAttribute("value").toString();
		
		
		String expected="Valid Value"	;
		
		assertEquals(expected, result);
	}
	
	
	
	@Test
	public void Good_password_2() {
	   	
		
		WebElement textBox = browser.findElement(By.name("characters"));
		textBox.sendKeys("HH58*hh");
		browser.findElement(By.name("validate")).click();
	
		String result=browser.findElement(By.name("validation_message")).getAttribute("value").toString();
		
		
		String expected="Valid Value"	;
		
		assertEquals(expected, result);
	}
	
	
	
	
	@Test
	public void same_character1() {
	   	
		
		WebElement textBox = browser.findElement(By.name("characters"));
		textBox.sendKeys("#######");
		browser.findElement(By.name("validate")).click();
	
		String result=browser.findElement(By.name("validation_message")).getAttribute("value").toString();
		
		
		String expected="Invalid Value"	;
		
		assertEquals(expected, result);
	}
	
	
	
	@Test
	public void same_character2() {
	   	
		
		WebElement textBox = browser.findElement(By.name("characters"));
		textBox.sendKeys("BBBBBBB");
		browser.findElement(By.name("validate")).click();
	
		String result=browser.findElement(By.name("validation_message")).getAttribute("value").toString();
		
		
		String expected="Valid Value"	;
		
		assertEquals(expected, result);
	}
	
	
	@Test
	public void Short_password () {
	   	
		
		WebElement textBox = browser.findElement(By.name("characters"));
		textBox.sendKeys("Kg*8uy");
		browser.findElement(By.name("validate")).click();
	
		String result=browser.findElement(By.name("validation_message")).getAttribute("value").toString();
		
		
		String expected="Invalid Value"	;
		
		assertEquals(expected, result);
	}
	
	
	
	@Test
	public void Long_password () {
	   	
		
		WebElement textBox = browser.findElement(By.name("characters"));
		textBox.sendKeys("K9*544ggg");
		browser.findElement(By.name("validate")).click();
	
		String result=browser.findElement(By.name("validation_message")).getAttribute("value").toString();
		
		
		String expected="Invalid Value"	;
		
		assertEquals(expected, result);
	}
}
