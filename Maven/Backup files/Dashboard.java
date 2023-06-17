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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.time.format.DateTimeFormatter;

public class Dashboard {
	private static final Logger logger = LogManager.getLogger(Dashboard.class);

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
		logger.error(
				"-------------------Report for yesterday date :" + date + "--------------------------------------");

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
				System.out.println("Report for yesterday date : " + date);

				System.out.println("Outer value of " + site + ": " + OCA);

				String url = "https://app.store-and-supply.com/" + site
						+ "/dashboard.php?action=activite&dateFrom=%s&dateTo=%s";

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

				driver.navigate().back();
				i++; // Increment the value of i to move to the next row
			}
			Errormails();

		}
		driver.quit();
	}

	// ---------- Mail code - added below for mail code ------

	public static void Errormails() throws IOException, MessagingException {

		// Recipient's Mail id
		String receipientTo = "aravind@oclocksolutions.com";
		String receipientCC = "kalaiyarasan.s@oclocksolutions.com";
		String receipientCCM = "manikandan@oclocksoftware.co.in";
		String receipientCCP = "parthiv@oclocksolutions.com";
		String receipientCCR = "riyaj@oclocksolutions.com";
		String receipientCCS = "sathya@oclocksolutions.com";
		String receipientCCJ = "jayapetrishiya@oclocksolutions.com";

		// Sender's Mail id
		String senderFrom = "aravind@oclocksolutions.com";

		// Path of PDF test report
		String path = "/Users/macminir01/Documents/Automation/Mavenproject/local/qateamproject/Maven/maven/c:/temp/logs/dashboard.xml";

		// Getting System properties
		Properties prop = System.getProperties();

		// Setting up smtp host
		prop.setProperty("mail.smtp.host", "smtp.gmail.com");

		// Creating a new session for smtp
		Session session = Session.getDefaultInstance(prop);

		MimeMessage msg = new MimeMessage(session);

		// Instance of From Internet address
		InternetAddress frmAddress = new InternetAddress(senderFrom);

		// Instance of To Internet address
		InternetAddress toAddress = new InternetAddress(receipientTo);
		// Instance of To Internet address
		InternetAddress CCAddress = new InternetAddress(receipientCC);
		// Instance of To Internet address
		InternetAddress CCMAddress = new InternetAddress(receipientCCM);
		// Instance of To Internet address
		InternetAddress CCPAddress = new InternetAddress(receipientCCP);
		// Instance of To Internet address
		InternetAddress CCRAddress = new InternetAddress(receipientCCR);
		// Instance of To Internet address
		InternetAddress CCSAddress = new InternetAddress(receipientCCS);
		// Instance of To Internet address
		InternetAddress CCJAddress = new InternetAddress(receipientCCJ);

		// Setting up sender's address
		msg.setFrom(frmAddress);

		// Setting up recipient's address
		msg.addRecipient(Message.RecipientType.TO, toAddress);
		msg.addRecipient(Message.RecipientType.TO, CCAddress);
		msg.addRecipient(Message.RecipientType.CC, CCMAddress);
		msg.addRecipient(Message.RecipientType.CC, CCPAddress);
		msg.addRecipient(Message.RecipientType.CC, CCRAddress);
		msg.addRecipient(Message.RecipientType.CC, CCSAddress);
		msg.addRecipient(Message.RecipientType.CC, CCJAddress);

		// Setting email's subject
		msg.setSubject("Dashboard reports \uD83D\uDE00");

		BodyPart msgBody = new MimeBodyPart();

		// Setting email's message body

		msgBody.setText(
				"Hi Team \uD83D\uDE00 some sites are not placed order yesterday, please check below report. !!!! OPEN IT \uD83D\uDE00 !!!!");

		// Instance of second part
		Multipart multiPart = new MimeMultipart();

		multiPart.addBodyPart(msgBody);

		// Another mail body
		msgBody = new MimeBodyPart();

		// Path to pdf file for attachment
		DataSource source = new FileDataSource(path);

		DataHandler dataHandler = new DataHandler(source);

		msgBody.setDataHandler(dataHandler);

		msgBody.setFileName(path);

		multiPart.addBodyPart(msgBody);

		msg.setContent(multiPart);

		// Authentication and connection establishment to the sender's mail
		Transport transport = session.getTransport("smtps");
		transport.connect("smtp.gmail.com", 465, "aravind@oclocksolutions.com", "Aravind@1234");
		transport.sendMessage(msg, msg.getAllRecipients());
		transport.close();

		System.out.println("Mail Sent - Please check your mail");

	}
}
