package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchUpdated {
	

WebDriver driver =null;

//By TextBox=By.xpath("//input[@name='q']");
//By SearchButton=By.xpath("//div[@class='FPdoLc tfB0Bf']//input");



public GoogleSearchUpdated(WebDriver driver1)
{
	
	driver=driver1;
}

public void textBox(String text)
{
driver.findElement(By.xpath("//input[@name='q']")).sendKeys(text);

}


public void SearchText() {
	driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input")).sendKeys(Keys.RETURN);
	
}
}