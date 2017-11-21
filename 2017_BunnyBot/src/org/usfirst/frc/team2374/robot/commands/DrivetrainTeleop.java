package org.usfirst.frc.team2374.robot.commands;

import org.usfirst.frc.team2374.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class DrivetrainTeleop extends Command {
	
	public DrivetrainTeleop() { requires(Robot.drive); }
	
	@Override
	protected void initialize() { }
	
	@Override
	protected void execute() {
		// This is a functionality Alec likes, the left and right triggers can make the robot drive
		// straight forward or straight back
		double leftTrigger = Robot.oi.getLeftTrigger();
		double rightTrigger = Robot.oi.getRightTrigger();
		double leftJoy = Robot.oi.getDriverLeftY();
		double rightJoy = Robot.oi.getDriverRightY();
		if (rightTrigger != 0) 
			Robot.drive.tankDrive(rightTrigger, rightTrigger);
		else if (leftTrigger != 0)
			Robot.drive.tankDrive(-leftTrigger, -leftTrigger);
		// This is how normal people drive, the left joystick controls the left side of the
		// drivetrain and the right joystick controls the right side of the drivetrain
		else
			Robot.drive.tankDrive(leftJoy, rightJoy);
	}

	@Override
	protected boolean isFinished() { return false; }
	
	@Override
	protected void end() { Robot.drive.tankDrive(0, 0); }
	
	@Override
	protected void interrupted() { end(); }

}
