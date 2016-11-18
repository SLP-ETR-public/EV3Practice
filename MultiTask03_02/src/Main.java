import jp.ac.kagawa_u.infoexpr.Sensor.TouchSensor;
import lejos.hardware.port.SensorPort;

public class Main {

    public final static TouchSensor touch = new TouchSensor(SensorPort.S1);

    public static void main(String[] args) {
        Thread SoundThread = new Thread(new SoundThread());
        Thread RunThread   = new Thread(new RunThread());

        SoundThread.start();
        RunThread.start();
        try {
            SoundThread.join();
            RunThread.join();
        } catch (InterruptedException e) {
        	e.printStackTrace();
        }
    }
}