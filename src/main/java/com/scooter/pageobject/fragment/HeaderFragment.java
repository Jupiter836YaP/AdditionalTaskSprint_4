package com.scooter.pageobject.fragment;

import com.scooter.pageobject.page.BasePage;
import com.scooter.pageobject.page.OrderStatusPage;
import com.scooter.pageobject.page.RegisterOrderPageFirst;
import com.scooter.pageobject.page.YandexMainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Set;

public class HeaderFragment extends BasePage {
    private final By scooterLogo = By.className("Header_LogoScooter__3lsAR");
    private final By buttonOrder = By.className("Button_Button__ra12g");
    private final By homeHeader = By.className("Home_Header__iJKdX");
    private final By yandexLogo = By.xpath("//*[@id='root']/div/div/div[1]/div[1]/a[1]");
    private final By buttonOrderNumber = By.className("Header_Link__1TAG7");
    private final By inputOrderNumber = By.xpath("//*[@id='root']/div/div/div[1]/div[3]/div/input");
    private final By buttonGo = By.xpath("//*[@id='root']/div/div/div[1]/div[3]/button");



    public HeaderFragment(WebDriver driver) {
        super(driver);
    }

    public HeaderFragment clickButtonOrderFirst() {
        driver.findElement(buttonOrder).click();
        return this;
    }

    public RegisterOrderPageFirst clickButtonOrderSecond() {
        driver.findElement(buttonOrder).click();
        return new RegisterOrderPageFirst(driver);
    }

    public HeaderFragment clickScooterLogo() {
        driver.findElement(scooterLogo).click();
        return this;
    }

    public String searchMainText() {
        WebElement element = driver.findElement(homeHeader);
        return element.getText();
    }

    public YandexMainPage clickYandexLogo() {
        String currentWindow = driver.getWindowHandle();
        driver.findElement(yandexLogo).click();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String window : windowHandles) {
            if (!window.equals(currentWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }
        return new YandexMainPage(driver);
    }

    public HeaderFragment clickButtonOrderNumber() {
        driver.findElement(buttonOrderNumber).click();
        return this;
    }

    public HeaderFragment provideOrderNumber(String orderNumber) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(inputOrderNumber)).sendKeys(orderNumber);
        return this;
    }

    public OrderStatusPage clickButtonGo() {
        driver.findElement(buttonGo).click();
        return new OrderStatusPage(driver);
    }


}
