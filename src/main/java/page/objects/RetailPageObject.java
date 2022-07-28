package page.objects;

import core.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RetailPageObject extends Base{
	
	public RetailPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()= 'My Account']")
	private WebElement myAccount;
	
	@FindBy(id = "input-company")
	private WebElement company;
	
	@FindBy(id = "input-website")
	private WebElement webSite;
	
	@FindBy(id = "input-tax")
	private WebElement taxID;
	
	@FindBy(xpath = "//input[@type='radio' and @value ='cheque']")
	private WebElement chequeButton;
	
	@FindBy(xpath = "//input[@type='radio' and @value ='bank']")
	private WebElement bankTransferButton;
	
	@FindBy(xpath = "//input[@id='input-cheque']")
	private WebElement chequePayeeName;
	
	@FindBy(xpath = "//input[@id='input-bank-name']")
	private WebElement bankName;
	
	@FindBy(xpath = "//input[@id='input-bank-branch-number']")
	private WebElement branchNumber;
	
	@FindBy(xpath = "//input[@id='input-bank-swift-code']")
	private WebElement swiftCode;
	
	@FindBy(xpath = "//input[@id='input-bank-account-name']")
	private WebElement accountName;
	
	@FindBy(xpath = "//input[@id='input-bank-account-number']")
	private WebElement accountNumber;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement checkBox;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement continueButton;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement accountCreatedMessage;
	
	@FindBy(xpath = "//a[text()='Edit your affiliate information']")
	private WebElement editAffiliateInfoButton;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement accountUpdatedMessage;
	
	@FindBy(xpath = "//a[text()='Edit your account information'] ")
	private WebElement editAccountInfo;
	
	@FindBy(xpath = "//input[@id='input-firstname']")
	private WebElement firstName;
	
	@FindBy(xpath = "//input[@id='input-lastname']")
	private WebElement lastName;
	
	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement email;		
	
	@FindBy(xpath = "//input[@id='input-telephone']")
	private WebElement telephone;	
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submitButton;	
	
	public boolean ismyAccountDisplayed() {
		if (myAccount.isDisplayed())
			return true;
		else
			return false;
	}
	
	public void enterCompanyName(String companyName) {
		company.sendKeys(companyName);
	}

	public void enterWebSite(String websiteName) {
		webSite.sendKeys(websiteName);
	}
	
	public void enterTaxID(String idNumber) {
		taxID.sendKeys(idNumber);
	}

	
	public void selectChequePaymentMethod(String string) {
			if(string.equalsIgnoreCase("cheque")){
					chequeButton.click();
			}
	} 
	
	public void clickOnBankTransferButton() {
		bankTransferButton.click();
	}
	
	public void enterPayeeName(String payee) {
		chequePayeeName.sendKeys(payee);
	}
	
	public void enterBankName(String bank) {
		bankName.sendKeys(bank);
	}
	
	public void enterBranchNumber(String num) {
		branchNumber.sendKeys(num);
	}
	
	public void enterSwiftCode(String code) {
		swiftCode.sendKeys(code);
	}
	
	public void enterAccountName(String name) {
		accountName.sendKeys(name);
	}
	
	public void enterAccountNumber(String num) {
		accountNumber.sendKeys(num);
	}
	
	public void clickCheckBox() {
		checkBox.click();
	}
	
	public void clickContinueButton() {
		continueButton.click();
	}
	
	
	
	public boolean isAccountCreatedMessageDisplayed() {
		if(accountCreatedMessage.isDisplayed()) {
			return true;
		} else 
			return false;
		
	}
	
	public void clickEditAffiliateInfoButton() {
		editAffiliateInfoButton.click();
	}
	
	public boolean isAccountUpdatedDisplayed() {
		if(accountUpdatedMessage.isDisplayed()) {
			return true;
		} else 
			return false;
		
	}
	
	public void clickOnEditAccountInfo() {
		editAccountInfo.click();
	}
	
	public void enterFirstName(String fName) {
		firstName.clear();
		firstName.sendKeys(fName);
	}
	
	public void enterLastName(String lName) {
		lastName.clear();
		lastName.sendKeys(lName);
	}
	
	public void enterEmail(String text) {
		email.clear();
		email.sendKeys(text);
	}
	
	public void enterTelephone(String num) {
		telephone.clear();
		telephone.sendKeys(num);
	}
	
	public void clickSubmitButton() {
		submitButton.click();
		
	}
	
	
	
	
}
