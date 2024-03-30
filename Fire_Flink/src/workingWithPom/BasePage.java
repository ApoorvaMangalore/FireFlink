package workingWithPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

	// step 1
	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Step 2:

	@FindBy(id = "small-searchterms")
	private WebElement searchTextBox;

	public WebElement getSearchTextBox() {
		return searchTextBox;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	@FindBy(xpath = "//input[@value='Search']")
	private WebElement searchButton;
}
