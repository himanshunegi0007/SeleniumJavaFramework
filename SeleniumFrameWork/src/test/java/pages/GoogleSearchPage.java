package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchPage {
	

		
			
	public static WebDriver driver = new ChromeDriver();	
			

	 public static WebElement searchBar(WebDriver driver) {
		

		WebElement element=driver.findElement(By.xpath("//input[@name='q']"));
			return element;
	}
		
	 public static WebElement searchButton(WebDriver driver) 
	 {
		 
		WebElement element= driver.findElement(By.className("gNO89b"));
		return element;

		 
	 }

}
