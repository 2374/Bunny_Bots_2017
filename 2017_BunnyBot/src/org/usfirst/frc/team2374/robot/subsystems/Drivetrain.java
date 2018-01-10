package org.usfirst.frc.team2374.robot.subsystems;

import org.usfirst.frc.team2374.robot.commands.DrivetrainTeleop;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Drivetrain extends Subsystem {
	
	private RobotDrive robotDrive;
	// masters are CIMs, others are mCIMS, each mCIM is matched to the CIM with the same number
	private Talon left1, left2, masterLeft1, masterLeft2, right1, right2, masterRight1, masterRight2;
	
	public Drivetrain() {
		//left1 = new Talon(RobotMap.TALON_LEFT_1);
		//left2 = new Talon(RobotMap.TALON_LEFT_2);
		//masterLeft1 = new Talon(RobotMap.TALON_LEFT_MASTER_1);
		//masterLeft2 = new Talon(RobotMap.TALON_LEFT_MASTER_2);
		//right1 = new Talon(RobotMap.TALON_RIGHT_1);
		//right2 = new Talon(RobotMap.TALON_RIGHT_2);
		//masterRight1 = new Talon(RobotMap.TALON_RIGHT_MASTER_1);
		//masterRight2 = new Talon(RobotMap.TALON_RIGHT_MASTER_2);
		// robot drive is given CIMs as parameters
		robotDrive = new RobotDrive(masterLeft1, masterLeft2, masterRight1, masterRight2);
		robotDrive.setSafetyEnabled(false);
		left1.setInverted(true);
		masterLeft1.setInverted(true);
		left2.setInverted(true);
		masterLeft2.setInverted(true);
		right1.setInverted(true);
		masterRight1.setInverted(true);
		right2.setInverted(true);
		masterRight2.setInverted(true);
	}

	// setDefaultCommand(new CommandName()) takes a command as an input and sets the default
	// command for this subsystem, usually the teleop command that corresponds to this subsystem
	@Override
	protected void initDefaultCommand() { setDefaultCommand(new DrivetrainTeleop()); }
	
	public void tankDrive(double left, double right) {
		// uses tank drive method in robot drive to set the speed of the CIMs and then mCIMS are set to their
		// corresponding CIM (this needs to be tested, if it doesn't work we may have to write our own tankDrive method)
		robotDrive.tankDrive(left, right);
		left1.setSpeed(masterLeft1.getSpeed());
		left2.setSpeed(masterLeft2.getSpeed());
		right1.setSpeed(masterRight1.getSpeed());
		right2.setSpeed(masterRight2.getSpeed());
	}

}
