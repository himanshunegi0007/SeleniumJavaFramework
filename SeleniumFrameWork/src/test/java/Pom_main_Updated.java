import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.GoogleSearchUpdated;
public class Pom_main_Updated {
	
	
	static WebDriver driver=null;
	
		public static void Search(){
		System.setProperty("webdriver.chrome.driver","C:/Users/himanshu/workspace/NEON/SeleniumFrameWork/drivers/chromedriver.exe");		
		 driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		GoogleSearchUpdated g=new GoogleSearchUpdated(driver);
		g.textBox("hello");
		g.SearchText();
		}
		public static void main(String[] args){
			Search();
		}
		
		
		
		
}
		
		
		
	//	GoogleSearchUpdated.searchBar(driver).sendKeys("test");
		//GoogleSearchPage.searchButton(driver).click();
		
		
		
		
		
	
		



