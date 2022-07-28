package step.definitions;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.HomePageObject;
import utilities.Util;

public class HomePageStepDefinition extends Base{
	
	HomePageObject homePage = new HomePageObject();
	
	

		@Given("User is on retail website")
		public void user_is_on_reail_website() throws InterruptedException {
			Thread.sleep(2000);
		    homePage.isLogoDisplayed();
		    logger.info("User is on Retail website");
		}

		@When("User click on Currency")
		public void user_click_on_currency() throws InterruptedException {
			Thread.sleep(2000);
		    homePage.clickOnCurrency();
		    logger.info("User clicked on Currency");
		}

		@When("User Chose Euro from dropdown")
		public void user_chose_euro_from_dropdown() throws InterruptedException {
			Thread.sleep(2000);
		    homePage.clickOnEuroOption();
		    logger.info("User chose Euro from dropdown");
		}

		@Then("currency value should change to Euro")
		public void currency_value_should_change_to_euro() throws InterruptedException {
			Thread.sleep(2000);
		    homePage.isEuroDisplayed();
		    logger.info("Currency value changed to Euro");
		}

		@When("User click on shopping cart")
		public void user_click_on_shopping_cart() throws InterruptedException {
			Thread.sleep(2000);
		    homePage.clickOnShoppingCart();
		    logger.info("User clicked on shopping cart");
		}

		@Then("{string} message should display")
		public void message_should_display(String expectedSuccessMessage) throws InterruptedException {
			Thread.sleep(2000);
		    Assert.assertTrue(homePage.isCartEmpty());
		    logger.info(expectedSuccessMessage + " is equal to " + homePage.isCartEmpty());
		    Util.takeScreenShot();
		}

}
