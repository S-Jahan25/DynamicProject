package com.upright.pageObjects;

import com.upright.utility.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KarateHomePage {

    public KarateHomePage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//p[text() = 'ACTION KARATE– Available in 35 LOCATIONS!']")
    WebElement FirstTextPath;

    @FindBy(xpath = "//p[text() = 'Karate brings Fitness, focus & Fun – for the whole family']")
    WebElement SecondTextPath;

   // @FindBy(xpath = "")


   public void firstText(){

       do{
           BaseClass.getDriver().navigate().refresh();
       }
       while ( FirstTextPath.isDisplayed());


   ;


  }

  }

