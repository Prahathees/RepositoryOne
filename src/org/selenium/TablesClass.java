package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablesClass {
	
	public static void main(String[] args) {
		
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\SeleniumChrome\\driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	driver.get("https://demo.guru99.com/test/write-xpath-table.html");


	
	driver.findElement(By.id("details-button")).click();
	
	
	driver.findElement(By.id("proceed-link")).click();
	
	
	//1.Print data just like row order
	//List<WebElement> list = driver.findElements(By.tagName("tr"));
	
	//System.out.println(list.size());
	
	//for (int i = 0; i < list.size(); i++) {
		
		//WebElement element = list.get(i);
		//String text = element.getText();
		//System.out.println(text);
		
	//}
	//2.Print all the data in the table
	
//List<WebElement> list1 = driver.findElements(By.tagName("td"));
	
	//System.out.println(list1.size());
	
	//for (int i = 0; i < list1.size(); i++) {
		
		//WebElement element = list1.get(i);
		//String text = element.getText();
		//System.out.println(text);
		
	//}
	
	//3.Print data in row by row order
	
	
	List<WebElement> list = driver.findElements(By.tagName("tr"));
	
	for (int i = 0; i < list.size(); i++) {
		
		WebElement x = list.get(i);
		List<WebElement> list1 = x.findElements(By.tagName("td"));	
		
		for (int j = 0; j < list1.size(); j++) {
			
			WebElement element = list1.get(j);
			
			String text = element.getText();
			
			if (text.equals("first cell")) {
				System.out.println(text);
				System.out.println("row no."+ (i+1));
				System.out.println("col no."+ (j+1));
				
				
			//	}
				
			//}
			//System.out.println(text);
	//	}
			
	List<WebElement> list3 = driver.findElements(By.tagName("tr"));
	
	for (WebElement webElement : list) {
		
	List<WebElement> list2 = webElement.findElements(By.tagName("td"));
		
	for (WebElement webElement2 : list2) {
		
		String text1 = webElement2.getText();
		System.out.println(text1);
		
			
			
		}
	System.out.println("@@@@@@@@@@@@@@@");
	}
	

	}
	
	
	
	
	
	
	
	
	
	
	
	
	}}}}
	
	
	
	
	
	
	
	
	
	
	
	
	
