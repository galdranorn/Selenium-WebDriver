import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		
		// Invoke Browser Driver .exe file
		System.setProperty("webdriver.chrome.driver", "D:\\PROGRAMOWANIE\\Kodilla\\Projekty\\Selenium\\chromedriver.exe");
		
		// Create driver object for Chrome (implements methods of WebDriver)
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/");
		
		driver.get("http://google.com");
		driver.navigate().back();
		
		driver.close(); // closes current browser
		driver.quit(); // closes all the browsers opened by selenium script
	}

}
