import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Header {
    private WebDriver driver;

    public Header( WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(id="searchInput")
    private WebElement recherche;

    @FindBy(id="searchButton")
    private WebElement chercher;


    public DestinationPage RechercherDansHeader(String a){
        recherche.sendKeys(a);
        chercher.click();
        return new DestinationPage(driver);
    }


}
