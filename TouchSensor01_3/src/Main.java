import jp.ac.kagawa_u.infoexpr.Sensor.TouchSensor;
import lejos.hardware.motor.Motor;
import lejos.hardware.port.SensorPort;
import lejos.robotics.RegulatedMotor;
import lejos.utility.Delay;

public class Main {
 
    private static TouchSensor touch = new TouchSensor(SensorPort.S1);
    private static RegulatedMotor leftMoter = Motor.C;
    private static RegulatedMotor rightMoter = Motor.B;
    private static int time = 0;
 
    public static void main(String[] args) {
    	// タッチセンサーが押されてないとループする。
    	while ( ! touch.isPressed() ) { 
    		// 前進
    		leftMoter.forward();
        	rightMoter.forward();
    	}
        // timeが1000になるまでの間の処理
        while ( time <= 1000 ) {
        	// 後退
        	leftMoter.backward();
            rightMoter.backward();
            // 10ms待つ
            Delay.msDelay(10);
            time += 10;
        }
    }
}
 