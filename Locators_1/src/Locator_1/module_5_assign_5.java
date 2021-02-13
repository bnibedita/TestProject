package Locator_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class module_5_assign_5 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String url1 = "https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt";
		driver.get(url1);
		Thread.sleep(1000);
		driver.manage().window().maximize();
		System.out.println("current URL1 - "+driver.getCurrentUrl());
		driver.switchTo().frame("iframeResult");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().sendKeys("Nibedita");
		Thread.sleep(1000);
		System.out.println("Alert message: "+driver.switchTo().alert().getText());
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.close();
		
	}

}
