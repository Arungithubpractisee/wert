package com.xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class googlemapsplaceautosuggest {

	public static void main(String[] args) 
	
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://maps.google.com/");
		
		driver.manage().window().maximize();
		
       WebElement searchbox = driver.findElement(By.xpath("//input[@id='searchboxinput']"));
       
       searchbox.sendKeys("Bang");
       
       String text;
      
      do
      {
    	  searchbox.sendKeys(Keys.ARROW_DOWN);
    	  text = searchbox.getAttribute("value");
    	  
    	  if(text.equals("Bangalore, Karnataka"))
    	  {
    		  searchbox.sendKeys(Keys.ENTER);
    		  break;
    	  }
    	  
    	  }while(!text.isEmpty());
    		  	
      
	}
}
     
     
        
        
		

	


