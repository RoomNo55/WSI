package stepdefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class loginsteps extends DriverFactory{
	
	public LoginPage LogPage;
	
	Logger logs;
	
	@When("User clicks on My Account dropdown")
	public void User_clicks_on_My_Account_dropdown() {
		logs = LogManager.getLogger(loginsteps.class.getName());

		logs.debug("clicked on MyAccount option");
		}
	

	@Then("User clicks on Login link")
	public void User_clicks_on_Login_link() {
		   //When clicking on login dropdown takes you to LoginPage so go to login() method retrun the object 
									//of LoginPage(return new LoginPage) and store it in LoginPage LogPage = LanPage.Login();
	    logs.debug("clicked on login option");
	}
	
	@And("User enters valid email address {string}")
	public void User_enters_valid_email_address(String emailaddress){
		
	
		logs.debug("entered emailaddress");
		
	
	}
	
	@And("User enters valid password {string}")
	public void User_enters_valid_password(String password) {
		logs.debug("entered password");
		
	}
	
	@And("User clicks on Login button")
	public void User_clicks_on_Login_button() {
		
		logs.debug("clicked on loginbutton");
		
	}
	
	@Then("User should Login successfully")
	public void User_should_Login_successfully() {
		
		logs.info("login successfully");
	}
	
	@When("^User enters email address (.+)$")
	public void User_enters_email_address(String email) {
		
		logs.debug("entered emailaddress");
	}
	
	@And("^User enters password (.+)$")
	public void User_enters_password(String password) {
	
		logs.debug("entered password");
	}

	@Then("User should not login successfully")
	public void User_should_not_login_successfully() {
	
		logs.info("login unsuccessfull");
		 
		
	}
	
}

