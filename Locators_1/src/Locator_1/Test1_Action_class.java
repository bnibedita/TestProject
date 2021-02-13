package Locator_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_Action_class {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// verification points by contains()
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
			
		String actual_page_title = driver.getTitle();
		Thread.sleep(2000);
		String expct_page_title = driver.getTitle();
		Thread.sleep(2000);
		if (actual_page_title.contains(expct_page_title))
		System.out.println("Yes!! Title matches pass.");
		else
		System.out.println("Oops!! Title matches failed.");
		driver.close();
		
	}

}
