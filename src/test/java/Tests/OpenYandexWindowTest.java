package Tests;

import com.scooter.pageobject.fragment.HeaderFragment;
import org.junit.Test;


import static org.junit.Assert.assertTrue;

public class OpenYandexWindowTest extends BaseTest {

    @Test
    public void returnOnMainPageTest() {
        boolean isLogoDzenDisplayed = new HeaderFragment(driver)
                .clickYandexLogo()
                .searchDzenLogo();
        assertTrue(isLogoDzenDisplayed);
    }

}