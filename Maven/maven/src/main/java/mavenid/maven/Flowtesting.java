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
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Flowtesting extends TimerTask {

	Flowsite cAlpha = new Flowsite();
	Allmethods st = new Allmethods();

	private static final Logger logger = LogManager.getLogger(Flowtesting.class);

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

	@Test

	public void test() throws MalformedURLException, IOException, InterruptedException, MessagingException {

		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "/Users/macminir01/Documents/Automation/d/chromedriver_mac64(1)/chromedriver"
		 * );
		 * 
		 * WebDriver driver = new ChromeDriver();
		 */

		System.setProperty("webdriver.gecko.driver", "/Users/macminir01/Documents/Automation/d/geckodriver");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "null");

		WebDriver driver = new FirefoxDriver();

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
				st.mail();
				try {
					st.Pagescreenshots(url);
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("Mail method is calling ....");

			}
			logger.info("The cron time started - " + java.time.LocalDateTime.now());
          driver.quit();
		}
	}

}