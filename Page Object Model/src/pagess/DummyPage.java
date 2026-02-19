package pagess;

import org.openqa.selenium.WebDriver;

public class DummyPage {

	WebDriver driver;

	public DummyPage(WebDriver driver) {
		this.driver = driver;
	}

	public void printMessage(String msg) {
		System.out.println("Dummy Page: " + msg);
	}
}
