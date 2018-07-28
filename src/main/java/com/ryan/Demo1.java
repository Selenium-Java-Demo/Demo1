package com.ryan;

import com.ryan.driver.CustomDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Demo1 {

    public static void main(String[] args) {
        WebDriver driver = CustomDriver.getDriver();
        driver.get("http://www.cnblogs.com/ryan255/");
        System.out.println(driver.getTitle());

        try {
            WebElement button = driver.findElement(By.cssSelector("#blog_nav_admin"));
            button.click();
            WebElement input1 = driver.findElement(By.cssSelector("#input1"));
            input1.clear();
            input1.sendKeys("ryan255");
            Thread.sleep(5000);
            CustomDriver.quit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
