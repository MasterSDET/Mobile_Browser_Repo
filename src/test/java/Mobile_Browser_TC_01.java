import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Mobile_Browser_TC_01 extends Mobile_Browser_Base_File
{
@Test
	public  void Browser_TC01()
	{
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Mohit");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);  //click on google search button

	}

}
