Feature: Create an Article
https://conduit-realworld-example-app.fly.dev/#/

Scenario: Login into App
Given User is on Login Page
When User provides "murali123.muluka@gmail.com" and "AyaanSri@143#"
Then User should be on Home Page

Scenario: Create an Article
Given User Should be on login Page
When User enters Article details
|Murali3|Desc|Content|Tag1|
Then Article must be created

Scenario: Edit an Article
Given User Should be on Article Page
When User enters edit Article details
|Murali2|Descrypt|Content1|Tag2|
Then Article must be edited and created


Scenario: Delete an Article
Given User Should be on Article delete Page
When User enters delete Article details
Then Article must be deleted