package Locator_1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class module_6_2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url="http://only-testing-blog.blogspot.com/2014/09/selectable.html";
        driver.get(url);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
        WebElement ab=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
        Thread.sleep(1000);
        Actions e=new Actions(driver);
		e.doubleClick(ab).build().perform();
		Thread.sleep(2000);
		System.out.println("windows alret: "+driver.switchTo().alert().getText());
        Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
        driver.close();
		
	}

}
