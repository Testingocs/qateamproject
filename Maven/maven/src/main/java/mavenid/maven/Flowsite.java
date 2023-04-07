package mavenid.maven;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Flowsite {

	WebDriver driver;

	@Test

	public void test() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "/Users/macminir01/Documents/Automation/chromedriver");
		driver = new ChromeDriver();

		// ----------------------------Sites Url------------------------------------//

		String CCV = "https://facebook.com";

		System.out.println(".............Loading URL one by one .............");

		// ccvmode//

		driver.get("http://facebook.com");
		HttpURLConnection cn = (HttpURLConnection) new URL(CCV).openConnection();
		cn.setRequestMethod("HEAD");
		cn.connect();
		int res = cn.getResponseCode();
		int ER = 2001;
		// System.out.println("Http response code: " + res);
		if (res == ER) {
			System.out.println("CCV Site is working");
		} else {
			System.err.println("!!!!!!!CCV Site is not working !!!!!");
			mail();

		}

		driver.quit();
	}

	public void mail() throws IOException {
		String to = "sasdosthteam@gmail.com";
		String from = "aravind@oclocksolutions.com";
		String host = "49.207.182.140"; // or IP address
		// Get the session object
		// Get system properties
		Properties properties = System.getProperties();
		// Setup mail server
		properties.setProperty("mail.smtp.host", host);
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.socketFactory.port", "465");
		properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.port", "465");
		// Get the default Session object
		Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("aravind@oclocksolutions.com", "Aravind@1234");
			}
		});
		// compose the message
		try {
			// javax.mail.internet.MimeMessage class
			// is mostly used for abstraction.
			MimeMessage message = new MimeMessage(session);
			// header field of the header.
			message.setFrom(new InternetAddress(from));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			message.setSubject(" Message Alert ");

			// Now set the actual message
			message.setText(" Hai , Please check the attachement which the site is not working !!!!!! ");

			message.setText(" Hello, aas is sending email ");
			// Create object to add multimedia type content

			BodyPart messageBodyPart1 = new MimeBodyPart();
			messageBodyPart1.setText("This is message body");
			// Create another object to add another content
			Multipart emailContent = new MimeMultipart();
			MimeBodyPart textbodypart = new MimeBodyPart();
			textbodypart.setText("hai");
			MimeBodyPart pdfAttachemnet = new MimeBodyPart();
			textbodypart.setText("Here's the file");
			pdfAttachemnet.attachFile("/Users/macminir01/Downloads/SendAttachment.pdf");
			emailContent.addBodyPart(pdfAttachemnet);
			message.setContent(emailContent);
			Multipart multipart = new MimeMultipart();
			multipart.addBodyPart(messageBodyPart1);
			multipart.addBodyPart(textbodypart);

			// Send message
			Transport.send(message);
			System.out.println("Check the mail we have issue !!!!..");
		} catch (MessagingException mex) {
			mex.printStackTrace();
		}
	}
}