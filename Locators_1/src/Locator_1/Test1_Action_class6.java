package Locator_1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test1_Action_class6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Text Box Input Using Keys
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement ob = driver.findElement(By.xpath("//span[contains(text(),'Forgot?')]//preceding::button[1]"));
		Thread.sleep(1000);
	    ob.click();
		Thread.sleep(2000);
		//WebElement ob1 = driver.findElement(By.xpath("//span[contains(text(),'Women')]"));
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("windows.scrollBy(0,600)");
		//Thread.sleep(1000);
		driver.close();
		
	}

}
