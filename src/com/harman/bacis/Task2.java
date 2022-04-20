package com.harman.bacis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.goto.com/meeting/");
		driver.findElement(By.id("truste-consent-button")).click();
		
		driver.findElement(By.linkText("Try Free")).click();
}

}
