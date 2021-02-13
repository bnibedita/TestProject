package Locator_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loc {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	String title1 = driver.getTitle();
	System.out.println(title1);
	driver.navigate().to("https://www.google.co.in/");
	Thread.sleep(1000);
	String title2 = driver.getTitle();
	System.out.println("Navigated to : "+title2);
	driver.navigate().back();
	Thread.sleep(1000);
	String title3 = driver.getTitle();
	System.out.println("Backwarded to : "+title3);
	driver.navigate().forward();
	String title4 = driver.getTitle();
	System.out.println("Forwarded to : "+title4);
	Thread.sleep(1000);
	System.out.println("/n Program sucessfully completed.");
	driver.close();

	}

}
