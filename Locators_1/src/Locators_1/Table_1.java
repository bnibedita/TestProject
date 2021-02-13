package Locators_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_1 {

		public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ABCD");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456789");
		Thread.sleep(1000);
		driver.close();
	}

}
