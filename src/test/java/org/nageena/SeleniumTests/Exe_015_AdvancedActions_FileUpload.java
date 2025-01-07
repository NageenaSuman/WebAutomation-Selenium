package org.nageena.SeleniumTests;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class Exe_015_AdvancedActions_FileUpload {

    String url = "https://the-internet.herokuapp.com/upload";
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
    public void test_fileupload() throws InterruptedException {
        String path_to_file = System.getProperty("user.dir");
        System.out.println(path_to_file);
        Thread.sleep(3000);
    driver.findElement(By.id("file-upload")).sendKeys(path_to_file +"/src/test/java/org/nageena/SeleniumTests/Test.xlsx");
    driver.findElement(By.cssSelector("input.button")).click();

        Assert.assertTrue(driver.getPageSource().contains("File Uploaded!"));
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
