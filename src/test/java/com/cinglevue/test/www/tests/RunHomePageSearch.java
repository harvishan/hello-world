package com.cinglevue.test.www.tests;


import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by harshanw on 5/16/15.
 * Runner class File for CingleVue Home Page Search
 */

@RunWith(Cucumber.class)
@Cucumber.Options(format = {"pretty", "html:target/cucumber-htmlreport",
        "junit:target/cucumber-junit-report/allcukes.xml"},
        features={"src/test/resources/"},
        tags = { "@HomePageSearch" },
        glue = {"com.cinglevue.test.www"}
        )


public class RunHomePageSearch {
}


