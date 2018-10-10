package com.nokia.cto.steps;


import com.nokia.cto.Screenshot;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

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
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[text()='Week']")).click();
        //Thread.sleep(1000);
        Thread.sleep(1000);
    }

    @When("^Click on AllSubs Trend$")
    public void Click_on_AllSubs_subs_Trend() throws Throwable {

        // Express the Regexp above with the code you wish you had
        Thread.sleep(8000);

        WebElement find=driver.findElement(By.xpath("//*[@id=\"cemboard-pulldown-836481-label-wrapper\"]/span"));
        //Screenshot.scrollElementDown(driver,find);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,550)");
        Actions actions = new Actions(driver);
        //actions.moveToElement(find).click().perform();
        Thread.sleep(3000);
    }

    @Then("^All subs Trend graph should be displayed on same page below$")
    public void All_subs_Trend_graph_should_be_displayed_on_same_page_below() throws Throwable {
        // Express the Regexp above with the code you wish you had
//driver.findElement(By.xpath("//*[@id="cemboard-composite-chart-410168"]/svg/g/path[2]"));
          //WebElement hover=  driver.findElement(By.xpath("//*[@id=\"cemboard-composite-chart-410168\"]/svg/g/g[1]/g[5]/g/g[1]/g[1]/path[2]"));
        //WebElement hover=  driver.findElement(By.xpath("//*[contains(@d,'M230.5 74.5 L 241.5 74.5 241.5 173.5 230.5 173.5Z')][@fill='url(#kdef18)']"));
        WebElement hover=  driver.findElement(By.xpath("//*[contains(@d,'M230.5 74.5 L 241.5 74.5 241.5 173.5 230.5 173.5Z')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(hover).click().perform();

        Thread.sleep(1000);
        Screenshot.screenshotcapture(driver,"target/Tooltipgoodprofile.jpg");
        Thread.sleep(1000);
        WebElement graph=driver.findElement(By.xpath("//*[@id=\"board-content\"]/div/ul/li[26]/section/div[3]/div[1]/div"));

    }

}