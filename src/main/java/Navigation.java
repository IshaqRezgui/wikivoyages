import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Navigation {

    public Navigation( WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    private WebDriver driver;


    @FindBy ( id = "n-mainpage")
    private WebElement mainPage;

    @FindBy ( id = "n-help")
    private WebElement help;



    public void goHomePage(){
        WebElement mainpage = mainPage.findElement(By.tagName("a"));
        mainpage.click();

    }

    public void helpPage() {
        WebElement aide = help.findElement(By.tagName("a"));
        aide.click();
    }

}
