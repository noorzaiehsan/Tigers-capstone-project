@test1
Feature: Retail Website

	Background: 
		Given user is on Retail home page
		And user clicks on MyAccount 
		When user clicks on Login 
		And user enters username 'ja524@wix.com' and password '12345'
		And user clicks on Login button
		Then User should be logged in to MyAccount Dashboard

 
  Scenario: Register as an Affiliate user with Cheque payment Method 
    When user clicks on Register for an Affiliate account link
    And user fills affiliate form with below information
    |company|website|taxID|paymentMethod|payeeName|
    |wix|wix.com|1233456|cheque|john doe|
    And User check on About us check box
    And User click on continue button
    Then user should see a success message


  Scenario: Edit your affiliate information from Cheque payment method to Bank transfer
    When user clicks on Edit your affiliate information link
    And user clicks on Bank Transfer radio button 
    And user fills Bank Information with below information 
    |bankName|abaNumber|swiftCode|accountName|accountNumber|
    |wells fargo|123456|321|jd123|654321|
    And User clicks on Continue button
    Then User should see a success message

   Scenario: Edit your account information 
   When User click on Edit your account information link
   And user modify below information 
   |firstName|lastName|email|telephone|
   |john|doe|ja123456@wix.com|1234567891|
   And user click on continue button 
   Then user should see a message 'Success: Your account has been successfully updated.'
   
