Feature: Brands / Add product

  Scenario : Verify Navigating to a Polo Brand
    Given User is on the Products page
    When User clicks on the Polo brand in the Sidebar
    Then The page header displays BRAND - POLO PRODUCTS


  Scenario: Verify Navigating to a HAndM Brand
    Given User is on the Products page
    When User clicks on the HandM brand in the Sidebar
    Then The page header displays BRAND - HandM PRODUCTS

  Scenario: Verify Navigating to a Madame Brand
    Given  User is on the Products page
    When User clicks on the Madame brand in the Sidebar
    Then The page header displays BRAND - Madame PRODUCTS


  Scenario: Verify Navigating to a MastAndHarbour Brand
    Given User is on the Products page
    When User clicks on the MastAndHarbour brand in the Sidebar
    Then The page header displays BRAND - MastAndHarbour PRODUCTS




  Scenario: Verify Navigating to a Babyhug Brand
    Given User is on the Products page
    When User clicks on the Babyhug brand in the Sidebar
    Then The page header displays BRAND - Babyhug PRODUCTS


  Scenario: Verify Navigating to a AllenSollyJunior Brand
    Given User is on the Products page
    When User clicks on the AllenSollyJunior brand in the Sidebar
    Then The page header displays BRAND - AllenSollyJunior PRODUCTS


  Scenario: Verify Navigating to a KookieKids Brand
    Given User is on the Products page
    When User clicks on the KookieKids brand in the Sidebar
    Then The page header displays BRAND - KookieKids PRODUCTS



  Scenario: Verify Navigating to a Biba Brand
    Given User is on the Products page
    When User clicks on the Biba brand in the Sidebar
    Then The page header displays BRAND - Biba PRODUCTS




  Scenario : Verify Adding a Product to Cart
    Given User is on the All Products page
    When User hovers over the first product and clicks the Add to cart button
    Then A message is displayed with the title Added





