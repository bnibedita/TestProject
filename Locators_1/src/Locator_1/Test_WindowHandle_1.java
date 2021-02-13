package Locator_1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_WindowHandle_1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		WebElement ob = driver.findElement(By.xpath("//span[contains(text(),'Forgot?')]//preceding::button[1]"));
		Thread.sleep(1000);
	    ob.click();
		Thread.sleep(2000);
			
		/*String orginalwindow = driver.getWindowHandle();
		Thread.sleep(2000);
		System.out.println(orginalwindow);*/
		
		ob = driver.findElement(By.xpath("//div[text()='More']//following::div[24]"));
		ob.click();
		/*Thread.sleep(1000);
		ob.sendKeys(Keys.DOWN);
		Thread.sleep(1000);
		ob.sendKeys(Keys.DOWN);
		Thread.sleep(1000);
		ob.sendKeys(Keys.DOWN);
		Thread.sleep(1000);
		ob.click();*/
		
		//assert driver.getWindowHandles().size()==1;
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Anand Sarees')]")).click();
		Thread.sleep(2000);
		driver.close();
				
		
	}

}
