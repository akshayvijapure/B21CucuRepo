Feature: Testing basics

Scenario: 3.I want to test google is up and running
Given google have website
When I hit google application
Then I validate status code

#Scenario: 2.I want to test google is up and running
#When I hit google applicaiton 
#Then I validate status code

#Scenario: 3.Validate fb login
#Given open fb application
#When I enter user name
#When I enter password
#When I hit login
#Then I check I am logged in

Scenario: 5.I want to test that I am getting data from F1
When I hit the F1 race application
Then I validate the status code of F1 app