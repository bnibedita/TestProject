package Locator_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Module_5_assign6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String url="http://www.maths.surrey.ac.uk/explore/nigelspages/frame2.htm";
		driver.get(url);
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(500);
		driver.switchTo().frame(0);
		WebElement text=driver.findElement(By.xpath("//p[@class='examp3']"));
		System.out.println(text.getText());
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		Thread.sleep(1000);
		WebElement text1=driver.findElement(By.xpath("//textarea[@name='browser']"));
		text1.clear();
		text1.sendKeys("Hello Nibedita!!");
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		Thread.sleep(500);
		driver.switchTo().frame(2);
		Thread.sleep(1000);
		WebElement text2=driver.findElement(By.xpath("/html/body/form/table[1]/tbody/tr/td[2]/p[2]/font"));
		Thread.sleep(1000);
		System.out.println(text2.getText());
		Thread.sleep(1000);
		driver.quit();

	}

}
