Feature: Create an Article
https://conduit-realworld-example-app.fly.dev/#/

Scenario: Login into App
Given User is on Login Page
When User provides "murali123.muluka@gmail.com" and "AyaanSri@13#"
Then User Should be on Home Page

Scenario: Create New Article
Given User Should be on New Article Page
When User enters Article details
|Title|Desc|Content|Tag|
|Article1|Article1_data|Hi this is 1st Article|1St Article|
Then Article must be created