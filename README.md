# gherkins_test

Login test 
## Assumptions made
- Website is up and running (Server is not down).
- No Validation occuring on Username and Password fields. 
- Test should fail for incorrect user name format and password length.
- Application Showing errors only for incorrect username format and if the password is length less than 8.

Prerequisites
Git
JAVA SDK 8, Selenium, Junit
Sourcecode editor (Eg.eclipse)
Download chromedriver and set path correctly -  https://sites.google.com/a/chromium.org/chromedriver/downloads
 

## Installation
Clone or download reposiory gherkins_test(https://github.com/shilsur/gherkins_test.git)from github

## Usage
Framework Overview
The cucumber BDD testing framework specifies acceptance tests as written from the view of the Product Owner. Using keywords such as Given, When, Then and And, acceptance criteria tests known as feature files can then be broken down into testable steps.   

## Files
Feature File - features/Login.feature  
Step Definition Feature File - Java class whereby the steps from the feature file are broken down to be coded into automation tests  
StepDefinitions/ LoginStepDefinitions.java  
TestRunner class - Runner/TestRunner.java  
ChromeDriver.exe - Local chromedriver necessary in order  
Cucumber Reports - Cucumber has a built in report generation whereby Feature files tested are automatically written to cucumbers own reporting system  
Steps to write an acceptance test  
Feature file has it’s step defition, pageobject & model class  
              
  

   
   



