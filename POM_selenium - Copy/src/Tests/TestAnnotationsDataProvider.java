package Tests;

import org.testng.annotations.DataProvider;

public class TestAnnotationsDataProvider {
	
	@DataProvider(name = "data-provider")
	public Object[][] dataProviderMethod() {
		return new Object[][] { { "user5","password" },{ "user","admin" }
				 };
	}

}
