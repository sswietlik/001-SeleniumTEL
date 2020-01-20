import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    WebDriver driver;  //wyrzucam Webdirver driver do ciała całej klasy

    @BeforeEach
    public void driverSetup(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(480, 640));
    }

    @AfterEach
    public void driverQuit(){
        driver.quit();
    }

    @Test
    public void getMethod(){
        driver.get("https://wp.pl");
    }

    @Test
    public void navigate(){
        driver.navigate().to("https://google.pl"); //Metoda navigate korzysta z metody get
        driver.navigate().to("https://amazon.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }


    }

