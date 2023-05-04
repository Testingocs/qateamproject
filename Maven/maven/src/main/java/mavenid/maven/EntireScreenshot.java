package mavenid.maven;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class EntireScreenshot {

	@Test

	public void Pagescreenshots() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/Users/macminir01/Documents/Automation/d/geckodriver");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "null");
		WebDriver driver = new FirefoxDriver();
		// goto url

		driver.get("https://frnch.fr/fr/robes/3874-13179-robe-leona.html#/5-taille-s/12-couleur-orange");
		int width = 1920;
		int height = 800;
		Dimension dm = new Dimension(width, height);
		driver.manage().window().setSize(dm);
		System.out.println(driver.manage().window().getSize());
		Thread.sleep(3000);

		// Take a screenshot and save it as a file
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		// Specify the location where you want to save the screenshot file
		String screenshotFilePath = "/Users/macminir01/Documents/Automation/Mavenproject/local/qateamproject/Maven/maven/Screenshots/Homepage.jpg";

		try {
			// Copy the screenshot file to the specified location
			FileHandler.copy(screenshotFile, new File(screenshotFilePath));
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Screenshot code ////////////////

		/*
		 * Screenshot screenshot = new AShot().takeScreenshot(driver);
		 * 
		 * screenshot = new
		 * AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).
		 * takeScreenshot(driver);
		 * 
		 * ImageIO.write(screenshot.getImage(), "jpg", new File(
		 * "/Users/macminir01/Documents/Automation/Mavenproject/local/qateamproject/Maven/maven/Screenshots/Homepage.jpg"
		 * ));
		 */
	}

}