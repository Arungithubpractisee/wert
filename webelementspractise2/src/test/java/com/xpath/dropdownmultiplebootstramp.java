package com.xpath;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdownmultiplebootstramp {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
	WebElement ment	= driver.findElement(By.xpath("//span[@class='icp-nav-link-inner']"));
		
		act.moveToElement(ment).click().perform();
		
	List<WebElement> country = driver.findElements(By.xpath("//span//i[@class='icp-radio']"));
	multiselect(country, "English");
	
	Thread.sleep(10);
	
	WebElement mentt = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
	
	act.moveToElement(mentt).click().perform();
	
	List<WebElement> accounts = driver.findElements(By.xpath("//a//span[@class='nav-text']"));
	multiselect(accounts, "Your Orders");
	
	Thread.sleep(10);
	
	}
	public static void multiselect(List<WebElement> ele, String value)
	{
	
		for(WebElement opt:ele)
		{
		if(opt.getText().equals(value));
		{
			opt.click();
			break;
			
		}
			
	}
	}
}
		
	


  