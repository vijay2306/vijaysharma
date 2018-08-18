package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class findElements {
	public static WebDriver driver;
	
 public static void main(String[] args) {
		//int count=0;
		driver=new FirefoxDriver();
		driver.get("https://www.eenadupellipandiri.net/");
		driver.manage().window().maximize();
		/*List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for (int i=0;i<links.size();i++){
			//System.out.println(links.get(i).getText());
			if(!links.get(i).getText().isEmpty()){
				System.out.println(links.get(i).getText());
				count=count+1;
				
			}
		}
		System.out.println("visible links are:"+count);
		*/
	 WebElement droploc=driver.findElement(By.id("reg_mothertongue"));
	 List<WebElement> citems=droploc.findElements(By.tagName("option"));
	 System.out.println(citems.size());
	 for(int i=1;i<citems.size();i++){
		 System.out.println(citems.get(i).getText());
	 }
		
		
	}

}
