package org.selenium;



import java.util.NoSuchElementException;

import javax.xml.datatype.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;


public class WaitTime {
	
	public static void main(String[] args) {
		
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\SeleniumChrome\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");

driver.manage().window().maximize();
//1.implicit wait
//driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);


	driver.findElement(By.id("email")).sendKeys("Aababa");
	
	driver.findElement(By.id("pass")).sendKeys("Aababa");

	//2.WebdriverWait
//WebDriverWait wait = new WebDriverWait(driver, 100);

//WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("login")));
	
	
	//element.click();
	
//Wait wait = new FluentWait(driver).withTimeout(java.time.Duration.ofSeconds(100)).pollingEvery(java.time.Duration.ofMillis(100)).ignoring(NoSuchElementException.class);
	
	//WebElement element= (WebElement) wait.until(ExpectedConditions.elementToBeClickable(By.name("login")));
	
	//element.click();
	
	
	
	
	}}
