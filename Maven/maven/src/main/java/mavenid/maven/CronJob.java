package mavenid.maven;

import java.util.Timer;
import java.util.TimerTask;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CronJob {
	private static final Logger logger = LogManager.getLogger(CronJob.class);

	public static void main(String[] args) {
		Timer timer = new Timer();
		TimerTask task = new Allsitesflowtesting();
		timer.schedule(task, 0, 180000);

	}

}