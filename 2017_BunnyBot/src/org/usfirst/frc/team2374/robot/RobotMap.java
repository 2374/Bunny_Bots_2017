package org.usfirst.frc.team2374.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// joystick ports
	public static int driverJoy = 0;
	public static int driverJoy2 = 1;
	
	// joystick buttons
	public static int rsLeftAxisY = 1;
	public static int rsRightAxisY = 5;
	public static int rsLeftTrigger = 2;
	public static int rsRightTrigger = 3;
	public static int rsLeftBumper = 5;
	public static int rsRightBumper = 6;
	public static int rsButtonX = 3;
	public static int rsButtonA = 1;
	public static int rsButtonY = 4;
	public static int rsButtonB = 2;
	
	// robot ports
	public static final int TALON_LEFT_1 = 4; // front left mCIM
	public static final int TALON_LEFT_2 = 1; // back left mCIM
	public static final int TALON_LEFT_MASTER_1 = 2; // front left CIM
	public static final int TALON_LEFT_MASTER_2 = 3; // back left CIM
	public static final int TALON_RIGHT_1 = 0; // front right mCIM
	public static final int TALON_RIGHT_2 = 5; // back right mCIM
	public static final int TALON_RIGHT_MASTER_1 = 6; // front right CIM
	public static final int TALON_RIGHT_MASTER_2 = 7; // back right CIM
	
	public static final int TALON_CATAPULT_1 = 0;
	public static final int SOLENOID_CATAPULT_1 = 2;
	public static final int SOLENOID_CATAPULT_2 = 3;

	public static final int TALON_ARM_1 = 8; // first motor for the arm
	public static final int TALON_ARM_2 = 9; // second motor for the arm
	public static final int SOLENOID_ARM_1 = 0; // first solenoid for the arm
	public static final int SOLENOID_ARM_2 = 1; // second solenoid for the arm
	public static final int SOLENOID_ARM_3 = 4; // third solenoid for the arm
	public static final int SOLENOID_ARM_4 = 5; // fourth solenoid for the arm

}
