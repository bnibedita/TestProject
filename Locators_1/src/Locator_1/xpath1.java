package Locator_1;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class xpath1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");		
		Thread.sleep(4000);
		driver.manage().window().maximize();
		
		// Syntax 1: 
		//input[@locator='value of locator']
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ABCD@gmail.com");
		Thread.sleep(6000);
			
		
		driver.findElement(By.xpath("//input[@id='password::content']")).sendKeys("123456789");
		Thread.sleep(6000);
		
			
		driver.findElement(By.xpath("//input[@name='retypePassword']")).sendKeys("123456789");
		Thread.sleep(3000);
		// Syntax 2: AND
		Select obj = new Select(driver.findElement(By.xpath("//select[@name='country'][@id='country::content']")));
		obj.selectByValue("IN");
		
		// Syntax 3: OR
				//input[@locator1='value of locator' OR @locator2='value of locator2'] 
					
		driver.findElement(By.xpath("//input[@name='firstName' or @id='firstName::content']")).sendKeys("Nibedita");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Behera");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='jobTitle']")).sendKeys("Lead Analyst");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='workPhone']")).sendKeys("1234567890");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='companyName']")).sendKeys("ABCD pvt ltd");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("#11, Street 1, District");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='address2']")).sendKeys("State, country");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("City");
		Thread.sleep(3000);
		
		Select obj1= new Select(driver.findElement(By.xpath("//select[@name='state']")));
		obj1.selectByValue("25");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("123456");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@class='xfx'][contains(text(),'Create Account')]")).click();
		Thread.sleep(2000);
		
		driver.close();
		}

}
