
/*
Write a selenium script to move tile3 to the position of tile2 on Sortable.html
*/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Question_1 {

    public static void main(String[] args) throws InterruptedException {
        

        System.setProperty("webdriver.gecko.driver", "E:\\Sem_3\\STQA\\Selenium_setup\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        // Open the local Sortable.html file
        driver.get("file:///E:/Sem_3/STQA/Testing%20sites/Sample/Sortable.html");
        driver.manage().window().maximize();

        // Locate tile 3 using By.name()
        WebElement dragme = driver.findElement(By.name("three"));

        // Create Actions class instance
        Actions builder = new Actions(driver);
        Thread.sleep(3000);
        // Move tile 3 by specified (x, y) offset to reach tile 2 position
        builder.dragAndDropBy(dragme, 110, 0).perform();

        System.out.println("Tile 3 moved using dragAndDropBy successfully!");

        Thread.sleep(3000);
        driver.quit();
    }
}

