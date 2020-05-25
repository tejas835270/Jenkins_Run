package docker;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	static WebDriver driver;
	@Test
	public void test11()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/tejasshirke-mac/Desktop/Tejas/Pikachu/CICD_for_QA_Youtube_automationworks/chromedriver_83");
		WebDriver driver = new ChromeDriver();
		driver.get("https://onlinect.sharepoint.com/sites/interct/Pages/Home.aspx");
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
	}

	@Test
	public void Test2() {
		
		driver.get("https://github.com/SeleniumHQ");
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	@Test
	public void Test3() {
		
		driver.get("https://mvnrepository.com/artifact/org.apache.maven.plugins/maven-surefire-plugin/2.19.1");
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	@Test
	public void Test4() {
		
		driver.get("https://github.com/tejas835270/Jenkins_Test");
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	
	
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "/Users/tejasshirke-mac/Desktop/Tejas/Pikachu/CICD_for_QA_Youtube_automationworks/chromedriver_83");
		 driver = new ChromeDriver();
	}
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}
}
