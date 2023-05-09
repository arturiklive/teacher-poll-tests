package com.edurio.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageLoaded {
    public static boolean check(WebDriver driver, By element) throws InterruptedException {
        Thread.sleep(1000);
        WaitingUtils.waitUntilElem(driver, element, 20);
        WebElement isElementPresent = driver.findElement(element);
        return isElementPresent != null;
    }
}