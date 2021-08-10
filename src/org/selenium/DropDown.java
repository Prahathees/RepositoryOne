package org.selenium;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) {
		
		
			
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\SeleniumChrome\\driver\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			
			driver.get("http://demo.automationtesting.in/Register.html");

	driver.manage().window().maximize();
	
	WebElement dDnSkill = driver.findElement(By.id("Skills"));
	
	Select select = new Select(dDnSkill);
	
	//select.selectByIndex(1);
	
	List<WebElement> list = select.getOptions();
	WebElement element = list.get(5);
	String text = element.getText();
	
	System.out.println(text);
	
	for (int i = 0; i < list.size(); i++) {
		WebElement webElement = list.get(i);
	String text2 = webElement.getText();
	System.out.println(text2);
	
	}
	
	
	
	for (WebElement webElement : list)
	{
		String attribute = webElement.getAttribute("value");
	System.out.println(attribute);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
