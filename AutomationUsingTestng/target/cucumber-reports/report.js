$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 2,
  "name": "Login",
  "description": "login to flight application",
  "id": "login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@loginmain"
    }
  ]
});
formatter.before({
  "duration": 291100,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Checking the Registration functionality flight application",
  "description": "",
  "id": "login;checking-the-registration-functionality-flight-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 20,
      "name": "@Registration"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "i am on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "i am entering the Registration details",
  "rows": [
    {
      "cells": [
        "Filed",
        "Value",
        "",
        ""
      ],
      "line": 24
    },
    {
      "cells": [
        "Firstname",
        "xyz",
        "",
        ""
      ],
      "line": 25
    },
    {
      "cells": [
        "LastName",
        "def",
        "",
        ""
      ],
      "line": 26
    },
    {
      "cells": [
        "AddressLine_2",
        "Whitfield",
        "",
        ""
      ],
      "line": 27
    },
    {
      "cells": [
        "City",
        "Bangalore",
        "",
        ""
      ],
      "line": 28
    },
    {
      "cells": [
        "Country",
        "India",
        "",
        ""
      ],
      "line": 29
    },
    {
      "cells": [
        "phoneNum",
        "0000000",
        "11111",
        "555555"
      ],
      "line": 30
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "i am validating the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "SD_login.i_am_on_login_page()"
});
formatter.result({
  "duration": 157512800,
  "status": "passed"
});
formatter.match({
  "location": "SD_login.i_am_entering_the_Registration_details(DataTable)"
});
formatter.result({
  "duration": 1951700,
  "status": "passed"
});
formatter.match({
  "location": "SD_login.i_am_validating_the_home_page()"
});
formatter.result({
  "duration": 264700,
  "status": "passed"
});
formatter.after({
  "duration": 74300,
  "status": "passed"
});
});