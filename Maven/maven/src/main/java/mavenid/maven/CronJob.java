package mavenid.maven;

import java.util.Timer;
import java.util.TimerTask;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CronJob {
	private static final Logger logger = LogManager.getLogger(CronJob.class);

	public static void main(String[] args) {

		logger.info("The cron time started - " + java.time.LocalDateTime.now());
		Timer timer = new Timer();
		TimerTask task = new Flowsite();
		timer.schedule(task, 0, 14400000);
		logger.info("The cron time closed - " + java.time.LocalDateTime.now());


	}
	

}
