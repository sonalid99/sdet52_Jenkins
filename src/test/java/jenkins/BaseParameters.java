package jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BaseParameters {

	@Test
	public void parameters() {
		String Browser=System.getProperty("browser");
		String Url=System.getProperty("url");
		WebDriver driver;
		if(Browser.equalsIgnoreCase("chrome")) {
		driver=new ChromeDriver();
		}
		
		else if (Browser.equalsIgnoreCase("firefox")) {
		driver= new FirefoxDriver();
			
		}
		
		else if (Browser.equalsIgnoreCase("edge")) {
		driver=new EdgeDriver();
		}
		else {
		driver=new ChromeDriver();
		}
		
		driver.get(Url);
	}
}
