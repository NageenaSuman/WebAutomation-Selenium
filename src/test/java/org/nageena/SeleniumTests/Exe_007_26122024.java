package org.nageena.SeleniumTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class Exe_007_26122024 {

    @Test
    public void test_sel(){
        EdgeOptions eo = new EdgeOptions();
        eo.addArguments("--window-size=900,600");
        eo.addExtensions(new File("src/test/java/org/nageena/SeleniumTests/AdBlocker.crx"));
        WebDriver driver = new EdgeDriver(eo);
        driver.get("https://www.youtube.com");

        // Setting Proxy

//        Proxy proxy = new Proxy();
//        proxy.setHttpProxy("188.255.245.205:1080");
//        edgeOptions.setCapability("proxy", proxy);


    }
}
