package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import WebDriverManager.driverManager;

public class productPage {

	@FindBy(xpath = "//b[text()='ADIDAS ORIGINAL']/../../button[contains(@class,'btn w-10')]")
	WebElement addtoCart;
	@FindBy(xpath = "//button[@routerlink='/dashboard/cart']")
	WebElement CartButton;

	WebDriver driver;

	public productPage() {
		this.driver = driverManager.getDriver();
		PageFactory.initElements(driver, this);
	}

	public void clicktoAddToCart() {
		addtoCart.click();

	}

	public void clickCart() throws InterruptedException {
		Thread.sleep(5000);
		CartButton.click();
	}

}
