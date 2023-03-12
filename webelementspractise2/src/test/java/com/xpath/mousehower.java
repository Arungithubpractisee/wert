package com.xpath;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mousehower {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
	WebElement ment	= driver.findElement(By.xpath("//span[@class='icp-nav-link-inner']"));
	
	act.moveToElement(ment).perform();
	
	Thread.sleep(20);
	
	WebElement mentt = driver.findElement(By.xpath("//div[@id='nav-flyout-icp']//span[text()='ಕನ್ನಡ']"));
		
	act.moveToElement(mentt).click().perform();
		
	
	WebElement abc = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
	
	act.moveToElement(abc).perform();
	
	Thread.sleep(20);
	
	WebElement def = driver.findElement(By.xpath("//span[text()='Your Orders']"));
	
	Thread.sleep(20);
	
	act.moveToElement(def).click().perform();
	
	}

}
