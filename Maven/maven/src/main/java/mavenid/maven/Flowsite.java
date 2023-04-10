package mavenid.maven;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.Properties;
import java.util.TimerTask;

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

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class Flowsite extends TimerTask {
	final Logger logger = Logger.getLogger(Flowsite.class);

	@Override
	public void run() {

		System.out.println("Cron started time" + new Date());
		try {
			test();
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	WebDriver driver;

	@Test

	public void test() throws MalformedURLException, IOException, InterruptedException, MessagingException {
		System.setProperty("webdriver.chrome.driver", "/Users/macminir01/Documents/Automation/chromedriver");
		driver = new ChromeDriver();
		
		

		// ----------------------------Sites Url------------------------------------//

		String CCV = "https://www.ccvmode.com/";
		String Hexagona = "https://www.hexagona.com/";
		String Cimarron = "https://www.cimarronjeans.fr/";
		String Redskins = "https://www.redskins.fr/fr/";
		String PeterandMay = "https://www.peterandmay.com/";
		String Redwood = "http://redwoodjeans.com/";
		String Altonadock = "https://altonadock.com/";
		String Bendroff = "https://www.bendorff.es/";
		String Rieker = "https://www.rieker-online.fr/";
		String Stanbridge = "https://www.stanbridge.fr/";
		String TheKorner = "https://thekorner.fr/";

		// ----------------------------Sites Url------------------------------------//

		System.out.println(".............Loading URL one by one .............");

		// ccvmode//

		driver.get(CCV);
		HttpURLConnection cn = (HttpURLConnection) new URL(CCV).openConnection();
		cn.setRequestMethod("HEAD");
		cn.connect();
		int res = cn.getResponseCode();
		int ER = 2001;
		// System.out.println("Http response code: " + res);
		if (res == ER) {
			Reporter.log("CCV Site is working");
			System.out.println("CCV Site is working");
		} else {
			Reporter.log("!!!!!!!CCV Site is not working !!!!!!!!!!!!!!!!!!!!");
			System.err.println("!!!!!!!CCV Site is not working !!!!!!");
			mail();

		}

		// Hexagona

		driver.get(Hexagona);
		Thread.sleep(3000);
		HttpURLConnection cnh = (HttpURLConnection) new URL(Hexagona).openConnection();
		cnh.setRequestMethod("HEAD");
		cnh.connect();
		int resh = cnh.getResponseCode();
		int ERh = 200;
		// System.out.println("Http response code: " + res);
		if (resh == ERh) {
			Reporter.log("Hexagona Site is working");
			System.out.println("Hexagona Site is working");
		} else {
			Reporter.log("!!!!!!!Hexagona Site is not working !!!!!!!!!!!!!!!!!!!!!!!");
			System.err.println("!!!!!!!Hexagona Site is not working !!!!!!");
			mail();

		}

		// Cimarron

		driver.get(Cimarron);
		Thread.sleep(6000);
		HttpURLConnection cnc = (HttpURLConnection) new URL(Hexagona).openConnection();
		cnc.setRequestMethod("HEAD");
		cnc.connect();
		int resc = cnc.getResponseCode();
		int ERc = 200;
		// System.out.println("Http response code: " + res);
		if (resc == ERc) {
			Reporter.log("Cimarron Site is working");
			System.out.println("Cimarron Site is working");
		} else {
			Reporter.log("!!!!!!!Cimarron Site is not working !!!!!!!!!!!!!!!!!!!!!!");
			System.err.println("!!!!!!!Cimarron Site is not working !!!!!!");
			mail();

		}

		// Redskins//

		driver.get(Redskins);
		HttpURLConnection cnr = (HttpURLConnection) new URL(Redskins).openConnection();
		cnr.setRequestMethod("HEAD");
		cnr.connect();
		int resr = cnr.getResponseCode();
		int ERr = 200;
		// System.out.println("Http response code: " + res);
		if (resr == ERr) {
			Reporter.log("CCV Site is working");
			System.out.println("Redskins Site is working");
		} else {
			Reporter.log("!!!!!!!Redskins Site is not working !!!!!!!!!!!!!!!!!!!!");
			System.err.println("!!!!!!!Redskins Site is not working !!!!!!");
			mail();

		}

		// PeterandMay//

		driver.get(PeterandMay);
		HttpURLConnection cnp = (HttpURLConnection) new URL(PeterandMay).openConnection();
		cnp.setRequestMethod("HEAD");
		cnp.connect();
		int resp = cnp.getResponseCode();
		int ERp = 200;
		// System.out.println("Http response code: " + res);
		if (resp == ERp) {
			Reporter.log("PeterandMay Site is working");
			System.out.println("PeterandMay Site is working");
		} else {
			Reporter.log("!!!!!!!PeterandMay Site is not working !!!!!!!!!!!!!!!!!!!!");
			System.err.println("!!!!!!!PeterandMay Site is not working !!!!!!");
			mail();

		}

		// Redwood//

		driver.get(Redwood);
		HttpURLConnection cnre = (HttpURLConnection) new URL(Redwood).openConnection();
		cnre.setRequestMethod("HEAD");
		cnre.connect();
		int resre = cnr.getResponseCode();
		int ERre = 200;
		// System.out.println("Http response code: " + res);
		if (resre == ERre) {
			Reporter.log("Redwood Site is working");
			System.out.println("Redwood Site is working");
		} else {
			Reporter.log("!!!!!!!Redwood Site is not working !!!!!!!!!!!!!!!!!!!!");
			System.err.println("!!!!!!!Redwood Site is not working !!!!!!");
			mail();

		}

		// Altonadock//

		driver.get(Altonadock);
		HttpURLConnection cnra = (HttpURLConnection) new URL(Altonadock).openConnection();
		cnra.setRequestMethod("HEAD");
		cnra.connect();
		int resra = cnr.getResponseCode();
		int ERra = 200;
		// System.out.println("Http response code: " + res);
		if (resra == ERra) {
			Reporter.log("Altonadock Site is working");
			System.out.println("Altonadock Site is working");
		} else {
			Reporter.log("!!!!!!!Altonadock Site is not working !!!!!!!!!!!!!!!!!!!!");
			System.err.println("!!!!!!!Altonadock Site is not working !!!!!!");
			mail();

		}

		// Bendroff//

		driver.get(Bendroff);
		HttpURLConnection cnrb = (HttpURLConnection) new URL(Bendroff).openConnection();
		cnrb.setRequestMethod("HEAD");
		cnrb.connect();
		int resrb = cnrb.getResponseCode();
		int ERrb = 200;
		// System.out.println("Http response code: " + res);
		if (resrb == ERrb) {
			Reporter.log("Bendroff Site is working");
			System.out.println("Bendroff Site is working");
		} else {
			Reporter.log("!!!!!!!Bendroff Site is not working !!!!!!!!!!!!!!!!!!!!");
			System.err.println("!!!!!!!Bendroff Site is not working !!!!!!");
			mail();

		}

		// Rieker//

		driver.get(Rieker);
		HttpURLConnection cnrr = (HttpURLConnection) new URL(Rieker).openConnection();
		cnrr.setRequestMethod("HEAD");
		cnrr.connect();
		int resrr = cnrr.getResponseCode();
		int ERrr = 200;
		// System.out.println("Http response code: " + res);
		if (resrr == ERrr) {
			Reporter.log("Rieker Site is working");
			System.out.println("Rieker Site is working");
		} else {
			Reporter.log("!!!!!!!Rieker Site is not working !!!!!!!!!!!!!!!!!!!!");
			System.err.println("!!!!!!!Rieker Site is not working !!!!!!");
			mail();

		}

		// Stanbridge//

		driver.get(Stanbridge);
		HttpURLConnection cns = (HttpURLConnection) new URL(Stanbridge).openConnection();
		cns.setRequestMethod("HEAD");
		cns.connect();
		int ress = cns.getResponseCode();
		int ERs = 200;
		// System.out.println("Http response code: " + res);
		if (ress == ERs) {
			Reporter.log("Stanbridge Site is working");
			System.out.println("Stanbridge Site is working");
		} else {
			Reporter.log("!!!!!!!Stanbridge Site is not working !!!!!!!!!!!!!!!!!!!!");
			System.err.println("!!!!!!!Stanbridge Site is not working !!!!!!");
			mail();

		}

		// TheKorner//

		driver.get(TheKorner);
		HttpURLConnection cnsr = (HttpURLConnection) new URL(TheKorner).openConnection();
		cnsr.setRequestMethod("HEAD");
		cnsr.connect();
		int ressr = cnsr.getResponseCode();
		int ERsr = 200;
		// System.out.println("Http response code: " + res);
		if (ressr == ERsr) {
			Reporter.log("TheKorner Site is working");
			System.out.println("TheKorner Site is working");
		} else {
			Reporter.log("!!!!!!!TheKorner Site is not working !!!!!!!!!!!!!!!!!!!!");
			System.err.println("!!!!!!!TheKorner Site is not working !!!!!!");
			mail();

		}
		
		driver.quit();
	}

	public void mail() throws IOException, MessagingException {
		// Recipient's Mail id
		String receipientTo = "sasdosthteam@gmail.com";

		// Sender's Mail id
		String senderFrom = "aravind@oclocksolutions.com";

		// Path of PDF test report
		String path = "/Users/macminir01/Documents/Automation/Mavenproject/local/qateamproject/Maven/maven/test-output/emailable-report.html";

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

		// Setting up sender's address
		msg.setFrom(frmAddress);

		// Setting up recipient's address
		msg.addRecipient(Message.RecipientType.TO, toAddress);

		// Setting email's subject
		msg.setSubject("Test Status Report");

		BodyPart msgBody = new MimeBodyPart();

		// Setting email's message body
		msgBody.setText("This is test report through mail - there report site not working");

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