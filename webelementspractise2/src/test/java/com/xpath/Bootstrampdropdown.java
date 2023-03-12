package com.xpath;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bootstrampdropdown {

	public static void main(String[] args)

	{
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-notifications");
		
		ops.addArguments("--remote-allow-origins=*");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(ops);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.hdfcbank.com/");
		
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//div[@id='onetrust-close-btn-container']//button[@aria-label='Close']")).click();

	

		driver.findElement(By.xpath("//a[text()='Select Product Type']")).click();

		List<WebElement> Accounts = driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
		abc(Accounts, "EMI");

		driver.findElement(By.xpath("//a[text()='Select Product']")).click();

		List<WebElement> SavingsAccounts = driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']//li"));
		abc(SavingsAccounts, "Lifecare");

	}

	public static void abc(List<WebElement> options, String value) {
		for (WebElement option : options) {
			if (option.getText().equals(value)) {
				option.click();
				break;
			}

		}

	}

}
