import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class SaforaContactTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://safora.se/en/contact.html");

        driver.findElement(
                By.cssSelector("input[placeholder='Your Name']")
        ).sendKeys("Chira Lava");

        driver.findElement(
                By.cssSelector("input[type='email']")
        ).sendKeys("chira.lava@test.com");

        driver.findElement(
                By.cssSelector("input[placeholder='Phone Number']")
        ).sendKeys("0771234567");

        driver.findElement(
                By.tagName("textarea")
        ).sendKeys("Our company is exploring workplace safety solutions.");

        // Complete CAPTCHA manually
        Thread.sleep(15000);

        // Scroll to button
        ((JavascriptExecutor) driver)
                .executeScript("window.scrollBy(0,500)");

        Thread.sleep(2000);

        // Click Send Message
        driver.findElement(
                By.xpath("//button[contains(text(),'Send Message')]")
        ).click();

        Thread.sleep(5000);

        driver.quit();
    }
}