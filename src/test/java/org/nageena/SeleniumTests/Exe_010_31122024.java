package org.nageena.SeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Exe_010_31122024 {

    @Test
    public void test_sel_xpath () throws Exception {
        EdgeOptions eo = new EdgeOptions();
        eo.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(eo);
        driver.get("https://www.idrive360.com/enterprise/login");
        Thread.sleep(3000);

        WebElement web = driver.findElement(By.xpath("//input[@id='username']"));
        web.sendKeys("augtest_040823@idrive.com");
        web = driver.findElement(By.xpath("//input[@id='password']"));
        web.sendKeys("123456");
        web = driver.findElement(By.xpath("//span[@class='id-checkmark']"));
        web.click();
        web = driver.findElement(By.xpath("//button[text()=\"Sign in\"]"));
        web.click();
        Thread.sleep(30000);
        web = driver.findElement(By.xpath("//h5[text()='Your free trial has expired' and contains(@class, 'id-card-title')]"));
        Assert.assertEquals(web.getText(), "Your free trial has expired");
        driver.quit();

    }


}
