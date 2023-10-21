package com.anvysystems.LearningSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormBot 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./binaries/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://form-bot-anvsystems.pages.dev/"); 
		driver.findElement(By.name("firstname")).sendKeys("Anshuman");
//		driver.findElement(By.name("firstname")).sendKeys(UUID.randomUUID().toString().substring(0, 8));
		driver.findElement(By.name("lastname")).sendKeys("Pradhan");
		driver.findElement(By.name("email")).sendKeys("pradhan096@gmail.com");
//		driver.findElement(By.name("email")).sendKeys(UUID.randomUUID().toString().substring(0, 8)+"@gmail.com");
		
// 		behalf of gender we can write xpath (Example - 1) 
		
		driver.findElement(By.xpath("/html/body/div/div/form/label[4]/label[2")).click();
//		driver.findElement(By.name("gender")).click();
		
// 		Relative Xpath Example-2		
		driver.findElement(By.name("//input[@value='Java']")).click();
		
		driver.findElement(By.name("phone")).sendKeys("0987654321");
		Select s=new Select(driver.findElement(By.name("country")));
		s.selectByVisibleText("India");
		driver.findElement(By.name("programming")).click();
		driver.findElement(By.tagName("button")).click();
		
		Thread.sleep(2000);
		driver.quit();
	}

}
