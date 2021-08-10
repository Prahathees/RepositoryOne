package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class Frames {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\SeleniumChrome\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");

driver.manage().window().maximize();


driver.switchTo().frame("login_page");

driver.findElement(By.name("fldLoginUserId")).sendKeys("12345");
	
	
	
	driver.findElement(By.xpath("//img[@alt='continue']")).click();
	Thread.sleep(3000);
	
	//driver.switchTo().defaultContent();
	//driver.switchTo().frame("login_page");

	
	driver.findElement(By.name("fldPassword")).sendKeys("ttyyy");
	
	driver.findElement(By.xpath("//img[@alt='Login']")).click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}}
