package Tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import WebDriverManager.driverManager;
import listner.Listner;
import pages.CartPage;
import pages.loginPage;
import pages.productPage;

@Listeners(Listner.class)
public class E2E_tests extends driverManager {

	@Test
	// (dataProvider = "data-provider", dataProviderClass =
	// TestAnnotationsDataProvider.class)
	@Parameters({ "baseUrl" })
	public void ensureLoginSuccessful(String baseUrl) throws InterruptedException {
		loginPage loginpage = new loginPage();

		loginpage.navigatetoLoginPage(baseUrl);
		loginpage.loginUsingCredentials("Nupur1@gmail.com", "Nupur123");
		Assert.assertTrue(loginpage.ensureLoginsuccessful(), "not page logged");

		productPage ProductPage = new productPage();
		ProductPage.clicktoAddToCart();

		ProductPage.clickCart();

		CartPage cartpage = new CartPage();
		Assert.assertTrue(cartpage.ensurecountinueshoppingsuccessful(), "not page loaded");

		loginpage.signOut();

	}

//	@Test
//	public void test1() {
//		WebDriver driver1 = new ChromeDriver();
//	}
//
//	@Test
//	public void test2() {
//		WebDriver driver1 = new EdgeDriver();
//	}
//
//	@Test
//	public void test3() {
//		WebDriver driver1 = new ChromeDriver();
//	}

}
