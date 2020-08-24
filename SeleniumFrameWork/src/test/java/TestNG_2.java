import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_2 {
	
	WebDriver driver=null;
	
	@BeforeTest
	public void setUp()
	{
	
		System.setProperty("webdriver.chrome.driver","C:/Users/himanshu/workspace/NEON/SeleniumFrameWork/drivers/chromedriver.exe");
			
		 driver = new ChromeDriver();
		 
		 
	}
	@Test
	public void googleSearch(){
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("tallest tree");

		driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input")).sendKeys(Keys.RETURN);
	}
		
	@Test
	public void googleSearch2(){
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("tallest tree");

		driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input")).sendKeys(Keys.RETURN);
	}
	
	
	
		@AfterTest
	public void exit()
	{
		driver.close();
	}
	}


