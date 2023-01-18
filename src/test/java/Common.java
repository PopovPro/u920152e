import io.restassured.RestAssured;

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
}
