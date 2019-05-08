@run

  Feature: As a Vanguard user,
    In order to manage my investments successfully,
    I want to be able to compare Retail funds using the “Product Facts”

    Background: User is on the Retail Managed Funds page
      Given retail homepage is loaded
      When user clicks on 'Retail managed funds' link
      Then retail investment products page is displayed

    Scenario: Compare 4 Retail Funds
      Given more than 4 funds are displayed
      When user selects 4 funds
      And user clicks 'Compare' button
      Then 'Compare products' page is loaded



