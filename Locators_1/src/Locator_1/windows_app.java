package Locator_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windows_app {

	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
    WebDriver driver= new ChromeDriver();
    driver.get("https://netbanking.hdfcbank.com/netbanking/");
    Thread.sleep(1000);
    driver.manage().window().maximize();
    //driver.findElement(By.xpath("//a[text()='Know More'][1]")).click();
    
    driver.switchTo().frame("login_page");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//a[text()='Know More'][1]")).click();
    //Frame id - destination_publishing_iframe_hdfcbank_0
    Thread.sleep(1000);
    driver.quit();   
 
	}

}
