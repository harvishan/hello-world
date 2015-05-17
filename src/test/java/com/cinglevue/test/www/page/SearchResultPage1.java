package com.cinglevue.test.www.page;

/**
 * Created by harshanw on 5/17/15.
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchResultPage1 {
    @FindBy(how = How.XPATH, using = "//html/body/section[2]/div/div/div/div/div[2]/ul/li[2]/a")
    private WebElement Btn_searchPg2;


    @FindBy(how = How.XPATH, using = "//html/body/section[2]/div/div/div/div/div[2]/ul/li[6]/a")
    private WebElement Btn_searchNxt;


    public SearchResultPage1(WebDriver driver){
       // super(driver);
        //this.driver = driver;
    }


    public WebElement getBtn_searchPg2() {
        return Btn_searchPg2;
    }


    public WebElement getBtn_searchNxt() {
        return Btn_searchNxt;
    }




    public void clickBtn_searchPg2() {
        getBtn_searchPg2().click();
    }





    public void clickBtn_searchNxt() {
        getBtn_searchNxt().click();
    }



}

