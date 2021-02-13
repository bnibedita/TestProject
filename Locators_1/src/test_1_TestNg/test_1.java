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

public class test_1 {
	public WebDriver driver;
	

  @Test()
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
	  Thread.sleep(2000);
	    
	   }
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("beforeMethod");	  
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod");	    
  }


  @BeforeClass
  public void beforeClass() {
	  System.out.println("before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("after test");  
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  driver.close();
	  System.out.println("after suite");
  }

}

