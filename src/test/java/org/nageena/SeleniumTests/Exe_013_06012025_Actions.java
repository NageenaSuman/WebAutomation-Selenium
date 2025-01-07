package org.nageena.SeleniumTests;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Exe_013_06012025_Actions {

    String url = "https://www.makemytrip.com";
    WebDriver driver;

    @BeforeTest
    public void openBro(){
        EdgeOptions eo = new EdgeOptions();
        eo.addArguments("--start-maximized");
        driver = new EdgeDriver(eo);
        driver.get(url);

    }
    @Test
    @Description("Validate Mouse Actions")
    public void test_actions() throws InterruptedException {

        // Wait for the popup to come and click the x icon
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.
                until(ExpectedConditions.
                        visibilityOfElementLocated
                                (By.xpath("//span[@data-cy='closeModal']")));


        driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]")).click();

        Thread.sleep(5000);

        WebElement fromCity = driver.findElement(By.id("fromCity"));

        Actions action = new Actions(driver);
        action.moveToElement(fromCity).click().build().perform();
        action.moveToElement(fromCity).sendKeys("del").build().perform();
        Thread.sleep(10000);
        action.moveToElement(fromCity).keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER).build().perform();
        // we can take from autosuggestions list as well
        //        List<WebElement> list_auto_complete = driver.findElements(By.xpath("//ul[@class=\"react-autosuggest__suggestions-list\"]/li"));
//
//        for(WebElement e : list_auto_complete){
//            if(e.getText().contains("New Delhi")){
//                e.click();
//                break;
//            }
//        }



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
