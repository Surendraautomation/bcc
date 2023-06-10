package redchillie.bcc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class CTest {
	
	@Test
	public void c() {
		System.out.println("C Test");
		System.setProperty("webdriver.chrome.driver", "/Users/surendra/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		System.out.println("Done");
		System.out.println("Second Change");
		driver.close();
	}

}
