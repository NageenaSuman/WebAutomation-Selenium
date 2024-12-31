package org.nageena.SeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Exe_008_30122024 {

    @Test
    public void test_locators() throws Exception {

        //to verify locators
        //[id="name"] --> ctrl + f
        //$x("//id/div") --> console specailly for xpath


        EdgeOptions eo = new EdgeOptions();
        eo.addArguments("--start-maximized");
        WebDriver Driver = new EdgeDriver(eo);
        Driver.get("https://katalon-demo-cura.herokuapp.com");

        WebElement anchor_tag = Driver.findElement(By.linkText("Make Appointment"));
        anchor_tag.click();
        anchor_tag = Driver.findElement(By.id("txt-username"));
        anchor_tag.sendKeys("John Doe");
        anchor_tag = Driver.findElement(By.name("password"));
        anchor_tag.sendKeys("ThisIsNotAPassword");
        anchor_tag = Driver.findElement(By.id("btn-login"));
        anchor_tag.click();
        Thread.sleep(3000);
        Assert.assertEquals(Driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");
        Driver.quit();






    }



}
