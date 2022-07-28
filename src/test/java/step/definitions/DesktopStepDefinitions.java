package step.definitions;


import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.HomePageObject;
import page.objects.DesktopPageObject;
import utilities.Util;

public class DesktopStepDefinitions extends Base{

	HomePageObject homePage = new HomePageObject();
	DesktopPageObject desktopPage = new DesktopPageObject();
	

@Given("user is on Retail Website")
public void user_is_on_retail_website() throws InterruptedException {
	Thread.sleep(2000);
    homePage.isLogoDisplayed();
    logger.info("User is on Retail Page");
}

@When("User clicks on desktops tab")
public void user_clicks_on_desktops_tab() throws InterruptedException {
	Thread.sleep(2000);
    homePage.clickOnDesktops();
    logger.info("User clicked on desktops tab");
}

@When("user clicks on Show all desktops")
public void user_clicks_on_show_all_desktops() throws InterruptedException {
	Thread.sleep(2000);
    homePage.clickOnShowAllDesktops();
    logger.info("user clicked on show all desktops");
}

@Then("user should see all items are present in Desktop Page")
public void user_should_see_all_items_are_present_in_Desktop_Page() throws InterruptedException {
	Thread.sleep(2000);
	List<WebElement> desktopObjects = desktopPage.desktopItems();
	for( WebElement element : desktopObjects) {
		Assert.assertTrue(element.isDisplayed());
		logger.info(element.getAttribute("title") + " is present");
		
	}
}

@When("user clicks on ADD TO CART option on HP LP3065 item")
public void user_clicks_on_add_to_cart_option_on_hp_lp3065_item() throws InterruptedException {
	Thread.sleep(2000);
    desktopPage.clickOnAddLaptop();
    logger.info("User clicked on ADD TO CART option on HP LP3065 item");
}

@When("User select quantity {string}")
public void user_select_quantity(String int1) throws InterruptedException {
	Thread.sleep(2000);
    desktopPage.enterLaptopQuantity(int1);
    logger.info("User selected quantity of 1");
}

@When("User Click add to Cart button")
public void user_click_add_to_cart_button() throws InterruptedException {
	Thread.sleep(2000);
    desktopPage.clickOnAddToCart();
    logger.info("User clicked on add to Cart button");
}

@Then("user should see a message: {string}")
public void user_should_see_a_message(String expectedSuccessMessage) throws InterruptedException {
	Thread.sleep(2000);
    Assert.assertEquals(desktopPage.HPSuccessMessage(), expectedSuccessMessage);
    Assert.assertTrue(desktopPage.isSuccessMessagePresent());
    logger.info(expectedSuccessMessage + " equals to " + desktopPage.HPSuccessMessage());
    logger.info("User shown the message : 'Success: You have added HP LP3065 to your shopping cart!'");
    
}

@When("user clicks on ADD TO CART option on Canon EOS 5D item")
public void user_clicks_on_add_to_cart_option_on_canon_eos_5d_item() throws InterruptedException {
	Thread.sleep(2000);
    desktopPage.addCameraToCart();
    logger.info("user clicked on add to cart button for Canon EOS 5D Camera");
}

@When("user select color from dropdown Red")
public void user_select_color_from_dropdown_red() throws InterruptedException {
	Thread.sleep(2000);
    desktopPage.chooseCameraColor();
    logger.info("user selected color red from dropdown");
}

@Then("user should see the message: {string}")
public void user_should_see_the_message(String expectedSuccessMessage) throws InterruptedException {
	Thread.sleep(2000);
    Assert.assertEquals(desktopPage.canonSuccessMessage(), expectedSuccessMessage);
    Assert.assertTrue(desktopPage.isSuccessMessagePresent());
    logger.info(expectedSuccessMessage + " equals to " + desktopPage.canonSuccessMessage());
    
}

@When("User click Canon EOS 5D item")
public void user_click_canon_eos_5d_item() throws InterruptedException {
	Thread.sleep(2000);
    desktopPage.clickCameraLink();
    logger.info("user clicked on canon EOS 5D camera item");
}



@When("User click on write a review link")
public void user_click_on_write_a_review_link() throws InterruptedException {
	Thread.sleep(2000);
    desktopPage.clickOnReviewLink();
    logger.info("User clicked on write a review link");
}

@When("user fill the review information with below information")
public void user_fill_the_review_information_with_below_information(DataTable dataTable) throws InterruptedException {
	Thread.sleep(2000);
    List<Map<String, String>> reviewInformation = dataTable.asMaps(String.class , String.class);
    desktopPage.inputName(reviewInformation.get(0).get("yourName"));
    desktopPage.writeReview(reviewInformation.get(0).get("yourReview"));
    desktopPage.SelectRating(reviewInformation.get(0).get("rating"));
    logger.info("user filled the review information");
}

@When("user clicks on continue button")
public void user_click_on_continue_button() throws InterruptedException {
	Thread.sleep(2000);
	desktopPage.clickOnContinueButton();
	logger.info("User clicked on continue button");
}

@Then("User should see a message with {string}")
public void user_should_see_a_message_with(String expectedSuccessMessage) throws InterruptedException {
	Thread.sleep(2000);
	Assert.assertEquals(desktopPage.reviewSuccessMessage(), expectedSuccessMessage);
//	Assert.assertTrue(desktopPage.reviewSuccessMessage());
    logger.info(expectedSuccessMessage + " equals to " + desktopPage.reviewSuccessMessage());
}

}
