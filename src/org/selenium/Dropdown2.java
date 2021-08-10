package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown2 {
	
public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\SeleniumChrome\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
	
	driver.manage().window().maximize();
	
	
	
	
 driver.findElement(By.id("onward_cal")).click();

 WebElement btnNext = driver.findElement(By.className("next"));

btnNext.click();

WebElement btnNext1 = driver.findElement(By.className("next"));
btnNext1.click();
driver.findElement(By.xpath("//td[text()='18']")).click();















}
}
