package mavenid.maven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Accountcreationforallsites {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "/Users/macminir01/Documents/Automation/d/geckodriver1");

		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "null");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.redskins.fr/fr/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		driver.navigate().refresh();

		try {
			WebElement cookies = driver.findElement(By.id("axeptio_btn_acceptAll"));
			cookies.click();
		} catch (NoSuchElementException e) {
			// Element not found, handle the situation
			// Perform actions if the element is not present
			// or continue with the next part of your code
		}

		WebElement account = driver
				.findElement(By.partialLinkText("compte"));
		account.click();
		String email = "qa@store-and-supply.com";
		WebElement accountcreation = driver.findElement(By.xpath("//*[@id=\"email_create\"]"));
		accountcreation.sendKeys(email);

		try {
			WebElement button = driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]"));
			button.click();

			WebElement errorMessages = driver.findElement(By.id("create_account_error"));
			if (errorMessages.isDisplayed()) {
				Thread.sleep(7000);
				System.out.println("An error occurred: " + errorMessages.getText());
			}
		} catch (StaleElementReferenceException e) {
			System.out.println("StaleElementReferenceException occurred. Trying to re-fetch the element...");
			WebElement button = driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]"));
			button.click();

			WebElement errorMessages = driver.findElement(By.id("create_account_error"));
			if (errorMessages.isDisplayed()) {
				Thread.sleep(7000);
				System.out.println("An error occurred: " + errorMessages.getText());
			}
		}

		try {

			if (driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]")).isDisplayed()) {
				System.out.println("An error occurred: "
						+ driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]")).getText());
				Thread.sleep(3000);
			} else {
				System.out.println("Account creation started");
			}
		} catch (NoSuchElementException e) {
			System.out.println("Element not found. Unable to display error message.");
			System.exit(0); // Stop execution

		}
		WebElement prenom = driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]"));
		prenom.sendKeys("TEST");

		WebElement nom = driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]"));
		nom.sendKeys("NE PAS TRAITER");

		WebElement accountcreation1 = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		accountcreation1.clear();
		accountcreation1.sendKeys(email);

		WebElement pwd = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
		pwd.sendKeys("QA75017& ");

		WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"psgdpr-consent\"]"));
		checkbox.click();

		WebElement submit = driver.findElement(By.id("submitAccount"));
		submit.click();
		Thread.sleep(3000);
		System.out.println("Account created successfully!");

		try {

			if (driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]")).isDisplayed()) {
				Thread.sleep(7000);
			} else {
				System.out.println("An error occurred: "
						+ driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]")).getText());
			}
		} catch (NoSuchElementException e) {
			System.out.println("Element not found. Unable to display error message.");
			System.exit(0); // Stop execution

		}

	}

}
