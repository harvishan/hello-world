package com.cinglevue.test.www.tests;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by harshanw on 5/16/15.
 * Step Definition File for CingleVue Home Page Search
 */

public class HomePageSearchStepDef {

    private WebDriver driver;

    @Given("^I am in CingleVue Homepage$")
    public void I_am_in_CingleVue_Homepage() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "/home/harshanw/hello-world/src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.cinglevue.com/");
        Assert.assertTrue("Training mode record hasn't created in couchdb", driver.findElement(By.xpath("//html/body/header/div/div/div/section/div/div/div/div/form/div/div/div/input")).isDisplayed());
        this.driver = driver;
        }


    @When("^I enter \"([^\"]*)\" as the keyword and submit$")
    public void I_enter_as_the_keyword_and_submit(String arg1) throws Throwable {
        Assert.assertTrue("Training mode record hasn't created in couchdb", driver.findElement(By.xpath("//html/body/header/div/div/div/section/div/div/div/div/form/div/div/div/input")).isDisplayed());
        driver.findElement(By.xpath("//html/body/header/div/div/div/section/div/div/div/div/form/div/div/div/input")).click();
        driver.findElement(By.xpath("//html/body/header/div/div/div/section/div/div/div/div/form/div/div/div/input")).sendKeys(arg1+"\n");
    }

    //Since one search result page contain 10 results, Test will verify for the availability of "2nd" page and "Next" page buttons to make sure so that total number of search results are more than 10
    @Then("^I should see more than ten results$")
    public void I_should_see_more_than_ten_results() throws Throwable {
        Assert.assertTrue("Training mode record hasn't created in couchdb", driver.findElement(By.xpath("//html/body/section[2]/div/div/div/div/div[2]/ul/li[2]/a")).isDisplayed());
        Assert.assertTrue("Training mode record hasn't created in couchdb", driver.findElement(By.xpath("//html/body/section[2]/div/div/div/div/div[2]/ul/li[6]/a")).isDisplayed());
        driver.quit();

    }

}
