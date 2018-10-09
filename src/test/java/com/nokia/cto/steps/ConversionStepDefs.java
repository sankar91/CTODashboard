package com.nokia.cto.steps;


import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;


public class ConversionStepDefs {
    public WebDriver driver;
    @Given("^Login into CTO Dashboard$")
    public void Login_into_CTO_Dashboard() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://10.93.99.30:8443/");
        WebElement uname = driver.findElement(By.xpath("//*[@id=\"userlogin\"]"));
        uname.sendKeys("cemoduser2@etisalat.com");
        WebElement pass = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        pass.sendKeys("Etisalat@123");
        WebElement login= driver.findElement(By.xpath("//*[@id=\"btnLogin\"]/span[3]"));
        login.click();
    }

    @Given("^By default Experience Tab is shown in Landing Page$")
    public void By_default_Experience_Tab_is_shown_in_Landing_Page() throws Throwable {
        // Express the Regexp above with the code you wish you had
        driver.get("https://10.93.99.30:8443/group/etisalat/uc-cto-dashboard");

    }

    @When("^Appy WEEK filter$")
    public void Appy_WEEK_filter() throws Throwable {
        // Express the Regexp above with the code you wish you had
        driver.findElement(By.xpath("//*[text()='Week']")).click();
        //Thread.sleep(1000);
        Thread.sleep(1000);
    }

    @When("^Click on Prestige (\\d+) subs Trend$")
    public void Click_on_Prestige_subs_Trend(int arg1) throws Throwable {
        // Express the Regexp above with the code you wish you had

    }

    @Then("^Care QoE Report for the Prestige (\\d+) Subs Trend should be displayed on same page below$")
    public void Care_QoE_Report_for_the_Prestige_Subs_Trend_should_be_displayed_on_same_page_below(int arg1) throws Throwable {
        // Express the Regexp above with the code you wish you had

    }

}