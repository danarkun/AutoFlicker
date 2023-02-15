
//package clicker;
import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.awt.image.BufferedImage;
import java.util.Random;
import java.util.Timer;
import java.awt.Point;
import java.util.TimerTask;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;
import java.awt.PointerInfo;
import java.awt.MouseInfo;

public class Clicker {

	static boolean stop;

	public static void main(String[] args) throws AWTException, InterruptedException {
		Robot clicker = new Robot();
		String delayStr = args[0];
		int delay = Integer.parseInt(delayStr) * 1000;
		int randos = ThreadLocalRandom.current().nextInt(delay, delay + 1000);

		Point a = MouseInfo.getPointerInfo().getLocation();
		while (true) {

			// Move mouse to random location and click
			int randos_x = ThreadLocalRandom.current().nextInt(a.x, a.x + 2);
			int randos_y = ThreadLocalRandom.current().nextInt(a.y, a.y + 2);
			System.out.println(InputEvent.BUTTON1_DOWN_MASK);
			clicker.mouseMove(randos_x, randos_y);
			clicker.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			clicker.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			Thread.sleep(800);
			clicker.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			clicker.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			Thread.sleep(randos);
		}
	}
}
