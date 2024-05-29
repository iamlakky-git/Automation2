package TestBase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setUp {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

//driver.findElement(By.id("email")).sendKeys("laxman24@gmail.com");


        driver.findElement(By.xpath("//input[@id='email' and @name = 'email']")).sendKeys("laxman24@gail.com");
        driver.findElement(By.xpath("//input[@id='pass' and @name = 'pass']")).sendKeys("laxman");
        Thread.sleep(2000);
        driver.findElement(By.name("login")).click();

    }
}
