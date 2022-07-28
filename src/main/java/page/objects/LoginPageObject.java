package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;


public class LoginPageObject extends Base{
	
	public LoginPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "input-email")
	private WebElement emailInput;
	
	@FindBy(id = "input-password")
	private WebElement passwordInput;
	
	@FindBy(xpath = "//h2[text()='My Account']")
	private WebElement myAccountText;
	
	@FindBy(xpath ="//input[@value='Login']")
	private WebElement loginButton;
	
	@FindBy(xpath = "//a[text()='Register for an affiliate account']")
	private WebElement affiliateRegister;
	

	public void enterEmail(String emailValue) {
		emailInput.sendKeys(emailValue);
	}
	
	public void enterPassword(String passwordValue) {
		passwordInput.sendKeys(passwordValue);
	}
	
	public void clickOnLoginButton() {
		loginButton.click();
	}
	
	public void clickOnAffiliateRegister() {
		affiliateRegister.click();
	}
	public boolean myAccountTextIsPresent() {
		if(myAccountText.isDisplayed())
			return true;
		else 
			return false;
	}
	

	
	
}
