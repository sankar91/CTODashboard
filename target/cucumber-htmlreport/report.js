$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('Functionality.feature');
formatter.feature({
  "line": 1,
  "name": "Verify user is able to monitor data in Prestige 2 Subs Trend tab in Care QoE for Hour Filter",
  "description": "",
  "id": "verify-user-is-able-to-monitor-data-in-prestige-2-subs-trend-tab-in-care-qoe-for-hour-filter",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Prestige 2 Subs Trend",
  "description": "",
  "id": "verify-user-is-able-to-monitor-data-in-prestige-2-subs-trend-tab-in-care-qoe-for-hour-filter;prestige-2-subs-trend",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "Login into CTO Dashboard",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "By default Experience Tab is shown in Landing Page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Appy WEEK filter",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Click on Prestige 2 subs Trend",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Care QoE Report for the Prestige 2 Subs Trend should be displayed on same page below",
  "keyword": "Then "
});
formatter.match({
  "location": "ConversionStepDefs.Login_into_CTO_Dashboard()"
});
formatter.result({
  "duration": 9139565775,
  "status": "passed"
});
formatter.match({
  "location": "ConversionStepDefs.By_default_Experience_Tab_is_shown_in_Landing_Page()"
});
formatter.result({
  "duration": 16962167960,
  "status": "passed"
});
formatter.match({
  "location": "ConversionStepDefs.Appy_WEEK_filter()"
});
formatter.result({
  "duration": 22970855,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[text()\u003d\u0027Week\u0027]\"}\n  (Session info: chrome\u003d69.0.3497.100)\n  (Driver info: chromedriver\u003d2.38.552522 (437e6fbedfa8762dec75e2c5b3ddb86763dc9dcb),platform\u003dWindows NT 10.0.16299 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 20 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.45.0\u0027, revision: \u00275017cb8e7ca8e37638dc3091b2440b90a1d8686f\u0027, time: \u00272015-02-27 09:10:26\u0027\nSystem info: host: \u0027N-20HEPF135EGA\u0027, ip: \u002710.136.222.113\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002710.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.38.552522 (437e6fbedfa8762dec75e2c5b3ddb86763dc9dcb), userDataDir\u003dC:\\WINDOWS\\TEMP\\scoped_dir2760_8198}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d69.0.3497.100, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dfalse, acceptInsecureCerts\u003dfalse, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: 897a0dfb51f106873aae4930f49699b3\n*** Element info: {Using\u003dxpath, value\u003d//*[text()\u003d\u0027Week\u0027]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:488)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:204)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:156)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:599)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:352)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:449)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:357)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:344)\r\n\tat com.nokia.cto.steps.ConversionStepDefs.Appy_WEEK_filter(ConversionStepDefs.java:43)\r\n\tat ✽.When Appy WEEK filter(Functionality.feature:9)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 18
    }
  ],
  "location": "ConversionStepDefs.Click_on_Prestige_subs_Trend(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 33
    }
  ],
  "location": "ConversionStepDefs.Care_QoE_Report_for_the_Prestige_Subs_Trend_should_be_displayed_on_same_page_below(int)"
});
formatter.result({
  "status": "skipped"
});
});