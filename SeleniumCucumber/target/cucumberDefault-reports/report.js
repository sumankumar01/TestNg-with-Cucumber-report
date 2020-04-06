$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/login.feature");
formatter.feature({
  "name": "Login",
  "description": "  login to flight application",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@loginFlight"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Checking the login functionality flight application",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.step({
  "name": "i am on login page",
  "keyword": "Given "
});
formatter.step({
  "name": "i am entering the login credential \"\u003cUsername\u003e\" and \"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "i am validating the home page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ]
    },
    {
      "cells": [
        "mercury",
        "mercury"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Checking the login functionality flight application",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@loginFlight"
    },
    {
      "name": "@login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "i am on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefination.SD_login.i_am_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "i am entering the login credential \"mercury\" and \"mercury\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefination.SD_login.i_am_entering_the_login_credential_something_and_something(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "i am validating the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.SD_login.i_am_validating_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});