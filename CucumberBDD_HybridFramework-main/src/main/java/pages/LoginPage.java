package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilis.Constants;
import utilis.ElementUtilis;

public class LoginPage {

	WebDriver driver;
	private ElementUtilis elementutilis;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		elementutilis = new ElementUtilis(driver);
	}

	@FindBy(id = "input-email")
	private WebElement emailAddressoption;

	@FindBy(id = "input-password")
	private WebElement Passwordoption;

	@FindBy(xpath = "//button[@class='btn btn-primary']")
	private WebElement loginbuttonoption;

	@FindBy(xpath = "//*[@class='alert alert-danger alert-dismissible']")
	private WebElement errormessagetext;

}
