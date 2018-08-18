package webdriver_TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class AssertionCammand {
	public WebDriver driver;
  @Test
  public void f() {
	  String expval="Google";
	  String actval=driver.getTitle();
	 // Assert.assertEquals(actval, expval);
	  Assert.assertTrue(actval.equals(expval));
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
  }

}
