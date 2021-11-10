package test_cases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TC0002 {

    public static void main(String[] args) {

        String url = "http://practice.cybertekschool.com/forgot_password";
        String actualUsername = "helpdesk25@cybertekschool.com";
        String loginButton = "form_submit";

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

        driver.findElement(By.name("email")).sendKeys(actualUsername);

        driver.findElement(By.id(loginButton)).click();

        String expectedURL = "http://practice.cybertekschool.com/email_sent";
        String actualURL = driver.getCurrentUrl();

        if (expectedURL.equals(actualURL)){
            System.out.println("Displayed on Screen: Your e-mail's been sent!");
        } else {
        System.out.println("FAIL: Home page link does not match expected link");

        }
}
}


