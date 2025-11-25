/*
Write a selenium script to select tile 1, tile 5, tile 11 on Selectable.html
*/
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Question_2 {

    public static void main(String[] args) throws InterruptedException {
       

        System.setProperty("webdriver.gecko.driver", "E:\\Sem_3\\STQA\\Selenium_setup\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        // Open local Selectable.html file
        driver.get("file:///E:/Sem_3/STQA/Testing%20sites/Sample/Selectable.html");
        driver.manage().window().maximize();

        // Locate tile 1, 5, and 11 using their 'name' attributes
        WebElement tile1 = driver.findElement(By.name("one"));
        WebElement tile5 = driver.findElement(By.name("five"));
        WebElement tile11 = driver.findElement(By.name("eleven"));

        // Create Actions instance
        Actions action = new Actions(driver);

        // Hold down CTRL key
        action.keyDown(Keys.CONTROL).perform();
        Thread.sleep(500);

        // Click on tile 1
        action.click(tile1).perform();
        Thread.sleep(500);

        // Click on tile 5
        action.click(tile5).perform();
        Thread.sleep(500);

        // Click on tile 11
        action.click(tile11).perform();
        Thread.sleep(500);
        System.out.println("Tiles 1, 5, and 11 selected successfully!");

        Thread.sleep(2000);
        driver.quit();
    }
}

