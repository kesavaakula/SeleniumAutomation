Feature: login

  Scenario: Successful login with valid credentials
    Given User Launch Chrome browser
    When User opens Urls "http://admin-demo.noncommerce.com/login"
    And  User enters Email as "admin@yourstore.com" and password as "admin"
    And Click on Login
    Then page Title should be "Dashboard / nonCommerce administration"
    When User click on logout link
    Then Page Title should be "Your store.Login"
    And close browser



