package com.upright.stepDef;

import com.upright.pageObjects.KarateHomePage;
import com.upright.utility.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class KarateHomePageTest {
    KarateHomePage karateHomePage;

    @Given("User is on the home page")
    public void user_is_on_the_home_page() throws IOException {
        karateHomePage = new KarateHomePage(BaseClass.getDriver());
        FileInputStream fis = new FileInputStream("C:\\Users\\suboj\\OneDrive\\Desktop\\Sample_Project_Frame_Work_Developed_ by Shifat_Jahan\\src\\test\\java\\com\\upright\\utility\\env.properties");
        Properties prop = new Properties();
        prop.load(fis);
        String myurl = prop.getProperty("url");
        BaseClass.getDriver().get(myurl);

    }

    @Then("verify that the first Text \"ACTION KARATE – NOW IN 35 LOCATIONS! text is displayed")
    public void verify_that_the_first_text_action_karate_now_in_locations_text_is_displayed() {
        karateHomePage.firstText();
    }


    @Then("verify that the second Text {string} is visible")
    public void verify_that_the_second_text_is_visible(String string) {



    }








}
