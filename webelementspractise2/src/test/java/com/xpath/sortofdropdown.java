package com.xpath;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sortofdropdown {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.opencart.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@class='navbar-right hidden-xs']//a[text()='Register']")).click();
		
	     WebElement ele = driver.findElement(By.name("country_id"));
		
	     Select sel = new Select(ele);
	     
	     ArrayList orglist = new ArrayList();
	     ArrayList templist = new ArrayList();
	     
	     
	   List<WebElement>  elem = sel.getOptions();
	   
	   for(WebElement web : elem )
	   {
		   orglist.add(web.getText());
		   templist.add(web.getText());
   
	  }
	   Collections.sort(templist);
	   if(orglist.equals(templist))
		{
			System.out.println("sorted");
		}
	   else
	   {
		   System.out.println("not sorted"); 
	   }
		   
		   
		   

	}
	
	
}
