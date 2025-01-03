package org.nageena.SeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class Exe_012_03012025_SVG {
    @Test
    public void test_svgoricons() throws InterruptedException {
        EdgeOptions eo = new EdgeOptions();
        eo.addArguments("--start-maximized");
        WebDriver driver = new EdgeDriver(eo);

        driver.get("https://www.amcharts.com/svg-maps/?map=india");
        Thread.sleep(4000);

        List<WebElement> web_ele = driver.findElements(By.xpath("//*[name()='svg']/*[name()='g'][7]/*[name()='g']/*[name()='g']/*[name()='path']"));
        for (WebElement c: web_ele){
            System.out.println(c.getAttribute("aria-label")); //as there is no blank text available
            if(c.getAttribute("aria-label").contains("Tamil Nadu ")){
                Thread.sleep(1000);
                c.click();
            }
        }

    }


}
