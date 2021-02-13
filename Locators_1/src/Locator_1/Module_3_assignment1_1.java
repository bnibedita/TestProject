package Locator_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Module_3_assignment1_1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// verification points by contains()
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
		
		driver.switchTo().defaultContent();	
		Thread.sleep(1000);
		driver.switchTo().frame(1);
		Thread.sleep(1000);
		String title3=driver.getTitle();
		System.out.println("Title of frame1 - "+title3);
		//driver.findElement(By.xpath("//span[text()='Transfer Money']//following::a[1]")).click();
		Thread.sleep(1000);
		driver.quit();
		
	}

}
