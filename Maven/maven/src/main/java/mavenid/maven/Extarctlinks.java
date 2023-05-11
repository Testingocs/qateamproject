package mavenid.maven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Extarctlinks {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/macminir01/Documents/Automation/d/geckodriver");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "null");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.ccvmode.com/");
		driver.manage().window().maximize();
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		for (WebElement link : allLinks) {
			System.out.println(link.getAttribute("href"));
		}
		driver.quit();
	}

}
