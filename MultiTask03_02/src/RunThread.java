import lejos.hardware.motor.Motor;
import lejos.robotics.RegulatedMotor;

public class RunThread implements Runnable {
 
    private static RegulatedMotor leftMotor = Motor.C;
    private static RegulatedMotor rightMotor = Motor.B;
 
    @Override
    public void run() {
        while (! Main.touch.isPressed()) {
        	leftMotor.forward();
            rightMotor.forward();
        }
    }
}
 