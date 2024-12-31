package org.nageena.SeleniumTests;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Exe_006_26122024 {
    // EdgeOptions -> It will help you set the browser
    // options to browsers
    // window - size
    // headless mode - there is not UI -> advantage - Fast Execution
    // full UI mode - default - UI browser
    // incognito mode - switch
    // start Max
    // add extensions - browsers
    // 100 + others , https , http
    // localstorage, download ?
    // edgeOptions.addArguments("--window-size=1280,720");
    // edgeOptions.addArguments("--window-size=800,600");
    // edgeOptions.addArguments("--incognito");
    // edgeOptions.addArguments("--start-maximized");


    @Description( "Edge/Chrome/Firefox options")
    @Test

    public void test_options(){
        EdgeOptions eo = new EdgeOptions();
        //eo.addArguments("--headless");
        eo.addArguments("--start-maximized");
        WebDriver driver = new EdgeDriver(eo);
        driver.get("https://google.com");

    }
}
