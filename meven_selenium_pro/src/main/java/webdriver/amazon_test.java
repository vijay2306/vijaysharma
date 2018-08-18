package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class amazon_test {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://amazon.com");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		WebElement str=driver.findElement(By.id("twotabsearchtextbox"));
		String expstr="harry porter";
		str.sendKeys("harry porter");
		String actstr=str.getAttribute("value");
		if(expstr.equals(actstr)){
			System.out.println("both string are same");
		}
		else{
			System.out.println("both string are different");
		}
		
		
		
		

	}

}
