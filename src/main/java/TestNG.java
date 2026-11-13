import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNG {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        String url= driver.getCurrentUrl();
        System.out.println("Current URL: " + url);
        System.out.println("Page title: " + driver.getTitle());
        System.out.println("first code moved to git");
        driver.quit();
        
    }
}