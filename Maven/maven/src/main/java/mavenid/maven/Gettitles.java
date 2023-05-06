package mavenid.maven;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettitles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/macminir01/Documents/Automation/d/chromedriver_mac64(1)/chromedriver");
		WebDriver driver = new ChromeDriver();
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

		String[] objc1 = { CCV, Hexagona, Cimarron, Redskins, PeterandMay, Redwood, Altonadock, Bendroff, Rieker,
				Stanbridge, TheKorner, Parallele, Mim, Mephistode, Mephisto, Mephistoes, Leecooper, Mmax, MKT, Lacity,
				Gabor, Frnch, ek, Charles, Cadolle, Bendorff, Altlier, Mustang, Hectier, Lamrathe, Lasquar, Pourchet,
				TBC, Rivaldi };

		for (String i : objc1) {
			driver.get(i);
			String expectedTitle = driver.getTitle();
			System.out.println(expectedTitle);

		}
	}

}


