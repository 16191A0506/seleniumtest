$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login to DigitalShopify Application",
  "description": "",
  "id": "login;login-to-digitalshopify-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@UITest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on login",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.i_am_on_homepage()"
});
formatter.result({
  "duration": 12740237300,
  "status": "passed"
});
formatter.match({
  "location": "Login.i_click_on_login()"
});
formatter.result({
  "duration": 3746922601,
  "status": "passed"
});
formatter.match({
  "location": "Login.i_should_be_logged_in()"
});
formatter.result({
  "duration": 1533385400,
  "status": "passed"
});
});