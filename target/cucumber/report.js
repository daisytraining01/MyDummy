$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/Register.feature");
formatter.feature({
  "name": "To Register in Demo site",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User1 Registration",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@user1"
    }
  ]
});
formatter.step({
  "name": "User is able to launch the application",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_is_able_to_launch_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User provides the neccessary details",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_provides_the_neccessary_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks submit button",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_clicks_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User2 Registration",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@user2"
    }
  ]
});
formatter.step({
  "name": "User is able to launch the application",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_is_able_to_launch_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User provides the neccessary details",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_provides_the_neccessary_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks submit button",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_clicks_submit_button()"
});
formatter.result({
  "status": "passed"
});
});