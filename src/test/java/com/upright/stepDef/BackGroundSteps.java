package com.upright.stepDef;

import com.upright.utility.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BackGroundSteps {


    // this is getting initialize from profile.feature file.
//    @Given("User is on the home page")
//    public void user_is_on_the_home_page() throws IOException {
//
//
//        FileInputStream obj = new FileInputStream("C:\\Users\\suboj\\OneDrive\\Desktop\\Sample_Project_Frame_Work_Developed_ by Shifat_Jahan\\src\\test\\java\\com\\upright\\utility\\env.properties");
//        Properties prop = new Properties();
//        prop.load(obj);
//        String myurl = prop.getProperty("url");
//        BaseClass.getDriver().get(myurl);
//
//
//    }

}