package Tests;

import com.scooter.pageobject.fragment.HeaderFragment;
import com.scooter.pageobject.page.RegisterOrderPageFirst;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class CheckErrorsFieldsOrderFormTest extends BaseTest {
    private final String errorAddress = "qqq";


    @Test
    public void checkErrorsTest() {
        String errorCodeName = new HeaderFragment(driver)
                .clickButtonOrderSecond()
                .inputErrorAddress(errorAddress)
                .clickButtonNext()
                .searchNameErrorMessage();
        String errorCodeSurname = new RegisterOrderPageFirst(driver)
                .searchSurnameErrorMessage();
        String errorCodeAddress = new RegisterOrderPageFirst(driver)
                .searchAddressErrorMessage();
        String errorCodePhone = new RegisterOrderPageFirst(driver)
                .searchPhoneErrorMessage();
        String errorCodeStation = new RegisterOrderPageFirst(driver)
                .searchStationErrorMessage();
        assertTrue("Текст не совпадает или отсутствует", errorCodeName.contains("Введите корректное имя"));
        assertTrue("Текст не совпадает или отсутствует", errorCodeSurname.contains("Введите корректную фамилию"));
        assertTrue("Текст не совпадает или отсутствует", errorCodeAddress.contains("Введите корректный адрес"));
        assertTrue("Текст не совпадает или отсутствует", errorCodeStation.contains("Выберите станцию"));
        assertTrue("Текст не совпадает или отсутствует", errorCodePhone.contains("Введите корректный номер"));


    }
}
