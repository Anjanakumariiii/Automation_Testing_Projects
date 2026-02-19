package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AccountPage;
import pages.loginpage;

public class E2E_Test {
 

	@Test
	 (dataProvider = "data-provider", dataProviderClass =
	 TestAnnotationsDataProvider.class)
	public void ensureLoginSuccessful(String username , String password ) throws InterruptedException {
		loginpage loginpage = new loginpage();

		loginpage.navigatetoLoginPage();
		loginpage.loginUsingCredentials(username,password);
		Assert.assertTrue(loginpage.ensureCustomerisonAccountAervice(), "not page logged");

	
         AccountPage accountpage = new AccountPage();
        
        Assert.assertTrue(accountpage.ensureAtleastOneAccount(), "not page logged");
		

		loginpage.signOut();

	}}

