package docker;

import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

public class Grid_docker extends Test1 {

	@Test
	public void test1() 
	{
		/*
		 * DesiredCapabilities dc = DesiredCapabilities.chrome(); URL url = new
		 * URL("http://0.0.0.0:4444/grid/console");
		 * 
		 * RemoteWebDriver driver = new RemoteWebDriver(url,dc);
		 */
		
	
		driver.get("https://github.com/SeleniumHQ");
		String title = driver.getTitle();
		System.out.println(title);
	}
	
}
