package mavenid.maven;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.time.format.DateTimeFormatter;

public class Everymonthdashboard {
	private static final Logger logger = LogManager.getLogger(Everymonthdashboard.class);

	public static void main(String[] args) throws InterruptedException, IOException, MessagingException {
		LocalDate yesterday = LocalDate.now().minusDays(1);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String date = yesterday.format(formatter);

		System.setProperty("webdriver.gecko.driver", "/Users/macminir01/Documents/Automation/d/geckodriver1");

		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "null");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://app.store-and-supply.com");
		driver.manage().window().maximize();

		WebElement user = driver.findElement(By.xpath("//*[@id=\"form-submit\"]/div[1]/input"));
		user.sendKeys("admin");

		WebElement pwd = driver.findElement(By.xpath("//*[@id=\"form-submit\"]/div[2]/input"));
		pwd.sendKeys("admin@sas");

		WebElement submit = driver.findElement(By.xpath("//*[@id=\"frmLoginbutton\"]"));
		submit.click();

		WebElement Datepicker = driver.findElement(By.id("datepickerExpand"));
		Datepicker.click();

		// Find the start date input element
		WebElement dateInputStart = driver.findElement(By.cssSelector(".date-input#date-start"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].removeAttribute('readonly')", dateInputStart);
		dateInputStart.clear();
		String startDate = "01/01/2023";
		dateInputStart.sendKeys(startDate);
		System.out.println(startDate);

		// Find the end date input element
		WebElement dateInputEnd = driver.findElement(By.cssSelector(".date-input#date-end"));
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].removeAttribute('readonly')", dateInputEnd);
		dateInputEnd.clear();
		String endDate = "31/01/2023";
		dateInputEnd.sendKeys(endDate);
		System.out.println(endDate);

		WebElement apply = driver.findElement(By.xpath("//*[@id=\"applyDetailsBtn\"]"));
		apply.click();

		for (int i = 1; i <= 3; i++) {
			String[] Sites = { "seidensticker", "gabor", "gentlemanfarmer", "ccvmode", "mephisto", "mephistode",
					"redskins", "rivaldi", "cadolle", "gerardpasquier", "leecooper", "stanbridge", "mktstudio",
					"hexagona", "ek", "redskinsbtob", "rieker", "atelier", "altonadock", "frnch", "mustang",
					"thebaggingco", "lasquadraparis", "marclebihan", "bendorff", "peterandmay", "lacity", "mim",
					"charleslegolf", "mephistoes", "redwood", "electricridesonly", "monsieurmax", "parallele",
					"mktstudioes", "thekorner", "lamarthe", "thebaggingcode", "cimarronjeans", "hechterlingerie",
					"pilimpich", "maisonpourchet", "francinel", "emiaparis" };

			for (String site : Sites) {

				String xpathExpression = String
						.format("/html/body/section/div/div[3]/div/div/div/table/tbody/tr[%d]/td[3]", i);
				WebElement element = driver.findElement(By.xpath(xpathExpression));
				String OCA = element.getText();
				System.out.println("------------ Report for 1 month : ");
				logger.error("-------------------Report for 1 month  :" + "--------------------------------------");

				System.out.println("Outer value of " + site + ": " + OCA);

				String url = "https://app.store-and-supply.com/" + site + "/dashboard.php?action=activite&dateFrom="
						+ startDate + "&dateTo=" + endDate;

				driver.get(String.format(url, date, date));
				String ICA = driver
						.findElement(By.xpath("/html/body/section/div/div[2]/div/div[3]/div/div[1]/a/div/h3/span[1]"))
						.getText() + " €";
				System.out.println("Inner value of " + site + ": " + ICA);

				if (ICA.equals(OCA)) {
					System.out.println("The values for " + site + " are the same.");
				} else {
					System.err.println("The values for " + site + " are not the same.");
					logger.error("Outer value of " + site + ": " + OCA);
					logger.error("Inner value of " + site + ": " + ICA);
					logger.error("The values for " + site
							+ " are not the same  or this site are not placed any order yesterday !! ");
					logger.error(
							"----------------------------------------------------------------------------------------------------------------");

				}

				WebElement drop = driver.findElement(By.xpath("//*[@id=\"dropdownMenuButton\"]/span"));
				drop.click();
				WebElement home = driver.findElement(By.xpath("//*[@id=\"main\"]/nav/div[3]/div[1]/div/a[1]"));
				home.click();

				i++; // Increment the value of i to move to the next row
			}
			// Errormails();

		}
		driver.quit();
	}
}

