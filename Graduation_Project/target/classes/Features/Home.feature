Feature: Home
Scenario: Verify that user will be redirected to products page after clicking on Products button
  Given User is on homePage
  When User clicks on products button
  Then User should be redirected to products page

Scenario: Verify that user will be redirected to cart page after clicking on cart button
  Given User is on homePage
  When User clicks on cart button
  Then User should be redirected to cart page

Scenario: Verify that user will be redirected to signUp page after clicking on signUp button
  Given User is on homePage
  When User clicks on signUp button
  Then User should be redirected to signUp page

Scenario: Verify that user will be redirected to contact page after clicking on contact button
  Given User is on homePage
  When User clicks on contact button
  Then User should be redirected to contact page

#  Category

Scenario: Verify 'Women' category expands when clicked from a collapsed state on home page
  Given The women category section is currently Collapsed on home page
  When The user clicks on the women category title
  Then The women category sub-list should be Expanded

Scenario: Verify switching from an open category to 'Women' on home page
  Given A different product category (e.g., Men or Kids) is currently Open on home page
  When The user clicks on the women category title
  Then The displayed products should be Switched to Women's products
Scenario: Verify 'Men' category expands when clicked from a collapsed state on home page
  Given The men category section is currently Collapsed on home page
  When The user clicks on the men category title
  Then The men category sub-list should be Expanded

Scenario: Verify switching from an open category to 'Men' on home page
  Given A different product category (e.g., Women or Kids) is currently Open on home page
  When The user clicks on the men category title
  Then The displayed products should be Switched to Men's products
Scenario: Verify 'Kids' category expands when clicked from a collapsed state on home page
  Given The kids category section is currently Collapsed on home page
  When The user clicks on the kids category title
  Then The kids category sub-list should be Expanded

Scenario: Verify switching from an open category to 'Kids' on home page
  Given A different product category (e.g., Women or Men) is currently Open on home page
  When The user clicks on the kids category title
  Then The displayed products should be Switched to kids products
Scenario: User opens Women > Dress category from home page
  Given The user clicks on the women category title
  When The user clicks on the Dress sub-category
  Then The user should be redirected to the Dress products page

Scenario: User opens Women > Tops category from home page
  Given The user clicks on the women category title
  When The user clicks on the Tops sub-category
  Then The user should be redirected to the Tops products page

Scenario: User opens Women > Saree category from home page
  Given The user clicks on the women category title
  When The user clicks on the Saree sub-category
  Then The user should be redirected to the Saree products page
Scenario: User opens Men > Tshirts category from home page
  Given The user clicks on the men category title
  When The user clicks on the Tshirts sub-category
  Then The user should be redirected to the Tshirts products page

Scenario: User opens Men > Jeans category from home page
  Given The user clicks on the men category title
  When The user clicks on the Jeans sub-category
  Then The user should be redirected to the Jeans products page
Scenario: User opens Kids > Dress category from home page
  Given The user clicks on the kids category title
  When The user clicks on the Dress-Kids sub-category
  Then The user should be redirected to the Dress-Kids products page

Scenario: User opens Kids > Tops category from home page
  Given The user clicks on the kids category title
  When The user clicks on the Tops&Shirts sub-category
  Then The user should be redirected to the Tops&Shirts products page

# Slider Section

Scenario: Navigate slides using the Right Arrow
  Given User is on homePage
  When the user clicks the Right Arrow (>) once
  Then the Carousel should move to the next slide

Scenario: Navigate slides using the Left Arrow
  Given User is on homePage
  When the user clicks the Left Arrow (<) once
  Then the Carousel should move to the previous slide


Scenario: Verify "Test Cases" link redirection
  Given User is on homePage
  When the user clicks the Test Cases button below the slider
  Then the user should be successfully redirected to the Test Cases page

Scenario: Verify "APIs List" link redirection
  Given User is on homePage
  When the user clicks the APIs List button below the slider
  Then the user should be successfully redirected to the API List page
