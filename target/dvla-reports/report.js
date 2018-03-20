$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("vehicledetails.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "####DVLA Vechicle Details feature"
    },
    {
      "line": 2,
      "value": "#"
    },
    {
      "line": 3,
      "value": "# Test Vechicle details from DVLA site"
    },
    {
      "line": 4,
      "value": "#"
    },
    {
      "line": 5,
      "value": "#"
    },
    {
      "line": 6,
      "value": "####"
    }
  ],
  "line": 8,
  "name": "DVLA Vehicle Details",
  "description": "Description: This feature enables testing of Vechicle details from DVLA",
  "id": "dvla-vehicle-details",
  "keyword": "Feature",
  "tags": [
    {
      "line": 7,
      "name": "@DVLATest"
    }
  ]
});
formatter.scenario({
  "line": 11,
  "name": "Login to DVLA",
  "description": "",
  "id": "dvla-vehicle-details;login-to-dvla",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "DVLA Url",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "you click on Startnow button",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "it will redirect to Enter the registration number of the vehicle page",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Excel file to read Vehicle details",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "you enter Vehicle number and Click on Continue button",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "it will navigate to Vehicle Information page",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "displays necessary Vehicle details",
  "keyword": "And "
});
formatter.match({
  "location": "DVLAHomePageTest.dvla_Url()"
});
formatter.result({
  "duration": 6472858973,
  "status": "passed"
});
formatter.match({
  "location": "DVLAHomePageTest.you_click_on_Startnow_button()"
});
formatter.result({
  "duration": 3100350487,
  "status": "passed"
});
formatter.match({
  "location": "DVLAHomePageTest.it_will_redirect_to_Enter_the_registration_number_of_the_vehicle_page()"
});
formatter.result({
  "duration": 9987341,
  "status": "passed"
});
formatter.match({
  "location": "DVLAHomePageTest.excel_file_to_read_Vehicle_details()"
});
formatter.result({
  "duration": 781996328,
  "status": "passed"
});
formatter.match({
  "location": "DVLAHomePageTest.you_enter_Vehicle_number_and_Click_on_Continue_button()"
});
formatter.result({
  "duration": 786372846,
  "status": "passed"
});
formatter.match({
  "location": "DVLAHomePageTest.it_will_navigate_to_Vehicle_Information_page()"
});
formatter.result({
  "duration": 7348050,
  "status": "passed"
});
formatter.match({
  "location": "DVLAHomePageTest.displays_necessary_Vehicle_details()"
});
formatter.result({
  "duration": 884556171,
  "status": "passed"
});
});