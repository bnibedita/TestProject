package Locator_1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test1_Action_class4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Text Box Input Using Keys
		driver.get("https://stackoverflow.com/questions/18557275/how-to-locate-and-insert-a-value-in-a-text-box-input-using-python-selenium");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement ob = driver.findElement(By.xpath("//textarea[@name='post-text']"));
		Thread.sleep(1000);
	    ob.sendKeys("HI,");
	    Thread.sleep(1000);
	    ob.sendKeys(Keys.BACK_SPACE);
	    Thread.sleep(500);
	    ob.sendKeys(Keys.BACK_SPACE);
	    Thread.sleep(500);
	    ob.sendKeys(Keys.BACK_SPACE);
	    Thread.sleep(2000);
	    ob.sendKeys("Hello,",Keys.ENTER);
		Thread.sleep(2000);
		ob.sendKeys("How are you?",Keys.ENTER);
		Thread.sleep(2000);
		ob.sendKeys("Let's learn here.",Keys.ENTER,"Thanks!!");
		Thread.sleep(2000);
		driver.close();
		
	}

}
