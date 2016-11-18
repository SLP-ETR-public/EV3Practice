import jp.ac.kagawa_u.infoexpr.Sensor.TouchSensor;
import lejos.hardware.port.SensorPort;
import lejos.utility.Delay;

public class sensorThread implements Runnable {

    private static TouchSensor touch = new TouchSensor(SensorPort.S1);
    private static boolean state = true;

    @Override
    public void run() {
        while (timeThread.getTime() <= 10000) {
            toggleState();
        }
    }

    public static void toggleState() {
        if (touch.isPressed()) {
            state = ! state;
            Delay.msDelay(500);
        }
    }
    public static boolean getState() {
    	return state;
    }
}