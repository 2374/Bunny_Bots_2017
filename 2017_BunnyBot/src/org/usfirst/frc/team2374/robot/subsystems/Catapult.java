package org.usfirst.frc.team2374.robot.subsystems;

import org.usfirst.frc.team2374.robot.RobotMap;
import org.usfirst.frc.team2374.robot.commands.CatapultTeleop;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.DigitalInput;
 
public class Catapult extends Subsystem {
	
	private Talon catapult1;
	private DoubleSolenoid solenoid;

	private static final double MOTOR_SPEED = 1.0;
	
	public Catapult() {
		// if this doesn't work find a way to get pwm ports from navx
		catapult1 = new Talon(RobotMap.TALON_CATAPULT_1 + 11);
		solenoid = new DoubleSolenoid(RobotMap.SOLENOID_CATAPULT_1, RobotMap.SOLENOID_CATAPULT_2);
	}
	
	@Override
	protected void initDefaultCommand() { setDefaultCommand(new CatapultTeleop()); }

	public void motorsForward() { catapult1.setSpeed(MOTOR_SPEED); }
	
	public void motorsBackward() { catapult1.setSpeed(-MOTOR_SPEED); }
	
	public void motorsStop() { catapult1.setSpeed(0); }
	
	public double getMotors() { return catapult1.getSpeed(); }
	
	public void pistonStart() { solenoid.set(Value.kForward); }
	
	public void pistonStop() { solenoid.set(Value.kReverse); }
	
	public boolean getPiston() { return solenoid.equals(Value.kReverse); }

}

