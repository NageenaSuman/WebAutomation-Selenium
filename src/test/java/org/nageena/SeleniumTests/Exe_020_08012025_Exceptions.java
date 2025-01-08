package org.nageena.SeleniumTests;

import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Exe_020_08012025_Exceptions {
    String url = "https://google.com";
    WebDriver driver;

    @BeforeTest
    public void openBro(){
        EdgeOptions eo = new EdgeOptions();
        eo.addArguments("--start-maximized");
        driver = new EdgeDriver(eo);
        driver.get(url);

    }
    @Test
    @Description("Validate Various Exceptions")
    public void test_exceptions() throws InterruptedException {

        // InvallidSelectorException


        try {
            driver.findElement(By.xpath("//input[@id='nageena')]"));
        }
        catch (InvalidSelectorException e){

            System.out.println(e.getMessage());
        }

        // NoSuchElementException -- will definetly throw error even when used try block and will not stop execution
        driver.get("https://app.vwo.com/");
        try {
            driver.findElement(By.id("nageena"));
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }

        //StaleElementException
        driver.get("https://google.com");
        try {

            WebElement search_inputbox  = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
            driver.navigate().refresh();
            // HTML Page (DOM) is not refreshed,
            // Driver will think that, element may or may not available now.
            // I have found the element before refresh.

            // Refresh, Navigate other Page, change in DOM elements (Ajax Calls) - VueJS, AngularJS
            // If you want to fix the stale element exp - refind the element after DOM changes)
            //search_inputbox  = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));

            // Fix is to search the webelement again
            search_inputbox.sendKeys("thetestingacademy"+ Keys.ENTER);
        } catch (StaleElementReferenceException e) {
            System.out.println(e.getMessage());
        }

        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@id='abc']")));
            driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("nageena");
        }
        catch (TimeoutException e){

            System.out.println(e.getMessage());
        }
        System.out.println("End of the program");

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
