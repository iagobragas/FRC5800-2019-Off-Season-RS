package frc.robot.commands;

import frc.robot.subsystems.SubsystemJoystick;
import frc.robot.Robot;
import edu.wpi.first.wpilibj.command.*;

public class CommandDrive extends Command {
	double arcadeSpeed;
	double arcadeRotation;

	public static final double minR = 0.4D, difR = 0.5D;

	public CommandDrive() {
		super(Robot.driver);
	}

	@Override
	protected void execute() {
		this.arcadeSpeed = -0.75 * SubsystemJoystick.axis_d_LY.get();
		this.arcadeRotation = SubsystemJoystick.axis_d_RX.get();
		Robot.driver.arcadeDrive(this.arcadeSpeed, this.arcadeRotation);
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	public void arcadeDrive(double speed, double rotation) {
		double modifier = minR + difR * Math.pow(1 - Math.abs(speed), 2);
		double rate = Math.pow(rotation, 3) * modifier;
		Robot.driver.tankDrive(-(speed + rate), rate - speed);
	}

	@Override
	protected void end() {
	}
}
