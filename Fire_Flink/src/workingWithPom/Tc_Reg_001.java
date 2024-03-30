package workingWithPom;

import org.testng.annotations.Test;

public class Tc_Reg_001 extends BaseClass {

	@Test
	public void register() throws InterruptedException {
		RegisterPage rp= new RegisterPage(driver);
		rp.getRegisterLink().click();
		Thread.sleep(2000);
		rp.getFemaleRadioButton().click();
		Thread.sleep(2000);
		rp.getFirstNameTextBox().sendKeys("Apoorva");
		rp.getLastNameTextBox().sendKeys("Mangalore");
	}
}
