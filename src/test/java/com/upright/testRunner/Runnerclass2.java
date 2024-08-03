package com.upright.testRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"C:\\Users\\suboj\\FinalCucumberProject\\src\\test\\java\\com\\upright\\features\\UpRightForumPractice.feature"}, glue={"com.upright.stepDef"},
        tags = "@Functional_Test",
        plugin = { "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },

        publish = true)


public class Runnerclass2 extends AbstractTestNGCucumberTests {
}
