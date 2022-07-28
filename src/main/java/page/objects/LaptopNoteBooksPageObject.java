package page.objects;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import core.Base;

public class LaptopNoteBooksPageObject extends Base {

	public LaptopNoteBooksPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//a[text()='MacBook']")
	private WebElement macBook;
	
	@FindBy(xpath = "//button[text()='Add to Cart']")
	private WebElement addMacBookToCart;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessage;
	
	@FindBy(xpath = "(//a[text()='MacBook'])[3]")
	private WebElement macSuccessMessage;
	
	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement cartTotal;
	
	@FindBy(xpath = "//*[@id=\"cart\"]/ul/li[1]/table/tbody/tr/td[5]/button/i")
	private WebElement removeButton;
	
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[2]")
	private WebElement macBookCompButton;
	
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[3]")
	private WebElement macAirCompButton;
	
	@FindBy(xpath ="//a[@id='compare-total']")
	private WebElement prodCompLink;
	
	@FindBy(xpath = "//div[@id='content']")
	private WebElement prodCompChart;
	
	@FindBy(xpath = "(//i[@class='fa fa-heart'] )[6]")
	private WebElement sonyFavButton;
	
	@FindBy(xpath = "//a[text() = 'MacBook Pro']")
	private WebElement macProLink;
	
	@FindBy(xpath = "//h2[text() = '$2,000.00']")
	private WebElement macProPrice; 
	
	public void clickOnMacbook() {
		macBook.click();
	}
	
	public void clickonAddToCart()
	{
		addMacBookToCart.click();
	}
	
	public boolean isSuccessMessagePresent() {
		if(successMessage.isDisplayed()) {
			return true;
		} else
				return false;
			}
	public void clickOnCartTotal() {	
		cartTotal.click();
	}
	
	public void clickOnRemoveButton() {
		removeButton.click();
	}
	
	
	public String macbookSuccessMessage() {
		String actualResult = successMessage.getText();
		return actualResult;		
	}
	
	public String cartTotalMessage() {
		String actualResult = cartTotal.getText();
		return actualResult;
	}
	
	public void clickOnMacBookCompButton() {
		macBookCompButton.click();
	}
	
	public void clickOnMacAirCompButton() {
		macAirCompButton.click();
	}
	
	public void clickOnProdCompLink() {
		prodCompLink.click();
	}
	
	public boolean isProdCompChartDisplayed() {
		if(prodCompChart.isDisplayed()) {
			return true;
		} else 
			return false;
	}
	
	public void clickOnSonyFavButton() {
		sonyFavButton.click();
	}
	public void clickOnMacProLink() {
		macProLink.click();
	}
	
	public boolean isMacProPriceDisplayed() {
		if(macProPrice.isDisplayed()) {
			return true;
		} else
			return false;
	}
}

