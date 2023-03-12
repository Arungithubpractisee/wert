package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class uploadingfilesendkeys {
	
	public static void main(String[] args) 
	{

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.monsterindia.com/");
          
          driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//a[@title='Click to upload your resume']")).click();
		
		
		
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("‪D:\\Selenium\\abcd.pdf");
		
		
	}
	}


	