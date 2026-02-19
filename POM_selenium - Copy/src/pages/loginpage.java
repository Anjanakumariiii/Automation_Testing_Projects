package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import WebDriverManager.driverManager;

public class loginpage {
	
		@FindBy(name = "username")
		WebElement userNameBox;
		@FindBy(name = "password")
		WebElement passwordBox;
		@FindBy(xpath = "//input[@value='Log In']")
		WebElement loginBtn;
		@FindBy(xpath = "//a[text()='Log Out']")
		WebElement productPageSignOutButtonText;
		
		
		WebDriver driver;
		
		public loginpage() {
		this.driver = driverManager.getDriver();
		PageFactory.initElements(driver, this);
	}

	public void navigatetoLoginPage() {

		driver.get("https://parabank.parasoft.com/ ");
		driver.manage().window().maximize();
	}

	public void loginUsingCredentials(String name, String password) {
		userNameBox.sendKeys(name);
		passwordBox.sendKeys(password);
		loginBtn.click();
	}
	
	public boolean ensureCustomerisonAccountAervice() {
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

	
	

	

}
