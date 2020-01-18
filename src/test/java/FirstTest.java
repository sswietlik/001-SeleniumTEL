import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    @Test
    //@Test - to adnotacja z JUnit mówiąca że3 metoda pod nią jest testem
    public void demoTest(){
        System.setProperty()


        // METODA o nazwie demoTest
        WebDriver driver = new ChromeDriver();      //Inicjacja WD tworzy chromedrivera - WD interfejs a CD klasa implementująca ten interface
                        // Teraz podpinamy w POM "selenium" / zależności
                        // Przechodzimy do POM a potem (Alt+Insert) lub ...
                        // CODE -> GENERATE -> DEPENDENCY TEMPLATE -> I dodajemy z MVNRepository
                        // Dorzucamy SeleniumJAVA, JUnit Jupiter,
    }
}
