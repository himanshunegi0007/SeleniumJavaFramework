import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver","C:/Users/himanshu/workspace/NEON/SeleniumFrameWork/drivers/chromedriver.exe");
		//WebDriver driver = new FirefoxDriver();
		//driver.get("https://www.selenium.dev/");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("tallest tree");

	driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input")).sendKeys(Keys.RETURN);

		//driver.findElement(By.xpath("https://mail.rediff.com/cgi-bin/login.cgi"));
		
		
	}

}
