package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelect {
	
	
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\SeleniumChrome\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
	
	driver.manage().window().maximize();
	
	WebElement dDnMutiple = driver.findElement(By.name("multipleselect[]"));
	
	Select select = new Select(dDnMutiple);
	
	List<WebElement> list = select.getOptions();
	
	for (int i = 0; i < list.size(); i++) {
		
		WebElement element = list.get(i);
		String text = element.getText();
		System.out.println(text);
		
		String attribute = element.getAttribute("value");
		System.out.println(attribute);
	}
	
	//select.selectByIndex(0);
	//select.selectByIndex(1);select.selectByIndex(2);select.selectByIndex(3);

	
	
	//for (int i = 0; i < list.size(); i++) {
		//select.selectByIndex(i);
	//}
	
	//for (WebElement webElement : list) {
		//String text = webElement.getText();
	//select.selectByVisibleText(text);
	//}
	
	for (WebElement webElement : list) {
		String attribute = webElement.getAttribute("value");
	select.selectByValue(attribute);
	}
	
	List<WebElement> list2 = select.getAllSelectedOptions();
	
	for (WebElement webElement : list2) {
	String text = webElement .getText();
	System.out.println(text);
	}
	
	WebElement firstSelectedOption = select.getFirstSelectedOption();
	String text = firstSelectedOption.getText();
	
	System.out.println(text);
	
	select.deselectByIndex(2);
	
	select.deselectAll();
	
	
	}

}
