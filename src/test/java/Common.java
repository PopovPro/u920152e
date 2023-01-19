import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Common {

    WebDriver webDriver;
    String baseUrl;

    @BeforeTest
    public void setUp() {
        // Создаем экземпляр WebDriver
        webDriver = new ChromeDriver();
        baseUrl = "http://u920152e.beget.tech";
    }

    @AfterTest
    public void tearDown() {
        // Закрываем браузер
        webDriver.quit();
    }
}
