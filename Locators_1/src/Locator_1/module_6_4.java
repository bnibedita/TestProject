package Locator_1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class module_6_4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url="http://only-testing-blog.blogspot.com/2014/09/selectable.html";
        driver.get(url);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
        WebElement ab=driver.findElement(By.xpath("//div[@id='slider']"));
		WebElement ab1=driver.findElement(By.xpath("//Span[@class='ui-slider-handle ui-state-default ui-corner-all']"));
        
		int x = ab.getLocation().getX();
		int y = ab.getLocation().getY();
		System.out.println(x+" ,"+y);
		int x1=ab1.getLocation().getX();
		int y1=ab1.getLocation().getY();
		Thread.sleep(1000);
		System.out.println(x1+" ,"+y1);
		//int y2 = y1+y1/2;		
		
		Thread.sleep(1000);
        Actions e=new Actions(driver);
        //e.dragAndDropBy(ab1,x1, y1).build().perform();
        Thread.sleep(1000);
        
      JavascriptExecutor js = (JavascriptExecutor) driver;
      //js.executeScript("document.getElementById('Women Jeans')");
      		
       driver.close(); 
        		
	}
}
