package Locator_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_Count {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			String url="https://www.facebook.com/";
			driver.get(url);
			Thread.sleep(1000);
			List<WebElement> links=driver.findElements(By.tagName("a"));
			int size=links.size();
			System.out.println("Total Number of Links present is :"+size);
			Thread.sleep(1000);
			driver.close();
			

	}

}
