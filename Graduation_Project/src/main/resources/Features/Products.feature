Feature: Products
Scenario: Verify that user will redirect to home page after click on home button
  Given User in productsPage
  When Click on home button
  Then User redirected to home page
Scenario: Verify that user will redirect to cart page after click on cart button
  Given User in productsPage
  When Click on cart button
  Then User redirected to cart page
Scenario: Verify that user will redirect to singUp page after click on signUp button
  Given User in productsPage
  When Click on signUp button
  Then User redirected to signUp page
Scenario: Verify that user will redirect to contact page after click on contact button
  Given User in productsPage
  When Click on contact button
  Then User redirected to contact page

#Search
Scenario: Verify searching for an existing product returns results
  Given User in productsPage
  When The user searches for "Dress"
  Then Search results should be shown on the screen
Scenario: Verify searching for an invalid product returns no results
  Given User in productsPage
  When The user searches for "Invalid"
  Then The product grid should be empty
Scenario: Verify submitting an empty search reloads the page
  Given User in productsPage
  When The user submits an empty search query
  Then The page should be reloaded

#Category
Scenario: Verify 'Women' category expands when clicked from a collapsed state
  Given The women category section is currently Collapsed
  When The user clicks on the women category title
  Then The women category sub-list should be Expanded
Scenario: Verify switching from an open category to 'Women'
  Given A different product category (e.g., Men or Kids) is currently Open
  When The user clicks on the women category title
  Then The displayed products should be Switched to Women's products
Scenario: Verify 'Men' category expands when clicked from a collapsed state
  Given The men category section is currently Collapsed
  When The user clicks on the men category title
  Then The men category sub-list should be Expanded
Scenario: Verify switching from an open category to 'Men'
  Given A different product category (e.g., Women or Kids) is currently Open
  When The user clicks on the men category title
  Then The displayed products should be Switched to Men's products
Scenario: Verify 'Kids' category expands when clicked from a collapsed state
  Given The kids category section is currently Collapsed
  When The user clicks on the kids category title
  Then The kids category sub-list should be Expanded
Scenario: Verify switching from an open category to 'Kids'
  Given A different product category (e.g., Women or Men) is currently Open
  When The user clicks on the kids category title
  Then The displayed products should be Switched to kids products
Scenario: User opens Women > Dress category
  Given The user clicks on the women category title
  When The user clicks on the Dress sub-category
  Then The user should be redirected to the Dress products page
Scenario: User opens Women > Tops category
  Given The user clicks on the women category title
  When The user clicks on the Tops sub-category
  Then The user should be redirected to the Tops products page
Scenario: User opens Women > Saree category
  Given The user clicks on the women category title
  When The user clicks on the Saree sub-category
  Then The user should be redirected to the Saree products page
Scenario: User opens Men > Tshirts category
  Given The user clicks on the men category title
  When The user clicks on the Tshirts sub-category
  Then The user should be redirected to the Tshirts products page
Scenario: User opens Men > Jeans category
  Given The user clicks on the men category title
  When The user clicks on the Jeans sub-category
  Then The user should be redirected to the Jeans products page
Scenario: User opens Kids > Dress category
  Given The user clicks on the kids category title
  When The user clicks on the Dress-Kids sub-category
  Then The user should be redirected to the Dress-Kids products page
Scenario: User opens Kids > Tops category
  Given The user clicks on the kids category title
  When The user clicks on the Tops&Shirts sub-category
  Then The user should be redirected to the Tops&Shirts products page


