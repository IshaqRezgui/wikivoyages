import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePage {


    public HomePage( WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        navigationPanel = new Navigation(driver);
        header = new Header(driver);
        destPage = new DestinationPage(driver);
    }
    DestinationPage destPage;
    Header header;
    Navigation navigationPanel;
    private WebDriver driver;


    @FindBy(id = "searchInput")
    private WebElement rech;

    @FindBy (id = "searchButton")
    private WebElement searchButton;



    public void rechAccueil(String destination){
        rech.sendKeys(destination);
        searchButton.click();

    }



}
