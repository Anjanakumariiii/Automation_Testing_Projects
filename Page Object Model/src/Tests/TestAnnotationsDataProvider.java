package Tests;

import org.testng.annotations.DataProvider;

public class TestAnnotationsDataProvider {

	@DataProvider(name = "data-provider")
	public Object[][] dataProviderMethod() {
		return new Object[][] { { "Prakriti1@gmail.com", "Prakriti123" }, { "Nupur1@gmail.com", "Nupur123" },
				{ "", "Anjana@123" } };
	}

}
