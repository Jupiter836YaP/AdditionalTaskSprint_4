package com.scooter.pageobject.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YandexMainPage extends BasePage {
    private final By dzenLogo = By.xpath("//*[@id='dzen-header']/div[1]");

    public YandexMainPage(WebDriver driver) {
        super(driver);
    }

    public boolean searchDzenLogo() {
        return driver.findElement(dzenLogo).isDisplayed();
    }
}
