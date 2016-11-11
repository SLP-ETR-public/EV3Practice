import jp.ac.kagawa_u.infoexpr.Sensor.TouchSensor;
import lejos.hardware.Button;
import lejos.hardware.motor.Motor;
import lejos.hardware.port.SensorPort;
import lejos.robotics.RegulatedMotor;

public class Main {
 
    static TouchSensor touch = new TouchSensor(SensorPort.S1);
    private static RegulatedMotor leftMotor = Motor.C;
    private static RegulatedMotor rightMotor = Motor.B;
 
    public static void main(String[] args) {
    	leftMotor.setSpeed(200);
        rightMotor.setSpeed(200);
        while( !Button.ESCAPE.isDown() ) {
            while( ! touch.isPressed() ) {}
            while( touch.isPressed() ) {}
            leftMotor.forward();
            rightMotor.forward();
            while( ! touch.isPressed() ) {}
            while( touch.isPressed() ) {}
            leftMotor.backward();
            rightMotor.backward();
        }
        leftMotor.stop();
        rightMotor.stop();
    }
}