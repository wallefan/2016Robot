package org.usfirst.frc2813.Robot2016.commands.measurements;

import org.usfirst.frc2813.Robot2016.Robot;

import edu.wpi.first.wpilibj.command.Command;


public class EnableRecording extends Command {

    public EnableRecording() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.oi.enableRecording();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}