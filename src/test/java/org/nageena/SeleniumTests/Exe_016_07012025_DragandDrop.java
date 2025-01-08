package org.nageena.SeleniumTests;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Exe_016_07012025_DragandDrop {
    String url = "https://the-internet.herokuapp.com/drag_and_drop";
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
    WebElement drag = driver.findElement(By.id("column-a"));
    WebElement drop = driver.findElement(By.id("column-b"));
        Actions action = new Actions(driver);
        action.dragAndDrop(drag,drop).perform();
        //can also be performed like this
        // actions.moveToElement(drag).moveToElement(drop).release(to).build().perform();


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
