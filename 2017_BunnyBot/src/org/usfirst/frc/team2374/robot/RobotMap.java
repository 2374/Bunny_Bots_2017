package org.usfirst.frc.team2374.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

	public static int driverJoy = 0;
	
	public static int rsLeftAxisY = 1;
	public static int rsRightAxisY = 5;
	public static int rsLeftTrigger = 2;
	public static int rsRightTrigger = 3;
	public static int rsLeftBumper = 5;
	public static int rsRightBumper = 6;
	public static int rsButtonX = 3;
	public static int rsButtonA = 1;
	public static int rsButtonY = 4;
	
	public static final int TALON_LEFT_1 = 1; // front left mCIM
	public static final int TALON_LEFT_2 = 2; // back left mCIM
	public static final int TALON_LEFT_MASTER_1 = 3; // front left CIM
	public static final int TALON_LEFT_MASTER_2 = 4; // back left CIM
	public static final int TALON_RIGHT_1 = 5; // front right mCIM
	public static final int TALON_RIGHT_2 = 6; //back right mCIM
	public static final int TALON_RIGHT_MASTER_1 = 7; // front right CIM
	public static final int TALON_RIGHT_MASTER_2 = 8; // back right CIM
	

	public static final int CATAPULT_TALON_1 = 11;
	public static final int CATAPULT_SOLENOID_2 = 12;
	public static final int CATAPULT_SOLENOID_3 = 13;

	public static final int TALON_ARM_1 = 9; // first motor for the arm
	public static final int TALON_ARM_2 = 10; // second motor for the arm
	public static final int SOLENOID_ARM_1 = 14; // first solenoid for the arm
	public static final int SOLENOID_ARM_2 = 15; // second solenoid for the arm
	public static final int SOLENOID_ARM_3 = 16; // third solenoid for the arm
	public static final int SOLENOID_ARM_4 = 17; // fourth solenoid for the arm

	
}
