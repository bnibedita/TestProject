package test_1_TestNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class test_3 {
	public WebDriver driver;
	
	 @BeforeSuite
	  public void beforeSuite() {
		  System.out.println("before suite");
		  System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		  driver = new ChromeDriver();
	  }
	 
	 @BeforeTest
	  public void beforeTest() {
		  System.out.println("before test");
	  }
	 
	 @BeforeClass
	  public void beforeClass() {
		  System.out.println("before class");
	  }
	 

	  @BeforeMethod
	  public void beforeMethod() {
		  
		  System.out.println("before Method");	  
	  }

	 
  @Test()
  public void c_testcase_1() throws InterruptedException {
	  
	  driver.get("https://www.flipkart.com/");
	  Thread.sleep(2000);
	    
	   }
  
  @Test()
    public void a_testcase_2() throws InterruptedException {
	  
	  driver.get("https://smallpdf.com/jpg-to-pdf");
	  Thread.sleep(2000);
	    
	   }
  
  @Test()
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

