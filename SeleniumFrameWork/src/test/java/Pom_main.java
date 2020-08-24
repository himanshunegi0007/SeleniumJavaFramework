import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.GoogleSearchPage;
public class Pom_main {
	
	
	static WebDriver driver=null;
	public static void main(String[] args){
		Search();
	}
		public static void Search(){
		System.setProperty("webdriver.chrome.driver","C:/Users/himanshu/workspace/NEON/SeleniumFrameWork/drivers/chromedriver.exe");		
		 driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		GoogleSearchPage.searchBar(driver).sendKeys("test");
		GoogleSearchPage.searchButton(driver).click();
		
		
		
		}
		
}	
		



