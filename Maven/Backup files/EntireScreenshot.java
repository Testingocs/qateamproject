package mavenid.maven;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class EntireScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		String homepage = "https://www.ccvmode.com/";
		String listing = "https://www.ccvmode.com/229-nouveautes-homme";
		String detailPage = "https://www.ccvmode.com/mules/117418-birkenstock-mules-boston-fermees-noires-en-cuir-a-talon-plat-et-boucle-a-ardillon.html#/11-couleurs-noir/22-taille-39";

		String[] urls = { homepage, listing, detailPage };

		for (String url : urls) {
			System.setProperty("webdriver.gecko.driver", "/Users/macminir01/Documents/Automation/d/geckodriver");
			System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "null");
			WebDriver driver = new FirefoxDriver();

			// Go to the URL
			driver.get(url);
			int width = 2560;
			int height = 2000;
			Dimension dm = new Dimension(width, height);
			driver.manage().window().setSize(dm);
			System.out.println(driver.manage().window().getSize());
			System.out.println("Screenshots saved");

			Thread.sleep(4000);

			// Take a screenshot and save it as a file
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			// Specify the location where you want to save the screenshot file
			String dynamicPart = getDynamicPartFromUrl(url); // Extract dynamic part from URL
			String screenshotFilePath = "/Users/macminir01/Documents/Automation/Mavenproject/local/qateamproject/Maven/maven/Screenshots/"
					+ dynamicPart + ".jpg";

			try {
				// Copy the screenshot file to the specified location
				FileHandler.copy(screenshotFile, new File(screenshotFilePath));
			} catch (IOException e) {
				e.printStackTrace();
			}

			driver.quit();
		}
	}

	// Helper method to extract the dynamic part from the URL
	private static String getDynamicPartFromUrl(String url) {
		String dynamicPart = url.replaceAll("[^a-zA-Z0-9-_\\.]", "_");
		return dynamicPart.substring(dynamicPart.lastIndexOf("/") + 1);
	}
}
