// Facebook Sign_up/ Registration page
package Locator_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LOC1 {

	public static void main(String[] args) throws InterruptedException {
		
		// Initiating Chrome Browser
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	// Passing URL to Browser
	driver.get("https://www.facebook.com/");
	
	// Give Wait Time to get load
	Thread.sleep(1000);
	
	// click on login Button
	driver.findElement(By.id("u_0_2")).click();
	Thread.sleep(1000);
	
	//Insert Text as input to TextBox field
	driver.findElement(By.name("firstname")).sendKeys("AB");;
	Thread.sleep(1000);
	driver.findElement(By.name("lastname")).sendKeys("Behera");
	Thread.sleep(1000);
	driver.findElement(By.id("u_2_g")).sendKeys("-9112341234");
	Thread.sleep(1000);
	
	// Fill Password field
	driver.findElement(By.id("password_step_input")).sendKeys("12345678");
	Thread.sleep(1000);
	
	// Enter DOB from Drop down by using Index or Value from SELECT CLASS
	Select s= new Select(driver.findElement(By.name("birthday_day")));
	s.selectByValue("1");
	Thread.sleep(1000);
	Select s1 = new Select(driver.findElement(By.id("month")));
	s1.selectByIndex(11);
	Thread.sleep(1000);
	Select s2 = new Select(driver.findElement(By.name("birthday_year")));
	s2.selectByValue("2016");
	Thread.sleep(1000);
	
	//Perform Select radio button
	List<WebElement> rd1= driver.findElements(By.name("sex"));
	int size=rd1.size();
	
	//WebElement rd2= driver.findElement(By.xpath("//input[@id ='u_0_5']"));
	
	Thread.sleep(1000);
	System.out.println("Radio button Size:"+ size);
	Thread.sleep(1000);
	for(int i=0; i<size; i++)
	{
		String val=rd1.get(i).getAttribute("value");
		if (val.equalsIgnoreCase("2"))
		{
			rd1.get(i).click();
			System.out.println("Radio button2 selected");
		}
	}
		
	// Click on sign up page
	driver.findElement(By.name("websubmit")).click();
	Thread.sleep(1000);
	driver.close();

	}

}
