package orangehrmlive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTest {
    static String browser = "Chrome";
    static String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        //use if-condition
        if (browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
            driver = new ChromeDriver();
            driver.get(baseUrl);
            driver.close();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            System.setProperty("webdriver.gecko.driver", "Drivers/firefoxgeckodriver.exe");
            driver = new FirefoxDriver();
            driver.get(baseUrl);
            driver.close();
        } else if (browser.equalsIgnoreCase("Edge")) {
            System.setProperty("webdriver.edge.driver", "Drivers/msedgedriver.exe");
            driver = new EdgeDriver();
            driver.get(baseUrl);
            driver.close();
        } else {
            System.out.println("Wrong Browser Name");
        }
        //launch the url,maximise the window,implicit the time
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

}

