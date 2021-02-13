package Locator_1;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Module_3_assignment4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","D:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		Thread.sleep(500);
		driver.manage().window().maximize();
			
		int si = driver.findElements(By.tagName("frame")).size();
		Thread.sleep(1000);
		System.out.println("Total number of Frame present Here - "+si);
		
		driver.switchTo().frame("login_page");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Transfer Money']//following::a[1]")).click();
		Thread.sleep(3000);
		String titl=driver.getTitle();
		System.out.println("Title of 1st Know more - "+titl);
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		String title1=driver.getTitle();
		System.out.println("Title of default container - "+title1);
		
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		String title=driver.getTitle();
		System.out.println("Title of Frame0 - "+title);
		Thread.sleep(1000);
		
		ArrayList<String> windw = new ArrayList<String>(driver.getWindowHandles());
		
		System.out.println("Current active window - "+windw);
		System.out.println("Current active window title - "+ driver.getTitle());
		driver.switchTo().window(windw.get(1));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='money-transfer-icon menu-icon']//following::span[text()= 'Money Transfer'][1]"));
		System.out.println("window title - "+ driver.getTitle());	
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(2000);
		driver.switchTo().window(windw.get(0));
		System.out.println("window title - "+ driver.getTitle());	
		Thread.sleep(2000);
		driver.quit();
		
		

	}

}
