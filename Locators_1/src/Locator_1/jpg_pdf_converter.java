package Locator_1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jpg_pdf_converter {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://smallpdf.com/jpg-to-pdf");
	Thread.sleep(1000);
	driver.manage().window().maximize();
	Thread.sleep(1000);
	driver.manage().deleteAllCookies();
	WebElement upload = driver.findElement(By.xpath("//button[@type='button'][@class ='sc-1mvwhop-0 bXaSgw']"));
	upload.click();
	//upload.sendKeys(Keys.ENTER);
	Thread.sleep(1000);
	upload.sendKeys("C:\\Users\\Dell\\Desktop\\Capture.JPG");
	Thread.sleep(1000);
	upload.sendKeys(Keys.TAB);
	upload.sendKeys(Keys.TAB);
	upload.sendKeys(Keys.ENTER);
	Thread.sleep(5000);
	driver.close();
	
		
	}

}
