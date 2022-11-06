package pom;
import static org.openqa.selenium.By.id;
import main.BrowserRule;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public class MainPage  {
    private BrowserRule browserRule = new BrowserRule();
    public  MainPage(WebDriver driver) {this.browserRule.driver = driver;}
    private final By howMuch = id("accordion__panel-0"); //Сколько это стоит? И как оплатить?
    private final By severalScooter = id("accordion__panel-1"); //Хочу сразу несколько самокатов! Так можно?
    private final By rentalTime = id("accordion__panel-2"); //Как рассчитывается время аренды?
    private final By orderToday = id("accordion__panel-3"); //Можно ли заказать самокат прямо на сегодня?
    private final By extendOrder = id("accordion__panel-4"); //Можно ли продлить заказ или вернуть самокат раньше?
    private final By bringCharger = id("accordion__panel-5"); //Вы привозите зарядку вместе с самокатом?
    private final By cancelOrder = id("accordion__panel-6"); //Можно ли отменить заказ?
    private final By liveMKAD = id("accordion__panel-7"); //Я живу за МКАДом, привезёте?
    private final By howMucButton = id("accordion__heading-0");//клик Сколько это стоит? И как оплатить?
    private final By severalScooterButton = id("accordion__heading-1");//клик Хочу сразу несколько самокатов! Так можно
    private final By rentalTimeButton = id("accordion__heading-2");//клик Как рассчитывается время аренды?
    private final By orderTodayButton = id("accordion__heading-3");//клик Можно ли заказать самокат прямо на сегодня?
    private final By extendOrderButton = id("accordion__heading-4");//клик Можно ли продлить заказ или вернуть самокат раньше?
    private final By bringChargerButton = id("accordion__heading-5");//клик Вы привозите зарядку вместе с самокатом?
    private final By cancelOrderButton = id("accordion__heading-6");//клик Можно ли отменить заказ?
    private final By liveMKADButton = id("accordion__heading-7");//клик Я живу за МКАДом, привезёте?

    public String  howMuchClick() { // Получить текст с "Сколько это стоит? И как оплатить?"
        browserRule.driver.findElement(howMucButton).click();
        browserRule.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String text = browserRule.driver.findElement(howMuch).getText();
        return text;
    }
    public String severalScooterClick() {  //Получить текст с "Хочу сразу несколько самокатов! Так можно?"
        browserRule.driver.findElement(severalScooterButton).click();
        browserRule.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String text = browserRule.driver.findElement(severalScooter).getText();
        return text;
    }
    public String rentalTimeClick(){  //Получить текст с ", Как рассчитывается время аренды?"
        browserRule.driver.findElement(rentalTimeButton).click();
        browserRule.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String text = browserRule.driver.findElement(rentalTime).getText();
        return text;
    }
    public String orderTodayClick(){  //Получить текст с "Можно ли заказать самокат прямо на сегодня?"
        browserRule.driver.findElement(orderTodayButton).click();
        browserRule.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String text = browserRule.driver.findElement(orderToday).getText();
        return text;
    }
    public String extendOrderClick() {  //Получить текст с "Можно ли продлить заказ или вернуть самокат раньше?"
        browserRule.driver.findElement(extendOrderButton).click();
        browserRule.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String text = browserRule.driver.findElement(extendOrder).getText();
        return text;
    }
    public String bringChargerClick() {  //Получить текст с "Вы привозите зарядку вместе с самокатом?"
        browserRule.driver.findElement(bringChargerButton).click();
        browserRule.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String text = browserRule.driver.findElement(bringCharger).getText();
        return text;
    }
    public String cancelOrderClick(){  //Получить текст с "Можно ли отменить заказ?"
        browserRule.driver.findElement(cancelOrderButton).click();
        browserRule.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String text = browserRule.driver.findElement(cancelOrder).getText();
        return text;
    }
    public String liveMKADClick() {  //Получить текст с "Я живу за МКАДом, привезёте?"
        browserRule.driver.findElement(liveMKADButton).click();
        browserRule.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String text = browserRule.driver.findElement(liveMKAD).getText();
        return text;
    }
}