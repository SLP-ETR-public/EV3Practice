import lejos.hardware.motor.Motor;
import lejos.robotics.RegulatedMotor;

public class runThread implements Runnable {

	private static RegulatedMotor leftMotor = Motor.C;
    private static RegulatedMotor rightMotor = Motor.B;

    @Override
    public void run() {
        while (timeThread.getTime() <= 10000) {
            if (sensorThread.getState() == true) {
            	leftMotor.forward();
                rightMotor.forward();
            } else {
            	leftMotor.backward();
                rightMotor.backward();;
            }
        }
    }
}
