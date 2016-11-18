import lejos.hardware.lcd.LCD;
import lejos.utility.Delay;

public class timeThread implements Runnable {
    private static int time = 0;

    @Override
    public void run() {
        while (time <= 11000) {
            Delay.msDelay(100);
            time += 100;
            LCD.clear();
            LCD.drawInt(time, 0, 5);
            LCD.clear();
            LCD.refresh();
        }
    }

    public static int getTime() {
        return time;
    }
}