import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PagePrincipale {

    public PagePrincipale( WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    private WebDriver driver;
   // private String rech;

    @FindBy (id= "searchInput")
    private WebElement search;

    @FindBy (id = "searchButton")
    private WebElement searchButton;

    @FindBy (xpath = "//*[@id=\'www-wikivoyage-org\']/div[2]/div[5]/a")
    private WebElement fr;

    @FindBy (xpath = "//*[@id=\'www-wikivoyage-org\']/div[2]/div[2]/a")
    private WebElement en;

    @FindBy (xpath = "//*[@id=\'www-wikivoyage-org\']/div[2]/div[4]/a")
    private WebElement es;

    public void ouvrePageFrançais(){
        fr.click();
        WebDriverWait wait = new WebDriverWait(driver, 5);

    }

    public void ouvrePageAnglais(){
        en.click();
        WebDriverWait wait = new WebDriverWait(driver, 5);

    }


    public void ouvrePageEspagnol(){
        es.click();
        WebDriverWait wait = new WebDriverWait(driver, 5);

    }


    public void rechPagePrin(String rech){

        search.sendKeys(rech);
        searchButton.click();
    }

}
