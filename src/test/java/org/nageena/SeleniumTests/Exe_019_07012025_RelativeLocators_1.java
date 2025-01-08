package org.nageena.SeleniumTests;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.openqa.selenium.support.locators.RelativeLocator.with;
import java.util.List;

public class Exe_019_07012025_RelativeLocators_1 {
    String url = "https://www.aqi.in/real-time-most-polluted-city-ranking";
    WebDriver driver;

    @BeforeTest
    public void openBro(){
        EdgeOptions eo = new EdgeOptions();
        eo.addArguments("--start-maximized");
        driver = new EdgeDriver(eo);
        driver.get(url);

    }
    @Test
    @Description("Validate Relative Locators")
    public void test_rl() throws InterruptedException {
        List<WebElement> locations = driver.findElements(By.cssSelector(".location-name > p"));
        for(WebElement loc:locations){
            System.out.println(loc.getText());
            String rank = driver.findElement(with(By.tagName("p")).toLeftOf(loc)).getText();
            String aqi = driver.findElement(with(By.tagName("span")).toRightOf(loc)).getText();
            System.out.println("| +" + rank +" | " + loc.getText() + " | " + aqi + " | ");
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
