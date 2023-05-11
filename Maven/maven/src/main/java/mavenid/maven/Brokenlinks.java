package mavenid.maven;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Brokenlinks {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/macminir01/Documents/Automation/d/geckodriver");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "null");
		WebDriver driver = new FirefoxDriver();
		// Navigate to the web page you want to check
		driver.get("https://www.ccvmode.com/");

		// Find all the links on the page using the <a> tag
		List<WebElement> links = driver.findElements(By.tagName("a"));

		// Loop through each link and check if it's broken
		for (WebElement link : links) {
			String href = link.getAttribute("href");
			if (href != null && !href.isEmpty()) {
				// Create a HTTP connection to the link URL
				try {
					HttpURLConnection connection = (HttpURLConnection) new URL(href).openConnection();
					connection.setRequestMethod("HEAD");

					// Check the response code to see if the link is broken
					int responseCode = connection.getResponseCode();
					if (responseCode != 200) {
						System.out.println("Broken link found: " + href + " (response code " + responseCode + ")");
					}

					connection.disconnect();
				} catch (Exception e) {
					System.out.println("Broken link found: " + href + " (" + e.getMessage() + ")");
				}
			}
		}

		driver.quit();
	}
}
