package webdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.id("lst-ib")).sendKeys("python tutorial");
		WebDriverWait wait=new WebDriverWait(driver, 120);
		Thread.sleep(5000);
		List<WebElement> var=driver.findElements(By.xpath("//ul[@class='sbsb_b']/li/div/div[@class='sbqs_c']/b"));
		for(WebElement itr:var)
		{
			System.out.println(itr.getAttribute("innerHTML"));
			if(itr.getAttribute("innerHTML").contains("point")){
				wait.until(ExpectedConditions.elementToBeClickable(itr)).click();
				break;
			}
			
		}
		

	}

}
