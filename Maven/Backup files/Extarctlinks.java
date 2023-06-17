package mavenid.maven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Extarctlinks {
	public static void main(String[] args) {
		String Homepage = "https://www.ccvmode.com/";
		//String Listing = "https://www.ccvmode.com/229-nouveautes-homme";
		//String detailpage = "https://www.ccvmode.com/mules/117418-birkenstock-mules-boston-fermees-noires-en-cuir-a-talon-plat-et-boucle-a-ardillon.html#/11-couleurs-noir/22-taille-39";

		String[] objc1 = { Homepage};

		for (String i : objc1) {
			System.setProperty("webdriver.gecko.driver", "/Users/macminir01/Documents/Automation/d/geckodriver");
			System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "null");

			WebDriver driver = new FirefoxDriver();
			driver.get(i);
			System.out.println(
					"-------------------------------------------" + i + "-------------------------------------------");

			driver.manage().window().maximize();
			List<WebElement> allLinks = driver.findElements(By.tagName("a"));
			for (WebElement link : allLinks) {
				System.out.println(link.getAttribute("href"));

			}
			System.out.println(
					"--------------------------------------------------------------------------------------------");

			driver.quit();
		}

	}
}