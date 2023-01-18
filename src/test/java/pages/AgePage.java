package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AgePage {
    By radioUnderEighteen = By.cssSelector("input[value='18']");
    By submitBtn = By.cssSelector("input[type='submit']");

    private final WebDriver driver;

    public AgePage(WebDriver driver) {
        this.driver = driver;
    }



}
