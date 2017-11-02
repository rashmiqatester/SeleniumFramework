package com.auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class AutomationEx1 {
	
	public static void main(String[] args) {
		
		WebDriver driver;
		
		Driver D = new Driver();
		
		driver = D.intitatedriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("selenium");
		
		driver.findElement(By.xpath("//input[@name='btnK']")).click();
		
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();
		
		
		
	}

}
