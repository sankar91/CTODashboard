    Feature: Verify user is able to monitor data in Prestige 2 Subs Trend tab in Care QoE for Hour Filter


      Scenario: All Subs Trend

        Given  Login into CTO Dashboard
        And By default Experience Tab is shown in Landing Page
        When Appy WEEK filter
        When Click on AllSubs Trend
        Then All subs Trend graph should be displayed on same page below
