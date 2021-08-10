package org.selenium;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownOne {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\SeleniumChrome\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
	
	driver.manage().window().maximize();
	
driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	
Thread.sleep(3000);	
//1.Print all text options(Years)
WebElement dDnYear = driver.findElement(By.id("year"));
	Select select = new Select(dDnYear);
	
List<WebElement> list = select.getOptions();
	
	for (int i = 0; i < list.size(); i++) {
		
		WebElement webElement = list.get(i);
		String text = webElement.getText();
		System.out.println(text);
	}
	//2.Print all attribute options (days)
	WebElement dDnDay = driver.findElement(By.id("day"));
	Select select1 = new Select(dDnDay);
	
	List<WebElement> list2 = select1.getOptions();
	
	for (WebElement webElement : list2) {
		
		String attribute = webElement.getAttribute("value");
		System.out.println(attribute);
	}
	
	WebElement dDnMonth = driver.findElement(By.id("month"));
	Select select2 = new Select(dDnMonth);
	
	
	List<WebElement> list3 = select2.getOptions();
	
	
	
	//3.Print last 5 options text (month)
	for (int i = list3.size()-5; i < list3.size(); i++) {
		WebElement webElement = list3.get(i);
		String text = webElement.getText();
		System.out.println(text);
	}
	
	//4.Print first 5 options text (month)
	for (int i = 0; i <5; i++) {
		WebElement webElement = list3.get(i);
		String text = webElement.getText();
		System.out.println(text);
		
	}
	
	
	
	//5.Print the middle option text (month)
	WebElement webElement = list3.get(6);
	String text = webElement.getText();
	System.out.println(text);
	
	//6.Print alternate option text (month)
    for (int i = 0; i < list3.size(); i+=2) {
	
    WebElement element = list3.get(i);
	
	String text2 = element.getText();
	System.out.println(text2);
}
    //7.Print all options text without using select (month)
    String month = dDnMonth.getText();
	System.out.println(month);
    	
	
	//8.Print all options text without using select (day & year)
	String day = dDnDay.getText();	
	System.out.println(day);

	String year = dDnYear.getText();
	System.out.println(year);
	
	//11.Select last option in month  (dynamically changing)
	select2.selectByIndex(list3.size()-1);

	
	
	
	
	
	//9.Check any duplicate is present in drop down(month)
	
	Set<Object> si = new LinkedHashSet<>();
	si.addAll(list3);
	
	if(si.size()==list3.size())
	{
	System.out.println("no duplicates");
	
	}
	else {
System.out.println("Duplicates present");

	}
	
	//10.Check any duplicate is present in drop down(year)
	Set<Object> si1 = new LinkedHashSet<>();
	
	si1.addAll(list);
	System.out.println(si1.size());
	System.out.println(list.size());
	if(si1.size()==list.size())
	{
	System.out.println("no duplicates");
	
	}
	else {
System.out.println("Duplicates present");

	}
	
	
	
	}}























