package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		driver.navigate().to("http://spicejet.com");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		String str=driver.getTitle();
		System.out.println("the current page title is: "+str);
		String str1=driver.getCurrentUrl();
		System.out.println("the current page url is: "+str1);
		//String str2=driver.getPageSource();
		//System.out.println(str2);
		WebElement s=driver.findElement(By.className("maincontainer"));
		System.out.println(s);
		driver.navigate().refresh();
		
		
		
		
	


	}

}
