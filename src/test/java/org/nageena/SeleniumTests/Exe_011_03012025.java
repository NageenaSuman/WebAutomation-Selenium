package org.nageena.SeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import javax.print.DocFlavor;
import java.sql.SQLOutput;
import java.util.List;

public class Exe_011_03012025 {
    @Test
    public void test_xpath_webtables() throws InterruptedException {
        EdgeOptions eo = new EdgeOptions();
        eo.addArguments("--start-maximized");
        WebDriver driver = new EdgeDriver(eo);

        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
        Thread.sleep(3000);
        WebElement web_ele = driver.findElement(By.xpath("//input[@name=\"username\"]"));
        web_ele.sendKeys("admin");
        web_ele = driver.findElement(By.xpath("//input[@name=\"password\"]"));
        web_ele.sendKeys("Hacker@4321");
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

        //Fetching Table
        Thread.sleep(3000);
        List<WebElement> row = driver.findElements(By.xpath("//div[@class='oxd-table-card']/div"));
        System.out.println("ID                 FirstName               LastName");
        for (int i =0; i<row.size();i++){

            System.out.println(row.get(i).findElement(By.xpath("div[2]")).getText() +
                    "               " +
                    row.get(i).findElement(By.xpath("div[3]")).getText() +
                    "            " +
                    row.get(i).findElement(By.xpath("div[4]")).getText());
        };

    }
}


