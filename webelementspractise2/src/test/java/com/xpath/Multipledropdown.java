package com.xpath;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multipledropdown {
	
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver?");
		
		driver.manage().window().maximize();
		
		WebElement products = driver.findElement(By.xpath("//select[@id='first']"));
		multiselect(products, "Google");
		
		
		WebElement animals = driver.findElement(By.id("animals"));
		multiselect(animals, "Avatar");
	}
	
	public static void multiselect(WebElement ele, String value)
	{
		Select sel = new Select(ele);
		
		List<WebElement> options = sel.getOptions();
		
		for(WebElement opt:options)
		{
			if(opt.getText().equals(value))
			{
				opt.click();
				break;
			}
		}
	}
}
	
		
		
	
			
		
		
		
		
		
		
		
	
	
  
