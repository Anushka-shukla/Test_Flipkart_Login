Feature: Test Flipkart login functionality

Scenario: Unsuccessful Login to Flipkart
 Given Flipkart website is loaded.
 When user enters UserName and Password and login
 Then Login should be successful and verify the error message 