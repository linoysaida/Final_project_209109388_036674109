package Selleniun_start_projects.Selleniun_start_projects;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.junit.Before;
import java.time.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.lang.Thread;
import org.openqa.selenium.support.ui.Select;
public class Triangle {
	 
	
	 static WebDriver  browser;
	 
	 @Before
	  public void setup() {
		 System.setProperty("webdriver.gecko.driver", "C:\\selenium webdriver\\FirefoxDriver\\geckodriver.exe");
	    	
			FirefoxOptions options = new FirefoxOptions();
			options.setBinary("C:\\Program Files\\Mozilla Firefox\\Firefox.exe");
			
			browser = new FirefoxDriver(options);
			 
		  	  browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			
		      browser.get("https://testpages.eviltester.com/styled/apps/triangle/triangle001.html");
		
	  }
		
	@Test
	public void Tests1() {
		
			WebElement textBox1 = browser.findElement(By.id("side1"));
			WebElement textBox2 = browser.findElement(By.id("side2"));
			WebElement textBox3 = browser.findElement(By.id("side3"));
			textBox1.sendKeys("1");
			textBox2.sendKeys("4");
			textBox3.sendKeys("6");
			
			browser.findElement(By.id("identify-triangle-action")).click();;
			String result=browser.findElement(By.id("triangle-type")).getText();
			
			String expected="Error: Not a Triangle"	;
			assertEquals(expected, result);
			

			
    }
	
	
	@Test
	public void Tests2() {
		
			WebElement textBox1 = browser.findElement(By.id("side1"));
			WebElement textBox2 = browser.findElement(By.id("side2"));
			WebElement textBox3 = browser.findElement(By.id("side3"));
			textBox1.sendKeys("9");
			textBox2.sendKeys("4");
			textBox3.sendKeys("4");
			
			browser.findElement(By.id("identify-triangle-action")).click();;
			String result=browser.findElement(By.id("triangle-type")).getText();
			
			String expected="Error: Not a Triangle"	;
			assertEquals(expected, result);
			
	}
			@Test
			public void Tests3() {
				
					WebElement textBox1 = browser.findElement(By.id("side1"));
					WebElement textBox2 = browser.findElement(By.id("side2"));
					WebElement textBox3 = browser.findElement(By.id("side3"));
					textBox1.sendKeys("5");
					textBox2.sendKeys("10");
					textBox3.sendKeys("5");
					
					browser.findElement(By.id("identify-triangle-action")).click();;
					String result=browser.findElement(By.id("triangle-type")).getText();
					
					String expected="Error: Not a Triangle"	;
					assertEquals(expected, result);
					
    }
			
			
			
			@Test
			public void Tests4() {
				
					WebElement textBox1 = browser.findElement(By.id("side1"));
					WebElement textBox2 = browser.findElement(By.id("side2"));
					WebElement textBox3 = browser.findElement(By.id("side3"));
					textBox1.sendKeys("1");
					textBox2.sendKeys("1");
					textBox3.sendKeys("6");
					
					browser.findElement(By.id("identify-triangle-action")).click();;
					String result=browser.findElement(By.id("triangle-type")).getText();
					
					String expected="Error: Not a Triangle"	;
					assertEquals(expected, result);
					
				
					
    }
			
			
			@Test
			public void Tests5() {
				
					WebElement textBox1 = browser.findElement(By.id("side1"));
					WebElement textBox2 = browser.findElement(By.id("side2"));
					WebElement textBox3 = browser.findElement(By.id("side3"));
					textBox1.sendKeys("3");
					textBox2.sendKeys("4");
					textBox3.sendKeys("5");
					
					browser.findElement(By.id("identify-triangle-action")).click();;
					String result=browser.findElement(By.id("triangle-type")).getText();
					
					String expected="Scalene"	;
					assertEquals(expected, result);
					
				
					
    }
			@Test
			public void Tests6() {
				
					WebElement textBox1 = browser.findElement(By.id("side1"));
					WebElement textBox2 = browser.findElement(By.id("side2"));
					WebElement textBox3 = browser.findElement(By.id("side3"));
					textBox1.sendKeys("7");
					textBox2.sendKeys("5");
					textBox3.sendKeys("5");
					
					browser.findElement(By.id("identify-triangle-action")).click();;
					String result=browser.findElement(By.id("triangle-type")).getText();
					
					String expected="Isosceles"	;
					assertEquals(expected, result);
					
			
			}
			@Test
			public void Tests7() {
				
					WebElement textBox1 = browser.findElement(By.id("side1"));
					WebElement textBox2 = browser.findElement(By.id("side2"));
					WebElement textBox3 = browser.findElement(By.id("side3"));
					textBox1.sendKeys("6");
					textBox2.sendKeys("3");
					textBox3.sendKeys("6");
					
					browser.findElement(By.id("identify-triangle-action")).click();;
					String result=browser.findElement(By.id("triangle-type")).getText();
					
					String expected="Isosceles"	;
					assertEquals(expected, result);
					
			
			}
			
			
			@Test
			public void Tests8() {
				
					WebElement textBox1 = browser.findElement(By.id("side1"));
					WebElement textBox2 = browser.findElement(By.id("side2"));
					WebElement textBox3 = browser.findElement(By.id("side3"));
					textBox1.sendKeys("7");
					textBox2.sendKeys("7");
					textBox3.sendKeys("3");
					
					browser.findElement(By.id("identify-triangle-action")).click();;
					String result=browser.findElement(By.id("triangle-type")).getText();
					
					String expected="Isosceles"	;
					assertEquals(expected, result);
					
			
			}
			
			@Test
			public void Tests9() {
				
					WebElement textBox1 = browser.findElement(By.id("side1"));
					WebElement textBox2 = browser.findElement(By.id("side2"));
					WebElement textBox3 = browser.findElement(By.id("side3"));
					textBox1.sendKeys("7");
					textBox2.sendKeys("7");
					textBox3.sendKeys("7");
					
					browser.findElement(By.id("identify-triangle-action")).click();;
					String result=browser.findElement(By.id("triangle-type")).getText();
					
					String expected="Equilateral"	;
					assertEquals(expected, result);
					
			
			}
			
			@Test
			public void Tests10() {
				
					WebElement textBox1 = browser.findElement(By.id("side1"));
					WebElement textBox2 = browser.findElement(By.id("side2"));
					WebElement textBox3 = browser.findElement(By.id("side3"));
					textBox1.sendKeys("k");
					textBox2.sendKeys("7");
					textBox3.sendKeys("7");
					
					browser.findElement(By.id("identify-triangle-action")).click();;
					String result=browser.findElement(By.id("triangle-type")).getText();
					
					String expected="Error: Side 1 is not a Number"	;
					assertEquals(expected, result);
					
			
			}
			
			@Test
			public void Tests11() {
				
					WebElement textBox1 = browser.findElement(By.id("side1"));
					WebElement textBox2 = browser.findElement(By.id("side2"));
					WebElement textBox3 = browser.findElement(By.id("side3"));
					textBox1.sendKeys("6");
					textBox2.sendKeys("v");
					textBox3.sendKeys("7");
					
					browser.findElement(By.id("identify-triangle-action")).click();;
					String result=browser.findElement(By.id("triangle-type")).getText();
					
					String expected="Error: Side 2 is not a Number"	;
					assertEquals(expected, result);
					
			
			}
			
			@Test
			public void Tests12() {
				
					WebElement textBox1 = browser.findElement(By.id("side1"));
					WebElement textBox2 = browser.findElement(By.id("side2"));
					WebElement textBox3 = browser.findElement(By.id("side3"));
					textBox1.sendKeys("5");
					textBox2.sendKeys("7");
					textBox3.sendKeys("d");
					
					browser.findElement(By.id("identify-triangle-action")).click();;
					String result=browser.findElement(By.id("triangle-type")).getText();
					
					String expected="Error: Side 3 is not a Number"	;
					assertEquals(expected, result);
					
			
			}
			
			
}