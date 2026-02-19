package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import WebDriverManager.driverManager;

public class Helpers {

	WebDriver driver;

	public Helpers() {
		this.driver = driverManager.getDriver();
		PageFactory.initElements(driver, this);
	}

	public void captureScreenshots() throws IOException {
		TakesScreenshot scrshot = (TakesScreenshot) driver;
		File SrcFile = scrshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(SrcFile,
				new File("C:\\Users\\anjkumar12\\eclipse-workspace\\Feb10_pageObject\\src\\utilities\\screeen.png"));
	}

}
