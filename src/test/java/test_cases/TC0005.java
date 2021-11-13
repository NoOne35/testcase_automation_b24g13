package test_cases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class TC0005 {
    public static void main(String[] args) throws InterruptedException {

        String url = "https://qa2.vytrack.com/user/login";
        String userName = "salesmanager137";
        String passWord = "UserUser123";

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

        driver.findElement(By.id("prependedInput")).sendKeys(userName);
        System.out.println("Entered username successfully");

        driver.findElement(By.id("prependedInput2")).sendKeys(passWord);
        System.out.println("Entered password successfully");

        driver.findElement(By.id("_submit")).click();

        Thread.sleep(2000);

        //driver.findElement(By.className("dropdown dropdown-level-1")).click();


        driver.findElement(By.xpath("//li[@class='dropdown dropdown-level-1']")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//span[text()='Vehicles']")).click();

        String expectedURL = "https://qa2.vytrack.com/entity/Extend_Entity_Carreservation";
        String actualURL = driver.getCurrentUrl();
        System.out.println("Got current URL");

        if (expectedURL.equals(actualURL)){
            System.out.println("PASS: Our test passed");
        } else {
            System.out.println("FAIL: Current link does not match expected link");
        }
    }




    }





