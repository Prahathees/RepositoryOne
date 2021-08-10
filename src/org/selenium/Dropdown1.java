package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class Dropdown1 {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\SeleniumChrome\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
	
	driver.manage().window().maximize();
	
driver.findElement(By.xpath("//a[text()='Create New Account']")).click();

Thread.sleep(3000);


WebElement dDnMonth = driver.findElement(By.id("month"));

Select select = new Select(dDnMonth);

select.selectByVisibleText("Jun");

List<WebElement> list = select.getOptions();

for (WebElement webElement : list) {
	String text = webElement.getText();
	System.out.println(text);
}

for (int i = 0; i < list.size(); i++) {
	
	WebElement webElement = list.get(i);
	String attribute = webElement.getAttribute("value");
	System.out.println(attribute);
}

select.selectByIndex(9);


}}
