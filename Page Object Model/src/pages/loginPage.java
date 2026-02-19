package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import WebDriverManager.driverManager;

public class loginPage {

	@FindBy(id = "userEmail")
	WebElement userNameBox;
	@FindBy(id = "userPassword")
	WebElement passwordBox;
	@FindBy(id = "login")
	WebElement loginBtn;
	@FindBy(xpath = "//button/i[contains(@class,'sign-out')]")
	WebElement productPageSignOutButtonText;

	WebDriver driver;

	public loginPage() {
		this.driver = driverManager.getDriver();
		PageFactory.initElements(driver, this);
	}

	public void navigatetoLoginPage(String Url) {

		driver.get(Url);
		driver.manage().window().maximize();
	}

	public void loginUsingCredentials(String name, String password) {
		userNameBox.sendKeys(name);
		passwordBox.sendKeys(password);
		loginBtn.click();
	}

	public boolean ensureLoginsuccessful() {
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(16));
		wt.until(ExpectedConditions.visibilityOf(productPageSignOutButtonText));
		if (productPageSignOutButtonText.isDisplayed()) {
			return true;
		}
		return false;
	}

	public void signOut() {
		productPageSignOutButtonText.click();
	}

//
//	By usernameLoco = By.xpath("//input[@id='userEmail']");
//	By userpassLoco = By.xpath(" //input[@id='userPassword']");
//	By loginLoco = By.xpath("//input[@id='login']");
//s
//	public boolean ensureUserNameisDisplayed(WebDriver driver) {
//		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wt.until(ExpectedConditions.presenceOfAllElementsLocatedBy(usernameLoco));
//		if (driver.findElement(usernameLoco).isDisplayed()) {
//			return true;
//		}
//		return false;
//	}
//
//	public boolean ensurePasswordisDisplayed(WebDriver driver) {
//
//		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wt.until(ExpectedConditions.presenceOfAllElementsLocatedBy(userpassLoco));
//		if (driver.findElement(userpassLoco).isDisplayed()) {
//			return true;
//		}
//		return false;
//
//	}
//
//	public boolean ensureLoginIsDisplayed(WebDriver driver) {
//		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wt.until(ExpectedConditions.presenceOfAllElementsLocatedBy(loginLoco));
//		if (driver.findElement(loginLoco).isDisplayed()) {
//			return true;
//		}
//		return false;
//
//	}
//
//	public void loginUsingCredentials(WebDriver driver, String name, String password) {
//
//		WebElement login = driver.findElement(usernameLoco);
//		WebElement password2 = driver.findElement(userpassLoco);
//		WebElement button = driver.findElement(loginLoco);

//		login.sendKeys(name);
//		password2.sendKeys(password);
//		button.click();
//
//	}
//
//	public void navigatetoLoginPage() {
//		driver.get("https://rahulshettyacademy.com/client/#/auth/login");
//		driver.manage().window().maximize();
//	}

}
