import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends PageObject {

    @FindBy(id="menu-item-134")
    private WebElement submitButton;

    @FindBy(tagName = "h1")
    private WebElement header;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public boolean isInitialized() {
        return header.isDisplayed();
    }

    public ContactPage openContactPage() {
        submitButton.click();
        return new ContactPage(driver);
    }

}
