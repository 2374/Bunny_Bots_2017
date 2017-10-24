package org.usfirst.frc.team2374.robot.commands;

import org.usfirst.frc.team2374.robot.Robot;
import org.usfirst.frc.team2374.robot.subsystems.Catapult;

import edu.wpi.first.wpilibj.command.Command;

public class CatapultTeleop extends Command{
	
	public CatapultTeleop(){
		requires (Robot.catapult);
	}
	@Override
	protected void initialize() {
	}
	
	@Override
	protected void execute() {
		if(Robot.oi.getButtonA())
			Robot.catapult.motorsForward();
		else if(Robot.oi.getButtonA())
			Robot.catapult.motorsBackward();
		else
			Robot.catapult.motorsStop();
		
		if(Robot.oi.getButtonY())
			Robot.catapult.pistonStart();
		else
			Robot.catapult.pistonStop();
	}

	@Override
	protected boolean isFinished() {
		return false;
	}
	
	@Override
	protected void end() {
		Robot.catapult.motorsStop();
		Robot.catapult.pistonStop();
	}
	
	@Override
	protected void interrupted() {
		end();
	}
}
