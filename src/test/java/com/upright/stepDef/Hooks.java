package com.upright.stepDef;

import com.upright.utility.BaseClass;
import io.cucumber.java.Before;

import java.io.IOException;

public class Hooks {

    @Before
    public void launchBrowser() throws IOException {
        BaseClass.setDriver();
    }
}
