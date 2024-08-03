package com.upright.testRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"C:\\Users\\suboj\\OneDrive\\Desktop\\Sample_Project_Frame_Work_Developed_ by Shifat_Jahan\\src\\test\\java\\com\\upright\\Features\\homePage.feature"}, glue={"com.upright.stepDef"},
        //tags = "@Functional_Test",
        plugin = { "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },

        publish = true)



public class RunnerClass {
}
