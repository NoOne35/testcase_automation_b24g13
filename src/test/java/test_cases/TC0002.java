package test_cases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TC0002 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

    String url = "http://practice.cybertekschool.com/forgot_password";
        driver.get(url);


    String actualUsername = "helpdesk25@cybertekschool.com";
    WebElement emailButton= driver.findElement(By.name("email"));
        emailButton.sendKeys(actualUsername);
        System.out.println("entered email");
    String loginButton = "form_submit";
        driver.findElement(By.id(loginButton)).click();
        System.out.println("clicked login button");

    String expectedURL = "http://practice.cybertekschool.com/email_sent";
    String actualURL = driver.getCurrentUrl();

    if (expectedURL.equals(actualURL)){
        System.out.println("Displayed on Screen: Your e-mail's been sent!");
    } else {
        System.out.println("Fail - home page link does not match expected link");
    }
}
}


