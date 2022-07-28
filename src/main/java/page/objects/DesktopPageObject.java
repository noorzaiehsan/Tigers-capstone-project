package page.objects;

import org.openqa.selenium.support.PageFactory;

import core.Base;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesktopPageObject extends Base {

	public DesktopPageObject () {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(tagName="img")
	private List<WebElement> items;
	
	@FindBy(xpath = "(//span[text()='Add to Cart'])[3]")
	private WebElement addLaptop;
	
	@FindBy(xpath = "//input[@id='input-quantity']")
	private WebElement laptopQuantity;
	
	@FindBy(xpath = "//button[text()='Add to Cart']")
	private WebElement addToCart;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessage;
	
	@FindBy(xpath = "(//a[text()='HP LP3065'])[3]")
	private WebElement laptopSuccessMessage;
	
	@FindBy(xpath = "(//a[text()='Canon EOS 5D Camera'])[3] ")
	private WebElement cameraSuccessMessage;
	
	@FindBy(xpath = "(//span[text()='Add to Cart'])[2]")
	private WebElement addCamera;
	
//	@FindBy(xpath = "//select[@class= 'form-control']")
//	private WebElement selectColorDropdown;
	
	@FindBy(xpath = "//select[@class= 'form-control']//option[@value='15']")
	private WebElement selectColorRed;
	
	@FindBy(xpath = "//a[text()='Canon EOS 5D Camera']")
	private WebElement selectCamera;
	
	@FindBy(xpath = "//a[text()='Write a review']")
	private WebElement reviewLink;
	
	@FindBy(id = "input-name")
	private WebElement name;
	
	@FindBy(id = "input-review")
	private WebElement review;
	
	@FindBy(xpath = "//input[@type='radio']")
	private List <WebElement> rating;
	
	@FindBy(xpath = "//button[@id='button-review']")
	private WebElement continueButton;
	
	
	public void clickOnAddLaptop() {
		addLaptop.click();
	}
	
	public void enterLaptopQuantity(String int1) {
		laptopQuantity.clear();
		laptopQuantity.sendKeys(int1);
	}
	
	public void clickOnAddToCart() {
		addToCart.click();
	}
	
	public List<WebElement> desktopItems(){
		List<WebElement> itemsDesk = items;
		return itemsDesk;
	}
	
	
	
	public String HPSuccessMessage() {
		String actualResult = "Success: You have added " + laptopSuccessMessage.getText() + " to your shopping cart!";
		return actualResult;
	}
	
	public String canonSuccessMessage() {
		String actualResult = "Success: You have added " + cameraSuccessMessage.getText() + " to your shopping cart!";
		return actualResult;
	}
	
	public String reviewSuccessMessage() {
	String reviewMessage = successMessage.getText();
	return reviewMessage;
	}
	
	
			
	
	
	
	public boolean isSuccessMessagePresent() {
		if(successMessage.isDisplayed()) {
			return true;
		} else 
			return false;
	}
	public void addCameraToCart() {
		addCamera.click();
	}
	
	public void chooseCameraColor() {
//		selectColorDropdown.click();
		selectColorRed.click();
	}
	
	public void clickCameraLink() {
		selectCamera.click();
	}
	
	public void clickOnReviewLink() {
		reviewLink.click();
	}
	
	public void inputName(String enterName) {
		name.sendKeys(enterName);
	}
	
	public void writeReview(String reviewText) {
		 review.sendKeys(reviewText);
	}
	
	public List<WebElement> ratingSelection() {
		List<WebElement> ratingList = rating;
		return ratingList; 
	}
	
	public void SelectRating(String ratingValue) {
		List<WebElement> ratingElements = rating;
		for(WebElement element:ratingElements) {
			if(element.getAttribute("value").equalsIgnoreCase(ratingValue.trim())) {
				element.click();
				break;
			}
	}
	}
	public void clickOnContinueButton() {
		continueButton.click();
	}
	
}


