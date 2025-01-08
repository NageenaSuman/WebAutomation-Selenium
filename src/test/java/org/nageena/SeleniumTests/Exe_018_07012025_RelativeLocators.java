package org.nageena.SeleniumTests;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.time.Duration;

public class Exe_018_07012025_RelativeLocators {
    String url = "https://codepen.io/AbdullahSajjad/full/LYGVRgK";
    WebDriver driver;

    @BeforeTest
    public void openBro(){
        EdgeOptions eo = new EdgeOptions();
        eo.addArguments("--start-maximized");
        driver = new EdgeDriver(eo);
        driver.get(url);

    }
    @Test
    @Description("Validate Validate Relative Locators")
    public void test_rl() throws InterruptedException {

        // yu will get error as direct access is not possible due to iframe
        //driver.findElement(By.xpath("//form[@id=\"form\"]/button")).click();

        driver.switchTo().frame("result");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//form[@id=\"form\"]/button")).click();

        WebElement email = driver.findElement(By.xpath("//input[@id=\"email\"]"));
        System.out.println(driver.findElement(with(By.tagName("small")).below(email)).getText());


    }


    @AfterTest
    public void  closeBro(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();

    }


}
