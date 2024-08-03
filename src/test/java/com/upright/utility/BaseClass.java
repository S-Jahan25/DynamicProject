package com.upright.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseClass {


    private static WebDriver driver;
    // WebDriver is a interface . should not contain any body. it has many many method inside.


    public static WebDriver getDriver() {
        return driver;
    }

    public BaseClass() throws IOException {


// Connecting with the env.properties class with the help or fileinputstream
        FileInputStream obj = new FileInputStream("C:\\Users\\suboj\\FinalCucumberProject\\src\\test\\java\\com\\upright\\utility\\env.properties");

        // to get loaded all the information from the properties class first I ahve to create obj
        Properties prop = new Properties();  // created obj of the properties class
        prop.load(obj); // this line is loading all the envproperties file information.

        String myBrowser = prop.getProperty("browser"); // this line will return the browser type from the info properties file.
       // System.out.println(myBrowser);


     //   System.setProperty("webdriver.chrome.driver","C:\\Users\\suboj\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
       // System.setProperty("webdriver.gecko.driver","C:\\Users\\suboj\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");

// open browser
        if (myBrowser.equals("chrome")){
            driver = new ChromeDriver(); // this will open the chrome driver
        }
        else if (myBrowser.equals("firefox")) {
            driver = new FirefoxDriver(); // this is a constructor which is establish the connection with the browser.

        }
        else {
            System.out.println("Please Check your driver");
        }


        // driver.get mean it will wait until the driver gets loaded the whole page.

        //  driver.navigate().to("http://jahanprofile.click"); //navigate.to , it will not wait until whole page loaded. it will go to next page



        //   driver.navigate().back(); // this line will take to the previous page
        // driver.navigate().forward(); // this line will go to the next page.
        //  driver.navigate().refresh(); // it will refresh the page.
      driver.manage().window().maximize();


    }

    public static void setDriver() throws IOException {
        BaseClass obj = new BaseClass();
    }


}





