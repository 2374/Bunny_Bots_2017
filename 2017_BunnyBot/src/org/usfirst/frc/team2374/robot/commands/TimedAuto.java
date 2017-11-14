package org.usfirst.frc.team2374.robot.commands;

import org.usfirst.frc.team2374.robot.Robot;

import edu.wpi.first.wpilibj.command.TimedCommand;

public class TimedAuto extends TimedCommand {

	public TimedAuto(double timeout) {
		super(timeout);
		requires(Robot.drive);
	}
	
	@Override
	protected void initialize() {
	}
	
	@Override
	protected void execute() {
		Robot.drive.tankDrive(1, 1);
	}

	@Override
	protected boolean isFinished() {
		return super.isTimedOut();
	}
	
	@Override
	protected void end() {
		Robot.drive.tankDrive(0, 0);
	}
	
	@Override
	protected void interrupted() {
		end();
	}

}

