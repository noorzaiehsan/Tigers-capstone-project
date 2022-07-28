package step.definitions;

import static org.junit.Assert.assertTrue;

import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import page.objects.HomePageObject;
import page.objects.LaptopNoteBooksPageObject;
import utilities.Util;

public class LaptopNoteBooksStepDefinition extends Base{
	
	HomePageObject homePage = new HomePageObject();
	LaptopNoteBooksPageObject laptopNotebookPage = new LaptopNoteBooksPageObject();

	@Given("User is on Retail website")
	public void user_is_on_retail_website() throws InterruptedException {
		Thread.sleep(3000);
	    homePage.isLogoDisplayed();
	    logger.info("User is on Retail Website");
	}

	@When("User click on Laptop & NoteBook tab")
	public void user_click_on_laptop_note_book_tab() throws InterruptedException {
		Thread.sleep(3000);
	    homePage.clickOnLaptopsNotebooks();
	    logger.info("User clicked on Laptop & NoteBook tab");
	}

	@When("User click on Show all Laptop & NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() throws InterruptedException {
		Thread.sleep(3000);
	    homePage.clickOnShowAllLaptopsNoteBooks();
	    logger.info("User clicked on Show all Laptop & NoteBook option");
	}

	@When("User click on MacBook item")
	public void user_click_on_mac_book_item() throws InterruptedException {
		Thread.sleep(3000);
	    laptopNotebookPage.clickOnMacbook();
	    logger.info("User clicked on MacBook item");
	}

	@When("User click add to Cart button")
	public void user_click_add_to_cart_button() throws InterruptedException {
		Thread.sleep(2000);
	    laptopNotebookPage.clickonAddToCart();
	    logger.info("User clicked add to Cart button");
	}

	@Then("User should see a message {string}")
	public void user_should_see_a_message(String expectedSuccessMessage) throws InterruptedException {
		Thread.sleep(2000);
	    Assert.assertTrue(laptopNotebookPage.isSuccessMessagePresent());
	    logger.info(expectedSuccessMessage + " equals to " + laptopNotebookPage.isSuccessMessagePresent());
	    logger.info("User saw the message: 'Success: You have added MacBook to your shopping cart!'");
	}

	@Then("User should see {string} showed to the cart")
	public void user_should_see_item_s_showed_to_the_cart(String expectedMessage) throws InterruptedException {
		Thread.sleep(2000);
	    Assert.assertEquals(laptopNotebookPage.cartTotalMessage(), expectedMessage);
	    logger.info(expectedMessage + " equals to " + laptopNotebookPage.cartTotalMessage());
	    logger.info("User saw the message '1 item(s) - $602.00'");
	}

	@Then("User click on cart option")
	public void user_click_on_cart_option() throws InterruptedException {
		Thread.sleep(2000);
	    laptopNotebookPage.clickOnCartTotal();
	    logger.info("User clicked on cart option");
	    
	}

	@Then("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() throws InterruptedException {
		laptopNotebookPage.clickOnRemoveButton();
		Thread.sleep(3000);
	   logger.info("User clicked on red X button to remove the item from cart");
	}

	@Then("item should be removed and cart should show {string}")
	public void item_should_be_removed_and_cart_should_show_item_s(String expectedMessage) {
	    Assert.assertEquals(laptopNotebookPage.cartTotalMessage(), expectedMessage);
	    logger.info(expectedMessage + " equals to " + laptopNotebookPage.cartTotalMessage());
	}

	@When("User click on product comparison icon on MacBook")
	public void user_click_on_product_comparison_icon_on() throws InterruptedException {
		Thread.sleep(3000);
	    laptopNotebookPage.clickOnMacBookCompButton();
	    logger.info("User clicked on product compatison icon on MacBook");
	}
	
	@When("User click on product comparison icon on MacBook Air")
	public void user_click_on_product_comparison_icon_on_MacBook_Air() throws InterruptedException {
		Thread.sleep(3000);
		laptopNotebookPage.clickOnMacAirCompButton();
		logger.info("User clicked on product comparison icon on MacBook Air");
	}
	
	@Then("User should see the message {string}")
	public void User_should_see_the_message(String expectedSuccessMessage) throws InterruptedException {
		Thread.sleep(3000);
		Assert.assertTrue(laptopNotebookPage.isSuccessMessagePresent());
	    logger.info(expectedSuccessMessage + " equals to " + laptopNotebookPage.isSuccessMessagePresent());
	}
			

	@Then("User click on Product comparison link")
	public void user_click_on_product_comparison_link() throws InterruptedException {
		Thread.sleep(2000);
	    laptopNotebookPage.clickOnProdCompLink();
	    logger.info("User clicked on Product comparison link");
	}

	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() throws InterruptedException {
		Thread.sleep(3000);
	    laptopNotebookPage.isProdCompChartDisplayed();
	    logger.info("User should see Product Comparison Chart");
	}

	@When("User click on heart icon to add Sony Vaio laptop to wish list")
	public void user_click_on_heart_icon_to_add_laptop_to_wish_list() throws InterruptedException {
		Thread.sleep(3000);
	    laptopNotebookPage.clickOnSonyFavButton();
	    logger.info("User clicked on heart icon to add Sony Vaio laptop to wish list");
	}

	@Then("User should get a message {string}")
	public void user_should_get_a_message(String expectedSuccessMessage) throws InterruptedException {
		Thread.sleep(3000);
		Assert.assertTrue(laptopNotebookPage.isSuccessMessagePresent());
	    logger.info(expectedSuccessMessage + " equals to " + laptopNotebookPage.isSuccessMessagePresent());
	}

	@When("User click on MacBook Pro item")
	public void user_click_on_item() throws InterruptedException {
	    Thread.sleep(3000);
	    laptopNotebookPage.clickOnMacProLink();
	    logger.info("User clicked on MacBook Pro item");
	}

	@Then("User should see {string} price tag is present on UI")
	public void user_should_see_price_tag_is_present_on_ui(String string) throws InterruptedException {
	    Thread.sleep(3000);
	    Assert.assertTrue(laptopNotebookPage.isMacProPriceDisplayed());
	    logger.info("User saw '$2,000.00' price tag was present on UI");
	    Util.takeScreenShot();
	}
}
