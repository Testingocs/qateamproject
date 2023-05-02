package mavenid.maven;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flowsite {

	private static final Logger logger = LogManager.getLogger(Flowsite.class);

	@Test

	public void test() throws MalformedURLException, IOException, InterruptedException, MessagingException {
		logger.info("The cron time started - " + java.time.LocalDateTime.now());

		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "/Users/macminir01/Documents/Automation/d/chromedriver_mac64(1)/chromedriver"
		 * );
		 * 
		 * WebDriver driver = new ChromeDriver();
		 */

		System.setProperty("webdriver.gecko.driver", "/Users/macminir01/Documents/Automation/geckodriver");
		WebDriver driver = new FirefoxDriver();

		// ----------------------------Sites Url------------------------------------//

		String CCV = "https://www.ccvmode.com/";
		String Hexagona = "https://www.hexagona.com/";
		String Cimarron = "https://www.cimarronjeans.fr/";
		String Redskins = "https://www.redskins.fr/fr/";
		String PeterandMay = "https://www.peterandmay.com/";
		String Redwood = "http://redwoodjeans.com/";
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
		String Altlier = "https://atelierfandb.com/";
		String Mustang = "https://www.mustang-online.fr/";
		String Hectier = "https://www.hechter-lingerie.com/";
		String Lamrathe = "https://www.lamarthe.com/en/";
		String Lasquar = "https://www.lasquadraparis.com/";
		String Pourchet = "https://www.pourchet.com/fr/";
		String TBC = "https://thebaggingco.com/";
		String Rivaldi = "https://www.rivaldi.com/";

		// ----------------------------Sites Url------------------------------------//

		System.out.println(".............Loading URL one by one .............");

		// ccvmode//

		driver.get(CCV);
		String expectedTitle = driver.getTitle();
		String actualTitle = "CCV Vêtements et Chaussures, Mode femme, mode homme, mode enfant";
		HttpURLConnection cn = (HttpURLConnection) new URL(CCV).openConnection();
		cn.setRequestMethod("HEAD");
		cn.connect();
		int res = cn.getResponseCode();
		int ER = 200;
		if (res == ER && expectedTitle.equals(actualTitle)) {
			System.out.println("CCV Site is working");
		} else {
			logger.error("Site - CCV Site is not working");
			System.err.println("!!!!!!!CCV Site is not working !!!!!!");
			mail();

		}

		// Hexagona

		driver.get(Hexagona);
		String expectedTitle1 = driver.getTitle();
		String actualTitle1 = "Hexagona";

		HttpURLConnection cnh = (HttpURLConnection) new URL(Hexagona).openConnection();
		cnh.setRequestMethod("HEAD");
		cnh.connect();
		int resh = cnh.getResponseCode();
		int ERh = 200;
		// System.out.println("Http response code: " + res);
		if (resh == ERh && expectedTitle1.equals(actualTitle1)) {
			Reporter.log("Hexagona Site is working");
			System.out.println("Hexagona Site is working");
		} else {
			logger.error(" Site - Hexagona Site is not working");
			System.err.println("!!!!!!!Hexagona Site is not working !!!!!!");
			mail();

		}

		// Cimarron

		driver.get(Cimarron);
		String expectedTitle2 = driver.getTitle();
		String actualTitle2 = "Cimarron - Nouvelle collection de jeans pour femme";
		HttpURLConnection cnc = (HttpURLConnection) new URL(Hexagona).openConnection();
		cnc.setRequestMethod("HEAD");
		cnc.connect();
		int resc = cnc.getResponseCode();
		int ERc = 200;
		// System.out.println("Http response code: " + res);
		if (resc == ERc && expectedTitle2.equals(actualTitle2)) {
			Reporter.log("Cimarron Site is working");
			System.out.println("Cimarron Site is working");
		} else {
			logger.error("Site - Cimarron Site is not working");
			System.err.println("!!!!!!!Cimarron Site is not working !!!!!!");
			mail();

		}

		// Redskins//

		driver.get(Redskins);
		String expectedTitle3 = driver.getTitle();
		String actualTitle3 = "Boutique officielle Redskins : Blousons, Cuirs, vestes, chaussures...";
		HttpURLConnection cnr = (HttpURLConnection) new URL(Redskins).openConnection();
		cnr.setRequestMethod("HEAD");
		cnr.connect();
		int resr = cnr.getResponseCode();
		int ERr = 200;
		// System.out.println("Http response code: " + res);
		if (resr == ERr && expectedTitle3.equals(actualTitle3)) {
			Reporter.log("CCV Site is working");
			System.out.println("Redskins Site is working");
		} else {
			logger.error("Site - Redskins Site is not working");
			System.err.println("!!!!!!!Redskins Site is not working !!!!!!");
			mail();

		}

		// PeterandMay//

		driver.get(PeterandMay);
		String expectedTitle4 = driver.getTitle();
		String actualTitle4 = "PETER AND MAY | Paris-based eyewear designers";
		HttpURLConnection cnp = (HttpURLConnection) new URL(PeterandMay).openConnection();
		cnp.setRequestMethod("HEAD");
		cnp.connect();
		int resp = cnp.getResponseCode();
		int ERp = 200;
		// System.out.println("Http response code: " + res);
		if (resp == ERp && expectedTitle4.equals(actualTitle4)) {
			Reporter.log("PeterandMay Site is working");
			System.out.println("PeterandMay Site is working");
		} else {
			logger.error("Site - PeterandMay Site is not working");
			System.err.println("!!!!!!!PeterandMay Site is not working !!!!!!");
			mail();

		}

		// Redwood//

		driver.get(Redwood);
		String expectedTitle5 = driver.getTitle();
		String actualTitle5 = "Redwood Jeans| Collection sportswear, vintage et moderne";
		HttpURLConnection cnre = (HttpURLConnection) new URL(Redwood).openConnection();
		cnre.setRequestMethod("HEAD");
		cnre.connect();
		int resre = cnr.getResponseCode();
		int ERre = 200;
		// System.out.println("Http response code: " + res);
		if (resre == ERre && expectedTitle5.equals(actualTitle5)) {
			Reporter.log("Redwood Site is working");
			System.out.println("Redwood Site is working");
		} else {
			logger.error("Site - Redwood Site is not working");
			System.err.println("!!!!!!!Redwood Site is not working !!!!!!");
			mail();

		}

		// Altonadock//

		driver.get(Altonadock);
		String expectedTitle6 = driver.getTitle();
		String actualTitle6 = "ALTONADOCK Moda Española. Australian Spirit, Spanish Design - Altonadock";
		HttpURLConnection cnra = (HttpURLConnection) new URL(Altonadock).openConnection();
		cnra.setRequestMethod("HEAD");
		cnra.connect();
		int resra = cnr.getResponseCode();
		int ERra = 200;
		// System.out.println("Http response code: " + res);
		if (resra == ERra && expectedTitle6.equals(actualTitle6)) {
			Reporter.log("Altonadock Site is working");
			System.out.println("Altonadock Site is working");
		} else {
			logger.error("Site - Altonadock Site is not working");
			System.err.println("!!!!!!!Altonadock Site is not working !!!!!!");
			mail();

		}

		// Bendroff//

		driver.get(Bendroff);
		String expectedTitle7 = driver.getTitle();
		String actualTitle7 = "Bendorff : Marca de moda masculina diseñada en España desde 1995.";
		HttpURLConnection cnrb = (HttpURLConnection) new URL(Bendroff).openConnection();
		cnrb.setRequestMethod("HEAD");
		cnrb.connect();
		int resrb = cnrb.getResponseCode();
		int ERrb = 200;
		// System.out.println("Http response code: " + res);
		if (resrb == ERrb && expectedTitle7.equals(actualTitle7)) {
			Reporter.log("Bendroff Site is working");
			System.out.println("Bendroff Site is working");
		} else {
			logger.error(" Site - Bendroff Site is not working");
			System.err.println("!!!!!!!Bendroff Site is not working !!!!!!");
			mail();

		}

		// Rieker//

		driver.get(Rieker);
		String expectedTitle8 = driver.getTitle();
		String actualTitle8 = "RIEKER : Achetez vos chaussures Rieker en ligne";
		HttpURLConnection cnrr = (HttpURLConnection) new URL(Rieker).openConnection();
		cnrr.setRequestMethod("HEAD");
		cnrr.connect();
		int resrr = cnrr.getResponseCode();
		int ERrr = 200;
		// System.out.println("Http response code: " + res);
		if (resrr == ERrr && expectedTitle8.equals(actualTitle8)) {
			Reporter.log("Rieker Site is working");
			System.out.println("Rieker Site is working");
		} else {
			logger.error("Site - Rieker Site is not working");
			System.err.println("!!!!!!!Rieker Site is not working !!!!!!");
			mail();

		}

		// Stanbridge//

		driver.get(Stanbridge);
		String expectedTitle9 = driver.getTitle();
		String actualTitle9 = "STANBRIDGE : Official online store - Stanbridge - Stanbridge";
		HttpURLConnection cns = (HttpURLConnection) new URL(Stanbridge).openConnection();
		cns.setRequestMethod("HEAD");
		cns.connect();
		int ress = cns.getResponseCode();
		int ERs = 200;
		// System.out.println("Http response code: " + res);
		if (ress == ERs && expectedTitle9.equals(actualTitle9)) {
			Reporter.log("Stanbridge Site is working");
			System.out.println("Stanbridge Site is working");
		} else {
			logger.error("Site - Stanbridge Site is not working");
			System.err.println("!!!!!!!Stanbridge Site is not working !!!!!!");
			mail();

		}

		// TheKorner//

		driver.get(TheKorner);
		String expectedTitle10 = driver.getTitle();
		String actualTitle10 = "The Korner | Vestiaire féminin au style casual chic ➤ Robes, Jupes, Tops, Bas. Des nouveautés.";
		HttpURLConnection cnsr = (HttpURLConnection) new URL(TheKorner).openConnection();
		cnsr.setRequestMethod("HEAD");
		cnsr.connect();
		int ressr = cnsr.getResponseCode();
		int ERsr = 200;
		// System.out.println("Http response code: " + res);
		if (ressr == ERsr && expectedTitle10.equals(actualTitle10)) {
			Reporter.log("TheKorner Site is working");
			System.out.println("TheKorner Site is working");
		} else {
			logger.error("Site - TheKorner Site is not working");
			System.err.println("!!!!!!!TheKorner Site is not working !!!!!!");
			mail();

		}

		// Parllel

		driver.get(Parallele);
		String expectedTitle11 = driver.getTitle();
		String actualTitle11 = "Parallèle Paris";
		HttpURLConnection cnskkpp = (HttpURLConnection) new URL(Parallele).openConnection();
		cnskkpp.setRequestMethod("HEAD");
		cnskkpp.connect();
		int resskkpp = cnskkpp.getResponseCode();
		int ERskkpp = 200;
		// System.out.println("Http response code: " + res);
		if (resskkpp == ERskkpp && expectedTitle11.equals(actualTitle11)) {
			Reporter.log("Parallele Site is working");
			System.out.println("Parallele Site is working");
		} else {
			logger.error("Site - Parallele Site is not working");
			System.err.println("!!!!!!!Parallele Site is not working !!!!!!");
			mail();

		}

		// MIM

		driver.get(Mim);
		String expectedTitle12 = driver.getTitle();
		String actualTitle12 = "MIM - Prêt-à-porter féminin";
		HttpURLConnection cnskkmm = (HttpURLConnection) new URL(Mim).openConnection();
		cnskkmm.setRequestMethod("HEAD");
		cnskkmm.connect();
		int resskkmm = cnskkmm.getResponseCode();
		int ERskkmm = 200;
		// System.out.println("Http response code: " + res);
		if (resskkmm == ERskkmm && expectedTitle12.equals(actualTitle12)) {
			Reporter.log("Mim Site is working");
			System.out.println("Mim Site is working");
		} else {
			logger.error("Site - Mim Site is not working");
			System.err.println("!!!!!!!Mim Site is not working !!!!!!");
			mail();

		}

		// Mephistode

		driver.get(Mephistode);
		String expectedTitle13 = driver.getTitle();
		String actualTitle13 = "Mephisto";
		HttpURLConnection cnm = (HttpURLConnection) new URL(Mephistode).openConnection();
		cnm.setRequestMethod("HEAD");
		cnm.connect();
		int resm = cnm.getResponseCode();
		int ERm = 200;
		// System.out.println("Http response code: " + res);
		if (resm == ERm && expectedTitle13.equals(actualTitle13)) {
			Reporter.log("Mephistode Site is working");
			System.out.println("Mephistode Site is working");
		} else {
			logger.error("Site - Mephistode Site is not working");
			System.err.println("!!!!!!!Mephistode Site is not working !!!!!!");
			mail();

		}

		// Mephisto

		driver.get(Mephisto);
		String expectedTitle14 = driver.getTitle();
		String actualTitle14 = "Boutique en ligne MEPHISTO - Chaussures Mephisto en livraison gratuite";
		HttpURLConnection cnmm = (HttpURLConnection) new URL(Mephisto).openConnection();
		cnmm.setRequestMethod("HEAD");
		cnmm.connect();
		int resmm = cnmm.getResponseCode();
		int ERmm = 200;
		// System.out.println("Http response code: " + res);
		if (resmm == ERmm && expectedTitle14.equals(actualTitle14)) {
			Reporter.log("Mephisto Site is working");
			System.out.println("Mephisto Site is working");
		} else {
			logger.error("Site - Mephisto Site is not working");
			System.err.println("!!!!!!!Mephisto Site is not working !!!!!!");
			mail();

		}

		// Mephistoes

		driver.get(Mephistoes);
		String expectedTitle15 = driver.getTitle();
		String actualTitle15 = "Tienda online MEPHISTO - Zapatos Mephisto para todos los gustos";
		HttpURLConnection cnme = (HttpURLConnection) new URL(Mephistoes).openConnection();
		cnme.setRequestMethod("HEAD");
		cnme.connect();
		int resme = cnme.getResponseCode();
		int ERme = 200;
		// System.out.println("Http response code: " + res);
		if (resme == ERme && expectedTitle15.equals(actualTitle15)) {
			Reporter.log("Mephistoes Site is working");
			System.out.println("Mephistoes Site is working");
		} else {
			logger.error("Site - Mephistoes Site is not working");
			System.err.println("!!!!!!!Mephistoes Site is not working !!!!!!");
			mail();

		}

		// Leecooper

		driver.get(Leecooper);
		String expectedTitle16 = driver.getTitle();
		String actualTitle16 = "Lee Cooper France : la boutique en ligne officielle - Leecooper";
		HttpURLConnection cnl = (HttpURLConnection) new URL(Leecooper).openConnection();

		cnl.setRequestMethod("HEAD");
		cnl.connect();
		int resl = cnl.getResponseCode();
		int ERl = 200;
		// System.out.println("Http response code: " + res);
		if (resl == ERl && expectedTitle16.equals(actualTitle16)) {
			Reporter.log("Leecooper Site is working");
			System.out.println("Leecooper Site is working");
		} else {
			logger.error("Site - Leecooper Site is not working");
			System.err.println("!!!!!!!Leecooper Site is not working !!!!!!");
			mail();

		}

		// Mmax

		driver.get(Mmax);
		String expectedTitle17 = driver.getTitle();
		String actualTitle17 = "Vêtement homme grande taille de marque - Monsieur Max";
		HttpURLConnection cnmo = (HttpURLConnection) new URL(Mmax).openConnection();
		cnmo.setRequestMethod("HEAD");
		cnmo.connect();
		int resmo = cnmo.getResponseCode();
		int ERmo = 200;
		// System.out.println("Http response code: " + res);
		if (resmo == ERmo && expectedTitle17.equals(actualTitle17)) {
			Reporter.log("Mmax Site is working");
			System.out.println("Mmax Site is working");
		} else {
			logger.error("Site - Mmax Site is not working");
			System.err.println("!!!!!!!Mmax Site is not working !!!!!!");
			mail();

		}

		// MKT

		driver.get(MKT);
		String expectedTitle18 = driver.getTitle();
		String actualTitle18 = "MKT STUDIO - Nouvelle Collection Printemps - Été";
		HttpURLConnection cnmt = (HttpURLConnection) new URL(MKT).openConnection();
		cnmt.setRequestMethod("HEAD");
		cnmt.connect();
		int resmt = cnmt.getResponseCode();
		int ERmt = 200;
		// System.out.println("Http response code: " + res);
		if (resmt == ERmt && expectedTitle18.equals(actualTitle18)) {
			Reporter.log("MKT Site is working");
			System.out.println("MKT Site is working");
		} else {
			logger.error("Site - MKT Site is not working");
			System.err.println("!!!!!!!MKT Site is not working !!!!!!");
			mail();

		}

		// Lacity

		driver.get(Lacity);
		String expectedTitle19 = driver.getTitle();
		String actualTitle19 = "La City";
		HttpURLConnection cnla = (HttpURLConnection) new URL(Lacity).openConnection();
		cnla.setRequestMethod("HEAD");
		cnla.connect();
		int resla = cnla.getResponseCode();
		int ERla = 200;
		// System.out.println("Http response code: " + res);
		if (resla == ERla && expectedTitle19.equals(actualTitle19)) {
			Reporter.log("Lacity Site is working");
			System.out.println("Lacity Site is working");
		} else {
			logger.error("Site - Lacity Site is not working");
			System.err.println("!!!!!!!Lacity Site is not working !!!!!!");
			mail();

		}

		// Gabor

		driver.get(Gabor);
		String expectedTitle20 = driver.getTitle();
		String actualTitle20 = "GABOR I Découvrez notre Nouvelle Collection automne-hiver 2022 - Gabor";
		HttpURLConnection cnga = (HttpURLConnection) new URL(Gabor).openConnection();
		cnga.setRequestMethod("HEAD");
		cnga.connect();
		int resga = cnga.getResponseCode();
		int ERga = 200;
		// System.out.println("Http response code: " + res);
		if (resga == ERga && expectedTitle20.equals(actualTitle20)) {
			Reporter.log("Gabor Site is working");
			System.out.println("Gabor Site is working");
		} else {
			logger.error("Site - Gabor Site is not working");
			System.err.println("!!!!!!!Gabor Site is not working !!!!!!");
			mail();

		}

		// Frnch

		driver.get(Frnch);
		String expectedTitle21 = driver.getTitle();
		String actualTitle21 = "Bienvenue chez FRNCH | Livraison gratuite ➤ Robes, Jupes, Tops, Bas. Des nouveautés. FRNCH";
		HttpURLConnection cnfr = (HttpURLConnection) new URL(Frnch).openConnection();
		cnfr.setRequestMethod("HEAD");
		cnfr.connect();
		int resfr = cnfr.getResponseCode();
		int ERfr = 200;
		// System.out.println("Http response code: " + res);
		if (resfr == ERfr && expectedTitle21.equals(actualTitle21)) {
			Reporter.log("Frnch Site is working");
			System.out.println("Frnch Site is working");
		} else {
			logger.error("Site - Frnch Site is not working");
			System.err.println("!!!!!!!Frnch Site is not working !!!!!!");
			mail();

		}

		// ek

		driver.get(ek);
		String expectedTitle22 = driver.getTitle();
		String actualTitle22 = "Emmanuelle Khanh Paris - Maison EK - Eyewear - EMMANUELLE KHANH";
		HttpURLConnection cnek = (HttpURLConnection) new URL(ek).openConnection();
		cnek.setRequestMethod("HEAD");
		cnek.connect();
		int resek = cnek.getResponseCode();
		int ERek = 200;
		// System.out.println("Http response code: " + res);
		if (resek == ERek && expectedTitle22.equals(actualTitle22)) {
			Reporter.log("ek Site is working");
			System.out.println("ek Site is working");
		} else {
			logger.error("Site - ek Site is not working");
			System.err.println("!!!!!!!ek Site is not working !!!!!!");
			mail();

		}

		// Charles de golf

		driver.get(Charles);
		String expectedTitle23 = driver.getTitle();
		String actualTitle23 = "Prêt-à-porter haut de gamme pour homme - Charles Le Golf /INDEMOD,";
		HttpURLConnection cnch = (HttpURLConnection) new URL(Charles).openConnection();
		cnch.setRequestMethod("HEAD");
		cnch.connect();
		int resch = cnch.getResponseCode();
		int ERch = 200;
		// System.out.println("Http response code: " + res);
		if (resch == ERch && expectedTitle23.equals(actualTitle23)) {
			Reporter.log("Charles Site is working");
			System.out.println("Charles Site is working");
		} else {
			logger.error("Site - Charles Site is not working");
			System.err.println("!!!!!!!Charles Site is not working !!!!!!");
			mail();

		}

		// Cadolle

		driver.get(Cadolle);
		String expectedTitle24 = driver.getTitle();
		String actualTitle24 = "Cadolle | Lingerie de luxe et haute couture - Cadolle";
		HttpURLConnection cnca = (HttpURLConnection) new URL(Cadolle).openConnection();
		cnca.setRequestMethod("HEAD");
		cnca.connect();
		int resca = cnca.getResponseCode();
		int ERca = 200;
		// System.out.println("Http response code: " + res);
		if (resca == ERca && expectedTitle24.equals(actualTitle24)) {
			Reporter.log("Cadolle Site is working");
			System.out.println("Cadolle Site is working");
		} else {
			logger.error("Site - Cadolle Site is not working");
			System.err.println("!!!!!!!Cadolle Site is not working !!!!!!");
			mail();

		}

		// Bendorff

		driver.get(Bendorff);
		String expectedTitle25 = driver.getTitle();
		String actualTitle25 = "Bendorff : Marque de mode masculine créée en Espagne depuis 1995.";
		HttpURLConnection cnben = (HttpURLConnection) new URL(Bendorff).openConnection();
		cnben.setRequestMethod("HEAD");
		cnben.connect();
		int resben = cnben.getResponseCode();
		int ERben = 200;
		// System.out.println("Http response code: " + res);
		if (resben == ERben && expectedTitle25.equals(actualTitle25)) {
			Reporter.log("Bendorff Site is working");
			System.out.println("Bendorff Site is working");
		} else {
			logger.error("Site - Bendorff Site is not working");
			System.err.println("!!!!!!!Bendorff Site is not working !!!!!!");
			mail();

		}

		// Altlier

		driver.get(Altlier);
		String expectedTitle26 = driver.getTitle();
		String actualTitle26 = "Atelier F&B | Vêtements et accessoires pour homme";
		HttpURLConnection cnat = (HttpURLConnection) new URL(Altlier).openConnection();
		cnat.setRequestMethod("HEAD");
		cnat.connect();
		int resat = cnat.getResponseCode();
		int ERat = 200;
		// System.out.println("Http response code: " + res);
		if (resat == ERat && expectedTitle26.equals(actualTitle26)) {
			Reporter.log("Altlier Site is working");
			System.out.println("Altlier Site is working");
		} else {
			logger.error("Site - Altlier Site is not working");
			System.err.println("!!!!!!!Altlier Site is not working !!!!!!");
			mail();

		}

		// Mustang

		driver.get(Mustang);
		String expectedTitle27 = driver.getTitle();
		String actualTitle27 = "Chaussures MUSTANG® - Site officiel Mustang Shoes";
		HttpURLConnection cnmus = (HttpURLConnection) new URL(Mustang).openConnection();
		cnmus.setRequestMethod("HEAD");
		cnmus.connect();
		int resmus = cnmus.getResponseCode();
		int ERmus = 200;
		// System.out.println("Http response code: " + res);
		if (resmus == ERmus && expectedTitle27.equals(actualTitle27)) {
			Reporter.log("Mustang Site is working");
			System.out.println("Mustang Site is working");
		} else {
			logger.error("Site - Mustang Site is not working");
			System.err.println("!!!!!!!Mustang Site is not working !!!!!!");
			mail();

		}

		// Hectier

		driver.get(Hectier);
		String expectedTitle28 = driver.getTitle();
		String actualTitle28 = "Daniel Hechter Lingerie";
		HttpURLConnection cnhec = (HttpURLConnection) new URL(Hectier).openConnection();
		cnhec.setRequestMethod("HEAD");
		cnhec.connect();
		int reshec = cnhec.getResponseCode();
		int ERhec = 200;
		// System.out.println("Http response code: " + res);
		if (reshec == ERhec && expectedTitle28.equals(actualTitle28)) {
			Reporter.log("Hectier Site is working");
			System.out.println("Hectier Site is working");
		} else {
			logger.error("Site - Hectier Site is not working");
			System.err.println("!!!!!!!Hectier Site is not working !!!!!!");
			mail();

		}

		// Lamrathe

		driver.get(Lamrathe);
		String expectedTitle29 = driver.getTitle();
		String actualTitle29 = "Lamarthe";
		HttpURLConnection cnlam = (HttpURLConnection) new URL(Lamrathe).openConnection();
		cnlam.setRequestMethod("HEAD");
		cnlam.connect();
		int reslam = cnlam.getResponseCode();
		int ERlam = 200;
		// System.out.println("Http response code: " + res);
		if (reslam == ERlam && expectedTitle29.equals(actualTitle29)) {
			Reporter.log("Lamrathe Site is working");
			System.out.println("Lamrathe Site is working");
		} else {
			logger.error("Site - Lamrathe Site is not working");
			System.err.println("!!!!!!!Lamrathe Site is not working !!!!!!");
			mail();

		}

		// Lasquar

		driver.get(Lasquar);
		String expectedTitle30 = driver.getTitle();
		String actualTitle30 = "La Squadra Paris";
		HttpURLConnection cnlas = (HttpURLConnection) new URL(Lasquar).openConnection();
		cnlas.setRequestMethod("HEAD");
		cnlas.connect();
		int reslas = cnlas.getResponseCode();
		int ERlas = 200;
		// System.out.println("Http response code: " + res);
		if (reslas == ERlas && expectedTitle30.equals(actualTitle30)) {
			Reporter.log("Lasquar Site is working");
			System.out.println("Lasquar Site is working");
		} else {
			logger.error("Site - Lasquar Site is not working");
			System.err.println("!!!!!!!Lasquar Site is not working !!!!!!");
			mail();

		}

		// Pourchet

		driver.get(Pourchet);
		String expectedTitle31 = driver.getTitle();
		String actualTitle31 = "Maison Pourchet | Site officiel - Maroquinerie française";
		HttpURLConnection cnpour = (HttpURLConnection) new URL(Pourchet).openConnection();
		cnpour.setRequestMethod("HEAD");
		cnpour.connect();
		int respour = cnpour.getResponseCode();
		int ERpour = 200;
		// System.out.println("Http response code: " + res);
		if (respour == ERpour && expectedTitle31.equals(actualTitle31)) {
			Reporter.log("Pourchet Site is working");
			System.out.println("Pourchet Site is working");
		} else {
			logger.error("Site - Pourchet Site is not working");
			System.err.println("!!!!!!!Pourchet Site is not working !!!!!!");
			mail();

		}

		// TBC

		driver.get(TBC);
		String expectedTitle32 = driver.getTitle();
		String actualTitle32 = "▷ Bolsos, mochilas y monederos | The Bagging Co®";
		HttpURLConnection cntbc = (HttpURLConnection) new URL(TBC).openConnection();
		cntbc.setRequestMethod("HEAD");
		cntbc.connect();
		int restbc = cntbc.getResponseCode();
		int ERtbc = 200;
		// System.out.println("Http response code: " + res);
		if (restbc == ERtbc && expectedTitle32.equals(actualTitle32)) {
			Reporter.log("TBC Site is working");
			System.out.println("TBC Site is working");
		} else {
			logger.error("Site - TBC Site is not working");
			System.err.println("!!!!!!!TBC Site is not working !!!!!!");
			mail();

		}

		// Rivaldi

		driver.get(Rivaldi);
		String expectedTitle33 = driver.getTitle();
		String actualTitle33 = "RIVALDI - Nouvelle collection Rivaldi pour homme et enfant - Rivaldi";
		HttpURLConnection cnriv = (HttpURLConnection) new URL(Rivaldi).openConnection();
		cnriv.setRequestMethod("HEAD");
		cnriv.connect();
		int resriv = cnriv.getResponseCode();
		int ERriv = 200;
		// System.out.println("Http response code: " + res);
		if (resriv == ERriv && expectedTitle33.equals(actualTitle33)) {
			Reporter.log("Rivaldi Site is working");
			System.out.println("Rivaldi Site is working");
		} else {
			logger.error("Site - Rivaldi Site is not working");
			System.err.println("!!!!!!!Rivaldi Site is not working !!!!!!");
			mail();

		}
		driver.quit();
		logger.info("The cron time closed - " + java.time.LocalDateTime.now());

	}

	// Mail code - added below for mail code

	public void mail() throws IOException, MessagingException {
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
		/*
		 * msg.addRecipient(Message.RecipientType.TO, toAddress);
		 * msg.addRecipient(Message.RecipientType.CC, CCMAddress);
		 * msg.addRecipient(Message.RecipientType.CC, CCPAddress);
		 * msg.addRecipient(Message.RecipientType.CC, CCRAddress);
		 * msg.addRecipient(Message.RecipientType.CC, CCSAddress);
		 */

		// Setting email's subject
		msg.setSubject("Test Status Report");

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