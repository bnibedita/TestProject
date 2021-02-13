package Locator_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Module_3_assignment5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String url1 = "https://www.google.com/";
		String url2 = "https://www.selenium.dev/";
		
		driver.get(url1);
		Thread.sleep(1000);
		driver.manage().window().maximize();
		System.out.println("current URL1 - "+driver.getCurrentUrl());
		
		driver.get(url2);
		Thread.sleep(1000);
		driver.manage().window().maximize();
		System.out.println("current URL2 - "+driver.getCurrentUrl());
		
		driver.navigate().to(url1);
		Thread.sleep(1000);
		System.out.println("Navigate to URL1 - "+driver.getCurrentUrl());
		driver.navigate().forward();
		Thread.sleep(1000);
		System.out.println("Forward navigation: "+driver.getCurrentUrl());
		driver.navigate().refresh();
		Thread.sleep(1000);
		System.out.println("Page is Refreshed: "+driver.getCurrentUrl());
		driver.navigate().back();
		Thread.sleep(1000);
		System.out.println("Backward navigation: "+driver.getCurrentUrl());
		driver.close();
				
	}

}
