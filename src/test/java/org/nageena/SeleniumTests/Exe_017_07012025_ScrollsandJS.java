package org.nageena.SeleniumTests;

import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Exe_017_07012025_ScrollsandJS {

    String url = "https://onepagelove.com/tag/long-scrolling";
    WebDriver driver;

    @BeforeTest
    public void openBro(){
        EdgeOptions eo = new EdgeOptions();
        eo.addArguments("--start-maximized");
        driver = new EdgeDriver(eo);
        driver.get(url);

    }
    @Test
    @Description("Validate Window Handles")
    public void test_iFrame() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor)driver;

        //WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href=\"https://onepagelove.com/daisy-ai\"]")));
        WebElement element = driver.findElement(By.xpath("//a[@href=\"https://onepagelove.com/daisy-ai\"]"));
        js.executeScript("arguments[0].scrollIntoView(true);",element);
        Thread.sleep(3000);
        Actions action = new Actions(driver);
        //normal scroll
        action.sendKeys(Keys.ARROW_DOWN).build().perform();
        action.sendKeys(Keys.PAGE_DOWN).build().perform();
        //another method
        js.executeScript("window.scrollTo(0,1000)");



    }


    @AfterTest
    public void  closeBro(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //driver.quit();

    }

}
