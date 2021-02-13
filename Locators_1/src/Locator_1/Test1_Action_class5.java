package Locator_1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test1_Action_class5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Text Box Input Using Keys
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement ob = driver.findElement(By.xpath("//input[@name='q']"));
		Thread.sleep(1000);
	    ob.sendKeys("Republic img");
	    Thread.sleep(1000);
	    ob.sendKeys(Keys.ARROW_DOWN);
	    Thread.sleep(500);
	    ob.sendKeys(Keys.ARROW_DOWN);
	    Thread.sleep(500);
	    ob.sendKeys(Keys.ARROW_DOWN);
	    Thread.sleep(500);
		ob.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		ob.sendKeys(Keys.ARROW_UP);
		Thread.sleep(1000);
		ob.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.close();
		
	}

}
