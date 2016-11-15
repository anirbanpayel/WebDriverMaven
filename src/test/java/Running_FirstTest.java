import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;


public class Running_FirstTest {
	
	
	public static WebDriver driver;
	public Running_FirstTest()
	{
	System.setProperty("webdriver.ie.driver", "C:\\Users\\anirbanpayel\\Desktop\\IEDriverServer.exe");
	 driver= new InternetExplorerDriver();
	}
	
	@Test
	
	public void launchUrl()
	{
		
		driver.get("http://www.google.com");
	}
	
	@AfterSuite
	
	public void teardown()
	{
		driver.quit();
	}

}
