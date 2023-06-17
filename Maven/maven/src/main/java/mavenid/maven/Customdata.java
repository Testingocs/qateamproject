package mavenid.maven;

import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

                                       // User can enter the date and get the result 

public class Customdata {

	public static void main(String[] args) throws InterruptedException, IOException { 
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

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

		Scanner scanner = new Scanner(System.in);

		// Find the start date input element
		WebElement dateInputStart = driver.findElement(By.cssSelector(".date-input#date-start"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].removeAttribute('readonly')", dateInputStart);
		dateInputStart.clear();
		System.out.print("Enter the start date (dd/MM/yyyy): ");
		String startDate = scanner.next();
		dateInputStart.sendKeys(startDate);

		// Find the end date input element
		WebElement dateInputEnd = driver.findElement(By.cssSelector(".date-input#date-end"));
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].removeAttribute('readonly')", dateInputEnd);
		dateInputEnd.clear();
		System.out.print("Enter the End date (dd/MM/yyyy): ");
		String endDate = scanner.next();
		dateInputEnd.sendKeys(endDate);

		WebElement apply = driver.findElement(By.xpath("//*[@id=\"applyDetailsBtn\"]"));
		apply.click();

		String sites[] = { "seidensticker", "gabor", "gentlemanfarmer", "ccvmode", "mephisto", "mephistode", "redskins",
				"rivaldi", "cadolle", "gerardpasquier", "leecooper", "stanbridge", "mktstudio", "hexagona", "ek",
				"redskinsbtob", "rieker", "atelier", "altonadock", "frnch", "mustang", "thebaggingco", "lasquadraparis",
				"marclebihan", "bendorff", "peterandmay", "lacity", "mim", "charleslegolf", "mephistoes", "redwood",
				"electricridesonly", "monsieurmax", "parallele", "mktstudioes", "thekorner", "lamarthe",
				"thebaggingcode", "cimarronjeans", "hechterlingerie", "pilimpich", "maisonpourchet", "francinel",
				"emiaparis" };

		System.out.print("Enter the site name: ");
		String searchText = scanner.next().toLowerCase(); // Convert the search text to lowercase

		String correctedSearchText = null;
		for (String site : sites) {
			if (site.toLowerCase().startsWith(searchText)) {
				correctedSearchText = site;
				break;
			}
		}

		if (correctedSearchText != null) {
			System.out.println("Site name suggestion corrected to: " + correctedSearchText);
			searchText = correctedSearchText;

			// Rest of your code...
		} else {
			System.out.println("No matching site found. Please re-enter the site name.");
		}

		// Find all table rows
		List<WebElement> rows = driver.findElements(By.xpath("//table//tr"));
		for (WebElement row : rows) {
			try {
				// System.out.println("Row Text: " + row.getText());
				// Check if the row contains a partial match for the first two letters of the
				// search text (case-insensitive)
				if (row.getText().toLowerCase().contains(searchText.substring(0, 2).toLowerCase())) {
					// Define the column index

					WebElement column3 = row.findElement(By.xpath("./td[3]"));
					String OCA = column3.getText();
					System.out.println("Outer value of " + searchText + ": " + OCA);

					String url = "https://app.store-and-supply.com/" + searchText.toLowerCase()
							+ "/dashboard.php?action=activite&dateFrom=" + startDate + "&dateTo=" + endDate;

					driver.get(url);

					String ICA = driver
							.findElement(
									By.xpath("/html/body/section/div/div[2]/div/div[3]/div/div[1]/a/div/h3/span[1]"))
							.getText() + " €";

					System.out.println("Inner value of " + searchText + ": " + ICA);

					if (ICA.equals(OCA)) {
						System.out.println("The values for " + searchText + " are the same.");
					} else {
						System.err.println("The values for " + searchText + " are not the same.");
					}
				}
			} catch (StaleElementReferenceException e) {
				// Handle the StaleElementReferenceException by re-locating the element
				row = driver.findElement(By.xpath("//table//tr"));
				// Retry the loop iteration for the current row
				continue;
			}
		}

		driver.quit();
	}
}