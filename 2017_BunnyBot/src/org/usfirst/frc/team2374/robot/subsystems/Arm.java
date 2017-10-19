
package org.usfirst.frc.team2374.robot.subsystems;

import org.usfirst.frc.team2374.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Arm extends Subsystem {
	
	private Talon talon1, talon2;
	private DoubleSolenoid solenoid1, solenoid2;
	
	private static final double MOTOR_SPEED = 1.0;
	
	public Arm () {
		talon1 = new Talon(RobotMap.TALON_ARM_1);
		talon2 = new Talon(RobotMap.TALON_ARM_2);
		solenoid1 = new DoubleSolenoid(RobotMap.SOLENOID_ARM_1, RobotMap.SOLENOID_ARM_2);
		solenoid2 = new DoubleSolenoid(RobotMap.SOLENOID_ARM_3, RobotMap.SOLENOID_ARM_4);
		
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
	
	// moves the pistons in the arm
	public void pistons(boolean onOff){
		if(onOff){
			solenoid1.set(Value.kForward);
			solenoid2.set(Value.kForward);
		} 
		else{
			solenoid1.set(Value.kReverse);
			solenoid2.set(Value.kReverse);
		}
	}
	
	// The motors may need to spin in opposite directions ask mechanical later
	public void motorsForward(boolean onOff) {
		if(onOff){
			talon1.setSpeed(MOTOR_SPEED);
			talon2.setSpeed(MOTOR_SPEED);
		}
		else {
			talon1.setSpeed(0);
			talon2.setSpeed(0);
		}
	}
	
	// The motors may need to spin in opposite directions ask mechanical later
	public void motorsBackwards(boolean onOff) {
		if(onOff){
			talon1.setSpeed(-MOTOR_SPEED);
			talon2.setSpeed(-MOTOR_SPEED);
		}
		else {
			talon1.setSpeed(0);
			talon2.setSpeed(0);
		}
	}

}
