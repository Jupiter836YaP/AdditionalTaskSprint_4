package Tests;

import com.scooter.pageobject.fragment.HeaderFragment;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ReturnOnMainPageTest extends BaseTest {

    @Test
    public void returnOnMainPageTest() {
        String mainText = new HeaderFragment(driver)
                .clickButtonOrderFirst()
                .clickScooterLogo()
                .searchMainText();
        assertTrue("Текст не совпадает или отсутствует", mainText.contains("Привезём его прямо к вашей двери"));
    }

}
