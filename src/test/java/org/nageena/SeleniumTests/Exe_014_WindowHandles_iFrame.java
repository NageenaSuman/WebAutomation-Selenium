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


import java.util.List;
import java.util.Set;

public class Exe_014_WindowHandles_iFrame {

    String url = "https://app.vwo.com/#/test/ab/13/heatmaps/1?token=eyJhY2NvdW50X2lkIjo2NjY0MDAsImV4cGVyaW1lbnRfaWQiOjEzLCJjcmVhdGVkX29uIjoxNjcxMjA1MDUwLCJ0eXBlIjoiY2FtcGFpZ24iLCJ2ZXJzaW9uIjoxLCJoYXNoIjoiY2IwNzBiYTc5MDM1MDI2N2QxNTM5MTBhZDE1MGU1YTUiLCJzY29wZSI6IiIsImZybiI6ZmFsc2V9&isHttpsOnly=1";
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
        Thread.sleep(13000);
        String parent_window = driver.getWindowHandle();

        List<WebElement> heatmap = driver.findElements(By.cssSelector("[data-qa=\"danawobuqa\"]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(heatmap.get(1)).click().perform();
        Thread.sleep(13000);
        Set<String> allwindows = driver.getWindowHandles();

        for(String child: allwindows){
            if(!child.equals(parent_window)){
            driver.switchTo().window(child);
            // iFrame -- > page within page and it should be handled like first switch to element and then select the element using locator
            // direct element locator wont work so switch to frame first and then locate

            driver.switchTo().frame("heatmap-iframe");
            driver.findElement(By.cssSelector("[data-qa=\"liqokuxuba\"]")).click();

            }
        }



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
