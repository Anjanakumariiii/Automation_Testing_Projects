package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {

	protected WebDriver driver;

	@Parameters("browser")
	@BeforeMethod
	public void setup(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else {
			throw new RuntimeException("Browser not supported: " + browser);
		}

		driver.manage().window().maximize();
		System.out.println("Browser launched: " + browser);
	}

//	@AfterMethod
	public void teardown() {
		if (driver != null) {
			System.out.println("Closing browser...");
			driver.quit();
		}
	}
}
