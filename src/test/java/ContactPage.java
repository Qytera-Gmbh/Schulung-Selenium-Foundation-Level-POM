import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class ContactPage extends PageObject {

    @FindBy(xpath = "//h1[contains(text(),'Testseite-Kontaktformular')]")
    private WebElement header;

    @FindBys({@FindBy(name = "your-customer-type")})
    private List<WebElement> radioButtons;

    public ContactPage(WebDriver driver) {
        super(driver);
    }

    public boolean isInitialized() {
        return header.isDisplayed();
    }

    public String confirmationHeader() {
        return header.getText();
    }

    public List<WebElement> radioButtons() {
        return radioButtons;
    }
}
