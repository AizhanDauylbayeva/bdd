Feature: Login

Scenario: user can sign in

Given an open browser with mail.ru
When fill username "new_account_2018@bk.ru" and password "password2018"
Then click and reach to the inbox page
