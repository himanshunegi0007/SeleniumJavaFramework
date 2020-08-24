import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtendReportsTestNG {

	ExtentHtmlReporter htmlReporter;	
	ExtentReports e;
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent1.html");
		ExtentReports e=new ExtentReports();
		e.attachReporter(htmlReporter);

		System.setProperty("webDriver.chrome.driver","C:/Users/himanshu/workspace/NEON/SeleniumFrameWork/drivers/chromedriver.exe");
		 driver=new ChromeDriver();
	}
	
	@Test
	public void test1() 
	{
		ExtentTest test1=e.createTest("google Search");
		test1.log(Status.INFO,"Starting test case");
		
		driver.get("https://www.google.com");
		test1.pass("navigated to google");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("tallest tree");
		test1.pass("Text BOX");

		driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input")).sendKeys(Keys.RETURN);

		test1.pass(" Searched");
		e.flush();

	}
	
	//@AfterTest
	//public void closeConnection()
{
	//	driver.close();
}


      @AfterSuite
	public void tearDown()
	{
		e.flush();
	}
	
}
