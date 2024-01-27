package com.scooter.pageobject.page;

import com.scooter.pageobject.fragment.HeaderFragment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class RegisterOrderPageFirst extends BasePage {

    private final By nameErrorMessage = By.xpath(".//div[text()='Введите корректное имя']");
    private final By surnameErrorMessage = By.xpath(".//div[text()='Введите корректную фамилию']");
     private final By addressErrorMessage = By.xpath(".//div[text()='Введите корректный адрес']");
    private final By stationErrorMessage = By.xpath(".//div[text()='Выберите станцию']");
    private final By phoneErrorMessage = By.xpath(".//div[text()='Введите корректный номер']");
    private final By buttonNext = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    private final By inputAddress = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");




    public RegisterOrderPageFirst(WebDriver driver) {
        super(driver);
    }





    public String searchNameErrorMessage() {
        WebElement element = driver.findElement(nameErrorMessage);
        return element.getText();
    }


    public String searchSurnameErrorMessage() {
        WebElement element = driver.findElement(surnameErrorMessage);
        return element.getText();
    }


    public RegisterOrderPageFirst inputErrorAddress(String errorAddress) {
        driver.findElement(inputAddress).click();
        driver.findElement(inputAddress).sendKeys(errorAddress);
        return this;
    }

    public String searchAddressErrorMessage() {
        WebElement element = driver.findElement(addressErrorMessage);
        return element.getText();
    }


    public String searchPhoneErrorMessage() {
        WebElement element = driver.findElement(phoneErrorMessage);
        return element.getText();
    }

    public String searchStationErrorMessage() {
        WebElement element = driver.findElement(stationErrorMessage);
        return element.getText();
    }

    public RegisterOrderPageFirst clickButtonNext() {
        driver.findElement(buttonNext).click();
        return this;
    }

}
