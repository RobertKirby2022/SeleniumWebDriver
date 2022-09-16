package test;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestSelenium
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","C:/Program Files/JetBrains/IntelliJ IDEA Community Edition 2022.1.1/lib/chromedriver.exe");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        WebDriver driver = new ChromeDriver(chromeOptions);

        try
        {
            // Navigate to Url
            driver.get("https://bobbykirby.com");

            // Click to open the Contact Me page
            WebElement contact = driver.findElement(By.linkText("here"));
            contact.click();
            // Print the page title
            System.out.println("Page title after link click : " +   driver.getTitle());

            // Send a message on the Contact Me page
            // Get the WebElement of the fields and submit text data to test
            WebElement yourName = driver.findElement(By.name("your-name"));
            yourName.sendKeys("Bobby Kirby Tester");
            WebElement yourEmail = driver.findElement(By.name("your-email"));
            yourEmail.sendKeys("bobbykirby@gmail.com");
            WebElement yourSubject = driver.findElement(By.name("your-subject"));
            yourSubject.sendKeys("Selenium Test Email");
            WebElement yourMessage = driver.findElement(By.name("your-message"));
            yourMessage.sendKeys("This is a test email of bobbykirby.com's Contact Me page." +
                    "This message was sent using the Selenium WebDriver");

            // Find the Submit button and click it to send the message
            WebElement submitButton = driver.findElement(By.cssSelector("input[value='Submit']"));
            submitButton.click();

            // Return to homepage
            driver.navigate().back();

            // Click to open the GitHub page
            WebElement github = driver.findElement(By.linkText("GitHub"));
            github.click();
            // Print the page title
            System.out.println("Page title after link click : " +   driver.getTitle());
            // Return to homepage
            driver.navigate().back();

            // Click to open the LinkedIn page
            WebElement linkedin = driver.findElement(By.linkText("LinkedIn"));
            linkedin.click();
            // Print the page title
            System.out.println("Page title after link click : " +   driver.getTitle());
            // Return to homepage
            driver.navigate().back();

            //Print the homepage title.
            System.out.println("Page title after link click : " +   driver.getTitle());


        } finally
        {
            driver.quit();
        }
    }
}
