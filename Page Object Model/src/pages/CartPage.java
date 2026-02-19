package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import WebDriverManager.driverManager;

public class CartPage {

	@FindBy(xpath = "//button[text()='Continue Shopping']")
	WebElement CountinueShopping;

	WebDriver driver;

	public CartPage() {
		this.driver = driverManager.getDriver();
		PageFactory.initElements(driver, this);
	}

	public boolean ensurecountinueshoppingsuccessful() {
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(16));
		wt.until(ExpectedConditions.visibilityOf(CountinueShopping));
		if (CountinueShopping.isDisplayed()) {
			return true;
		}
		return false;
	}

}
