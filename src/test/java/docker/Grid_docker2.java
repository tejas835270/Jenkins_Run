package docker;

import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Grid_docker2 extends Test1 {

	@Test
	public void test2() throws MalformedURLException
	{/*
		 * DesiredCapabilities dc = DesiredCapabilities.chrome(); URL url = new
		 * URL("http://0.0.0.0:4444/grid/console");
		 * 
		 * RemoteWebDriver driver = new RemoteWebDriver(url,dc);
		 * 
		 * driver.get("https://www.google.com"); String title = driver.getTitle();
		 * System.out.println(title); driver.quit();
		 */
		
		driver.get("https://syapse.atlassian.net/secure/RapidBoard.jspa?rapidView=319");
		String title = driver.getTitle();
		System.out.println(title);
	}
	
}
