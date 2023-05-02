package mavenid.maven;

import java.io.File;

import javax.imageio.ImageIO;
import org.openqa.selenium.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class EntireScreenshot {

	@Test

	public void testGuru99TakeScreenShot() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/Users/macminir01/Documents/Automation/geckodriver");
		WebDriver driver = new FirefoxDriver();
		// goto url

		driver.get("https://www.altonadock.com/es/");
		int width = 2560;
		int height = 900;
		Dimension dm = new Dimension(width, height);
		driver.manage().window().setSize(dm);
		System.out.println(driver.manage().window().getSize());
		Thread.sleep(3000);

		// Screenshot code ////////////////

		Screenshot screenshot = new AShot().takeScreenshot(driver);

		screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);

		ImageIO.write(screenshot.getImage(), "jpg", new File(
				"/Users/macminir01/Documents/Automation/Mavenproject/local/qateamproject/Maven/maven/Screenshots/Homepage.jpg"));

	}

}