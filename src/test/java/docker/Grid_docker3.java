package docker;

import org.testng.annotations.Test;

import java.lang.reflect.Executable;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Grid_docker3 extends Test1{
	
	@Test
	public void test3() throws MalformedURLException
	{
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "/Users/tejasshirke-mac/Downloads/chromedriver");
		 * 
		 * 
		 * ChromeOptions option = new ChromeOptions(); URL url = new
		 * URL("http://0.0.0.0:4444/grid/console"); RemoteWebDriver driver = new
		 * RemoteWebDriver(url,option);
		 * 
		 * driver.get(
		 * "https://www.youtube.com/watch?v=f9gJ1Th3Dho&list=PLUDwpEzHYYLtpm24ojHwubwmMNQildHBc&index=6"
		 * ); String title = driver.getTitle(); System.out.println(title);
		 * driver.quit();
		 */
		

		driver.get("https://portal.dev.syapse.com/");
		String title = driver.getTitle();
		System.out.println(title);
	}
	
}
