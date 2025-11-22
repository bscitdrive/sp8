
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class Question_6 {

	public static void main(String[] args) throws InterruptedException {
		
		 // Set path to geckodriver
        System.setProperty("webdriver.gecko.driver", "E:\\Sem_3\\STQA\\Selenium_setup\\geckodriver.exe");
        
        // Launch Firefox browser
        WebDriver driver = new FirefoxDriver();
        System.out.println("Firefox browser launched successfully.");
        
        // Open the DemoQA Droppable page
        driver.get("https://demoqa.com/droppable/");
        System.out.println("Navigated to DemoQA Droppable page.");
        
        // Wait for elements to load
        Thread.sleep(3000);
        
        // Locate the draggable element (source)
        WebElement dragMe = driver.findElement(By.xpath("//*[@id='draggable']"));
        System.out.println("Located the draggable element.");
        
        // Locate the droppable area (target)
        WebElement dropHere = driver.findElement(By.xpath("//*[@id='droppable']"));
        System.out.println("Located the droppable area.");
        
        // Create Actions class instance
        Actions builder = new Actions(driver);
        System.out.println("Actions class initialized.");
        
        // Perform drag and drop
        builder.dragAndDrop(dragMe, dropHere).perform();
        System.out.println("Drag and Drop action performed successfully!");
        
        // Wait to observe the result
        Thread.sleep(3000);
        
        // Close the browser
        driver.quit();
        System.out.println("Browser closed. Test completed successfully.");

	}

}
