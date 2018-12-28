Feature: Login and open the cloud page

Background: User is logged In

Given an open browser with mail.ru
When fill username "new_account_2018@bk.ru" and password "password2018"
Then click and reach to the inbox page

Scenario Outline: user can open cloud page

Given a button 'Облако'
When click the button
Then reach to cloud page with a title "<title>"

Examples:
      | title          |
      | Облако Mail.Ru |