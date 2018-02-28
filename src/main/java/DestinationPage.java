import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DestinationPage {

    private final WebDriver driver;

    public DestinationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        header = new Header(driver);

    }

    public Header header;

}
