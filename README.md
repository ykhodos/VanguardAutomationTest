# VanguardAutomationTest
Test Automation task for Vanguard

The project implements two tests:

**Test 1. UI Automation**
Using Java or JavaScript/Typescript and any frameworks/libraries of your choice, automate the user flow/scenario below.
As a Vanguard user,
In order to manage my investments successfully,
I want to be able to compare 4 Retail funds using the “Product Facts”

**Test 2. API Automation**
Using Java or JavaScript/Typescript and any frameworks/libraries of your choice, automate the API scenario below.
As a Vanguard user,
In order to manage my investments successfully,
I want to view Net Asset Value (NAV) information on various products


The  project uses Cucumber and Selenium(for UI test) and Rest Assured(for API test)
 *src/test/resources/features/FundsCompare.feature* is the feature file for Test 1
 *src/test/resources/features/NavInformatio.feature* is the feature file for Test 2        
 *src/test/resources/application.properties* file contains base URL, web browser, and webdriver implicit wait time properties.

The results of the tests can be found in *reports/cucumber-html-report*

The project is a Maven project so it can be ran from the project directory using *>mvn clean test*
