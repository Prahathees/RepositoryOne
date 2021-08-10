package org.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
public static void main(String[] args) throws IOException {
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\SeleniumChrome\\driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	driver.get("https://en-gb.facebook.com/");

TakesScreenshot screenshot = (TakesScreenshot) driver;

File s = screenshot.getScreenshotAs(OutputType.FILE);

File d = new File("D:\\output.jpg");

driver.quit();

FileUtils.copyFile(s, d);

}
}
