####DVLA Vechicle Details feature
#
# Test Vechicle details from DVLA site
# 
#
####
@DVLATest
Feature: DVLA Vehicle Details
  Description: This feature enables testing of Vechicle details from DVLA

  Scenario: Login to DVLA
    Given DVLA Url
    When you click on Startnow button
    Then it will redirect to Enter the registration number of the vehicle page
 
 		Given Excel file to read Vehicle details
 		When you enter Vehicle number and Click on Continue button
 		Then it will navigate to Vehicle Information page
 		And displays necessary Vehicle details 
  