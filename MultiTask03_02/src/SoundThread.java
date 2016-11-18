import lejos.hardware.Sound;
import lejos.utility.Delay;

public class SoundThread implements Runnable {
 
    @Override
    public void run() {
        while (! Main.touch.isPressed()) {
            Sound.beep();
            Delay.msDelay(0);
        }
    }
}