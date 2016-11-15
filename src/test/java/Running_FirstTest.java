import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;


public class Running_FirstTest {
	
	
	@Test
	
	public void launchUrl()
	{
		System.setProperty("webdriver.ie.driver", "C:\\Users\\anirbanpayel\\Desktop\\IEDriverServer.exe");
		WebDriver driver= new InternetExplorerDriver();
		driver.get("http://www.google.com");
	}

}
