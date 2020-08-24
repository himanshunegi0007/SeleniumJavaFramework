import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtendReportBasic {
	
	
	static WebDriver driver=null;
	public static void main(String[] args) {
		
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
		ExtentReports e=new ExtentReports();
		e.attachReporter(htmlReporter);
		
		ExtentTest test1=e.createTest("google Search");
		test1.log(Status.INFO,"Starting test case");
		System.setProperty("webdriver.chrome.driver","C:/Users/himanshu/workspace/NEON/SeleniumFrameWork/drivers/chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.google.com");
		test1.pass("navigated to google");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("tallest tree");
		test1.pass("Text BOX");

		driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input")).sendKeys(Keys.RETURN);

		test1.pass(" Searched");


	driver.close();
	
	test1.pass(" closed");
	
	
	ExtentTest test2=e.createTest("google Search2");
	test2.log(Status.INFO,"Starting test case");
	System.setProperty("webdriver.chrome.driver","C:/Users/himanshu/workspace/NEON/SeleniumFrameWork/drivers/chromedriver.exe");
	 driver=new ChromeDriver();
	driver.get("https://www.google.com");
	test2.fail("navigated to google");
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("tallest tree");
	test2.fail("Text BOX");

	driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input")).sendKeys(Keys.RETURN);

	test2.fail(" Searched");


driver.close();
test2.pass(" closed");

e.flush();
	
	
	
	}

}
