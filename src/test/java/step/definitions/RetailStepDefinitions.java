package step.definitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import page.objects.HomePageObject;
import page.objects.LoginPageObject;
import page.objects.RetailPageObject;
import utilities.Util;

public class RetailStepDefinitions extends Base {
	
	RetailPageObject retailPage = new RetailPageObject();
	HomePageObject homePage = new HomePageObject();
	LoginPageObject loginPage = new LoginPageObject();
	
	@Given("user is on Retail home page")
	public void user_is_on_retail_home_page() throws InterruptedException {
		Thread.sleep(2000);
	    homePage.isLogoDisplayed();
	    logger.info("User is on Retail home page");
	}

	@Given("user clicks on MyAccount")
	public void user_clicks_on_my_account() throws InterruptedException {
		Thread.sleep(2000);
	    homePage.clickOnMyAccount();
	    logger.info("User clicked on MyAccount");
	}

	@When("user clicks on Login")
	public void user_clicks_on_login() throws InterruptedException {
		Thread.sleep(2000);
	    homePage.clickOnLoginButton();
	    logger.info("User clicked on login");
	}

	@When("user enters username {string} and password {string}")
	public void user_enters_username_and_password(String email, String password) throws InterruptedException {
		Thread.sleep(2000);
	    loginPage.enterEmail(email);
	    Thread.sleep(2000);
	    loginPage.enterPassword(password);
	    logger.info("User entered username and password");
	    
	}

	@When("user clicks on Login button")
	public void user_clicks_on_login_button() throws InterruptedException {
		Thread.sleep(2000);
	    loginPage.clickOnLoginButton();
	    logger.info("User clicked on Login Button");
	}

	@Then("User should be logged in to MyAccount Dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() throws InterruptedException {
		Thread.sleep(2000);
	    retailPage.ismyAccountDisplayed();
	    logger.info("User logged in to MyAccount Dashboard");
	}

	@When("user clicks on Register for an Affiliate account link")
	public void user_clicks_on_link() throws InterruptedException {
		Thread.sleep(2000);
	    loginPage.clickOnAffiliateRegister();
	    logger.info("User clicked on Register for an Affiliate account link");
	}
 
	@When("user fills affiliate form with below information")
	public void user_fills_affiliate_form_with_below_information(DataTable dataTable) throws InterruptedException {
	    List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		Thread.sleep(2000);
	    retailPage.enterCompanyName(data.get(0).get("company"));
	    Thread.sleep(1000);
	    retailPage.enterWebSite(data.get(0).get("website"));
	    Thread.sleep(1000);
	    retailPage.enterTaxID(data.get(0).get("taxID"));
	    Thread.sleep(1000);
	    retailPage.selectChequePaymentMethod(data.get(0).get("paymentMethod"));
	    Thread.sleep(1000);
	    retailPage.enterPayeeName(data.get(0).get("payeeName"));
	    logger.info("User filled affiliate form with below information");
	}
	    
	@When("User check on About us check box")
	public void user_check_on_about_us_check_box() throws InterruptedException {
		Thread.sleep(2000);
	    retailPage.clickCheckBox();
	    logger.info("User clicked on About us check box");
	}

	@When("User click on continue button")
	public void user_click_on_continue_button1() throws InterruptedException {
		Thread.sleep(2000);
	    retailPage.clickContinueButton();
	    logger.info("User clicked on continue button");
	}


	@Then("user should see a success message")
	public void user_should_see_a_success_message1() throws InterruptedException {
		Thread.sleep(2000);
	    retailPage.isAccountCreatedMessageDisplayed();
	    logger.info("User saw the success message");
	}

	@When("user clicks on Edit your affiliate information link")
	public void user_clicks_on_Edit_Affiliate_info() throws InterruptedException {
		Thread.sleep(2000);
	    retailPage.clickEditAffiliateInfoButton();
	    logger.info("User clicked on Edit your affiliate information link");
	}

	@When("user clicks on Bank Transfer radio button")
	public void user_clicks_on_bank_transfer_radio_button() throws InterruptedException {
		Thread.sleep(2000);
	    retailPage.clickOnBankTransferButton();
	    logger.info("User clicked on Bank Transfer radio button");
	}

	@When("user fills Bank Information with below information")
	public void user_fills_bank_information_with_below_information(DataTable dataTable) throws InterruptedException {
	    List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		Thread.sleep(2000);
	    retailPage.enterBankName(data.get(0).get("bankName"));
	    Thread.sleep(1000);
	    retailPage.enterBranchNumber(data.get(0).get("abaNumber"));
	    Thread.sleep(1000);
	    retailPage.enterSwiftCode(data.get(0).get("swiftCode"));
	    Thread.sleep(1000);
	    retailPage.enterAccountName(data.get(0).get("accountName"));
	    Thread.sleep(1000);
	    retailPage.enterAccountNumber(data.get(0).get("accountNumber"));
	    logger.info("User filled in Bank information");
	    	
	}

	@When("User clicks on Continue button")
	public void user_clicks_on_continue_button() throws InterruptedException {
		Thread.sleep(2000);
	    retailPage.clickContinueButton();
	    logger.info("User clicked on Continue button");
	}

	@Then("User should see a success message")
	public void user_should_see_a_success_message() throws InterruptedException {
		Thread.sleep(2000);
		retailPage.isAccountUpdatedDisplayed();
		logger.info("User saw the success message");
	}

	@When("User click on Edit your account information link")
	public void user_click_on_link() throws InterruptedException {
		Thread.sleep(2000);
	    retailPage.clickOnEditAccountInfo();
	    logger.info("User clicked on Edit your account information link");
	}

	@When("user modify below information")
	public void user_modify_below_information(DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		Thread.sleep(1000);
		retailPage.enterFirstName(data.get(0).get("firstName"));
		Thread.sleep(1000);
		retailPage.enterLastName(data.get(0).get("lastName"));
		Thread.sleep(1000);
		retailPage.enterEmail(data.get(0).get("email"));
		Thread.sleep(1000);
		retailPage.enterTelephone(data.get(0).get("telephone"));
		logger.info("User modified information");
	}

	@When("user click on continue button")
	public void user_click_on_continue_button() throws InterruptedException {
		Thread.sleep(2000);
	    retailPage.clickContinueButton();
	    logger.info("User clicked on continue button");
	}

	@Then("user should see a message {string}")
	public void user_should_see_a_message(String string) throws InterruptedException {
		Thread.sleep(2000);
	    retailPage.isAccountUpdatedDisplayed();
	    logger.info("User clicked the message");
	    Util.takeScreenShot();
	}


}
