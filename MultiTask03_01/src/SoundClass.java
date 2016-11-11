import lejos.hardware.Sound;
import lejos.utility.Delay;

public class SoundClass implements Runnable {
    private int time = 0;
 
    @Override
    public void run() {
        while (time <= 10000) {
            Sound.beep();
            Delay.msDelay(100);
            time += 100;
        }
    }
}