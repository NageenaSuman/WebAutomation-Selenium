package org.nageena.SeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;



public class Exe_009_30122024 {

    @Test
    public void test_locators() throws Exception {

        EdgeOptions eo = new EdgeOptions();
        eo.addArguments("--start-maximized");
        eo.addArguments("incognito");
        WebDriver Driver = new EdgeDriver(eo);
        Driver.get("https://app.vwo.com");

        WebElement web_element = Driver.findElement(By.id("login-username"));

        web_element.sendKeys("John Doe");
        web_element = Driver.findElement(By.name("password"));
        web_element.sendKeys("ThisIsNotAPassword");
        //List<WebElement> btn_list= Driver.findElements(By.className("checkbox-radio-button ng-scope"));
        //btn_list.get(0).click();
        web_element = Driver.findElement(By.id("js-login-btn"));
        web_element.click();
        Thread.sleep(3300);
        web_element = Driver.findElement(By.className("notification-box-description"));
        Assert.assertEquals(web_element.getText(),"Your email, password, IP address or location did not match");


        Driver.quit();


    }
}