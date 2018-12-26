Feature: Login

Scenario: user can sign in

Given an open browser with mail.ru
When fill username as "new_account_2018@bk.ru" and password as "password2018"
Then click and we reach the inbox page

Scenario: user can open cloud page

Given a button 'Облако'
When press the button
Then reach to cloud page with title "Облако Mail.Ru"