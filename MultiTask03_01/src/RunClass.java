import lejos.hardware.motor.Motor;
import lejos.robotics.RegulatedMotor;

public class RunClass implements Runnable {
 
    private int time = 0;
    private static RegulatedMotor leftMotor = Motor.C;
    private static RegulatedMotor rightMotor = Motor.B;
 
    @Override
    public void run() {
        while (time <= 10000) {
        	leftMotor.forward();
            rightMotor.forward();
            time += 100;
        }
    }
}