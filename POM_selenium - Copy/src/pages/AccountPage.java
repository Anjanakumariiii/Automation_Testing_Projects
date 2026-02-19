package pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;



import WebDriverManager.driverManager;

public class AccountPage {
	
	By accountLoco = By.xpath("//table[@id='accountTable']//tbody/tr");
	

	

	WebDriver driver;

	
	public AccountPage() {
	this.driver = driverManager.getDriver();
	
}

public boolean ensureAtleastOneAccount() {
	
	List<WebElement> accounts = new ArrayList<WebElement>();
WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(10));
	wt.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(accountLoco));
	accounts=driver.findElements(accountLoco);


    System.out.println(accounts.size());	
 if(accounts.size()>0) {
	 return true;
 }
 return false;


}
	
}
