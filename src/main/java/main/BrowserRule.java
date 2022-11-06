package main;
import org.junit.rules.ExternalResource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.time.Duration;

public class BrowserRule extends ExternalResource {

    public WebDriver driver;

    @Override
    protected void before() throws Throwable {

        System.setProperty("chromedriver.exe", "C:\\WebDriver\bin");

        String browser = System.getenv("browser");

        if ("ff".equals(browser)) {
            driver = new FirefoxDriver();
        } else {
            driver = new ChromeDriver();
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Override
    protected void after() {
        driver.quit();
    }
}
