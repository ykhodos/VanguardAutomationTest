@run

  Feature: As a Vanguard user,
    In order to manage my investments successfully,
    I want to view Net Asset Value (NAV) information on various products


    Scenario: NAV information is present in NAV Price List
      Given The Nav Price List URL
      When Nav Price List is retrieved
      Then NAV information is available for products



