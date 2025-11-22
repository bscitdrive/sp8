package shariq_85_prac8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Question_3 {

    public static void main(String[] args) throws InterruptedException {
        

        System.setProperty("webdriver.gecko.driver", "E:\\Sem_3\\STQA\\Selenium_setup\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        // Open local Selectable.html file
        driver.get("file:///E:/Sem_3/STQA/Testing%20sites/Sample/Selectable.html");

        // Create Actions instance
        Actions action = new Actions(driver);
        Thread.sleep(1000);
        // Move to approximate coordinates where tile 3 is located and click it
        // (Offsets are relative to the top-left corner of the page)
        action.moveByOffset(250, 50).click().perform();
        System.out.println("Tile 3 selected using moveByOffset().");

        Thread.sleep(1000);

        // Locate tile 11 using By.name() and click it directly
        WebElement tile11 = driver.findElement(By.name("eleven"));
        tile11.click();
        System.out.println("Tile 11 selected using WebElement click().");

        Thread.sleep(2000);
        driver.quit();
    }
}
