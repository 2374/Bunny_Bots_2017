package org.usfirst.frc.team2374.robot.subsystems;

import org.usfirst.frc.team2374.robot.RobotMap;
import org.usfirst.frc.team2374.robot.commands.CatapultTeleop;

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
	
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new CatapultTeleop());
	}

	public void motorsForward() {
		catapult1.setSpeed(MOTOR_SPEED);
	}
	
	public void motorsBackward() {
		catapult1.setSpeed(-MOTOR_SPEED);
	}
	
	public void motorsStop() {
		catapult1.setSpeed(0);
	}
	
	public double getMotors() {
		return catapult1.getSpeed();
	}
	
	public void pistonStart() {
		solenoid.set(Value.kForward);
	}
	
	public void pistonStop() {
		solenoid.set(Value.kReverse);
	}
	
	public boolean getPiston() {
		return solenoid.equals(Value.kReverse);
	}
	

}

