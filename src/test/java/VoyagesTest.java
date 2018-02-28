import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class VoyagesTest {

    WebDriver driver;

    @Before
    public void before() {
        driver = new ChromeDriver();
        driver.get("https://www.wikivoyage.org/");
        driver.manage().window().maximize();


    }

    @Test
    public void test1(){
        PagePrincipale pagePrin = new PagePrincipale (driver);
        pagePrin.rechPagePrin("Paris");


    }

    @Test
    public void testFr(){
        PagePrincipale pageFr = new PagePrincipale (driver);
        pageFr.ouvrePageFrançais();


    }
    @Test
    public void testEn() {
        PagePrincipale pageEn = new PagePrincipale(driver);
        pageEn.ouvrePageAnglais();
    }


    @Test
    public void testEs() {
        PagePrincipale pageEs = new PagePrincipale(driver);
        pageEs.ouvrePageEspagnol();
    }

    @Test
    public void testAccueil(){
        PagePrincipale pageFr = new PagePrincipale (driver);
        pageFr.ouvrePageFrançais();
        HomePage pageAccueil = new HomePage(driver);
        pageAccueil.rechAccueil("Rennes");
    }


    @Test
    public void testPanel(){
        PagePrincipale pagePrincipale = new PagePrincipale(driver);
        pagePrincipale.ouvrePageFrançais();
        HomePage hp = new HomePage(driver);
        hp.navigationPanel.goHomePage();

    }

    @Test

    public void testhelp(){
        PagePrincipale pagePrincipale = new PagePrincipale(driver);
        pagePrincipale.ouvrePageFrançais();
        HomePage hp = new HomePage(driver);
        hp.navigationPanel.helpPage();

    }

    @Test
    public void testheader(){
        PagePrincipale pagePrincipale = new PagePrincipale(driver);
        pagePrincipale.ouvrePageFrançais();
        HomePage hp = new HomePage(driver);
        hp.header.RechercherDansHeader("Paris");
    }

    @Test
    public void changerDestination(){
        PagePrincipale pagePrincipale = new PagePrincipale(driver);
        pagePrincipale.ouvrePageFrançais();
        HomePage hp = new HomePage(driver);
        hp.header.RechercherDansHeader("Paris")
                .header.RechercherDansHeader("Lyon")
                .header.RechercherDansHeader("Nantes");
    }


    @Test
    public void destHome(){

        PagePrincipale pagePrincipale = new PagePrincipale(driver);
        pagePrincipale.ouvrePageFrançais();
        HomePage hp = new HomePage(driver);
        hp.header.RechercherDansHeader("Paris");
        hp.navigationPanel.goHomePage();


    }


    @After
    public void after(){
        driver.quit();

    }
}
