
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class Question_5 {

	public static void main(String[] args) throws InterruptedException {
	
		 // Set path to geckodriver
        System.setProperty("webdriver.gecko.driver", "E:\\Sem_3\\STQA\\Selenium_setup\\geckodriver.exe");
        
        // Launch Firefox browser
        WebDriver driver = new FirefoxDriver();
        
        // Open Guru99 drag and drop demo page
        driver.get("http://demo.guru99.com/test/drag_drop.html");
        
        // Wait for page to load
        Thread.sleep(2000);
        // Locate the BANK element (to drag)
        WebElement bankElement = driver.findElement(By.xpath("//*[@id='credit2']/a"));
        System.out.println("Located the BANK element.");
        
        // Locate the ACCOUNT section under DEBIT SIDE (drop target)
        WebElement debitAccountSection = driver.findElement(By.xpath("//*[@id='bank']/li"));
        System.out.println("Located the Debit Side ACCOUNT section.");
        
        // Create Actions object
        Actions builder = new Actions(driver);
        System.out.println("Actions class initialized.");
        
        // Perform drag and drop
        builder.dragAndDrop(bankElement, debitAccountSection).perform();
        System.out.println("BANK element dragged and dropped into Debit Side ACCOUNT section successfully!");
        
        // Wait a few seconds to observe the result
        Thread.sleep(3000);
        
        // Close the browser
        driver.quit();
        System.out.println("Browser closed. Test completed successfully.");
	}

}
