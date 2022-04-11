package orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class ChromeDriver {
    public static void main(String[] args) {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");//1- key, 2 -path
        WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
        //launch the url
        driver.get(baseUrl);
        //maximise the window
        driver.manage().window().maximize();
        // give implicit the time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
        //get the title
        String title = driver.getTitle();
        System.out.println(title);
        //get the current url
        System.out.println("Current URL = " + driver.getCurrentUrl());
        //find the email  field element
        WebElement emailField = driver.findElement(By.id("txtUsername"));
        emailField.sendKeys("Admin");
        //find the password field element
        WebElement passwordField = driver.findElement(By.name("txtPassword"));
        passwordField.sendKeys("admin123");
        //close the browser
        driver.close();
    }
}




