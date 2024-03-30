package workingWithUnitTestingTool;

import org.testng.annotations.Test;

public class WorkingWithDependsOnMethods {

	@Test
	public void register() {
		System.out.println("I am able to register");
	}

	@Test(dependsOnMethods = "register")
	public void login() {
		System.out.println("I am able to login");
	}

	@Test(dependsOnMethods = "payment")
	public void logout() {
		System.out.println("I am able to logout");
	}

	@Test(dependsOnMethods = "login")
	public void search() {
		System.out.println("I am able to search product");
	}

	@Test(dependsOnMethods ="search" )
	public void cart() {
		System.out.println("I am able to add ptoduct to cart");
	}

	@Test(dependsOnMethods = "cart")
	public void payment() {
		System.out.println("I am able to make a payment");
	}
}
