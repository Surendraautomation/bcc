package redchillie.bcc;

import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BrowseropeningTest {
	static WebDriver driver;
	@Test
	public void test() throws IOException {
		String path=System.getProperty("user.dir")
				+ "//GlobalData.properties";
	// File file=new File (path);
		FileInputStream fis = new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(fis);
		
		String browserName= System.getProperty("browser")!= null ? System.getProperty("browser"):prop.getProperty("browser");
		
		//String browserName = System.getProperty("browser")!=null ? System.getProperty("browser") :prop.getProperty("browser");
		//String browserName=prop.getProperty("browser");

		if (browserName.contains("firefox")) {

	System.setProperty("webdriver.firefox.driver", "/Users/surendra/Documents/Grid");
	 
	 driver= new FirefoxDriver();
	driver.get("https://amazon.com");
	//System.out.println(driver.getPageSource());
	System.out.println("Opened");
	driver.close();

	}
		else if (browserName.contains("chrome")) {

			System.setProperty("webdriver.chrome.driver", "/Users/surendra/Documents/chromedriver");
			 
			 driver= new ChromeDriver();
			driver.get("https://amazon.com");
			//System.out.println(driver.getPageSource());
			System.out.println("Opened");
			driver.close();

			}
	
}
	
}
	
	
