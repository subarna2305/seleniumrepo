package com.harman.bacis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1Memberships {
   public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.linkText("My Info")).click();
		driver.findElement(By.linkText("Memberships")).click();
		
		driver.findElement(By.id("btnAddMembershipDetail")).click();
		
		Select membership = new Select(driver.findElement(By.id("membership_membership")));
		membership.selectByValue("1");
		Select SubscriptionPaidBy = new Select(driver.findElement(By.id("membership_subscriptionPaidBy")));
		SubscriptionPaidBy.selectByValue("Company");
		
		driver.findElement(By.name("membership[subscriptionAmount]")).sendKeys("1200");
		
		Select currency = new Select(driver.findElement(By.id("membership_currency")));
		currency.selectByValue("MYR");
		driver.findElement(By.id("membership_subscriptionCommenceDate")).sendKeys("2022-03-31");
		driver.findElement(By.id("membership_subscriptionRenewalDate")).sendKeys("2022-04-20");
		
		driver.findElement(By.name("btnSaveMembership")).click();
		
		
		
		
   }

}
