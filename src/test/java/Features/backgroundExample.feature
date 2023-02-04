Feature: Interact with the Demo Page
  As I user, I want to be able to login, add products to the cart and place an order

#  #Imperative way
#  Given I have navigated to the page
#  When I click on login tab
#  Then I should see the log in form
#  And I provide a valid username
#  And I provide a valid password
#  When I click on Log in button
#  Then I should be logged in
#Background:
 # Given I have navigated to the page

Background:
  Given I have navigated to the page
  #Declarative way
  Scenario: Log in into the site
    When I provide valid credentials after clicking on log in tab
    Then I should be logged in

  #Imperative
  @smoke
  Scenario: Add products to the cart
    When I click on the "Nexus 6" product
    Then I should be redirected to the product details page
    And I click on the "Add to cart" button
    Then I should see a "confirmation" alert

  #Declarative way
  Scenario: Validate that added products appears on the cart
    When I have added a product
    Then It should appear on the cart page

  Scenario: Place an order
    When I have added a product
    And I click on the "place order" button
    And I complete the place order form
    Then I should see a "confirmation" alert


