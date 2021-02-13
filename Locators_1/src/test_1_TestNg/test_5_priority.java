package test_1_TestNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

//https://www.guru99.com/introduction-testng-groups.html
public class test_5_priority {
	public WebDriver driver;
	 
	@BeforeSuite
	  public void beforeSuite() {
		  System.out.println("before suite");
		  System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		  driver = new ChromeDriver();
	  }
	 
	 @BeforeTest
	  public void beforeTest() throws InterruptedException {
		  System.out.println("before test");
		  String url1 = "https://www.spicejet.com/";
		  driver.get(url1);
		  Thread.sleep(2000);
		  
	  }
	 
	 @BeforeClass
	  public void beforeClass() {
		  System.out.println("before class"+" class name : test_5_priority");
	  }
	 

	  @BeforeMethod
	  public void beforeMethod() {
		 System.out.println("before Method");
		 
	  }

	 
  @Test(priority=0)
  public void c_testcase_1() throws InterruptedException {
  driver.findElement(By.xpath("//label[contains(text(),'Senior')]//preceding::input[1]")).click();
  Thread.sleep(2000);
  driver.manage().window().maximize();
  Thread.sleep(2000);
  Assert.assertFalse(true);
  Thread.sleep(2000);
  }
  
  @Test(priority=2)
    public void a_testcase_2() throws InterruptedException {
	 String act_title = driver.getTitle();
	 String exp_title = driver.getTitle();
	 Assert.assertFalse(false);
	 Thread.sleep(2000);

  }
  
  @Test(priority=4)
  public void b_testcase_3() throws InterruptedException {
	  
	  driver.get("https://www.guru99.com/all-about-testng-and-selenium.html");
	  Thread.sleep(2000);
	    
	   }

  
  @AfterMethod
  public void afterMethod() {
	  System.out.println("after Method");	    
  }
  
//@Before and @AfterMethod will be called once for every @test.
  
  @AfterClass
  public void afterClass() {
	  System.out.println("after class");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("after test");  
  }

   @AfterSuite
  public void afterSuite() {
	  driver.close();
	  System.out.println("after suite");
  }

}
