package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePageObject extends Base{
	
	public HomePageObject() {
		PageFactory.initElements(driver, this);
	}
	
	

	@FindBy(xpath= "//a[text()='TEST ENVIRONMENT']")
	private WebElement logo;
	
	@FindBy(xpath = "//a[text()= 'Desktops']")
	private WebElement desktops;
	
	@FindBy(xpath ="//a[text() = 'Laptops & Notebooks']")
	private WebElement laptopsNotebooks;
	
	@FindBy(xpath ="//a[@class = 'see-all' and text()= 'Show All Laptops & Notebooks']")
	private WebElement showAllLaptopsNotebooks;
	
	@FindBy(xpath = "//a[@class = 'see-all' and text()= 'Show All Desktops']")
	private WebElement showAllDesktops;
	
	@FindBy(xpath="//span[text()= 'My Account']")
	private WebElement myAccount;
	
	@FindBy(xpath="//a[text()='Login']")
	private WebElement login;
	
	@FindBy(xpath = "//a[text()='Register']")
	private WebElement register;
	
	@FindBy(xpath = "(//span[@class = 'hidden-xs hidden-sm hidden-md'])[1]")
	private WebElement currency;
	
	@FindBy(xpath = "(//button[@class = 'currency-select btn btn-link btn-block'])[1]")
	private WebElement euro;
	
	@FindBy(xpath = "//strong[text()='€']")
	private WebElement euroSymbol;
	
	@FindBy(xpath = "//span[text()='Shopping Cart']")
	private WebElement shoppingCart;
	
	@FindBy(xpath = "(//p[text()='Your shopping cart is empty!'])[2]")
	private WebElement emptyCart;
	
	
	public void clickOnLoginButton() {
		login.click();
	}
	public void clickOnDesktops() {
		desktops.click();
	}
	public void clickOnShowAllDesktops() {
		showAllDesktops.click();
	}
	public void clickOnMyAccount() {
		myAccount.click();
	}
		
	public void clickOnRegister() {
		register.click();
	}
	
	public boolean isLogoDisplayed() {
		if (logo.isDisplayed())
			return true;
		else
			return false;
	}
	
	public void clickOnLaptopsNotebooks() {
		laptopsNotebooks.click();
	}
	
	public void clickOnShowAllLaptopsNoteBooks() {
		showAllLaptopsNotebooks.click();
	}
	
	public void clickOnCurrency() {
		currency.click();
	}
	
	public void clickOnEuroOption() {
		euro.click();
	}
	
	public boolean isEuroDisplayed() {
		if(euroSymbol.isDisplayed()) {
			return true;
		} else 
			return false;
	}
	
	public void clickOnShoppingCart() {
		shoppingCart.click();
	}
	
	public boolean isCartEmpty() {
		if(emptyCart.isDisplayed()) {
			return true;
		} else
			return false;
	}
}


