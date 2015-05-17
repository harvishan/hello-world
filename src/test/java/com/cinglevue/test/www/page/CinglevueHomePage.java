package com.cinglevue.test.www.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.junit.Assert;
import org.junit.Assume;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;



/**
 * Created by harshanw on 5/16/15.
 */

public class CinglevueHomePage {


    private static WebDriver driver;

    @FindBy(how = How.XPATH, using = "//html/body/header/div/div/div[2]")
    private WebElement lbl_header;


    @FindBy(how = How.XPATH, using = "//html/body/header/div/div/div/section/div/div/div/div/form/div/div/div/input")
    private WebElement btn_search;

    @FindBy(how = How.XPATH, using = "//html/body/header/div/div/div/section/div/div/div/div/form/div/div/div[2]/button/i")
    private WebElement btn_roundSearch;

    @FindBy(how = How.XPATH, using = "//html/body/header/div/div/div/section/div/div/div/div/form/div/div/div/input")
    private WebElement txt_search;


    public  CinglevueHomePage (WebDriver driver){

        //super(driver);

        //super(driver);

       // this.driver = driver;
        //private static WebDriver driver;

       driver = new ChromeDriver();
       driver.get("http://www.cinglevue.com/");
       // driver.findElement();
        PageFactory.initElements(getDriver(), this);

       // return this;
    }


    public WebElement getlbl_header() {
        return lbl_header;
    }


    public WebElement getBtn_search() {
        return btn_search;
    }

    public WebElement getbtn_roundSearch() {
        return btn_roundSearch;
    }




    public CinglevueHomePage clickBtn_search() {
        getBtn_search().click();
        CinglevueHomePage cssdp = PageFactory.initElements(driver, CinglevueHomePage.class);
        return cssdp;

    }





    public void clickBtn_roundSearch() {
        getbtn_roundSearch().click();
    }


    public WebElement gettxt_search() {
        return txt_search;
    }





    public void setTxt_search(String value) {
        gettxt_search().clear();
       // CincoKeyboardHelper.sendKeys(getDriver(), value);
    }


    public WebDriver getDriver() {
        return driver;
    }


}