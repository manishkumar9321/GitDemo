Feature: Application Login

Background:
Given Validate the browser
When Browser is triggered
Then check if browser is started

@PortalTest
Scenario: Home page default login
Given User is on landing page
When User login into application with "manish" and password "gfdgsd"
Then Home page is populated
And Cards displayed are "true"

@PortalTest
Scenario: Home page default login
Given User is on landing page
When User login into application with "madffnish" and password "gfddsfdsgsd"
Then Home page is populated
And Cards displayed are "false"

@PortalTest
Scenario: Home page default login
Given User is on landing page
When User sign up with the following details
| manish | Kumar | manish.kumar129@gmail.com | 8806025075 | India |
Then Home page is populated
And Cards displayed are "false"

@PortalTest
Scenario Outline: Home page default login
Given User is on landing page
When User login in to application with <Username> and password <password>
Then Home page is populated
And Cards displayed are "false"

Examples:
|Username | password|
|manish   | manish1 |
|manish1  | manish2 |
|manish2  | manish3 |
|manish3  | manish4 |