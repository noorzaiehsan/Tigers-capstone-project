
Feature: Desktops Tab

Background: 
Given user is on Retail Website
When User clicks on desktops tab
And user clicks on Show all desktops
Then user should see all items are present in Desktop Page


Scenario: User add HP LP 3065 from Desktops Tab to the cart
When user clicks on ADD TO CART option on HP LP3065 item
And User select quantity '1'
And User Click add to Cart button
Then user should see a message: 'Success: You have added HP LP3065 to your shopping cart!'

Scenario: User add Canon EOS 5D from Desktops tab to the cart
When user clicks on ADD TO CART option on Canon EOS 5D item
And user select color from dropdown Red
And User select quantity '1'
And User Click add to Cart button
Then user should see the message: 'Success: You have added Canon EOS 5D Camera to your shopping cart!'

Scenario: User add a review to Canon EOS 5D item in Desktops tab
When User click Canon EOS 5D item 
And User click on write a review link
And user fill the review information with below information
|yourName|yourReview|rating|
|John Doe|Its great, I would definitely buy again|5 |
And user clicks on continue button
Then User should see a message with 'Thank you for your review. It has been submitted to the webmaster for approval.'