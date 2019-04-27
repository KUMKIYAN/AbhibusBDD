$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("abhi.feature");
formatter.feature({
  "line": 1,
  "name": "Reset functionality on login page of Application",
  "description": "",
  "id": "reset-functionality-on-login-page-of-application",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1751597720,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Verification of Reset button",
  "description": "",
  "id": "reset-functionality-on-login-page-of-application;verification-of-reset-button",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I visit Abhibus website",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I verify abhibus banner logo tooltip is \"abhibus.com - India\u0027s Fastest Online bus ticket booking site\"",
  "keyword": "Then "
});
formatter.match({
  "location": "abhiSteps.iAbhibusWebsite()"
});
formatter.result({
  "duration": 4712136899,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abhibus.com - India\u0027s Fastest Online bus ticket booking site",
      "offset": 41
    }
  ],
  "location": "abhiSteps.iVerifyAbhibusBannerLogoTooltipIsSomething(String)"
});
formatter.result({
  "duration": 30655912,
  "status": "passed"
});
formatter.after({
  "duration": 100483500,
  "status": "passed"
});
});