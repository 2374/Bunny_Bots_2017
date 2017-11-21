package org.usfirst.frc.team2374.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	Joystick driver;
	Joystick driver2;
	JoystickButton leftBumper;
	JoystickButton rightBumper;

	public OI() {
		driver = new Joystick(RobotMap.driverJoy);
		driver2 = new Joystick(RobotMap.driverJoy2);
		leftBumper = new JoystickButton(driver, RobotMap.rsLeftBumper);
		rightBumper = new JoystickButton(driver, RobotMap.rsRightBumper);
	}

	public double getDriverLeftY() { return driver.getRawAxis(RobotMap.rsLeftAxisY); }

	public double getDriverRightY() { return driver.getRawAxis(RobotMap.rsRightAxisY); }

	public double getLeftTrigger() { return quadraticScale(driver.getRawAxis(RobotMap.rsLeftTrigger)); }

	public double getRightTrigger() { return quadraticScale(driver.getRawAxis(RobotMap.rsRightTrigger)); }

	public boolean getButtonX() { return driver.getRawButton(RobotMap.rsButtonX); }

	public boolean getButtonA() { return driver.getRawButton(RobotMap.rsButtonA); }

	public boolean getButtonY() { return driver.getRawButton(RobotMap.rsButtonY); }
	
	public boolean getButtonB() { return driver.getRawButton(RobotMap.rsButtonB); }

	public boolean getLeftBumper() { return leftBumper.get(); }

	public boolean getRightBumper() { return rightBumper.get(); }
	
	public boolean getButtonA2() { return driver2.getRawButton(RobotMap.rsButtonA); }
	
	public boolean getButtonB2() { return driver2.getRawButton(RobotMap.rsButtonB); }
	
	public boolean getButtonY2() { return driver2.getRawButton(RobotMap.rsButtonY); }

	public double deadZone(double axisValue, double deadValue) {
		if (Math.abs(axisValue) < deadValue)
			return 0;
		else
			return axisValue;
	}

	public double quadraticScale(double value) { return value * Math.abs(value); }

	public void toSmartDashboard() { }

}

