package Tests;

import com.scooter.pageobject.page.MainPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    protected WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.get(MainPage.URL);

        setCookie(new Cookie("Cartoshka", "true"));
        setCookie(new Cookie("Cartoshka-legacy", "true"));
    }

    private void setCookie(Cookie cookie) {
        driver.manage().addCookie((cookie));
        driver.navigate().refresh();
    }

    @After
    public void tearDown() {
        driver.quit();
    }


//        @Before
//    public void setUp() {
//        String browser = System.getenv("BROWSER");
//        driver = getDriver(browser == null ? "chrome" : browser);
//        driver.get(MainPage.URL);
//
//        setCookie(new Cookie("Cartoshka", "true"));
//        setCookie(new Cookie("Cartoshka-legacy", "true"));
//    }
//
//
//
//    private WebDriver getDriver(String browser){
//
//        switch (browser.toLowerCase()) {
//            case "chrome":
//                WebDriverManager.chromedriver().setup();
//                return new ChromeDriver();
//            case "yandex":
//                System.setProperty("webdriver.chrome.driver", "src/test/resources/yandexdriver");
//                return new ChromeDriver();
//            default:
//                throw new IllegalArgumentException("Unsupported browser");
//
//        }
//    }
}
