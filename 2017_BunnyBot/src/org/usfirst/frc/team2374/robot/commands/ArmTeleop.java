package org.usfirst.frc.team2374.robot.commands;

import org.usfirst.frc.team2374.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class ArmTeleop extends Command {

	public ArmTeleop() {
		
		requires(Robot.arm);
		
	}
	
	@Override
	protected void initialize() {
		
		
		
	}
	
	@Override
	protected void execute() {
		
		if (Robot.oi.getRightBumper()) {
			
			Robot.arm.motorsForward();
			
		} else if (Robot.oi.getLeftBumper()) {
			
			Robot.arm.motorsBackwards();
			
		} else {
			
			Robot.arm.motorsStop();
			
		}
		
		if (Robot.oi.getButtonX()) {
			
			Robot.arm.pistonsStart();
			
		} else {
			
			Robot.arm.pistonsStop();
			
		}
		
	}

	@Override
	protected boolean isFinished() {
		
		return false;

	}
	
	@Override
	protected void end() {
		
		Robot.arm.motorsStop();
		Robot.arm.pistonsStop();
		
	}
	
	@Override
	protected void interrupted() {
		
		end();
		
	}
	
}
