package test;

import org.testng.annotations.Test;

import base.BaseTest;
import pagess.DummyPage;

public class DummyTest extends BaseTest {

	// -------------------------
	// PRIORITY TESTS
	// -------------------------
	@Test(priority = 1)
	public void test1() {
		new DummyPage(driver).printMessage("Test Case 1 Running");
	}

	@Test(priority = 2)
	public void test2() {
		new DummyPage(driver).printMessage("Test Case 2 Running");
	}

	@Test(priority = 3)
	public void test3() {
		new DummyPage(driver).printMessage("Test Case 3 Running");
	}

	// -------------------------
	// DEPENDENCY TESTS
	// -------------------------
	@Test(priority = 5)
	public void loginTest() {
		new DummyPage(driver).printMessage("Login Successful");
	}

	@Test(priority = 4, dependsOnMethods = "loginTest")
	public void dashboardTest() {
		new DummyPage(driver).printMessage("Dashboard Loaded");
	}

	@Test(priority = 6, dependsOnMethods = "dashboardTest")
	public void profileTest() {
		new DummyPage(driver).printMessage("Profile Opened");
	}

	// -------------------------
	// SIMPLE TESTS
	// -------------------------
	@Test(priority = 7)
	public void test7() {
		System.out.println("Executing Test #7");
	}

	@Test(priority = 8)
	public void test8() {
		System.out.println("Executing Test #8");
	}

	@Test(priority = 9)
	public void test9() {
		System.out.println("Executing Test #9");
	}

	@Test(priority = 10)
	public void test10() {
		System.out.println("Executing Test #10");
	}
}
