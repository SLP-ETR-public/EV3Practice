import jp.ac.kagawa_u.infoexpr.Sensor.TouchSensor;
import lejos.hardware.Button;
import lejos.hardware.Sound;
import lejos.hardware.port.SensorPort;

public class Main {
 
    static TouchSensor touch = new TouchSensor(SensorPort.S1);
 
    public static void main(String[] args) {
        while( ! Button.ESCAPE.isDown() ) {
            while( touch.isPressed() ){
                Sound.beep();
            }
        }
    }
}