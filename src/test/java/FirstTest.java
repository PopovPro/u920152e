
import org.testng.annotations.Test;
import pages.AuthorizationPage;
import static org.testng.AssertJUnit.*;

public class FirstTest extends Common{

    @Test
    public void checkEmailRequired() throws Exception {
        webDriver.get(baseUrl);
        AuthorizationPage authorizationPage = new AuthorizationPage(webDriver);

        assertTrue(authorizationPage.isEmailRequired());
    }

    @Test
    public void checkPasswordRequired() throws Exception {
        webDriver.get(baseUrl);
        AuthorizationPage authorizationPage = new AuthorizationPage(webDriver);

        assertTrue(authorizationPage.isPasswordRequired());
    }
}
