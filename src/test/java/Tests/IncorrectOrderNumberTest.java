package Tests;

import com.scooter.pageobject.fragment.HeaderFragment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class IncorrectOrderNumberTest extends BaseTest {
    private final String number;

    public IncorrectOrderNumberTest(String number) {
        this.number = number;
    }

    @Parameterized.Parameters
    public static Object[][] getNumberOrder() {
        return new Object[][]{
                {"12345"},
                {"54321"},
        };
    }

    @Test
    public void checkOrderStatusWithUnknownNumberShowsNotFoundImage() {
        boolean isImageDisplayed = new HeaderFragment(driver)
                .clickButtonOrderNumber()
                .provideOrderNumber(number)
                .clickButtonGo()
                .isOrderNotFoundImageDisplayed();

        assertTrue(isImageDisplayed);

    }
}


