package com.xpath;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.opencart.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@class='navbar-right hidden-xs']//a[text()='Register']")).click();
		
	     WebElement ele = driver.findElement(By.name("country_id"));
		
		Select sel = new Select(ele);
		
		sel.selectByVisibleText("Australia");
		
		 }
	

}
