package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AuthorizationPage {
    By emailField = By.cssSelector("input[name='auth_email']");
    By passField = By.cssSelector("input[name='auth_pass']");
    By loginBtn = By.cssSelector("button[name='form_auth_submit']");

    private final WebDriver driver;

    public AuthorizationPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isAttributePresent(WebElement element, String attribute) {
        boolean result = false;
        try {
            String value = element.getAttribute(attribute);
            if (value != null){
                result = true;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return result;
    }

    public boolean isEmailRequired(){
        return isAttributePresent(driver.findElement(emailField), "required");
    }

    public boolean isPasswordRequired(){
        return isAttributePresent(driver.findElement(passField), "required");
    }
}
