package com.cinglevue.test.www.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


/**
 * Created by harshanw on 5/16/15.
 * CingleVue Homepage Object
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



    public WebElement getlbl_header() {
        return lbl_header;
    }

    public WebElement getBtn_search() {
        return btn_search;
    }

    public WebElement getbtn_roundSearch() {
        return btn_roundSearch;
    }

    public void clickBtn_roundSearch() {
        getbtn_roundSearch().click();
    }


    public WebElement gettxt_search() {
        return txt_search;
    }

    public void setTxt_search(String value) {
        gettxt_search().clear();
    }

    public WebDriver getDriver() {
        return driver;
    }


}