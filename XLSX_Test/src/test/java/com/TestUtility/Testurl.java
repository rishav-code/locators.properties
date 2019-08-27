package com.TestUtility;

import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.XLS_Reader.Takeproperties;

public class Testurl {
	// static TakeLocator tl = new TakeLocator();
	@Test
	public void test() throws FileNotFoundException {
		Takeproperties tp = new Takeproperties();

		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\rishav.kumar\\Desktop\\Team_communication-master\\chromedriver.exe"
		 * ); WebDriver driver = new ChromeDriver();
		 * 
		 * 
		 * driver.get("http://orangehrm.com"); WebElement search
		 * =driver.findElement(By.name("q")); search.sendKeys("atmecs"); WebElement
		 * searchclick = driver.findElement(By.className("gNO89b"));
		 * searchclick.click();
		 */

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rishav.kumar\\Desktop\\Team_communication-master\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("cta_button_3749854_7956a89e-6f16-4650-8d49-9f825d5cc7d6")).click();
		driver.findElement(By.id(tp.Takeproperties("first_name"))).click();
		driver.findElement(By.id(tp.Takeproperties("first_name"))).sendKeys("rishav");
		driver.findElement(By.id(tp.Takeproperties("last_name"))).sendKeys("kumar");
		driver.findElement(By.id(tp.Takeproperties("url_here"))).click();
		driver.findElement(By.id(tp.Takeproperties("Bussiness_email"))).sendKeys("rishav@gmail.com");
		driver.findElement(By.id(tp.Takeproperties("job_title"))).sendKeys("engineer");
		driver.findElement(By.id(tp.Takeproperties("no_of_employees"))).click();

		driver.findElement(By.xpath(tp.Takeproperties("features"))).click();

		driver.navigate().back();
		driver.findElement(By.xpath(tp.Takeproperties("Services"))).click();

		driver.navigate().back();
	}
}