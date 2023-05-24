import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ContactPageTest extends FunctionalTest{
    @Test
    @Tag("MyFirstTest")
    public void checkRadioButtons(){
        System.out.println("FirstTest");
        driver.get("http://selenium.webtesting.eu/");

        MainPage mainPage = new MainPage(driver);
        Assertions.assertTrue(mainPage.isInitialized());

        ContactPage contactPage = mainPage.openContactPage();
        Assertions.assertTrue(contactPage.isInitialized());
        Assertions.assertEquals("TESTSEITE-KONTAKTFORMULAR",contactPage.confirmationHeader());

        for (WebElement e: contactPage.radioButtons()) {
            if(e.getAttribute("value").equals("Business")){
                Assertions.assertTrue(e.isSelected());
            }
            if(e.getAttribute("value").equals("Private")){
                Assertions.assertFalse(e.isSelected());
            }
        }
    }
