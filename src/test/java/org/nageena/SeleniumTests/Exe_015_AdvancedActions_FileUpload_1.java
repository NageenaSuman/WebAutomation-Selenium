package org.nageena.SeleniumTests;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Exe_015_AdvancedActions_FileUpload_1 {

    String url = "https://www.browserstack.com/users/sign_in";
    WebDriver driver;

    @BeforeTest
    public void openBro(){
        EdgeOptions eo = new EdgeOptions();
        eo.addArguments("--start-maximized");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

    }
    @Test
    @Description("Validate Window Handles")
    public void test_fileupload() throws InterruptedException {
        String path_to_file = System.getProperty("user.dir");
        System.out.println(path_to_file);

        driver.findElement(By.xpath("//input[@id=\"user_email_login\"]")).sendKeys("ligh6681@gmail.com");
        driver.findElement(By.xpath("//input[@id=\"user_password\"]")).sendKeys("arrafiu786");
        driver.findElement(By.xpath("//input[@id=\"user_submit\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(".aa-app-uploader__upload-text")).sendKeys(path_to_file + "src/test/java/org/nageena/SeleniumTests/example.apk");
        String upload_text = driver.findElement(By.xpath("//div[@class=\"aa-app-uploader__uploaded-app\"]/div/div[@class=\"text-container\"]")).getText();
        System.out.println(upload_text);
        Assert.assertEquals(upload_text, "example.apk");

        //Assert.assertTrue(driver.getPageSource().contains("File Uploaded!"));
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
