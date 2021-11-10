package test_cases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC0004 {

        public static void main(String[] args) {

            String actualUsername = "helpdesk27@cybertekschool.com";
            String actualPassword = "UserUser";
            String url = "https://login2.nextbasecrm.com/auth/?backurl=%2Fstream%2F";
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(url);

            driver.findElement(By.name("USER_LOGIN")).sendKeys(actualUsername);

            driver.findElement(By.name("USER_PASSWORD")).sendKeys(actualPassword);

            String loginButton = "form_submit";
            driver.findElement(By.className("login-btn")).click();

            String expectedURL = "https://login2.nextbasecrm.com/stream/";
            String actualURL = driver.getCurrentUrl();

            if (expectedURL.equals(actualURL)){
                System.out.println("PASS: We are on the Activity Stream page!");
            } else {
                System.out.println("FAIL: Activity Stream page link does not match expected link");
            }
        }
    }



