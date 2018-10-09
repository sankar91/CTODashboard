    Feature: Verify user is able to monitor data in Prestige 2 Subs Trend tab in Care QoE for Hour Filter



      Scenario: Prestige 2 Subs Trend

        Given  Login into CTO Dashboard
        And By default Experience Tab is shown in Landing Page
        When Appy WEEK filter
        When Click on Prestige 2 subs Trend
        Then Care QoE Report for the Prestige 2 Subs Trend should be displayed on same page below
