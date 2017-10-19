package org.usfirst.frc.team2374.robot.subsystems;

import org.usfirst.frc.team2374.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Catapult extends Subsystem {

	private static final double MOTOR_SPEED = 1;
	
	private Talon catapult1;
	private DoubleSolenoid solenoid;
	
	public Catapult() {

		catapult1 = new Talon(RobotMap.CATAPULT_TALON_1);
		solenoid = new DoubleSolenoid(RobotMap.CATAPULT_SOLENOID_2, RobotMap.CATAPULT_SOLENOID_3);
		
	}

	public void motorsForward(boolean t) {
		if (t) {
			catapult1.setSpeed(MOTOR_SPEED);	
		}
		else {
			catapult1.setSpeed(0);
		}
	}
	
	public void motorsBackward(boolean l) {
		
		if (l) {
			catapult1.setSpeed(-MOTOR_SPEED);	
		}
		else {
			catapult1.setSpeed(0);
		}
		
	}
	
	public void piston(boolean a) {
		
		if (a) {
			
			solenoid.set(Value.kForward);
		}
		else {
			solenoid.set(Value.kReverse);
		}
		
	}
	
	@Override
	protected void initDefaultCommand() {
		
			
	}

}
