$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/FundsCompare.feature");
formatter.feature({
  "line": 3,
  "name": "As a Vanguard user,",
  "description": "In order to manage my investments successfully,\nI want to be able to compare Retail funds using the “Product Facts”",
  "id": "as-a-vanguard-user,",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@run"
    }
  ]
});
formatter.before({
  "duration": 1731425728,
  "status": "passed"
});
formatter.background({
  "line": 7,
  "name": "User is on the Retail Managed Funds page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "retail homepage is loaded",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user clicks on \u0027Retail managed funds\u0027 link",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "retail investment products page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "FundsCompareSteps.retail_homepage_is_loaded()"
});
formatter.result({
  "duration": 3825439736,
  "status": "passed"
});
formatter.match({
  "location": "FundsCompareSteps.user_clicks_on_Retail_managed_funds_link()"
});
formatter.result({
  "duration": 5090182424,
  "status": "passed"
});
formatter.match({
  "location": "FundsCompareSteps.retail_investment_products_page_is_displayed()"
});
formatter.result({
  "duration": 73427524,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Compare 4 Retail Funds",
  "description": "",
  "id": "as-a-vanguard-user,;compare-4-retail-funds",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "more than 4 funds are displayed",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "user selects 4 funds",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "user clicks \u0027Compare\u0027 button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "\u0027Compare products\u0027 page is loaded",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 10
    }
  ],
  "location": "FundsCompareSteps.more_than_funds_are_displayed(int)"
});
formatter.result({
  "duration": 21225497,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 13
    }
  ],
  "location": "FundsCompareSteps.user_selects_funds(int)"
});
formatter.result({
  "duration": 4492269794,
  "status": "passed"
});
formatter.match({
  "location": "FundsCompareSteps.user_clicks_Compare_button()"
});
formatter.result({
  "duration": 5447497888,
  "status": "passed"
});
formatter.match({
  "location": "FundsCompareSteps.compare_products_page_is_loaded()"
});
formatter.result({
  "duration": 405424024,
  "status": "passed"
});
formatter.after({
  "duration": 141877837,
  "status": "passed"
});
formatter.uri("features/NavInformation.feature");
formatter.feature({
  "line": 3,
  "name": "As a Vanguard user,",
  "description": "In order to manage my investments successfully,\nI want to view Net Asset Value (NAV) information on various products",
  "id": "as-a-vanguard-user,",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@run"
    }
  ]
});
formatter.before({
  "duration": 753872,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "NAV information is present in NAV Price List",
  "description": "",
  "id": "as-a-vanguard-user,;nav-information-is-present-in-nav-price-list",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "The Nav Price List URL",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "Nav Price List is retrieved",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "NAV information is available for products",
  "keyword": "Then "
});
formatter.match({
  "location": "NavInformationSteps.theNavPriceListURL()"
});
formatter.result({
  "duration": 1171936848,
  "status": "passed"
});
formatter.match({
  "location": "NavInformationSteps.navPriceListIsRetrieved()"
});
formatter.result({
  "duration": 2750178361,
  "status": "passed"
});
formatter.match({
  "location": "NavInformationSteps.navInformationIsAvailableForProducts()"
});
formatter.result({
  "duration": 405258227,
  "status": "passed"
});
formatter.after({
  "duration": 13839,
  "status": "passed"
});
});