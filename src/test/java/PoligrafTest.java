import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PoligrafTest extends Base{


    @Test //finished
    public void testLogo() {
       // final String expectedLogoText = "Internet Brands";
        getDriver().get("http://poligraf-centr.ru");
        WebElement logo = getDriver().findElement(By.className("logo"));
        Assert.assertTrue(logo.isDisplayed());
    }




        @Test
        public void testLoginError() {

            getDriver().get("http://poligraf-centr.ru");
            WebElement username=getDriver().findElement(By.id("user_email_login"));
            WebElement password=getDriver().findElement(By.id("user_password"));
            WebElement login=getDriver().findElement(By.name("commit"));

            username.sendKeys("abc@gmail.com");
            password.sendKeys(("your_password"));
            login.click();

            WebElement error= getDriver().findElement(By.className("bs-alert-text"));



            Assert.assertEquals(error.getText(),"There have been several failed attempts to sign in from this account. Please wait a while and try again later.");
        }

        @Test
        public void testNewPassword(){

            getDriver().get("https://www.browserstack.com/users/sign_in");
            WebElement link=getDriver().findElement(By.linkText("Forgot password?"));

            link.click();

            Assert.assertEquals(getDriver().getCurrentUrl(),"https://www.browserstack.com/users/password/new");

        }




    }


