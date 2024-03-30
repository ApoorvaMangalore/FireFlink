package workingWithUnitTestingTool;


import org.testng.annotations.Test;

public class WorkingWithPriority {// tc_Id

	@Test(priority = 1)
	public void register() {
		System.out.println("User is able to register");
	}

	@Test(priority =2)
	public void login() {
		System.out.println("User is able to Login");
	}

	@Test(priority = 3)
	public void search() {
		System.out.println("User is able to search product");

	}

	@Test(enabled = false)
	public void wishlist() {
		System.out.println("User is able to add product to wishlist");
	}

	@Test
	public void cart() {
		System.out.println("User is able to add product to cart");
	}
	@Test
	public void Cart() {
		System.out.println("User is able to add product to cart");
	}

	@Test
	public void payment() {
		System.out.println("User is able to make a payment");
	}
	@Test(alwaysRun = true)
	public void closeBrowser() {
		System.out.println("User should be able to close the browser");
	}

}
