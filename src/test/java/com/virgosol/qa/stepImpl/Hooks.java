package com.virgosol.qa.stepImpl;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import com.codeborne.selenide.Configuration;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
public class Hooks {
    @After
    public void tearDown(){
        closeWindow();
    }

    @Before
    public void setup(){
        Configuration.browserSize = "1920x1080";
    }
}
