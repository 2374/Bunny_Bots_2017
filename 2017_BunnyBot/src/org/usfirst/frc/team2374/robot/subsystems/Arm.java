package org.usfirst.frc.team2374.robot.subsystems;

import org.usfirst.frc.team2374.robot.commands.ArmTeleop;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Arm extends Subsystem {
	
	private Talon talon1; // talon2 removed
	private DoubleSolenoid solenoid1; //solenoid2 removed
	private Compressor airCompressor;
	
	private Talon test1, test2, test3, test4;
	
	private static final double MOTOR_SPEED = 1.0;
	
	public Arm () {
		//talon1 = new Talon(RobotMap.TALON_ARM_1); 
		//testing redlines
		test1 = new Talon(0);
		test2 = new Talon(1);
		test3 = new Talon(2);
		test4 = new Talon(3);
		//talon2 = new Talon(RobotMap.TALON_ARM_2);
		//airCompressor = new Compressor();
        //airCompressor.start();
		//solenoid1 = new DoubleSolenoid(RobotMap.SOLENOID_ARM_1, RobotMap.SOLENOID_ARM_2);
		//solenoid2 = new DoubleSolenoid(RobotMap.SOLENOID_ARM_3, RobotMap.SOLENOID_ARM_4);	
	}

	@Override
	protected void initDefaultCommand() { setDefaultCommand(new ArmTeleop()); }
	
	// moves the pistons in the arm
	public void pistonsStart() {
		solenoid1.set(Value.kReverse);
		//solenoid2.set(Value.kForward);
	}
	 
	public void pistonsStop() {
		solenoid1.set(Value.kForward);
		//solenoid2.set(Value.kReverse);
	}
	
	public boolean getPistons() { return solenoid1.equals(Value.kForward); } // solenoid2.equals(Value.kForward)
	
	// The motors may need to spin in opposite directions ask mechanical later
	public void motorsForward() {
		//testing redlines
		test1.setSpeed(1);
		test2.setSpeed(-1);
		test3.setSpeed(1);
		test4.setSpeed(-1);
		//talon1.setSpeed(MOTOR_SPEED);
		//talon2.setSpeed(-MOTOR_SPEED);
	}
	
	// The motors may need to spin in opposite directions ask mechanical later
	public void motorsBackwards() {
		//testing redlines
		test1.setSpeed(-1);
		test2.setSpeed(1);
		test3.setSpeed(-1);
		test4.setSpeed(1);
		//talon1.setSpeed(-MOTOR_SPEED);
		//talon2.setSpeed(MOTOR_SPEED);
	}
	
	public void motorsStop() {
		test1.setSpeed(0);
		test2.setSpeed(0);
		test3.setSpeed(0);
		test4.setSpeed(0);
		//talon1.setSpeed(0);
		//talon2.setSpeed(0);
	}
	
	// talon1 and talon2 should have the same speed
	public double getMotors() { return talon1.getSpeed(); }

}
