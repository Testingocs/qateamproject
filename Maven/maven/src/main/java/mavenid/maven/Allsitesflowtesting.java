package mavenid.maven;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
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
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Allsitesflowtesting extends TimerTask {

	Flowsite cAlpha = new Flowsite();
	private static final Logger logger = LogManager.getLogger(Allsitesflowtesting.class);

	@Override
	public void run() {

		try {
			try {
				test();
			} catch (InterruptedException | MessagingException e) {

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("deprecation")
	@Test

	public void test() throws MalformedURLException, IOException, InterruptedException, MessagingException {

		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "/Users/macminir01/Documents/Automation/d/chromedriver_mac64(1)/chromedriver"
		 * );
		 * 
		 * WebDriver driver = new ChromeDriver();
		 */

		System.setProperty("webdriver.gecko.driver", "/Users/macminir01/Documents/Automation/d/geckodriver1");

		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "null");

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);

		// ----------------------------Sites Url------------------------------------//

		String CCV = "https://www.ccvmode.com/";
		String Hexagona = "https://www.hexagona.com/";
		String Cimarron = "https://www.cimarronjeans.fr/";
		String Redskins = "https://www.redskins.fr/fr/";
		String PeterandMay = "https://www.peterandmay.com/";
		String Redwood = "https://redwoodjeans.com/";
		String Altonadock = "https://altonadock.com/fr/";
		String Bendroff = "https://www.bendorff.es/";
		String Rieker = "https://www.rieker-online.fr/";
		String Stanbridge = "https://www.stanbridge.fr/";
		String TheKorner = "https://thekorner.fr/";
		String Parallele = "https://www.parallele.com/en/";
		String Mim = "https://mim.fr/";
		String Mephistode = "https://www.mephisto-shoes.com/de/";
		String Mephisto = "https://www.mephisto-shoes.com/";
		String Mephistoes = "https://www.mephisto-shoes.com/es/";
		String Leecooper = "https://www.leecooper.fr/";
		String Mmax = "https://www.monsieur-max.com";
		String MKT = "https://www.mktstudio.com/fr/";
		String Lacity = "https://www.lacity.fr/";
		String Gabor = "https://www.gabor-shop.fr/";
		String Frnch = "https://www.frnch.fr/fr/";
		String ek = "https://www.ek.fr/en/";
		String Charles = "https://www.charleslegolf.fr/";
		String Cadolle = "https://www.cadolle.com/fr/";
		String Bendorff = "https://www.bendorff.es/fr/";
		String Altlier = "https://www.atelierfandb.com/fr/";
		String Mustang = "https://www.mustang-online.fr/";
		String Hectier = "https://www.hechter-lingerie.com/";
		String Lamrathe = "https://www.lamarthe.com/en/";
		String Lasquar = "https://www.lasquadraparis.com/";
		String Pourchet = "https://www.pourchet.com/fr/";
		String TBC = "https://thebaggingco.com/";
		String Rivaldi = "https://www.rivaldi.com/";

		// Sites titles //

		String actualTitle = "CCV Vêtements et Chaussures, Mode femme, mode homme, mode enfant";
		String actualTitle1 = "Hexagona";
		String actualTitle2 = "Cimarron - Nouvelle collection de jeans pour femme";
		String actualTitle3 = "Boutique officielle Redskins : Blousons, Cuirs, vestes, chaussures...";
		String actualTitle4 = "PETER AND MAY | Paris-based eyewear designers";
		String actualTitle5 = "Redwood Jeans| Collection sportswear, vintage et moderne";
		String actualTitle6 = "ALTONADOCK Moda Española. Australian Spirit, Spanish Design - Altonadock";
		String actualTitle7 = "Bendorff : Marca de moda masculina diseñada en España desde 1995.";
		String actualTitle8 = "RIEKER : Achetez vos chaussures Rieker en ligne";
		String actualTitle9 = "STANBRIDGE : Official online store - Stanbridge - Stanbridge";
		String actualTitle10 = "The Korner | Vestiaire féminin au style casual chic ➤ Robes, Jupes, Tops, Bas. Des nouveautés.";
		String actualTitle11 = "Parallèle Paris";
		String actualTitle12 = "MIM - Prêt-à-porter féminin";
		String actualTitle13 = "Mephisto";
		String actualTitle14 = "Boutique en ligne MEPHISTO - Chaussures Mephisto en livraison gratuite";
		String actualTitle15 = "Tienda online MEPHISTO - Zapatos Mephisto para todos los gustos";
		String actualTitle16 = "Lee Cooper France : la boutique en ligne officielle - Leecooper";
		String actualTitle17 = "Vêtement homme grande taille de marque - Monsieur Max";
		String actualTitle18 = "MKT STUDIO - Nouvelle Collection Printemps - Été";
		String actualTitle19 = "La City";
		String actualTitle20 = "GABOR I Découvrez la nouvelle collection de chaussures Gabor - Gabor";
		String actualTitle21 = "Bienvenue chez FRNCH | Livraison gratuite ➤ Robes, Jupes, Tops, Bas. Des nouveautés. FRNCH";
		String actualTitle22 = "Emmanuelle Khanh Paris - Maison EK - Eyewear - EMMANUELLE KHANH";
		String actualTitle23 = "Prêt-à-porter haut de gamme pour homme - Charles Le Golf /INDEMOD,";
		String actualTitle24 = "Cadolle | Lingerie de luxe et haute couture - Cadolle";
		String actualTitle25 = "Bendorff : Marque de mode masculine créée en Espagne depuis 1995.";
		String actualTitle26 = "Atelier F&B | Vêtements et accessoires pour homme";
		String actualTitle27 = "Chaussures MUSTANG® - Site officiel Mustang Shoes";
		String actualTitle28 = "Daniel Hechter Lingerie";
		String actualTitle29 = "Lamarthe";
		String actualTitle30 = "La Squadra Paris";
		String actualTitle31 = "Maison Pourchet | Site officiel - Maroquinerie française";
		String actualTitle32 = "▷ Bolsos, mochilas y monederos | The Bagging Co®";
		String actualTitle33 = "RIVALDI - Nouvelle collection Rivaldi pour homme et enfant - Rivaldi";

		System.out.println("The cron time started - " + java.time.LocalDateTime.now());

		logger.info(".............----------------.............");

		System.out.println(".............Loading URL one by one.............");

		String objc1[] = { CCV, Hexagona, Cimarron, Redskins, PeterandMay, Redwood, Altonadock, Bendroff, Rieker,
				Stanbridge, TheKorner, Parallele, Mim, Mephistode, Mephisto, Mephistoes, Leecooper, Mmax, MKT, Lacity,
				Gabor, Frnch, ek, Charles, Cadolle, Bendorff, Altlier, Mustang, Hectier, Lamrathe, Lasquar, Pourchet,
				TBC, Rivaldi };

		String objc2[] = { actualTitle, actualTitle1, actualTitle2, actualTitle3, actualTitle4, actualTitle5,
				actualTitle6, actualTitle7, actualTitle8, actualTitle9, actualTitle10, actualTitle11, actualTitle12,
				actualTitle13, actualTitle14, actualTitle15, actualTitle16, actualTitle17, actualTitle18, actualTitle19,
				actualTitle20, actualTitle21, actualTitle22, actualTitle23, actualTitle24, actualTitle25, actualTitle26,
				actualTitle27, actualTitle28, actualTitle29, actualTitle30, actualTitle31, actualTitle32,
				actualTitle33 };

		for (int i = 0; i < objc1.length; i++) {
			String url = objc1[i];
			driver.get(url);
			String title = driver.getTitle();
			String expectedTitle = objc2[i];

			// System.out.println(expectedTitle);

			HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
			connection.setRequestMethod("HEAD");
			connection.connect();
			int responseCode = connection.getResponseCode();

			if (responseCode == 200 && title.equals(expectedTitle)) {
				System.out.println(url + " is working");
			} else {
				System.err.println(url + " is not working");
				logger.error(url + " is not working");
				Errormails();
				System.out.println("Mail method is calling ....");

			}

		}
		System.out.println("The cron time ended - " + java.time.LocalDateTime.now());

		logger.info("The cron time ended - " + java.time.LocalDateTime.now());

	}

	// Mail code - added below for mail code ------

	public void Errormails() throws IOException, MessagingException {

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
		String path = "/Users/macminir01/Documents/Automation/Mavenproject/local/qateamproject/Maven/maven/c:/temp/logs/app.xml";

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
		msg.setSubject("Site not working Status Report");

		BodyPart msgBody = new MimeBodyPart();

		// Setting email's message body

		msgBody.setText(
				"This is Test Report via Mail - this report automated some sites not working, please check below report. OPEN IT !!!!");

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