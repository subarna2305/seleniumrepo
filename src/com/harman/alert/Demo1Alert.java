package com.harman.alert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1Alert {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.get("https://netbanking.hdfcbank.com/netbanking/IpinResetUsingOTP.htm");
			driver.findElement(By.xpath("//img[@alt='Go']")).click();
			
			String alertText= driver.switchTo().alert().getText();
			System.out.println(alertText);
			
			driver.switchTo().alert().accept();
	}
}
