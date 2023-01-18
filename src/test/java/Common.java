import io.restassured.RestAssured;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.util.Properties;

public class Common {

    public Common() {
        Properties prop = new Properties();
        try {
            prop.load(getClass().getClassLoader().getResourceAsStream("config.properties"));

            RestAssured.baseURI = prop.getProperty("BASE_URL");
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }

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
