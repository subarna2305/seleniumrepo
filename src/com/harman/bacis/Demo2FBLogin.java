package com.harman.bacis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2FBLogin {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("hello@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("hello123");
		
		driver.findElement(By.name("login")).click();
	}

}
