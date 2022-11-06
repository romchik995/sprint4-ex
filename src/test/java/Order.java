import main.BrowserRule;
import org.junit.After;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import static org.junit.Assert.assertTrue;
import static org.openqa.selenium.By.cssSelector;
import pom.Form;
import java.util.concurrent.TimeUnit;

@RunWith(Parameterized.class)
public class Order {

    @Rule
    public BrowserRule browserRule = new BrowserRule();

    final By buttonAddress;
    final String name;
    final String family;
    final String address;
    final String numberPhone;
    final String comment;

    public Order(By buttonAddress, String name, String family, String address, String numberPhone, String comment) {
        this.buttonAddress = buttonAddress;
        this.name = name;
        this.family = family;
        this.address = address;
        this.numberPhone = numberPhone;
        this.comment = comment;
    }


    @Parameterized.Parameters
    public static Object[][] Parameters() {
        return new Object[][] {
                {cssSelector("div.Header_Nav__AGCXC > button.Button_Button__ra12g"), "Джонни", "Смитт", "Street, 1", "11259485759", "GO!"},
                {cssSelector("div.Home_RoadMap__2tal_ > div.Home_FinishButton__1_cWm > button"), "Тони", "Биг", "Street, 2", "11959885059", "AAA!"},
        };
    }

    @Test
    public void checkOrderFromHeader_success() {
        browserRule.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Form FormPage = new Form(browserRule.driver);
        FormPage.startPage();
        FormPage.findCheckAndClickOrderButton(buttonAddress);
        FormPage.userName(name);
        FormPage.userSurname(family);
        FormPage.userAddress(address);
        FormPage.userPhone(numberPhone);
        FormPage.metroStation();
        FormPage.metroStationChoice();
        FormPage.nextPageButton();
        FormPage.calendarDate();
        FormPage.rentalDuration();
        FormPage.scooterColour();
        FormPage.userComment(comment);
        FormPage.orderButton();
        FormPage.confirmButton();
        assertTrue("ERROR", FormPage.createdOrder());
    }

    @After
    public void closedBrowser() {
        browserRule.driver.quit();
    }
}
