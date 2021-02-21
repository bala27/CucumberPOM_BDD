$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/workspace/CucumberPOM_BDD/src/main/java/com/qa/feature/hrm.feature");
formatter.feature({
  "line": 1,
  "name": "Orange HRM application test",
  "description": "",
  "id": "orange-hrm-application-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Orange HRM login test",
  "description": "",
  "id": "orange-hrm-application-test;orange-hrm-login-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user is on login page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user logs into application",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Dashboard page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.user_opens_browser()"
});
formatter.result({
  "duration": 12015383890,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.user_is_on_login_page()"
});
formatter.result({
  "duration": 50069607,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.user_logs_into_application()"
});
formatter.result({
  "duration": 5436155572,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.Dashboard_page_is_displayed()"
});
formatter.result({
  "duration": 103666194,
  "status": "passed"
});
});