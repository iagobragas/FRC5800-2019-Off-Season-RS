package frc.robot;

/**
 * The RobotMap is a mapping the ports sensors and actuators are wired into to a
 * variable name. This provides flexibility changing wiring, makes checking the
 * wiring easier and significantly reduces the number of magic numbers floating
 * around.
 */

public class RobotMap {
	/* PWMs (0 - 9) */
	public static final int 
	
	DRIVE_MOTOR_FR_ID = 0, 
	DRIVE_MOTOR_FL_ID = 2, 
	DRIVE_MOTOR_RR_ID = 1, 
	DRIVE_MOTOR_RL_ID = 3,
  MOTOR_REDUCTIONBOX_1_ID = 4,
  MOTOR_REDUCTIONBOX_2_ID = 5;

	/* Solenoid (0 - 7) */
	public static final int 
	INTAKE_HATCH_ID = 0,
  INTAKE_CARGO_ID = 1,
  SOLENOID_ID = 3;

	/* Digital I/Os (0 - 9) */
	public static final int 
	DRIVE_ENCODER_R1_ID = 1, 
	DRIVE_ENCODER_R2_ID = 2, 
	DRIVE_ENCODER_L1_ID = 0,
	DRIVE_ENCODER_L2_ID = 3;
}