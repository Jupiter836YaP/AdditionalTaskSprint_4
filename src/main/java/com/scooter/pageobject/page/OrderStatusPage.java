package com.scooter.pageobject.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderStatusPage extends BasePage {

    private final By orderNotFound = By.className("Track_NotFound__6oaoY");

    public OrderStatusPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOrderNotFoundImageDisplayed() {
        return driver.findElement(orderNotFound).isDisplayed();
    }

}
