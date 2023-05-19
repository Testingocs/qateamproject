package mavenid.maven;

import java.io.File;
import java.io.IOException;
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

import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Allmethods {
	// Mail code - added below for mail code

	public void Errormails() throws IOException, MessagingException {
		// Recipient's Mail id
		String receipientTo = "aravind@oclocksolutions.com";
		String receipientCC = "kalaiyarasan.s@oclocksolutions.com";
		String receipientCCM = "manikandan@oclocksoftware.co.in";
		String receipientCCP = "parthiv@oclocksolutions.com";
		String receipientCCR = "riyaj@oclocksolutions.com";
		String receipientCCS = "sathya@oclocksolutions.com";

		// Sender's Mail id
		String senderFrom = "aravind@oclocksolutions.com";

		// Path of PDF test report

		String screenshotFilePath = "/Users/macminir01/Documents/Automation/Mavenproject/local/qateamproject/Maven/maven/Screenshots/Homepage.jpg";
		String path = "/Users/macminir01/Documents/Automation/Mavenproject/local/qateamproject/Maven/maven/c:/temp/logs/app.log";

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

		// Setting up sender's address
		msg.setFrom(frmAddress);

		// Setting up recipient's address
		msg.addRecipient(Message.RecipientType.TO, toAddress);
		msg.addRecipient(Message.RecipientType.TO, CCAddress);
		msg.addRecipient(Message.RecipientType.CC, CCMAddress);
		msg.addRecipient(Message.RecipientType.CC, CCPAddress);
		msg.addRecipient(Message.RecipientType.CC, CCRAddress);
		msg.addRecipient(Message.RecipientType.CC, CCSAddress);

		// Setting email's subject
		msg.setSubject("Test Status Report");

		BodyPart msgBody = new MimeBodyPart();

		// Setting email's message body
		msgBody.setText("This is Test Report via Mail - this report automated some sites not working, please check below report. OPEN IT !!!!");

		// Instance of second part
		Multipart multiPart = new MimeMultipart();

		multiPart.addBodyPart(msgBody);

		// Another mail body
		msgBody = new MimeBodyPart();

		// Path to pdf file for attachment
		DataSource source = new FileDataSource(path);
		DataSource sourceshot = new FileDataSource(screenshotFilePath);

		DataHandler dataHandler = new DataHandler(source);
		DataHandler dataHandlershot = new DataHandler(sourceshot);

		msgBody.setDataHandler(dataHandler);
		msgBody.setDataHandler(dataHandlershot);

		msgBody.setFileName(path);
		msgBody.setFileName(screenshotFilePath);

		multiPart.addBodyPart(msgBody);

		msg.setContent(multiPart);

		// Authentication and connection establishment to the sender's mail
		Transport transport = session.getTransport("smtps");
		transport.connect("smtp.gmail.com", 465, "aravind@oclocksolutions.com", "Aravind@1234");
		transport.sendMessage(msg, msg.getAllRecipients());
		transport.close();

		System.out.println("Mail Sent - Please check your mail");

	}

	//// Screen shots ///

	public void Pagescreenshots(String url) throws Exception {
		System.setProperty("webdriver.gecko.driver", "/Users/macminir01/Documents/Automation/d/geckodriver");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "null");
		WebDriver driver = new FirefoxDriver();
		// goto url

		driver.get(url);
		int width = 1920;
		int height = 800;
		Dimension dm = new Dimension(width, height);
		driver.manage().window().setSize(dm);
		System.out.println(driver.manage().window().getSize());
		Thread.sleep(3000);

		// Take a screenshot and save it as a file
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		// Specify the location where you want to save the screenshot file
		String screenshotFilePath = "/Users/macminir01/Documents/Automation/Mavenproject/local/qateamproject/Maven/maven/Screenshots/bugs.jpg";

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
