package Locator_1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class module_6_assign_1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String url1 = "https://www.flipkart.com/";
		driver.get(url1);
		Thread.sleep(1000);
		driver.manage().window().maximize();
		WebElement ob = driver.findElement(By.xpath("//span[contains(text(),'Forgot?')]//preceding::button[1]"));
		Thread.sleep(1000);
	    ob.click();
		Thread.sleep(2000);
		WebElement fashion = driver.findElement(By.xpath("//div[text()='Fashion']"));
		Thread.sleep(1000);
		Actions e = new Actions(driver);
		e.moveToElement(fashion).build().perform();
		Thread.sleep(2000);
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("document.getElementById('Women Jeans')");
		int x = fashion.getLocation().getX();
		int y = fashion.getLocation().getY();
		System.out.println("x= "+x+", Y= "+y);
		Thread.sleep(2000);
		WebElement shoes= driver.findElement(By.xpath("//a[contains(text(),'Shoes')]"));
		e.moveToElement(shoes).build().perform();
		shoes.click();
		Thread.sleep(2000);
		driver.close();
		
	}

}
