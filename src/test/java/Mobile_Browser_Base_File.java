
import java.net.MalformedURLException;
	import java.net.URL;
import java.time.Duration;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.options.UiAutomator2Options;
    
import io.appium.java_client.service.local.AppiumServiceBuilder;
 
    
    public class Mobile_Browser_Base_File
{
public static AndroidDriver driver;

@BeforeClass
public void Mobile_Google_Chrome_Base_File () throws MalformedURLException
{		
	
	
	UiAutomator2Options options = new UiAutomator2Options();
	options.setDeviceName("Sumsung");
	options.setChromedriverExecutable("//Users//mohitgaur//Downloads//chromedriver 6");
	options.setCapability("browserName", "Chrome");
    //options.setAppPackage("com.android.chrome");
	//options.setAppActivity("com.google.android.apps.chrome.Main");
	

	 driver =  new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub/"), options);


}
public static Double getFormattedAmount(String amount)
{
	Double price = Double.parseDouble(amount.substring(1));
	return price;
	
} 
// other files you does not need like log press kind of thing is in native app only 
/*
 * 
 */

@AfterClass
public void tearDown()
{
	driver.quit();

    
	}
}

    
  
	
