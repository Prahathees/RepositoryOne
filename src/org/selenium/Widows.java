package org.selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Widows {
	
	
	public static void main(String[] args) {
		
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\SeleniumChrome\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");

driver.manage().window().maximize();


	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);
	
	driver.findElement(By.xpath("(//span[text()='New Apple iPhone 11 (64GB) - Yellow'])[1]")).click();
	
	String pWId = driver.getWindowHandle();
	System.out.println(pWId);
	
	Set<String> allWindows = driver.getWindowHandles();
	System.out.println(allWindows);
	
	for (String eachWindowsId : allWindows) {
		if(!pWId.equals(eachWindowsId))
			
			driver.switchTo().window(eachWindowsId);
	}
	
	driver.findElement(By.id("add-to-cart-button")).click();
	
	
	driver.switchTo().window(pWId);
	
	
	
	driver.findElement(By.xpath("//span[text()='New Apple iPhone 11 (64GB) - Black']")).click();
	
	Set<String> set = driver.getWindowHandles();
	System.out.println(set);
	
	List<String> li = new ArrayList<>();
li.addAll(set);

System.out.println(li);
	
	driver.switchTo().window(li.get(1));
	
	driver.close();
	
	
	
	
	}
}