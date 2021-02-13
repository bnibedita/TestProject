package Locator_1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Text_input {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String url="https://www.facebook.com/";
		driver.get(url);
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(500);
		driver.findElement(By.id("u_0_2")).click();
		Thread.sleep(1000);
		
		//Insert Text as input to TextBox field
		WebElement ob = driver.findElement(By.name("firstname"));
		ob.sendKeys("AB");
		Thread.sleep(1000);
		
		ob.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(500);
		ob.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(500);
		ob.sendKeys("Nibedita");
		System.out.println("First name is :"+ob.getAttribute("value"));
		Thread.sleep(1000);
		driver.close();
		
	}

}
